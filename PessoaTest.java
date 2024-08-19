package br.com.cpardin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PessoaTest {

    @Test
    void testNomesFemininos() {
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

        // Verificar se todas as pessoas na lista são femininas
        assertTrue(feminino.size() == pessoas.size(), "A lista não contém apenas nomes femininos.");
    }
}
