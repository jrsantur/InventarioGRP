package com.app.gobiernoregional.inventariogrp.utils;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.app.gobiernoregional.inventariogrp.views.activities.LoginActivity;

import java.util.HashMap;

/**
 * Created by Junior on 20/06/2015.
 */
public class SessionManager {
    SharedPreferences mSharedPreferences;
    SharedPreferences.Editor mEditor;
    Context _context;

    int PRIVATE_MODE = 0;

    private  static  final String PREF_NAME = "AndroidInventarioPref";
    private  static  final String IS_LOGIN = "IsLogin";
    public static  final String KEY_NAME = "name";
    public static  final String KEY_PASSWORD = "password";

    public SessionManager(Context context){
        this._context=context;
        mSharedPreferences = _context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        mEditor = mSharedPreferences.edit();
    }
    public void createLoginSession(String user , String pass){
        mEditor.putBoolean(IS_LOGIN, true);
        mEditor.putString(KEY_NAME, user);
        mEditor.putString(KEY_PASSWORD , pass);
        mEditor.commit();
    }

    public void checkLogin() {
        // Check login status
        if (!this.isLoggedIn()) {
            // user is not logged in redirect him to Login Activity
            Intent i = new Intent(_context, LoginActivity.class);
            // Closing all the Activities
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            // Add new Flag to start new Activity
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            // Staring Login Activity
            _context.startActivity(i);
        }
    }

    /**
     * Get stored session data
     * */
    public HashMap<String, String> getUserDetails(){
        HashMap<String, String> user = new HashMap<String, String>();
        // user name
        user.put(KEY_NAME, mSharedPreferences.getString(KEY_NAME, null));

        // user password id
        user.put(KEY_PASSWORD, mSharedPreferences.getString(KEY_PASSWORD, null));

        // return user
        return user;
    }

    /**
     * Clear session details
     * */
    public void logoutUser(){
        // Clearing all data from Shared Preferences
        mEditor.clear();
        mEditor.commit();

        // After logout redirect user to Loing Activity
        Intent i = new Intent(_context, LoginActivity.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Staring Login Activity
        _context.startActivity(i);
    }

    /**
     * Quick check for login
     * **/
    // Get Login State
    public boolean isLoggedIn(){
        return mSharedPreferences.getBoolean(IS_LOGIN, false);
    }



}
