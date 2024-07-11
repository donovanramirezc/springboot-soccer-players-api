package com.project.springboot.soccer.players.api.repository;

import com.project.springboot.soccer.players.api.model.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FutbolistaRepository extends JpaRepository<Futbolista, Long> {
}
