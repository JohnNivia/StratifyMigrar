package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producto")
public class ProductoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    public ProductoEntity() {
    }

    public Integer getIdproducto() {
        return idProducto;
    }

    public void setIdproducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
