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
public abstract class ContaBancaria {

    String tipo;

    public int numeroConta;
    public double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void transfere(double valor, ContaBancaria conta) {
        if (this.getNumeroConta() == conta.getNumeroConta()) {
            JOptionPane.showMessageDialog(null, "por insira uma conta diferente da sua !!");
        } else if ((valor <= this.saldo)) {
            this.setSaldo(this.getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
            JOptionPane.showMessageDialog(null, " transferencia feita com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, " a sua conta nao possui esse montante");
        }
    }

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
