package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Domicilio;
import com.example.ApiRest.Repositorios.BaseRepository;
import com.example.ApiRest.Repositorios.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends BaseServiceImpl<Domicilio, Long> {
    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioService(DomicilioRepository domicilioRepository, BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
        this.domicilioRepository=domicilioRepository;
    }
}
