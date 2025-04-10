package com.tramp.controlescolar.models.tablas;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "tbl_academicos_admin")
public class AcademicosAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nid_academico_admin")
    private Integer nidAcademicoAdmin;

    @Column(name = "nid_persona", nullable = false)
    private Integer nidPersona;

    @Column(name = "nid_categoria", nullable = false)
    private Integer niCategoria;

    @Column(name = "nid_carrera", nullable = false)
    private Integer nidCarrera;

    @Column(name = "cnumero_cuenta", unique = true, length = 9, nullable = false)
    private String numeroCuenta;

    @Column(name = "ccorreo_institucional", unique = true, length = 50, nullable = false)
    private String correoInstitucional;

    @Column(name = "bhabilitado", nullable = false)
    private Boolean habilitado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_alta")
    private Date fechaAlta;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dfecha_baja")
    private Date fechaBaja;


}
