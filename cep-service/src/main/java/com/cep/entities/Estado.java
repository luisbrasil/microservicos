package com.cep.entities;

import java.util.List;

public class Estado{
    public String sigla;
    public String nome;
    public List<String> cidades;

    public Estado() {
    }

    public Estado(String sigla, String nome, List<String> cidades) {
        this.sigla = sigla;
        this.nome = nome;
        this.cidades = cidades;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getCidades() {
        return this.cidades;
    }

    public void setCidades(List<String> cidades) {
        this.cidades = cidades;
    }
}
