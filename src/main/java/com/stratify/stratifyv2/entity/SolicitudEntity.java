package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "solicitud")
public class SolicitudEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud")
    private Integer idSolicitud;

    public SolicitudEntity() {
    }

    public Integer getIdsolicitud() {
        return idSolicitud;
    }

    public void setIdsolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
}
