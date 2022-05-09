package com.rafaelfilgueiras.backline.api.dto;

public class NovoCorrentista {
    private String nome;
    private String cpf;
    
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
