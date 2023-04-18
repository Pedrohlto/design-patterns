package com.pedro.patterns.criacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class TesteBuilder {

    @Test
    @DisplayName("Deve criar uma funcionario com todas as informações com sucesso")
    public void deveCriarUmFuncionarioComSucesso(){

        var funcionario = new Funcionario("Fulano", LocalDate.of(2020, Month.JANUARY, 3), BigDecimal.valueOf(1500), "(11)99996-9996", LocalDate.of(1990, Month.JULY, 15), "40412366598", "15423659", Senioridade.PLENO);


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

