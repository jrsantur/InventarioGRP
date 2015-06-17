package com.app.gobiernoregional.model.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by practicanteoti on 11/06/2015.
 */

@DatabaseTable
public class Responsable implements Serializable {

    public static final String DNI = "dni";
    public static final String EMPLEADO = "empleado";
    public static final String APELLIDO_PATERNO = "apellido_paterno";
    public static final String APELLIDO_MATERNO = "apellido_materno";
    public static final String NOMBRES = "nombres";


    @DatabaseField( columnName = DNI)
    private String dni;

    @DatabaseField(id = true , columnName = EMPLEADO )
    private String empleado;

    @DatabaseField(columnName = APELLIDO_PATERNO)
    private String apellidoPaterno ;

    @DatabaseField(columnName = APELLIDO_MATERNO)
    private String apellidoMaterno ;

    @DatabaseField(columnName = NOMBRES)
    private String nombres;


    public Responsable() {
        this.dni = null;
        this.empleado = null;
        this.apellidoPaterno = null;
        this.apellidoMaterno = null;
        this.nombres = null;
    }



    public Responsable(String dni, String empleado, String apellidoPaterno, String apellidoMaterno, String nombres) {
        this.dni = dni;
        this.empleado = empleado;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
    }



    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
