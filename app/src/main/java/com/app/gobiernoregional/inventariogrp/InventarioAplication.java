package com.app.gobiernoregional.inventariogrp;

import android.app.Application;

import java.sql.Connection;

/**
 * Created by practicanteoti on 05/06/2015.
 */
public class InventarioAplication  extends Application {

    Connection connection;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
