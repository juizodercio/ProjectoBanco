/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Dercio
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel {
  final  double  LIMITE =400;

    public ContaPoupanca() {
        
        
    }
  
  

    public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
   public void sacar(double valor) {
        if(valor<= this.getSaldo()+LIMITE){
            this.setSaldo(this.getSaldo()-valor);
        JOptionPane.showMessageDialog(null, " levantamento feito com suceso");}
        else
         JOptionPane.showMessageDialog(null, " saldo insuficiente");   
         
    }

    @Override
   public void depositar(double valor) {
        if(valor> 0)
        this.setSaldo(this.getSaldo()+ valor);
        JOptionPane.showMessageDialog(null, " Deposito feito com suceso");
        
    }

    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null," conta numero: "+ this.getNumeroConta()+" Tem saldo: "+ this.getSaldo());
    }
    
}
