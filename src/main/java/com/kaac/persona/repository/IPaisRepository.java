package com.kaac.persona.repository;

import com.kaac.persona.model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaisRepository extends JpaRepository<Pais, Long> {
}
