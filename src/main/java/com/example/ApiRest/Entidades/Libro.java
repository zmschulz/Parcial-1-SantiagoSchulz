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
public class Libro extends BaseEntity {

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private int fecha;

    @Column(name = "genero")
    private String genero;

    @Column(name = "paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "LibroAutor",
            joinColumns = @JoinColumn(name = "libroId"),
            inverseJoinColumns = @JoinColumn(name = "autorId")
    )
    private List<Autor> listaAutores = new ArrayList<Autor>();

}
