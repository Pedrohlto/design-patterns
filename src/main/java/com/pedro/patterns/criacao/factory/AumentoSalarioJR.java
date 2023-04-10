package com.pedro.patterns.criacao.factory;

import com.pedro.patterns.criacao.builder.Funcionario;

import java.math.BigDecimal;

public class AumentoSalarioJR implements CalcularAumento {

    private static final Double PORCENTAGEM_JR_TEMPO_CASA_MENOR_CINCO = 0.5 ;
    private static final Double PORCENTAGEM_JR_TEMPO_CASA_MAIOR_CINCO = 0.7 ;

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        if(funcionario.getTempoDeCasaEmAnos() < 5) {
            return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_JR_TEMPO_CASA_MENOR_CINCO));
        } else {
            return funcionario.getSalario().multiply(BigDecimal.valueOf(PORCENTAGEM_JR_TEMPO_CASA_MAIOR_CINCO));
        }
    }
}
