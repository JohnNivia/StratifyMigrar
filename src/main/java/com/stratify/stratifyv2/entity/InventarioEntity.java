package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "inventario")
public class InventarioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inventario")
    private Integer idInventario;

    public InventarioEntity() {
    }

    public Integer getIdinventario() {
        return idInventario;
    }

    public void setIdinventario(Integer idInventario) {
        this.idInventario = idInventario;
    }
}
