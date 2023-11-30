package com.filmes.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.filmes.entities.Filmes;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
    private final ObjectMapper objectMapper;

    public FilmesController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<List<Filmes>> GetFilmes(){
        try{
        Resource resource = new ClassPathResource("filmes.json");
        String json = new String(Files.readAllBytes(Paths.get(resource.getURI())));

        List<Filmes> movies = objectMapper.readValue(json, new TypeReference<>() {});

        return ResponseEntity.ok(movies);
    
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }
}