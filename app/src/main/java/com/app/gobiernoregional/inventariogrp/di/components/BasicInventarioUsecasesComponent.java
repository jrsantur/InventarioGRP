package com.app.gobiernoregional.inventariogrp.di.components;

import com.app.gobiernoregional.inventariogrp.di.module.BasicInventarioUsecasesModule;
import com.app.gobiernoregional.inventariogrp.di.scopes.PerActivity;
import com.app.gobiernoregional.inventariogrp.views.activities.LoginActivity;
import com.app.gobiernoregional.inventariogrp.views.activities.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = BasicInventarioUsecasesModule.class)
public interface BasicInventarioUsecasesComponent {

    void inject (MainActivity mainActivity);
}
