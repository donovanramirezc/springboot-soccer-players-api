package com.project.springboot.soccer.players.api.service;

import com.project.springboot.soccer.players.api.model.Futbolista;

import java.util.List;
import java.util.Optional;

public interface FutbolistaService {

    List<Futbolista> getAllFutbolistas();
    Optional<Futbolista> getFutbolistaById(Long id);
}
