package com.kaac.persona.rest;

import com.kaac.persona.model.Pais;
import com.kaac.persona.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/paises")// URL base para acceder a este servicio
public class PaisRest {
    @Autowired
    private PaisService paisService;

    @GetMapping // Dar una respuesta a travez de peticiones get
    private ResponseEntity<List<Pais>> getAllPaises() {
        return ResponseEntity.ok(paisService.findAll());
    }

}
