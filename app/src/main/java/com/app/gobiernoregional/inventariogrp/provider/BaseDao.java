package com.app.gobiernoregional.inventariogrp.provider;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;

import java.sql.SQLException;

/**
 * Created by Junior on 18/06/2015.
 */
public class BaseDao<T> extends BaseDaoImpl {

    protected BaseDao(Class dataClass) throws SQLException {
        super(dataClass);
    }

    protected BaseDao(ConnectionSource connectionSource, Class dataClass) throws SQLException {
        super(connectionSource, dataClass);
    }

    protected BaseDao(ConnectionSource connectionSource, DatabaseTableConfig tableConfig) throws SQLException {
        super(connectionSource, tableConfig);
    }
}
