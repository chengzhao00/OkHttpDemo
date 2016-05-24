package com.bumptech.glide.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by yangguozhong on 2015/11/6.
 */
public class GlideApp  extends Application {
    public static Context mcontext;
    @Override
    public void onCreate() {
        super.onCreate();
        mcontext = this.getApplicationContext();
        System.out.println("----------------------sssssssssssss-------GlideApp------------");
    }
}
