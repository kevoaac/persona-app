package com.kaac.persona.rest;

import com.kaac.persona.model.Persona;
import com.kaac.persona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/personas")
@CrossOrigin
public class PersonaRest {
    @Autowired
    private PersonaService personaService;
    @GetMapping
    private ResponseEntity<List<Persona>> findAll(){
        return ResponseEntity.ok(this.personaService.findAll());
    }

    @PostMapping("add")
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona){
        try {
            Persona personaGuardada = this.personaService.save(persona);
            return ResponseEntity.created(new URI("/personas/" + personaGuardada.getId())).body(personaGuardada);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
