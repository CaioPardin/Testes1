package br.com.cpardin;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Pessoa {
    private String nome;
    private String genero;

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}