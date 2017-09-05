/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.Banco;
import Controle.Relatorio;

/**
 *
 * @author Dercio
 */
public class Executavel {
    public static void main(String[] args) {
        ContaPoupanca cp= new ContaPoupanca(0, 8800);
        ContaCorrente cc= new ContaCorrente(1, 200);
        Banco banco= new Banco();
        ContaBancaria cb;
        
        Relatorio relatorio = new Relatorio();
       // cp.sacar(0);
       // relatorio.geraRelatorio(cp);
        //relatorio.geraRelatorio(cc);
        //cp.transfere(300, cc);
        //relatorio.geraRelatorio(cc);
        banco.insere(cp);
        banco.insere(cc);
        banco.remove(cc);
        banco.mostrarDados();
//        banco.procurarConta(0);
//        banco.mostraPesquisa
    }
    
}
