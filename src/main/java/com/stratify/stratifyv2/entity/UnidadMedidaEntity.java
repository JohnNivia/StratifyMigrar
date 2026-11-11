package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "unidad_medida")
public class UnidadMedidaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_unidad_medida")
    private Integer idUnidadMedida;

    public UnidadMedidaEntity() {
    }

    public Integer getIdunidadmedida() {
        return idUnidadMedida;
    }

    public void setIdunidadmedida(Integer idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }
}
