package com.wangyuyang.currencyservice.server;

import com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.stub.StreamObserver;
import com.wangyuyang.currencyservice.grpclib.CurrencyServiceGrpc;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import com.alibaba.fastjson.JSON;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Map;

@GrpcService
public class CurrencyServiceImpl extends CurrencyServiceGrpc.CurrencyServiceImplBase{
    public static Map map;
    static {
        ClassPathResource classPathResource = new ClassPathResource("currency_conversion.json");
        String conversionString="{}";
        try {
            conversionString = FileCopyUtils.copyToString(new BufferedReader(new InputStreamReader(classPathResource.getInputStream(), StandardCharsets.UTF_8)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        map = (Map)JSON.parse(conversionString);
    }
    @Override
    public void getSupportedCurrencies(CurrencyServiceOuterClass.Empty request, StreamObserver<CurrencyServiceOuterClass.GetSupportedCurrenciesResponse> responseObserver) {
        CurrencyServiceOuterClass.GetSupportedCurrenciesResponse.Builder getSupportedCurrenciesResponseBuilder = CurrencyServiceOuterClass.GetSupportedCurrenciesResponse.newBuilder();
        for (Object key : map.keySet())
            getSupportedCurrenciesResponseBuilder.addCurrencyCodes((String) key);
        responseObserver.onNext(getSupportedCurrenciesResponseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void convert(CurrencyServiceOuterClass.CurrencyConversionRequest request, StreamObserver<CurrencyServiceOuterClass.Money> responseObserver) {
        String ocode = request.getFrom().getCurrencyCode();
        long oldunits = request.getFrom().getUnits();
        int oldnanos = request.getFrom().getNanos();
        String tocode = request.getToCode();
        long newunits = 0;
        int newnanos = 0;
        try{
            double eurounitsd = oldunits/Double.valueOf((String)map.get(ocode));
            double euronanosd = oldnanos/Double.valueOf((String)map.get(ocode));
            euronanosd = euronanosd + (eurounitsd%1)*1000000000;
            long eurounits = (long)eurounitsd + (long)(euronanosd/1000000000);
            euronanosd = euronanosd%1000000000;
            int euronanos = (int) Math.round(euronanosd);
            double newunitsd = eurounits*Double.valueOf((String)map.get(tocode));
            double newnanosd = euronanos*Double.valueOf((String)map.get(tocode));
            newnanosd = newnanosd + (newunitsd%1)*1000000000;
            newunits = (long)newunitsd + (long)(newnanosd/1000000000);
            newnanosd = newnanosd%1000000000;
            newnanos = (int)newnanosd;
        } catch (NullPointerException e) {}
        CurrencyServiceOuterClass.Money money = CurrencyServiceOuterClass.Money.newBuilder().setCurrencyCode(tocode).setUnits(newunits).setNanos(newnanos).build();
        responseObserver.onNext(money);
        responseObserver.onCompleted();
    }
}
