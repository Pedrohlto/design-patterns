package com.pedro.patterns.estruturais.adapter;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Pagamento {
    public ReciboPagamentoItau enviarPagamento(Funcionario funcionario) throws IOException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();
        PagamentoItau pagamentoItau = new PagamentoItau();
        pagamentoItau.setConta(funcionario.getConta());
        pagamentoItau.setValorTransacao(funcionario.getSalario());

        var requestBody = mapper.writeValueAsString(pagamentoItau);

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .header("Content-Type", "application/json")
                .uri(URI.create("http://localhost:8085/pagamento/itau"))
                .build();

        HttpClient client = HttpClient.newBuilder()
                .build();

        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());

        var recibo
                = mapper.readValue(send.body(), ReciboPagamentoItau.class);
        return recibo;
    }
}
