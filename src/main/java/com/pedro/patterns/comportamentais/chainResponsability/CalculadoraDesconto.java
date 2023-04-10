package com.pedro.patterns.comportamentais.chainResponsability;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Compra compra) {

        return new DescontoCompraAte3Itens(new DescontoCompraEntre6e10Itens(new DescontoCompraEntre3e5Itens(new NenhumDesconto())))
                .calcular(compra);
    }
}
