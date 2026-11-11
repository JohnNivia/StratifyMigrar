package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ubicacion_almacen")
public class UbicacionAlmacenEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion_almacen")
    private Integer idUbicacion;

    public UbicacionAlmacenEntity() {
    }

    public Integer getIdubicacion() {
        return idUbicacion;
    }

    public void setIdubicacion(Integer idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}
