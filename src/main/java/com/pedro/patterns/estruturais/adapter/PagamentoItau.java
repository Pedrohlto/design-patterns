package com.pedro.patterns.estruturais.adapter;

public class PagamentoItau {

    private String conta;
    private String valorTransacao;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }


    public String getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(String valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
}
