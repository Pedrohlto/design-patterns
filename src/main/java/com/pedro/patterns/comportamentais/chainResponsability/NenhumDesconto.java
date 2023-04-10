package com.pedro.patterns.comportamentais.chainResponsability;

import java.math.BigDecimal;

public class NenhumDesconto extends Desconto{

    public NenhumDesconto(){
        super(null);
    }

    @Override
    public BigDecimal calcular(Compra compra) {
        return BigDecimal.ZERO;
    }
}
