package com.pedro.patterns.comportamentais.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Boleto implements CalculoTaxaVenda{

    private final BigDecimal TAXA = BigDecimal.valueOf(0.03);
    @Override
    public BigDecimal calcularTaxa(BigDecimal valorVenda) {
        return valorVenda.multiply(TAXA).setScale(2, RoundingMode.HALF_UP);
    }
}
