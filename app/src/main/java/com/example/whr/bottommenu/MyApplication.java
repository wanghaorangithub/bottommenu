package com.example.whr.bottommenu;

import android.app.Application;
import android.content.Context;

/**
 * Created by whr on 2017/12/9.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
