package com.atividades.lp3.models;

public class FuncionarioComissionadoBase  extends FuncionarioComissionado{
    private float valorBase;

    public FuncionarioComissionadoBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public FuncionarioComissionadoBase(String nome, String cpf, float percentualSobVendas, float totalVendas, float valorBase) {
        super(nome, cpf, percentualSobVendas, totalVendas);
        this.valorBase = valorBase;
    }

    public FuncionarioComissionadoBase() {
    }

    public float getValorBase() {
        return valorBase;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public float getSalario(){
        return (this.getPercentualSobVendas() * this.getTotalVendas() ) + this.valorBase;
    }
}
