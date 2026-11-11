package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rol_permiso")
public class RolPermisoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_id_rol")
    private String rolIdRol;

    public RolPermisoEntity() {
    }

    public String getRolidrol() {
        return rolIdRol;
    }

    public void setRolidrol(String rolIdRol) {
        this.rolIdRol = rolIdRol;
    }
}
