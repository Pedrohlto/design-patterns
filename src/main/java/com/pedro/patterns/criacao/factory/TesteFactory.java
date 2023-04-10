package com.pedro.patterns.criacao.factory;

import com.pedro.patterns.criacao.builder.Funcionario;
import com.pedro.patterns.criacao.builder.Senioridade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class TesteFactory {

    @Test
    @DisplayName("Deve retornar classe instanciada correta a partir da senioridade do funcionario passada")
    public void deveRetornarClasseDeCalculoCorretaAtravesDaFactory(){

        var factoryRegra = new RegraCalculoAumentoFactory();
        var funcionarioJR = Funcionario.builder().senioridade(Senioridade.JUNIOR).build();
        var funcionarioPleno = Funcionario.builder().senioridade(Senioridade.PLENO).build();
        var funcionarioSenior = Funcionario.builder().senioridade(Senioridade.SENIOR).build();
        var funcionarioEspecialista = Funcionario.builder().senioridade(Senioridade.ESPECIALISTA).build();

        var factoryJunior = factoryRegra.getRegra(funcionarioJR);
        var factoryPleno = factoryRegra.getRegra(funcionarioPleno);
        var factorySenior = factoryRegra.getRegra(funcionarioSenior);
        var factoryEspecialista = factoryRegra.getRegra(funcionarioEspecialista);

        Assertions.assertTrue(factoryJunior instanceof AumentoSalarioJR);
        Assertions.assertTrue(factoryPleno instanceof AumentoSalarioPleno);
        Assertions.assertTrue(factorySenior instanceof AumentoSalarioSenior);
        Assertions.assertTrue(factoryEspecialista instanceof AumentoSalarioEspecialista);
    }

    @Test
    @DisplayName("Deve calcular valor correto para funcionario de acordo com a senioridade")
    void deveCalcularValorCorretoParaFuncionarioDeAcordoComSenioridade() {
        var funcionario = Funcionario.builder()
                .nome("Fulano")
                .dataContratacao(LocalDate.of(2020, Month.JANUARY, 3))
                .salario(BigDecimal.valueOf(1500))
                .dataNascimento(LocalDate.of(1990, Month.JULY, 15))
                .senioridade(Senioridade.PLENO)
                .build();

        var rh = new RH();
        var aumento = rh.calcularAumentoFuncionarioComFactory(funcionario);
        Assertions.assertEquals(BigDecimal.valueOf(150.0), aumento);
    }
}

