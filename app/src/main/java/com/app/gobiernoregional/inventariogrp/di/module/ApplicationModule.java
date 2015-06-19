package com.app.gobiernoregional.inventariogrp.di.module;

import android.content.Context;

import com.app.gobiernoregional.inventariogrp.InventarioApp;

import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;


@Module
public class ApplicationModule {

    private final InventarioApp application;

    public ApplicationModule (InventarioApp application) {

        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext () { return application; }

    public static class MovieUsecasesModule {

    }
}
