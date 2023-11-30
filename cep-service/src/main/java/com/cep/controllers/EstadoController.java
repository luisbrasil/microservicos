package com.cep.controllers;

import com.cep.entities.Estado;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

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
@RequestMapping("/estados")
public class EstadoController {
    private final ObjectMapper objectMapper;

    public EstadoController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping
    public ResponseEntity<List<Estado>> GetFilmes(){
        try{
        Resource resource = new ClassPathResource("estados-cidades.json");
        String json = new String(Files.readAllBytes(Paths.get(resource.getURI())));

        List<Estado> estados = objectMapper.readValue(json, new TypeReference<>() {});

        return ResponseEntity.ok(estados);
    
        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }
}
