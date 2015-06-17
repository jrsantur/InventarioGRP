package com.app.gobiernoregional.inventariogrp.provider;

import android.content.Context;

import com.app.gobiernoregional.model.entities.BienActivo;

import java.sql.SQLException;

/**
 * Created by practicanteoti on 16/06/2015.
 */
public class BienActivoDao  {

    private Context context;

    void BienActivo(Context context){
        this.context = context;
    }

    public void add(BienActivo bien){

        try {
            DatabaseHelper.getHelper(context).getBienActivoDao().create(bien);


        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
