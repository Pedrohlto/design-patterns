package com.pedro.patterns.comportamentais.chainResponsability;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TesteChainResponsability {


    @Test
    @DisplayName("Deve validar compra com ate 3 itens")
    void deveValidarCompraComAte3Itens(){
        Compra compra = new Compra();
        compra.setDataDaCompra(LocalDate.now());
        compra.setQuantiadeDeItens(2);


        var calculadoraDesconto = new CalculadoraDesconto();
        Assertions.assertEquals(BigDecimal.ONE, calculadoraDesconto.calcular(compra));
    }

    @Test
    @DisplayName("Deve validar compra com ate 5 itens")
    void deveValidarCompraComAte5Itens(){
        Compra compra = new Compra();
        compra.setDataDaCompra(LocalDate.now());
        compra.setQuantiadeDeItens(5);

        var calculadoraDesconto = new CalculadoraDesconto();
        Assertions.assertEquals(BigDecimal.TWO, calculadoraDesconto.calcular(compra));
    }

    @Test
    @DisplayName("Deve validar compra com ate 9 itens")
    void deveValidarCompraComAte9Itens(){
        Compra compra = new Compra();
        compra.setDataDaCompra(LocalDate.now());
        compra.setQuantiadeDeItens(9);



        var calculadoraDesconto = new CalculadoraDesconto();
        Assertions.assertEquals(BigDecimal.TEN, calculadoraDesconto.calcular(compra));
    }

    @Test
    @DisplayName("Deve validar compra com ate 200 itens")
    void deveValidarCompraComAte200Itens(){
        Compra compra = new Compra();
        compra.setDataDaCompra(LocalDate.now());
        compra.setQuantiadeDeItens(200);


        var calculadoraDesconto = new CalculadoraDesconto();
        Assertions.assertEquals(BigDecimal.ZERO, calculadoraDesconto.calcular(compra));
    }
}
