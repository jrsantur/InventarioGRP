package com.app.gobiernoregional.inventariogrp.views.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.app.gobiernoregional.inventariogrp.R;
import com.app.gobiernoregional.inventariogrp.mvp.presenters.LoginPresenterImpl;
import com.app.gobiernoregional.inventariogrp.mvp.views.LoginView;

import javax.inject.Inject;

import butterknife.InjectView;
import butterknife.Optional;


public class LoginActivity extends ActionBarActivity  implements LoginView{
    Context context;

    @Optional
    @InjectView(R.id.btn_login)         Button btnLogin;
    @InjectView(R.id.inputName)         TextInputLayout username;
    @InjectView(R.id.inputPassword)     TextInputLayout password;
    @InjectView(R.id.progress)          ProgressBar progressBar;


    @Inject
    LoginPresenterImpl loginPresenterImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        context = getContext();


        loginPresenterImpl.attachView(this);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenterImpl.validateCredentials(
                        username.getEditText().getText().toString(),
                        password.getEditText().getText().toString());
            }
        });

    }



    @Override
    public void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMessage() {

    }

    @Override
    public void setUsernameError() {
        username.getEditText().setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        username.getEditText().setError(getString(R.string.password_error));
    }

    @Override
    public void activateButtonLogin() {
       // btnLogin.setEnabled(true);
    }

    @Override
    public void hideButtonLogin() {
        //btnLogin.setEnabled(false);
    }

    @Override
    public void setTextFieldUsername(String username) {

    }

    @Override
    public void setTextFieldPassword(String password) {

    }

    @Override
    public boolean isFieldsEmpty() {
        return false;
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public Context getContext() {
        return this;
    }



}
