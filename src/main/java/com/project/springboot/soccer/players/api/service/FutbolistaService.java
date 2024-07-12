package com.project.springboot.soccer.players.api.service;

import com.project.springboot.soccer.players.api.model.Futbolista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface FutbolistaService {

    List<Futbolista> getAllFutbolistas();
    Optional<Futbolista> getFutbolistaById(Long id);
    Page<Futbolista> getAllFutbolistas(Pageable pageable);
}
