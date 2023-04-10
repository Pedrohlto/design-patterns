package com.pedro.patterns.comportamentais.chainResponsability;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximaRegra;

    public Desconto(Desconto proximaRegra){
        this.proximaRegra = proximaRegra;
    }

    public abstract BigDecimal calcular(Compra compra);
}
