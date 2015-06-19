package com.app.gobiernoregional.inventariogrp.di.components;


import com.app.gobiernoregional.inventariogrp.di.module.ApplicationModule;
import com.app.gobiernoregional.inventariogrp.di.module.DomainModule;
import com.squareup.otto.Bus;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {
    ApplicationModule.class,
    DomainModule.class,
})

public interface AppComponent {
    Bus bus();

}
