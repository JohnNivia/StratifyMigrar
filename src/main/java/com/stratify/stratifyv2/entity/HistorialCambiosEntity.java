package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "historial_cambios")
public class HistorialCambiosEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial_cambios")
    private Integer idHistorial;

    public HistorialCambiosEntity() {
    }

    public Integer getIdhistorial() {
        return idHistorial;
    }

    public void setIdhistorial(Integer idHistorial) {
        this.idHistorial = idHistorial;
    }
}
