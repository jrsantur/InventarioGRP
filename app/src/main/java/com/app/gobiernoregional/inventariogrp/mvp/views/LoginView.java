package com.app.gobiernoregional.inventariogrp.mvp.views;

/**
 * Created by practicanteoti on 05/06/2015.
 */
public interface LoginView extends View{

    void showLoading();

    void hideLoading();

    void showMessage();

    void setTextFieldUsername(String username);

    void setTextFieldPassword(String password);

    boolean isFieldsEmpty();

}
