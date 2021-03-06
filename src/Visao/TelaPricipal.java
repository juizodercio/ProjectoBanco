/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Modelo.*;
import Visao.*;
import Controle.Banco;
import Modelo.ContaCorrente;
import Modelo.ContaPoupanca;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import Modelo.ContaBancaria;

/**
 *
 * @author Dercio
 */
public class TelaPricipal extends javax.swing.JFrame {

    ContaBancaria conta;
    ContaCorrente contaC = new ContaCorrente();
    ContaPoupanca contaP = new ContaPoupanca();
    Banco banco = new Banco();
    private static int numeroSeguranca;
    private static int numeroDEconta =100;

    /**
     * Creates new form tudoNovo
     */
    public TelaPricipal() {
        initComponents();
    }

    private void salvar() {
        String categoria;
        int indice = cbTipoConta.getSelectedIndex();
        if (indice == 1) {
            contaP = new ContaPoupanca(Integer.parseInt(txtNumero.getText().toString()), Double.parseDouble(txtSaldo.getText().toString()));
            contaP.setTipo("Conta Poupanca");
            banco.insere(contaP);
            JOptionPane.showMessageDialog(null, " conta registada com sucesso");

        } else if (indice == 2) {
            contaC = new ContaCorrente(Integer.parseInt(txtNumero.getText().toString()), Double.parseDouble(txtSaldo.getText().toString()));
            contaC.setTipo("Conta Corrente");
            banco.insere(contaC);
            JOptionPane.showMessageDialog(null, " conta registada com sucesso");

        } else if (indice == 0) {
            JOptionPane.showMessageDialog(null, " por favor selecione um tipo de conta !");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal = new javax.swing.JPanel();
        btCriaConta = new javax.swing.JButton();
        btRemoveConta = new javax.swing.JButton();
        btSelecionaConta = new javax.swing.JButton();
        btGeraRelatorio = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        Card = new javax.swing.JPanel();
        Fixo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cadatroConta = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbTipoConta = new javax.swing.JComboBox<>();
        SubMenu2 = new javax.swing.JPanel();
        btDepositar = new javax.swing.JButton();
        btLevantar = new javax.swing.JButton();
        btTransfere = new javax.swing.JButton();
        btrelatorio = new javax.swing.JButton();
        Relatorio = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        btCriaConta.setBackground(new java.awt.Color(153, 255, 255));
        btCriaConta.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btCriaConta.setText("Criar Conta");
        btCriaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriaContaActionPerformed(evt);
            }
        });

        btRemoveConta.setBackground(new java.awt.Color(153, 255, 255));
        btRemoveConta.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btRemoveConta.setText("Remover Conta");
        btRemoveConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveContaActionPerformed(evt);
            }
        });

        btSelecionaConta.setBackground(new java.awt.Color(153, 255, 255));
        btSelecionaConta.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btSelecionaConta.setText("Selecionar Conta");
        btSelecionaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecionaContaActionPerformed(evt);
            }
        });

        btGeraRelatorio.setBackground(new java.awt.Color(153, 255, 255));
        btGeraRelatorio.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btGeraRelatorio.setText("Gerar Relatorio");
        btGeraRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeraRelatorioActionPerformed(evt);
            }
        });

        btSair.setBackground(new java.awt.Color(255, 51, 51));
        btSair.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btSair.setText("Finalizar");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        Card.setLayout(new java.awt.CardLayout());

        Fixo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 0, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("BEM VINDO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("AO MEU BANCO");

        javax.swing.GroupLayout FixoLayout = new javax.swing.GroupLayout(Fixo);
        Fixo.setLayout(FixoLayout);
        FixoLayout.setHorizontalGroup(
            FixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FixoLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(FixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        FixoLayout.setVerticalGroup(
            FixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FixoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        Card.add(Fixo, "card4");

        cadatroConta.setBackground(new java.awt.Color(209, 230, 229));

        jLabel1.setText("Criando Conta");

        jLabel2.setText("Numero da Conta");

        jLabel3.setText("Saldo :");

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo :");

        cbTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Conta Poupanca", "Conta Corrente", " " }));

        javax.swing.GroupLayout cadatroContaLayout = new javax.swing.GroupLayout(cadatroConta);
        cadatroConta.setLayout(cadatroContaLayout);
        cadatroContaLayout.setHorizontalGroup(
            cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadatroContaLayout.createSequentialGroup()
                .addGroup(cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadatroContaLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1))
                    .addGroup(cadatroContaLayout.createSequentialGroup()
                        .addGroup(cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadatroContaLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2))
                            .addGroup(cadatroContaLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(34, 34, 34)
                        .addGroup(cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumero)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(cbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cadatroContaLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cadatroContaLayout.setVerticalGroup(
            cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadatroContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadatroContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(47, 47, 47))
        );

        Card.add(cadatroConta, "cadastro");

        SubMenu2.setBackground(new java.awt.Color(215, 236, 236));

        btDepositar.setText("Depositar");
        btDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositarActionPerformed(evt);
            }
        });

        btLevantar.setText("Levantar");
        btLevantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLevantarActionPerformed(evt);
            }
        });

        btTransfere.setText("Transferir");
        btTransfere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransfereActionPerformed(evt);
            }
        });

        btrelatorio.setText("Relatorio");
        btrelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SubMenu2Layout = new javax.swing.GroupLayout(SubMenu2);
        SubMenu2.setLayout(SubMenu2Layout);
        SubMenu2Layout.setHorizontalGroup(
            SubMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenu2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(SubMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btTransfere, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(btDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(SubMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btLevantar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btrelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SubMenu2Layout.setVerticalGroup(
            SubMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubMenu2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(SubMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDepositar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(btLevantar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(SubMenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTransfere, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btrelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        Card.add(SubMenu2, "subMenu");

        Relatorio.setBackground(new java.awt.Color(195, 227, 227));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout RelatorioLayout = new javax.swing.GroupLayout(Relatorio);
        Relatorio.setLayout(RelatorioLayout);
        RelatorioLayout.setHorizontalGroup(
            RelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        RelatorioLayout.setVerticalGroup(
            RelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Card.add(Relatorio, "relatorio");

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btRemoveConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCriaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSelecionaConta, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(btGeraRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(btSair)
                .addGap(36, 36, 36)
                .addComponent(Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btCriaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btSelecionaConta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemoveConta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btGeraRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Card, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCriaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriaContaActionPerformed
        CardLayout cardl = (CardLayout) Card.getLayout();
        cardl.show(Card, "cadastro");
        txtNumero.setText("" + numeroDEconta);
    }//GEN-LAST:event_btCriaContaActionPerformed

    private void btSelecionaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecionaContaActionPerformed

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Insira o numero da Conta"));
        if (banco.procurarContab(numero) == true) {

            CardLayout cardl = (CardLayout) Card.getLayout();
            cardl.show(Card, "subMenu");
            numeroSeguranca = numero;

        } else {
            JOptionPane.showMessageDialog(null, " conta inexixtente");
        }


    }//GEN-LAST:event_btSelecionaContaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       
        
        salvar();
        numeroDEconta++;

        txtNumero.setText(null);
        txtSaldo.setText(null);
        txtNumero.setText("" + numeroDEconta);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btRemoveContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveContaActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, " Introduza o numero de conta que deseja remover"));
        if (banco.procurarContab(numero) == true) {
            banco.remove(banco.procurarConta(numero));
            JOptionPane.showMessageDialog(null, "removeu com a com sucesso !");
        } else {
            JOptionPane.showMessageDialog(null, " essa conta nao esta cadastrada");
        }

    }//GEN-LAST:event_btRemoveContaActionPerformed

    private void btDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositarActionPerformed
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, " deseja depositar quanto ?"));
        for (int i = 0; i < banco.contas.size(); i++) {

            if ((banco.contas.get(i).getNumeroConta() == numeroSeguranca)) {
                banco.contas.get(i).depositar(saldo);

            }

        }


    }//GEN-LAST:event_btDepositarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed

    private void btLevantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLevantarActionPerformed
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, " deseja Lenvantar quanto ?"));
        for (int i = 0; i < banco.contas.size(); i++) {
            if (banco.contas.get(i).getNumeroConta() == numeroSeguranca) {
                banco.contas.get(i).sacar(saldo);
            }

        }
    }//GEN-LAST:event_btLevantarActionPerformed


    private void btTransfereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransfereActionPerformed
        String valor = " intorduza o valor";
        String valor2 = "intorduza a conta do destinatario";
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(valor));
        int numero = Integer.parseInt(JOptionPane.showInputDialog(valor2));
        for (int i = 0; i < banco.contas.size(); i++) {
            if ((banco.contas.get(i).getNumeroConta() == numeroSeguranca)) {
                banco.contas.get(i).transfere(saldo, banco.procurarConta(numero));
            }
        }
    }//GEN-LAST:event_btTransfereActionPerformed

    private void btGeraRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeraRelatorioActionPerformed
//        ModeloTabela tabela = (ModeloTabela)jTable1.getModel();
        banco.listar(jTable1);
        CardLayout card = (CardLayout) Card.getLayout();
        card.show(Card, "relatorio");
    }//GEN-LAST:event_btGeraRelatorioActionPerformed

    private void btrelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrelatorioActionPerformed
        for (int i = 0; i < banco.contas.size(); i++) {
            if (banco.contas.get(i).getNumeroConta() == numeroSeguranca) {
                banco.mostrarDados();

            }

        }
    }//GEN-LAST:event_btrelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Card;
    private javax.swing.JPanel Fixo;
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JPanel Relatorio;
    private javax.swing.JPanel SubMenu2;
    private javax.swing.JButton btCriaConta;
    private javax.swing.JButton btDepositar;
    private javax.swing.JButton btGeraRelatorio;
    private javax.swing.JButton btLevantar;
    private javax.swing.JButton btRemoveConta;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSelecionaConta;
    private javax.swing.JButton btTransfere;
    private javax.swing.JButton btrelatorio;
    private javax.swing.JPanel cadatroConta;
    private javax.swing.JComboBox<String> cbTipoConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
