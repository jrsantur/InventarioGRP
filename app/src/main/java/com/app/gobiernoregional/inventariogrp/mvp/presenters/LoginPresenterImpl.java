package com.app.gobiernoregional.inventariogrp.mvp.presenters;


import com.app.gobiernoregional.domain.LoginUsecase;
import com.app.gobiernoregional.inventariogrp.mvp.views.LoginView;
import com.app.gobiernoregional.inventariogrp.views.listener.OnLoginFinishedListener;
import com.squareup.otto.Bus;


public class LoginPresenterImpl  implements LoginPresenter, OnLoginFinishedListener {

    private Bus mBus;
    private LoginView loginView;
    private LoginUsecase loginUsecase;
    private boolean isLoading = false;


    public LoginPresenterImpl(LoginUsecase loginUsecase, Bus mBus){

        this.loginUsecase = loginUsecase;
        this.mBus = mBus;

    }

    public void attachView(LoginView loginView){
        this.loginView = loginView;
    }


    @Override
    public void onUsernameError() {
        loginView.navigateToHome();
    }

    @Override
    public void onPasswordError() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void validateCredentials(String username, String password) {
        loginUsecase.login(username,password);
        loginView.showLoading();
    }
}
