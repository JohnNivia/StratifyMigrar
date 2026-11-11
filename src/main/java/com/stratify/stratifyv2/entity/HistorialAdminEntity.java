package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "historial_admin")
public class HistorialAdminEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial_admin")
    private Integer idHistorial;

    public HistorialAdminEntity() {
    }

    public Integer getIdhistorial() {
        return idHistorial;
    }

    public void setIdhistorial(Integer idHistorial) {
        this.idHistorial = idHistorial;
    }
}
