package com.pedro.patterns.criacao.factory;

import com.pedro.patterns.criacao.builder.Funcionario;

import java.math.BigDecimal;

public interface CalcularAumento {
    BigDecimal calcular(Funcionario funcionario);
}
