package com.example.administrator.okhttpdemo.http.builder;


import com.example.administrator.okhttpdemo.http.OkHttpUtils;
import com.example.administrator.okhttpdemo.http.request.OtherRequest;
import com.example.administrator.okhttpdemo.http.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers).build();
    }
}
