package com.chainup.futures.gateway.utils;

import cn.hutool.crypto.digest.HMac;
import org.apache.http.client.methods.HttpGet;

import java.nio.charset.StandardCharsets;

import static cn.hutool.crypto.digest.HmacAlgorithm.HmacSHA256;

public class SignUtil {

    public static final String TIME_MILLIS = String.valueOf(System.currentTimeMillis() + 20000);
    public static final String APP_SECRET = "12e59f1bee4e5b353698670549ce64cc";

    public static String signGet(String path) {

        String signBody = TIME_MILLIS +
                HttpGet.METHOD_NAME +
                path;
        HMac hMac = new HMac(HmacSHA256, APP_SECRET.getBytes(StandardCharsets.UTF_8));
        return hMac.digestHex(signBody);
    }

    public static String signPost(String path, String reqJson) {

        String signBody = TIME_MILLIS +
                HttpGet.METHOD_NAME +
                path +
                reqJson;
        HMac hMac = new HMac(HmacSHA256, APP_SECRET.getBytes(StandardCharsets.UTF_8));
        return hMac.digestHex(signBody);
    }

}
