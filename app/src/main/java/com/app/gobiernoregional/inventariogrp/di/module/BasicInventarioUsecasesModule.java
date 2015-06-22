package com.app.gobiernoregional.inventariogrp.di.module;

import com.app.gobiernoregional.domain.ConfigurationUsecase;
import com.app.gobiernoregional.domain.ConfigurationUsecaseController;
import com.app.gobiernoregional.domain.GetDataSigaUsecase;
import com.app.gobiernoregional.domain.GetDataSigaUsecaseController;
import com.app.gobiernoregional.domain.LoginUsecase;
import com.app.gobiernoregional.domain.LoginUsecaseController;
import com.app.gobiernoregional.model.local.DataSources;
import com.squareup.otto.Bus;


import dagger.Module;
import dagger.Provides;

@Module
public class BasicInventarioUsecasesModule {

    @Provides ConfigurationUsecase providerConfigurationUsecase(DataSources data , Bus bus){
        return null;
    }

    @Provides
    GetDataSigaUsecase providerGetDataSigaUsecase(DataSources data , Bus bus){
        return new GetDataSigaUsecaseController(data , bus);
    }

    @Provides
    LoginUsecase providerLoginUsecase(DataSources dataSources, Bus bus){
       // return  new LoginUsecaseController(dataSources , bus);
        return null;
    }




}


