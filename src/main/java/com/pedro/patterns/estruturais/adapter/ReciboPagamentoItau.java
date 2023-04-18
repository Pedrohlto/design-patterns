package com.pedro.patterns.estruturais.adapter;

public class ReciboPagamentoItau {

    private String codigoTransacao;
    private String valorTransacao;
    private String dataTransacao;
    private String hashControle;

    public String getCodigoTransacao() {
        return codigoTransacao;
    }

    public void setCodigoTransacao(String codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }

    public String getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(String valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getHashControle() {
        return hashControle;
    }

    public void setHashControle(String hashControle) {
        this.hashControle = hashControle;
    }
}
