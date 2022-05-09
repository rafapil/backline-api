package com.rafaelfilgueiras.backline.api.dto;

import com.rafaelfilgueiras.backline.api.model.MovimentacaoTipo;

public class NovaMovimentacao {

    private String descricao;

    private Double valor;

    private MovimentacaoTipo tipo;

    private Integer idConta;

    public String getDescricao() {
        return descricao;
    }

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
