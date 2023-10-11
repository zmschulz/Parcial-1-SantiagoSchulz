package com.example.ApiRest.Servicios;

import com.example.ApiRest.Entidades.Persona;
import com.example.ApiRest.Repositorios.BaseRepository;
import com.example.ApiRest.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class PersonaService extends BaseServiceImpl<Persona, Long> {
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository=personaRepository;
    }

    //Metodos para probar queries
    public List<Persona> searchNombreApellidoQuery(String filtro1, String filtro2) throws Exception{
        try {
            return this.personaRepository.findByNombreContainingOrApellidoContaining(filtro1, filtro2);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public List<Persona> searchNombreApellidoJpqlIndex(String filtro1, String filtro2) throws Exception{
        try {
            return this.personaRepository.searchJpqlIndexado(filtro1, filtro2);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public List<Persona> searchNombreApellidoJpqlNomb(String filtro1, String filtro2) throws Exception{
        try {
            return this.personaRepository.searchJpqlNombrado(filtro1, filtro2);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    public List<Persona> searchNombreApellidoNativa(String filtro1, String filtro2) throws Exception{
        try {
            return this.personaRepository.searchNativa(filtro1, filtro2);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public Page<Persona> searchNombreApellidoNativaPaged(String filtro1, String filtro2, Pageable pageable) throws Exception{
        try {
            return this.personaRepository.searchNativaPaged(filtro1, filtro2, pageable);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
