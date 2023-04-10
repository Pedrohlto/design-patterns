package com.pedro.patterns.comportamentais.chainResponsability;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Compra {

    private Integer quantiadeDeItens;
    private LocalDate dataDaCompra;

    public Integer getQuantiadeDeItens() {
        return quantiadeDeItens;
    }

    public void setQuantiadeDeItens(Integer quantiadeDeItens) {
        this.quantiadeDeItens = quantiadeDeItens;
    }

    public LocalDate getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(LocalDate dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }
}
