package com.app.gobiernoregional.inventariogrp.mvp.views;

/**
 * Created by practicanteoti on 05/06/2015.
 */
public interface ConfigDBView extends View{


    void setNameServidor(String name_servidor);

    void setUser(String user);

    void setPassord(String passord);

    void conect();

    void showLoading();

    void hideLoading();

    void showMessage();

    boolean isFieldsEmpty();

}
