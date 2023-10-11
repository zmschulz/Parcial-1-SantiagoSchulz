package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Localidad;
import com.example.ApiRest.Repositorios.BaseRepository;
import com.example.ApiRest.Repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService extends BaseServiceImpl<Localidad, Long> {
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadService(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository=localidadRepository;
    }
}
