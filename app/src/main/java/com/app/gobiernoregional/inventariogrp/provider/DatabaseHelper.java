package com.app.gobiernoregional.inventariogrp.provider;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.app.gobiernoregional.model.entities.BienActivo;
import com.app.gobiernoregional.model.entities.DireccionRegional;
import com.app.gobiernoregional.model.entities.Responsable;
import com.app.gobiernoregional.model.entities.UnidadEjecutora;
import com.app.gobiernoregional.model.entities.UnidadOrganica;
import com.app.gobiernoregional.model.entities.Users;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private Dao<BienActivo, Integer> bienactivoDao ;
    private Dao<UnidadEjecutora, Integer> unidadEjecutorasDao;
    private Dao<UnidadOrganica, Integer> unidadOrganicasDao;
    private Dao<DireccionRegional, Integer> direccionRegionalDao;
    private Dao<Responsable, Integer> responsableDao;
    private  static DatabaseHelper instance;


    public static synchronized DatabaseHelper getHelper(Context context)
    {
        if (instance == null)
        {
            synchronized (DatabaseHelper.class)
            {
                if (instance == null)
                    instance = new DatabaseHelper(context);
            }
        }

        return instance;
    }



    public DatabaseHelper(Context context) {
        super(context, DatabaseConstants.DATABASE_NAME, null, DatabaseConstants.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            Log.i(DatabaseHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource , BienActivo.class);
            TableUtils.createTable(connectionSource , UnidadEjecutora.class);
            TableUtils.createTable(connectionSource , UnidadOrganica.class);
            TableUtils.createTable(connectionSource , DireccionRegional.class);
            TableUtils.createTable(connectionSource , Responsable.class);
            TableUtils.createTable(connectionSource , Users.class);

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {


        try {
            Log.i(DatabaseHelper.class.getName(), "onUpdate");
            TableUtils.dropTable(connectionSource, BienActivo.class, true);
            TableUtils.dropTable(connectionSource, UnidadEjecutora.class, true);
            TableUtils.dropTable(connectionSource, UnidadOrganica.class, true);
            TableUtils.dropTable(connectionSource, DireccionRegional.class, true);
            TableUtils.dropTable(connectionSource, Responsable.class, true);
            TableUtils.dropTable(connectionSource, Users.class, true);
            onCreate(database, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Dao<BienActivo, Integer> getBienActivoDao() throws SQLException {
        if (bienactivoDao == null) {
            bienactivoDao = getDao(BienActivo.class);
        }
        return bienactivoDao;
    }

    public Dao<UnidadEjecutora , Integer > getUnidadEjecutorasDao() throws SQLException{
        if(unidadEjecutorasDao==null){
            unidadEjecutorasDao = getDao(UnidadEjecutora.class);
        }
        return unidadEjecutorasDao;
    }

    public Dao<UnidadOrganica , Integer> getUnidadOrganicasDao() throws SQLException {
        if(unidadOrganicasDao == null){
            unidadOrganicasDao = getDao(UnidadOrganica.class);
        }
        return unidadOrganicasDao;
    }

    @Override
    public void close()
    {
        bienactivoDao =null;
        direccionRegionalDao=null;
        unidadOrganicasDao = null;
        unidadEjecutorasDao = null;
        responsableDao = null;
        super.close();
    }

}
