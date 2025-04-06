package com.tramp.controlescolar.models.tablas;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "tbl_usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid_usuario")
    private Integer nidUsuario;

    @Column(name = "nid_persona", nullable = false)
    private Integer nidPersona;


    @Column(name = "cusuario", unique = true, length = 9, nullable = false)
    private String usuario;

    //Corregir en la base de datos
    @Column(name = "ccontrasenia", length = 50, nullable = false)
    private String contrasenia;

    @Column(name = "bhabilitado", nullable = false)
    private Boolean habilitado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_alta")
    private Date fechaAlta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_baja")
    private Date fechaBaja;

    public Integer getNidUsuario() {
        return nidUsuario;
    }

    public Integer getNidPersona() {
        return nidPersona;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public Boolean getHabilitado() {
        return habilitado;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setNidUsuario(Integer nidUsuario) {
        this.nidUsuario = nidUsuario;
    }

    public void setNidPersona(Integer nidPersona) {
        this.nidPersona = nidPersona;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setHabilitado(Boolean habilitado) {
        this.habilitado = habilitado;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
