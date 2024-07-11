package com.project.springboot.soccer.players.api.service;

import com.project.springboot.soccer.players.api.model.Futbolista;
import com.project.springboot.soccer.players.api.repository.FutbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FutbolistaServiceImpl implements FutbolistaService {

    @Autowired
    private FutbolistaRepository futbolistaRepository;

    @Override
    public List<Futbolista> getAllFutbolistas() {
        return futbolistaRepository.findAll();
    }

    @Override
    public Optional<Futbolista> getFutbolistaById(Long id) {
        return futbolistaRepository.findById(id);
    }
}
