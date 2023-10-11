package com.example.ApiRest.Entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Domicilio extends BaseEntity {

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "localidadId")
    private Localidad localidad;
}
