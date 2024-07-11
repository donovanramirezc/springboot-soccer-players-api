package com.project.springboot.soccer.players.api.controller;

import com.project.springboot.soccer.players.api.model.Futbolista;
import com.project.springboot.soccer.players.api.service.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/futbolistas")
public class FutbolistaController {

    @Autowired
    private FutbolistaService futbolistaService;

    @GetMapping
    public ResponseEntity<List<Futbolista>> getAllFutbolistas() {
        List<Futbolista> futbolistas = futbolistaService.getAllFutbolistas();
        return new ResponseEntity<>(futbolistas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Futbolista> getFutbolistaById(@PathVariable("id") Long id) {
        Optional<Futbolista> futbolista = futbolistaService.getFutbolistaById(id);
        return futbolista.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
