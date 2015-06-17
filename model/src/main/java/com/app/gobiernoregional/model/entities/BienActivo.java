package com.app.gobiernoregional.model.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

@DatabaseTable
public class BienActivo{

    public static final String CODIGO_ACTIVO="_id";
    public static final String ESTADO_ACTIVO ="estado_activo";
    public static final String TIPO_ACTIVO ="tipo_activo";
    public static final String SEDF_ACTIVO ="sede_activo";
    public static final String DESCRIPCION_ACTIVO="descripcion_activo";
    public static final String EMPLEADO_RESPONSABLE_ACTIVO = "empleado_responsable_activo";
    public static final String EMPLEADO_FINAL_ACTIVO ="empleado_final_activo";
    public static final String CARACTERITICAS_ACTIVO="caracteristica_activo";
    public static final String MODELO_ACTIVO ="modelo_activo";
    public static final String NRO_SERIE_ACTIVO="nro_serie_activo";
    public static final String MARCA_ACTIVO="marca_activo";
    public static final String ESTADO_ACTUAL_ACTIVO="estado_actual_activo";
    public static final String ESTADO_CONVERV_ACTIVO="estado_conserv_activo";
    public static final String CODIGO_BARRAS="codigo_barras" ;


    @DatabaseField(id = true, columnName = CODIGO_ACTIVO)
    private String codigo_activo;
    @DatabaseField(columnName =ESTADO_ACTIVO)
    private String estado_activo ;
    @DatabaseField(columnName = TIPO_ACTIVO)
    private char tipo_activo;
    @DatabaseField(columnName = SEDF_ACTIVO)
    private int sede_activo;
    @DatabaseField(columnName = DESCRIPCION_ACTIVO)
    private String descripcion_activo;
    @DatabaseField(columnName = EMPLEADO_RESPONSABLE_ACTIVO)
    private String empleado_responsable_activo;
    @DatabaseField(columnName = EMPLEADO_FINAL_ACTIVO)
    private String empleado_final_activo;
    @DatabaseField(columnName = CARACTERITICAS_ACTIVO)
    private String caracteristicas_activo;
    @DatabaseField(columnName = MODELO_ACTIVO)
    private String modelo_activo;
    @DatabaseField(columnName = NRO_SERIE_ACTIVO)
    private String nro_serie_activo;
    @DatabaseField(columnName = MARCA_ACTIVO)
    private String marca_activo;
    @DatabaseField(columnName = ESTADO_ACTUAL_ACTIVO)
    private char estado_actual_activo;
    @DatabaseField(columnName = ESTADO_CONVERV_ACTIVO)
    private char estado_conserv_activo;
    @DatabaseField(columnName = CODIGO_BARRAS)
    private String codigo_barras_activo;


    public BienActivo(String codigo_activo, String estado_activo, char tipo_activo, int sede_activo, String descripcion_activo, String empleado_responsable_activo, String empleado_final_activo, String caracteristicas_activo, String modelo_activo, String nro_serie_activo, String marca_activo, char estado_actual_activo, char estado_conserv_activo, String codigo_barras_activo) {
        this.codigo_activo = codigo_activo;
        this.estado_activo = estado_activo;
        this.tipo_activo = tipo_activo;
        this.sede_activo = sede_activo;
        this.descripcion_activo = descripcion_activo;
        this.empleado_responsable_activo = empleado_responsable_activo;
        this.empleado_final_activo = empleado_final_activo;
        this.caracteristicas_activo = caracteristicas_activo;
        this.modelo_activo = modelo_activo;
        this.nro_serie_activo = nro_serie_activo;
        this.marca_activo = marca_activo;
        this.estado_actual_activo = estado_actual_activo;
        this.estado_conserv_activo = estado_conserv_activo;
        this.codigo_barras_activo = codigo_barras_activo;
    }



    public String getCodigo_activo() {
        return codigo_activo;
    }

    public void setCodigo_activo(String codigo_activo) {
        this.codigo_activo = codigo_activo;
    }

    public String getEstado_activo() {
        return estado_activo;
    }

    public void setEstado_activo(String estado_activo) {
        this.estado_activo = estado_activo;
    }

    public char getTipo_activo() {
        return tipo_activo;
    }

    public void setTipo_activo(char tipo_activo) {
        this.tipo_activo = tipo_activo;
    }

    public int getSede_activo() {
        return sede_activo;
    }

    public void setSede_activo(int sede_activo) {
        this.sede_activo = sede_activo;
    }

    public String getDescripcion_activo() {
        return descripcion_activo;
    }

    public void setDescripcion_activo(String descripcion_activo) {
        this.descripcion_activo = descripcion_activo;
    }

    public String getEmpleado_responsable_activo() {
        return empleado_responsable_activo;
    }

    public void setEmpleado_responsable_activo(String empleado_responsable_activo) {
        this.empleado_responsable_activo = empleado_responsable_activo;
    }

    public String getEmpleado_final_activo() {
        return empleado_final_activo;
    }

    public void setEmpleado_final_activo(String empleado_final_activo) {
        this.empleado_final_activo = empleado_final_activo;
    }

    public String getCaracteristicas_activo() {
        return caracteristicas_activo;
    }

    public void setCaracteristicas_activo(String caracteristicas_activo) {
        this.caracteristicas_activo = caracteristicas_activo;
    }

    public String getModelo_activo() {
        return modelo_activo;
    }

    public void setModelo_activo(String modelo_activo) {
        this.modelo_activo = modelo_activo;
    }

    public String getNro_serie_activo() {
        return nro_serie_activo;
    }

    public void setNro_serie_activo(String nro_serie_activo) {
        this.nro_serie_activo = nro_serie_activo;
    }

    public String getMarca_activo() {
        return marca_activo;
    }

    public void setMarca_activo(String marca_activo) {
        this.marca_activo = marca_activo;
    }

    public char getEstado_actual_activo() {
        return estado_actual_activo;
    }

    public void setEstado_actual_activo(char estado_actual_activo) {
        this.estado_actual_activo = estado_actual_activo;
    }

    public char getEstado_conserv_activo() {
        return estado_conserv_activo;
    }

    public void setEstado_conserv_activo(char estado_conserv_activo) {
        this.estado_conserv_activo = estado_conserv_activo;
    }

    public String getCodigo_barras_activo() {
        return codigo_barras_activo;
    }

    public void setCodigo_barras_activo(String codigo_barras_activo) {
        this.codigo_barras_activo = codigo_barras_activo;
    }
}