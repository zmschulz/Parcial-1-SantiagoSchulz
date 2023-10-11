package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Localidad;
import com.example.ApiRest.Servicios.LocalidadService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "ApiRest.com/localidad")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadService>{
}
