package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Libro;
import com.example.ApiRest.Servicios.LibroService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/libro")
public class LibroController extends BaseControllerImpl<Libro, LibroService> {
}
