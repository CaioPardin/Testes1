package br.com.cpardin;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Pedro", "masculino"));
        pessoas.add(new Pessoa("Marta", "feminino"));
        pessoas.add(new Pessoa("Caio", "masculino"));
        pessoas.add(new Pessoa("Karol", "feminino"));
        pessoas.add(new Pessoa("Maria", "feminino"));
        pessoas.add(new Pessoa("Kaike", "masculino"));

        // Filtrar apenas as pessoas do sexo feminino
        List<Pessoa> feminino = pessoas.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("feminino"))
                .collect(Collectors.toList());

        // Imprimir os nomes das pessoas do sexo feminino
        feminino.forEach(pessoa -> System.out.print(pessoa.getNome() + ", "));
    }
}