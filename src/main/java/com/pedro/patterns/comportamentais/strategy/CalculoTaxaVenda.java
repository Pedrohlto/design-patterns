package com.pedro.patterns.comportamentais.strategy;

import java.math.BigDecimal;

public interface CalculoTaxaVenda {
    BigDecimal calcularTaxa(BigDecimal valorVenda);
}
