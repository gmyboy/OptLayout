package com.gmyboy.optlayout.network;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by GMY on 2016/3/17 16:57.
 * Contact me via email igmyboy@gmail.com.
 */
public class HttpUtil {
    OkHttpClient client = new OkHttpClient();
    Request request = new Request.Builder()
            .url("http://")
            .build();
    Call call = client.newCall(request);
    
}
