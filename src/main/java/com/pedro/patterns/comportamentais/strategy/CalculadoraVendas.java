package com.pedro.patterns.comportamentais.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraVendas {

    private final BigDecimal TAXA_DEBITO = BigDecimal.valueOf(0.05);

    private final BigDecimal TAXA_CREDITO = BigDecimal.valueOf(0.10);

    private final BigDecimal TAXA_BOLETO = BigDecimal.valueOf(0.03);


    public BigDecimal calcularTaxaVenda(BigDecimal valorVenda, String tipoCalculo){

        if("CREDITO".equalsIgnoreCase(tipoCalculo)){
            return valorVenda.multiply(TAXA_CREDITO).setScale(2, RoundingMode.HALF_UP);
        }

        if("DEBITO".equalsIgnoreCase(tipoCalculo)){
            return valorVenda.multiply(TAXA_DEBITO).setScale(2, RoundingMode.HALF_UP);
        }

        if("BOLETO".equalsIgnoreCase(tipoCalculo)){
            return valorVenda.multiply(TAXA_BOLETO).setScale(2, RoundingMode.HALF_UP);
        }

        throw new RuntimeException("Tipo Pagamento não encontrado");
    }
}
