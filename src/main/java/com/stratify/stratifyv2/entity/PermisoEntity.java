package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permiso")
public class PermisoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_permiso")
    private String idPermiso;

    public PermisoEntity() {
    }

    public String getIdpermiso() {
        return idPermiso;
    }

    public void setIdpermiso(String idPermiso) {
        this.idPermiso = idPermiso;
    }
}
