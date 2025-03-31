package com.tramp.controlescolar.models.catalogos;

import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cat_carreras")
@Data
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid_carrera")
    private int nid_carrera;

    @Column(name = "ccarrera", nullable = false)
    private String ccarrera;

    @Column(name = "bhabilitado")
    private boolean bhabilitado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_alta")
    private Date dfecha_alta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_baja")
    private Date dfecha_baja;

    public int getNid_carrera() {
        return nid_carrera;
    }

    public String getCcarrera() {
        return ccarrera;
    }

    public boolean isBhabilitado() {
        return bhabilitado;
    }

    public Date getDfecha_alta() {
        return dfecha_alta;
    }

    public Date getDfecha_baja() {
        return dfecha_baja;
    }

    public void setNid_carrera(int nid_carrera) {
        this.nid_carrera = nid_carrera;
    }

    public void setCcarrera(String ccarrera) {
        this.ccarrera = ccarrera;
    }

    public void setBhabilitado(boolean bhabilitado) {
        this.bhabilitado = bhabilitado;
    }

    public void setDfecha_alta(Date dfecha_alta) {
        this.dfecha_alta = dfecha_alta;
    }

    public void setDfecha_baja(Date dfecha_baja) {
        this.dfecha_baja = dfecha_baja;
    }
}
