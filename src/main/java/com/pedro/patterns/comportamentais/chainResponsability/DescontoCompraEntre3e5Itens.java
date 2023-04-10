package com.pedro.patterns.comportamentais.chainResponsability;

import java.math.BigDecimal;

public class DescontoCompraEntre3e5Itens extends Desconto{

    public DescontoCompraEntre3e5Itens(Desconto proximoDesconto){
        super(proximoDesconto);
    }
    @Override
    public BigDecimal calcular(Compra compra) {

        if(compra.getQuantiadeDeItens() >= 3 && compra.getQuantiadeDeItens() <= 5) {
            return BigDecimal.TWO;
        }
        return proximaRegra.calcular(compra);
    }
}
