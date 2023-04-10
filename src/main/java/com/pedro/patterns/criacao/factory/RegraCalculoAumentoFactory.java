package com.pedro.patterns.criacao.factory;

import com.pedro.patterns.criacao.builder.Funcionario;

public class RegraCalculoAumentoFactory {

    public CalcularAumento getRegra(Funcionario funcionario){
        var senioridade = funcionario.getSenioridade();

        switch (senioridade){

            case JUNIOR :
                return new AumentoSalarioJR();
            case PLENO:
                return new AumentoSalarioPleno();
            case SENIOR:
                return new AumentoSalarioSenior();
            case ESPECIALISTA:
                return new AumentoSalarioEspecialista();
            default:
                throw new RuntimeException();
        }
    }
}
