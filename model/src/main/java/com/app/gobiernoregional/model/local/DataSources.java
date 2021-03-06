package com.app.gobiernoregional.model.local;


import com.app.gobiernoregional.model.entities.Responsable;
import com.app.gobiernoregional.model.local.siga.ConnectionSiga;
import com.squareup.otto.Bus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sun.rmi.runtime.Log;

/**
 * Created by practicanteoti on 16/06/2015.
 */
public class DataSources implements DatabaseApi {


    private final Bus bus;
    Statement stm ;
    ResultSet resultSet;
    Connection conn ;


    public DataSources(Bus bus) {
        this.bus = bus;
        try {
            conn = new ConnectionSiga().conectar();
            stm = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Responsable getAllResponsables() {

        Responsable responsable = null;

        String SQL_query = "SELECT docm_ident , empleado, apellido_paterno , apellido_materno, nombres  FROM SIG_PERSONAL  ";
        try {

            resultSet = stm.executeQuery(SQL_query);

            while (resultSet.next()){
                String dni = resultSet.getString(1);
                String empleado = resultSet.getString(2);
                String apellido_paterno = resultSet.getString(3);
                String apellido_materno = resultSet.getString(4);
                String nombres = resultSet.getString(5);

                responsable = new Responsable();
                responsable.setDni(dni);
                responsable.setEmpleado(empleado);
                responsable.setApellidoPaterno(apellido_paterno);
                responsable.setApellidoMaterno(apellido_materno);
                responsable.setNombres(nombres);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return responsable;
    }

    @Override
    public Responsable getResponsableById() {
        return null;
    }

    @Override
    public Responsable getOneResponsable() {
        return null;
    }
}
