package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Autor;
import com.example.ApiRest.Repositorios.AutorRepository;
import com.example.ApiRest.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService extends BaseServiceImpl<Autor, Long>{
    @Autowired
    private AutorRepository autorRepository;
    public AutorService(BaseRepository<Autor, Long> baseRepository , AutorRepository autorRepository ) {
        super(baseRepository);
        this.autorRepository=autorRepository;
    }
}
