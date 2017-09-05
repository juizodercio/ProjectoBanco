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
public class ContaCorrente extends ContaBancaria implements Imprimivel  {
    
   final double TAXA_De_OPERACAO= 8;

    public ContaCorrente() {
        
    }
   
   

    public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
   public void sacar(double valor) {
        if(valor<= (super.getSaldo()-TAXA_De_OPERACAO)){
            super.setSaldo(super.getSaldo()-valor);
        JOptionPane.showMessageDialog(null, " levantamento feito com suceso");
    }
        else
            JOptionPane.showMessageDialog(null, " saldo insuficiente");
    }
    @Override
   public void depositar(double valor) {
        super.setSaldo(super.getSaldo()+ (valor-TAXA_De_OPERACAO));
        JOptionPane.showMessageDialog(null, " deposito feito com suceso");
        
        
          }

    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null," conta numero: "+ super.getNumeroConta()+" Tem saldo: "+ super.getSaldo());
        
    }
   
    
}
