package com.pedro.patterns.criacao.factory;

import com.pedro.patterns.criacao.builder.Funcionario;

import java.math.BigDecimal;

public class RH {
    public BigDecimal calcularAumentoFuncionarioComFactory(Funcionario funcionario){
        RegraCalculoAumentoFactory factory = new RegraCalculoAumentoFactory();
        var classeAumento = factory.getRegra(funcionario);
        return classeAumento.calcular(funcionario);
    }
}
