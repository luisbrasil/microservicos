package com.main.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/main")
public class MyController {

    private final String FILMES_URL = "http://localhost:8081/filmes";
    private final String ESTADOS_URL = "http://localhost:8082/estados";
    private final RestTemplate restTemplate;

    public MyController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/filmes")
    public ResponseEntity<String> getFilmes() {
        String filmesResponse = restTemplate.getForObject(FILMES_URL, String.class);
        return ResponseEntity.ok(filmesResponse);
    }

    @GetMapping("/estados")
    public ResponseEntity<String> getEstados() {
        String estadosResponse = restTemplate.getForObject(ESTADOS_URL, String.class);
        return ResponseEntity.ok(estadosResponse);
    }
}