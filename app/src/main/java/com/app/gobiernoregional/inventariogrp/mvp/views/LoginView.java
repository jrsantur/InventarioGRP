package com.app.gobiernoregional.inventariogrp.mvp.views;

/**
 * Created by practicanteoti on 05/06/2015.
 */
public interface LoginView extends View{

    public void showProgress();

    public void hideProgress();

    public void setUsernameError();

    public void setPasswordError();

    public void navigateToHome();
}
