package com.pedro.patterns.estruturais.adapter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AdapterTest {
    @Test
    @DisplayName("Deve enviar pagamento com sucesso")
    void deveEnviarPagamentoComSucesso() throws IOException, InterruptedException {

        Funcionario funcionario = new Funcionario();
        funcionario.setConta("123456");
        funcionario.setNome("Fulano");
        funcionario.setSalario("1500");

        Pagamento pagamento = new Pagamento();

        var reciboPagamento = pagamento.enviarPagamento(funcionario);

        Assertions.assertEquals("1500", reciboPagamento.getValorTransacao());
        Assertions.assertNotNull(reciboPagamento.getCodigoTransacao());
        Assertions.assertNotNull(reciboPagamento.getDataTransacao());
        Assertions.assertNotNull(reciboPagamento.getHashControle());

    }

}
