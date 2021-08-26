package com.atividades.lp3.models;

public class FuncionarioComissionado {
    private String nome;
    private String cpf;
    private float percentualSobVendas;
    private float totalVendas;


    public FuncionarioComissionado() {
    }

    public FuncionarioComissionado(String nome, String cpf, float percentualSobVendas, float totalVendas) {
        this.nome = nome;
        this.cpf = cpf;
        this.percentualSobVendas = percentualSobVendas;
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getPercentualSobVendas() {
        return percentualSobVendas;
    }

    public void setPercentualSobVendas(float percentualSobVendas) {
        this.percentualSobVendas = percentualSobVendas;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    public float getSalario(){
        return this.totalVendas * this.percentualSobVendas;
    }

    @Override
    public String toString() {
        return "FuncionarioComissionado{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", percentualSobVendas=" + percentualSobVendas +
                ", totalVendas=" + totalVendas +
                '}';
    }
}
