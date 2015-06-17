package com.app.gobiernoregional.inventariogrp;

import android.app.Application;

import com.app.gobiernoregional.inventariogrp.di.components.AppComponent;
import com.app.gobiernoregional.inventariogrp.di.components.DaggerAppComponent;
import com.app.gobiernoregional.inventariogrp.di.module.ApplicationModule;
import com.app.gobiernoregional.inventariogrp.di.module.DomainModule;

/**
 * Created by practicanteoti on 05/06/2015.
 */
public class InventarioApp extends Application {

    private AppComponent mAppComponent;

    @Override public void onCreate() {
        super.onCreate();
        this.initializeDependencyInjector();
    }

    private void initializeDependencyInjector() {

        mAppComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .domainModule(new DomainModule())
                .build();
    }

    public AppComponent getAppComponent() {

        return mAppComponent;
    }

}
