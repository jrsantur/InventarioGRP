package com.app.gobiernoregional.inventariogrp.domain;


import android.os.Handler;
import android.text.TextUtils;

import com.app.gobiernoregional.inventariogrp.views.listener.OnLoginFinishedListener;

public class LoginUsecaseController implements LoginUsecase {

    @Override
    public void login(final String username,  final String password, final OnLoginFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    if(username.equals("test") && password.equals("test")){
                        listener.onSuccess();
                    }
                    else {
                        error = true;
                    }
                }
            }
        }, 2000);
    }


    @Override
    public void execute() {

    }



}
