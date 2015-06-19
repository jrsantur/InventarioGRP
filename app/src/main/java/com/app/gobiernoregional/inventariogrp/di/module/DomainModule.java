package com.app.gobiernoregional.inventariogrp.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import com.squareup.otto.Bus;


@Module
public class DomainModule {

    @Provides @Singleton Bus provideBus () {
        return new Bus();
    }

    //@Provides @Singleton
    //DataSource provideDataSource (Bus bus) { return new DataSource(bus); }

}
