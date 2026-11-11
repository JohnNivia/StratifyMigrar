package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "proveedor")
public class ProveedorEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Integer idProveedor;

    public ProveedorEntity() {
    }

    public Integer getIdproveedor() {
        return idProveedor;
    }

    public void setIdproveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
}
