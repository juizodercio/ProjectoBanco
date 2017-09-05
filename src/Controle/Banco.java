/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Dercio
 */
public class Banco implements Imprimivel {

    public ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
    boolean encontrou= false;

    public void insere(ContaBancaria conta) {
        contas.add(conta);

    }

    public void remove(ContaBancaria conta) {
        contas.remove(conta);

    }

    public ContaBancaria procurarConta(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta() == numero)
                

            return contas.get(i);
            

        }
     
        return null;
    }
    
   

    public boolean procurarContab(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta() == numero) {
                return true;
            }

        }

        return false;
    }

    @Override
    public void mostrarDados() {
        for (int i = 0; i < contas.size(); i++) {
            JOptionPane.showMessageDialog(null, " conta numero: " + contas.get(i).getNumeroConta() + " tem saldo: " + contas.get(i).getSaldo());
        }
    }

    public void mostraPesquisa() {
        JOptionPane.showMessageDialog(null, "" + procurarConta(1).toString());

    }
    
    
    public JTable listar(JTable table) {
        String[] colunas = new String[]{
            "Numero", "Saldo"," Tipo "
        };
        ArrayList dados = new ArrayList();
        dados = buscarContas(dados);
        

        ModeloTabela tabela = new ModeloTabela(dados, colunas);
        table.setModel(tabela);

        return table;
    }
    
    private ArrayList buscarContas(ArrayList dados) {
        for (int i = 0; i < contas.size(); i++) {
            dados.add(new Object[]{
                this.contas.get(i).getNumeroConta(),
                this.contas.get(i).getSaldo(),
                this.contas.get(i).getTipo()
                }
            );

        }
return dados;
    }
}
