package com.example.ApiRest.Controladores;

import com.example.ApiRest.Entidades.Persona;
import com.example.ApiRest.Servicios.PersonaService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/api/persona")
public class PersonaController extends BaseControllerImpl<Persona, PersonaService>{

    @GetMapping("/search1")
    public ResponseEntity<?> search1(@RequestParam String nombre, String apellido) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoQuery(nombre, apellido));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search2")
    public ResponseEntity<?> search2(@RequestParam String nombre, String apellido) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoJpqlIndex(nombre, apellido));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search3")
    public ResponseEntity<?> search3(@RequestParam String nombre, String apellido) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoJpqlNomb(nombre, apellido));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search4")
    public ResponseEntity<?> search4(@RequestParam String nombre, String apellido) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoNativa(nombre, apellido));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
    @GetMapping("/search4paged")
    public ResponseEntity<?> search4paged(@RequestParam String nombre, String apellido, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchNombreApellidoNativaPaged(nombre, apellido, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }
}
