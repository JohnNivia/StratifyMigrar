package com.stratify.stratifyv2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="rol")
@Getter
@Setter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_rol")
    private int id_rol;

    @Column(name = "descripcion_rol")
    private String descripcion_rol;

}
