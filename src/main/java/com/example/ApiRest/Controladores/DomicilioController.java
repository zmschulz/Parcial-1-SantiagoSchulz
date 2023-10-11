package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Domicilio;
import com.example.ApiRest.Servicios.DomicilioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioService>{
}
