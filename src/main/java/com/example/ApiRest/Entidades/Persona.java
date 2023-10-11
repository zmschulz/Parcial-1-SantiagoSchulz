package com.example.ApiRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Persona extends BaseEntity {

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "personaId")
    private List<Libro> listaLibros = new ArrayList<Libro>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilioId")
    private Domicilio domicilio;
}
