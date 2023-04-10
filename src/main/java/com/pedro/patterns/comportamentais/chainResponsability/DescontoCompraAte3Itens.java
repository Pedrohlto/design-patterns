package com.pedro.patterns.comportamentais.chainResponsability;

import java.math.BigDecimal;

public class DescontoCompraAte3Itens extends Desconto {

    public DescontoCompraAte3Itens(Desconto proximoDesconto){
        super(proximoDesconto);
    }

    @Override
    public BigDecimal calcular(Compra compra) {

        if(compra.getQuantiadeDeItens() < 3) {
            return BigDecimal.ONE;
        }
        return proximaRegra.calcular(compra);
    }
}
