package com.pedro.patterns.criacao.factory;

import com.pedro.patterns.criacao.builder.Funcionario;

import java.math.BigDecimal;

public class AumentoSalarioPleno implements CalcularAumento {

    private static final Double PORCENTAGEM_PLENO_TEMPO_CASA_MENOR_CINCO = 0.10 ;
    private static final Double PORCENTAGEM_PLENO_TEMPO_CASA_MAIOR_CINCO = 0.12;

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        if(funcionario.getTempoDeCasaEmAnos() < 5) {
            return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_PLENO_TEMPO_CASA_MENOR_CINCO));
        } else {
            return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_PLENO_TEMPO_CASA_MAIOR_CINCO));
        }
    }
}
