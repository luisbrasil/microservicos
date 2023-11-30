package com.filmes.entities;

import java.util.List;

public class Filmes{
    public int id;
    public String titulo;
    public String diretor;
    public String classificacaoEtaria;
    public int anoLancamento;
    public int duracao;
    public List<String> atores;

    public Filmes() {
    }

    public Filmes(int id, String titulo, String diretor, String classificacaoEtaria, int anoLancamento, int duracao, List<String> atores) {
        this.id = id;
        this.titulo = titulo;
        this.diretor = diretor;
        this.classificacaoEtaria = classificacaoEtaria;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.atores = atores;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getClassificacaoEtaria() {
        return this.classificacaoEtaria;
    }

    public void setClassificacaoEtaria(String classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<String> getAtores() {
        return this.atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }
}
