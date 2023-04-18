package com.pedro.patterns.comportamentais.strategy;

import java.math.BigDecimal;

public class CalculadoraCompras {
    public BigDecimal calcularTaxaVenda(BigDecimal valorCompra, CalculoTaxaVenda calculo){
        return calculo.calcularTaxa(valorCompra);
    }
}
