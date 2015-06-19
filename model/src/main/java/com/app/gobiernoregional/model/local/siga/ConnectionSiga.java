package com.app.gobiernoregional.model.local.siga;


import com.grp.common.Constants;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionSiga {

    String url;
    java.sql.Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;


    public java.sql.Connection conectar(){

        url = "jdbc:jtds:sqlserver//"+ Constants.SERVER_IP+":"+Constants.PUERTO+";DatabaseName="+Constants.NAME_DATA_BASE;

        try{
            Class.forName(Constants.DRIVER);
            con = DriverManager.getConnection(url , Constants.USUER , Constants.PASSWORD);
            String SQL = "SELECT TOP 2 CODIGO_ACTIVO , DESCRIPCION FROM SIG_PATRIMONIO";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            //while (rs.next()) {
                //txtView.setText(rs.getString(2));
               // int i= 1;
                //Toast.makeText(this,"El resultado de la consulta es:  "+rs.getString(1), Toast.LENGTH_LONG).show();
            //i++;
            //}


        }
        catch(Exception ex){
            ex.printStackTrace();
        }

     return con;

    }
}
