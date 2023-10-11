package com.example.ApiRest.Repositorios;

import com.example.ApiRest.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Query Method
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    boolean existsByDni(int dni);

    //JPQL con parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1% OR p.apellido LIKE %?2%")
    List<Persona> searchJpqlIndexado(String filtro1, String filtro2);

    //JPQL con parametros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:nombre% OR p.apellido LIKE %:apellido%")
    List<Persona> searchJpqlNombrado(@Param("nombre") String filtro1, @Param("apellido") String filtro2);

    //Native Queries
    @Query(value = "select * from persona where nombre like %?1% or apellido like %?2%",
        nativeQuery = true)
    List<Persona> searchNativa(String filtro1, String filtro2);

    @Query(value = "select * from persona where nombre like %?1% or apellido like %?2%",
            countQuery = "select count(*) from persona",
            nativeQuery = true)
    Page<Persona> searchNativaPaged(String filtro1, String filtro2, Pageable pageable);
}
