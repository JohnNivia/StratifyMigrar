package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    public UsuarioEntity() {
    }

    public Integer getIdusuario() {
        return idUsuario;
    }

    public void setIdusuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
}
