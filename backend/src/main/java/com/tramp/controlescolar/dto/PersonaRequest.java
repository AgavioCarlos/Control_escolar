package com.tramp.controlescolar.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonaRequest {
    // Datos de la tabla Personas
    private String strNombre;
    private String strApellidos;
    private Boolean bitSexo;
    private Integer intEdad;
    private Date dateFechaNacimiento;
    private String strRFC;
    private String strNumeroCelular;
    private String strContraseña;

    // Claves foráneas
    private Integer intIdCategoria;
    private Integer intIdCarrera;

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrApellidos() {
        return strApellidos;
    }

    public void setStrApellidos(String strApellidos) {
        this.strApellidos = strApellidos;
    }

    public Boolean getBitSexo() {
        return bitSexo;
    }

    public void setBitSexo(Boolean bitSexo) {
        this.bitSexo = bitSexo;
    }

    public Integer getIntEdad() {
        return intEdad;
    }

    public void setIntEdad(Integer intEdad) {
        this.intEdad = intEdad;
    }

    public Date getDateFechaNacimiento() {
        return dateFechaNacimiento;
    }

    public void setDateFechaNacimiento(Date dateFechaNacimiento) {
        this.dateFechaNacimiento = dateFechaNacimiento;
    }

    public String getStrRFC() {
        return strRFC;
    }

    public void setStrRFC(String strRFC) {
        this.strRFC = strRFC;
    }

    public String getStrNumeroCelular() {
        return strNumeroCelular;
    }

    public void setStrNumeroCelular(String strNumeroCelular) {
        this.strNumeroCelular = strNumeroCelular;
    }

    public String getStrContraseña() {
        return strContraseña;
    }

    public void setStrContraseña(String strContraseña) {
        this.strContraseña = strContraseña;
    }

    public Integer getIntIdCategoria() {
        return intIdCategoria;
    }

    public void setIntIdCategoria(Integer intIdCategoria) {
        this.intIdCategoria = intIdCategoria;
    }

    public Integer getIntIdCarrera() {
        return intIdCarrera;
    }

    public void setIntIdCarrera(Integer intIdCarrera) {
        this.intIdCarrera = intIdCarrera;
    }
}

