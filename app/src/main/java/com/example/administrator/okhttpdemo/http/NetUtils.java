package com.example.administrator.okhttpdemo.http;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Administrator.
 * Time:2016/5/24
 */
public class NetUtils {
    public static boolean isNetworkAvailable(Context context) {
        boolean result = false;
        // 获取手机所有连接管理对象
        try {
            ConnectivityManager connManager = (ConnectivityManager) context.getSystemService(Context
                    .CONNECTIVITY_SERVICE);
            if (connManager != null) {
                // 获取网络连接管理的对象
                NetworkInfo info = connManager.getActiveNetworkInfo();
                if (info != null && info.isConnected()) {
                    // 判断当前网络是否已经连接
                    if (info.getState() == NetworkInfo.State.CONNECTED) {
                        result = true;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
