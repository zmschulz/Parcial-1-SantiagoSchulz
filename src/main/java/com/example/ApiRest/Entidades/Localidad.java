package com.example.ApiRest.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Localidad extends BaseEntity {

    @Column(name = "denominacion")
    private String denominacion;
}
