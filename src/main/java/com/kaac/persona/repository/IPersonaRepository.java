package com.kaac.persona.repository;

import com.kaac.persona.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
