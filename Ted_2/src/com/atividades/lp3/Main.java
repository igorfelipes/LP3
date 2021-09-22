package com.atividades.lp3;

import com.atividades.lp3.models.FuncionarioComissionado;
import com.atividades.lp3.models.FuncionarioComissionadoBase;

public class Main {

    public static void main(String[] args) {

        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Igor Felipe Sales", "99999999966", 0.10f, 200);
        FuncionarioComissionadoBase funcionarioComissionadoBase = new FuncionarioComissionadoBase("Ithamara Emilia Leite Gomes", "00000000000000", 0.30f, 300.00f, 997.00f);

        System.out.println(funcionarioComissionado + "Salario=" + funcionarioComissionado.getSalario());
        System.out.println();
        System.out.println(funcionarioComissionadoBase+ "Salario="  + funcionarioComissionadoBase.getSalario());
    }
}
