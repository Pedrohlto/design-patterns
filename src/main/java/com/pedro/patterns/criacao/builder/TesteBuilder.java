package com.pedro.patterns.criacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class TesteBuilder {

    @Test
    @DisplayName("Deve criar uma funcionario com todas as informações através do padrão Builder")
    public void deveCriarUmFuncionarioComBuilderComSucesso(){

        var funcionario = Funcionario.builder().
                nome("Fulano")
                .dataContratacao(LocalDate.of(2020, Month.JANUARY, 3))
                .salario(BigDecimal.valueOf(1500))
                .telefone("(11)99996-9996")
                .dataNascimento(LocalDate.of(1990, Month.JULY, 15))
                .cpf("40412366598")
                .rg("15423659")
                .senioridade(Senioridade.PLENO)
                .build();

        Assertions.assertEquals("Fulano", funcionario.getNome());
        Assertions.assertEquals(LocalDate.of(2020,Month.JANUARY,3), funcionario.getDataContratacao());
        Assertions.assertEquals(BigDecimal.valueOf(1500), funcionario.getSalario());
        Assertions.assertEquals("(11)99996-9996", funcionario.getTelefone());
        Assertions.assertEquals(LocalDate.of(1990, Month.JULY, 15), funcionario.getDataNascimento());
        Assertions.assertEquals("40412366598", funcionario.getCpf());
        Assertions.assertEquals("15423659", funcionario.getRg());
        Assertions.assertEquals(Senioridade.PLENO, funcionario.getSenioridade());
    }
}

