package com.kaac.persona.rest;

import com.kaac.persona.model.Estado;
import com.kaac.persona.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoRest {
    @Autowired
    private EstadoService estadoService;

    // Listar solo los espados pertenecientes a un país dado.
    @GetMapping("/{id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais(@PathVariable("id") Long idPais){
        return ResponseEntity.ok(this.estadoService.findAllByCountry(idPais));
    }
}
