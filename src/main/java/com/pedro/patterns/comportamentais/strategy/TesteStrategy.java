package com.pedro.patterns.comportamentais.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TesteStrategy {

    @Test
    @DisplayName("Deve calcular taxa correta de acordo com a forma de pagamento")
    void deveCalcularAFormaDePagamentoCorreta(){

        var calculadora = new CalculadoraCompras();
        var valorCompra = BigDecimal.valueOf(1000);

        var valorTaxaCredito = calculadora.calcularTaxaVenda(valorCompra, new Credito());
        var valorTaxaBoleto = calculadora.calcularTaxaVenda(valorCompra, new Boleto());
        var valorTaxaDebito = calculadora.calcularTaxaVenda(valorCompra, new Debito());

        Assertions.assertEquals(BigDecimal.valueOf(100.00).setScale(2, RoundingMode.HALF_UP), valorTaxaCredito);
        Assertions.assertEquals(BigDecimal.valueOf(30.00).setScale(2, RoundingMode.HALF_UP), valorTaxaBoleto);
        Assertions.assertEquals(BigDecimal.valueOf(50.00).setScale(2, RoundingMode.HALF_UP), valorTaxaDebito);

    }
}
