package com.project.springboot.soccer.players.api.repository;

import com.project.springboot.soccer.players.api.model.Posicion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosicionRepository extends JpaRepository<Posicion, Long> {
}
