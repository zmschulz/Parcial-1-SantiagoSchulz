package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Autor;
import com.example.ApiRest.Servicios.AutorService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "ApiRest.com/autor")
public class AutorController extends BaseControllerImpl<Autor, AutorService> {
}
