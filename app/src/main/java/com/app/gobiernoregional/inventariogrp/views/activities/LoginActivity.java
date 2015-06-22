package com.app.gobiernoregional.inventariogrp.views.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.app.gobiernoregional.inventariogrp.R;
import com.app.gobiernoregional.inventariogrp.mvp.presenters.LoginPresenter;
import com.app.gobiernoregional.inventariogrp.mvp.presenters.LoginPresenterImpl;
import com.app.gobiernoregional.inventariogrp.mvp.views.LoginView;
import com.app.gobiernoregional.inventariogrp.utils.SessionManager;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;


public class LoginActivity extends ActionBarActivity  implements LoginView{


    @Optional
    @InjectView(R.id.btn_login)         Button btnLogin;
    @InjectView(R.id.inputName)         TextInputLayout username;
    @InjectView(R.id.inputPassword)     TextInputLayout password;
    @InjectView(R.id.progress)          ProgressBar progressBar;

    SessionManager session;


    //@Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
        session = new  SessionManager(getApplicationContext());

        loginPresenter = new LoginPresenterImpl(this);


        //(savedInstanceState == null)
            //loginPresenter.attachView(this);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initializeValidation();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    private void initializeValidation(){
        String user = username.getEditText().getText().toString();
        String pass = password.getEditText().getText().toString();
        session.createLoginSession(username.getEditText().getText().toString(),
                                   password.getEditText().getText().toString());

        loginPresenter.validateCredentials(user, pass);

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setUsernameError() {
        username.getEditText().setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        password.getEditText().setError(getString(R.string.password_error));
    }


    @Override
    public void navigateToHome() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }


    @Override
    public Context getContext() {
        return this;
    }



}
