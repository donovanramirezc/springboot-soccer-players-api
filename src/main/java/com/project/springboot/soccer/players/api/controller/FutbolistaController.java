package com.project.springboot.soccer.players.api.controller;

import com.project.springboot.soccer.players.api.model.Futbolista;
import com.project.springboot.soccer.players.api.service.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/paginacion")
    public ResponseEntity<Page<Futbolista>> getAllFutbolistas(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "10") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Futbolista> futbolistas = futbolistaService.getAllFutbolistas(pageable);
        return new ResponseEntity<>(futbolistas, HttpStatus.OK);
    }

}
