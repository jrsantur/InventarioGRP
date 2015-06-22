package com.app.gobiernoregional.inventariogrp.mvp.presenters;


import com.app.gobiernoregional.inventariogrp.domain.LoginUsecase;
import com.app.gobiernoregional.inventariogrp.domain.LoginUsecaseController;
import com.app.gobiernoregional.inventariogrp.mvp.views.LoginView;
import com.app.gobiernoregional.inventariogrp.views.listener.OnLoginFinishedListener;
import com.squareup.otto.Bus;


public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {



    private LoginView loginView;
    private LoginUsecase loginUsecase;
    private boolean isLoading = false;

    /*
    @Inject public LoginPresenterImpl(){
        loginView = null;
        loginUsecase = new LoginUsecase();
    }
    */

    /*
    @Inject
    public LoginPresenterImpl(LoginUsecase loginUsecase, Bus mBus){

        this.loginUsecase = loginUsecase;
        this.mBus = mBus;
    }
    */

    public LoginPresenterImpl(LoginView loginView){
        this.loginView = loginView;
        loginUsecase = new LoginUsecaseController();
    }

    public void attachView(LoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void onUsernameError() {
        loginView.setUsernameError();
        loginView.hideProgress();
    }

    @Override
    public void onPasswordError() {
        loginView.setPasswordError();
        loginView.hideProgress();
    }

    @Override
    public void onSuccess() {
        loginView.navigateToHome();
    }

    @Override
    public void validateCredentials(String username, String password) {
        loginView.showProgress();
        loginUsecase.login(username,password, this);
    }
}
