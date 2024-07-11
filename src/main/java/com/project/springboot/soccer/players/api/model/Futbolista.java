package com.project.springboot.soccer.players.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "FUTBOLISTA")
public class Futbolista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDOS")
    private String apellidos;

    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "CARACTERISTICAS")
    private String caracteristicas;

    @ManyToOne
    @JoinColumn(name = "posicion_id", referencedColumnName = "id")
    private Posicion posicion;

}
