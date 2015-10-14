package com.fada.lambda;

import android.app.Application;

import com.orhanobut.logger.Logger;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by wengfada on 15/9/30.
 */
public class MyAPP extends Application{
    private static RefWatcher refWatcher;
    @Override
    public void onCreate() {

        super.onCreate();
        Logger.init("MyApp");
        refWatcher=LeakCanary.install(this);
    }
}
