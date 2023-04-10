package com.pedro.patterns.comportamentais.chainResponsability;

import java.math.BigDecimal;

public class DescontoCompraEntre6e10Itens extends Desconto {

    public DescontoCompraEntre6e10Itens(Desconto proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal calcular(Compra compra) {
        if(compra.getQuantiadeDeItens() >= 6 && compra.getQuantiadeDeItens() <= 10) {
            return BigDecimal.TEN;
        }
        return proximaRegra.calcular(compra);
    }
}
