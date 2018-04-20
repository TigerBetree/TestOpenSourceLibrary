package com.tiger.test.osl;

import android.app.Application;
import android.util.Log;

/**
 * Created by tiger on 2018/3/5.
 */

public class MyApp extends Application {

    public static final String TAG = "Tiger";

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static void logd(String msg){
        Log.d(TAG, msg);
    }
}
