package com.tramp.controlescolar.models.catalogos;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cat_categorias")
public class Categorias {
/*     private Integer nid_categoria;
    private String ccategoria;
    private boolean bhabilitado;
    private Date dfecha_alta;
    private Date dfecha_baja; */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid_categoria")
    private Integer nid_categoria;

    @Column(name = "ccategoria", nullable = false)
    private String ccategoria;

    @Column(name = "bhabilitado")
    private boolean bhabilitado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_alta")
    private Date dfecha_alta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_baja")
    private Date dfecha_baja;

    public Integer getNid_categoria() {
        return nid_categoria;
    }

    public void setNid_categoria(Integer nid_categoria) {
        this.nid_categoria = nid_categoria;
    }

    public String getCcategoria() {
        return ccategoria;
    }

    public void setCcategoria(String ccategoria) {
        this.ccategoria = ccategoria;
    }

    public boolean isBhabilitado() {
        return bhabilitado;
    }

    public void setBhabilitado(boolean bhabilitado) {
        this.bhabilitado = bhabilitado;
    }

    public Date getDfecha_alta() {
        return dfecha_alta;
    }

    public void setDfecha_alta(Date dfecha_alta) {
        this.dfecha_alta = dfecha_alta;
    }

    public Date getDfecha_baja() {
        return dfecha_baja;
    }

    public void setDfecha_baja(Date dfecha_baja) {
        this.dfecha_baja = dfecha_baja;
    }
}
