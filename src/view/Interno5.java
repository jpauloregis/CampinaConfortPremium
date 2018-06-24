/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Classes.classBabySitter;
import Classes.Hospede;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public class Interno5 extends javax.swing.JDialog {

    double valorBaby;
    String tipoBaby;
    ArrayList<classBabySitter> arrayListBabySitter;
    ArrayList<Hospede> arrayListHospede;

    /**
     * Creates new form Interno5
     */
    public Interno5(java.awt.Frame parent, boolean modal, ArrayList<classBabySitter> rt, ArrayList<Hospede> rt2) {
        super(parent, modal);
        initComponents();
        this.arrayListBabySitter = rt;
        this.arrayListHospede = rt2;
        PreencherComboBox();
        carregarTableBaby("");

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        BabySitter = new javax.swing.JLabel();
        abasBaby = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtHospedee = new javax.swing.JTextField();
        ImgTabela = new javax.swing.JLabel();
        btBaby = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btProsseguir = new javax.swing.JLabel();
        tabelaBaby = new javax.swing.JLabel();
        EscolherHospede = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfOpcao = new javax.swing.JTextField();
        tfIdadeCriancas = new javax.swing.JTextField();
        tfHoras = new javax.swing.JTextField();
        btFinalizar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tfHospede = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBaby = new javax.swing.JTable();
        botaoDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(207, 207, 207));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        BabySitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/babysitter.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtHospedee.setEditable(false);
        txtHospedee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHospedee.setText("Hospede:");
        txtHospedee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospedeeActionPerformed(evt);
            }
        });

        btBaby.setBackground(new java.awt.Color(255, 255, 255));
        btBaby.setText("Escolher");

        btProsseguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/prosseguir1.png"))); // NOI18N
        btProsseguir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btProsseguir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btProsseguirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btProsseguirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btProsseguirMouseExited(evt);
            }
        });

        tabelaBaby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/tabelaBABY.png"))); // NOI18N

        EscolherHospede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btProsseguir)
                .addGap(209, 209, 209))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tabelaBaby)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btBaby)
                                .addGap(337, 337, 337)
                                .addComponent(ImgTabela))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtHospedee, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EscolherHospede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(199, 199, 199))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHospedee, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(EscolherHospede))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabelaBaby)
                    .addComponent(btBaby))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImgTabela)
                .addGap(54, 54, 54)
                .addComponent(btProsseguir)
                .addGap(145, 145, 145)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        abasBaby.addTab("Serviços", jPanel3);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/opcao.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/horas.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/idade.png"))); // NOI18N

        tfOpcao.setEditable(false);

        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/finalizar1.png"))); // NOI18N
        btFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btFinalizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btFinalizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btFinalizarMouseExited(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("HOSPEDE:");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tfHospede.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfIdadeCriancas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(tfOpcao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHospede, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHoras))
                .addGap(443, 443, 443)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFinalizar)
                .addGap(370, 370, 370))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfOpcao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIdadeCriancas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfHoras)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFinalizar)
                .addGap(93, 93, 93))
        );

        abasBaby.addTab("Dados", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        TableBaby.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableBaby);

        botaoDelete.setText("Deletar");
        botaoDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeleteActionPerformed(evt);
            }
        });

        jLabel6.setText("PESQUISE O HOSPEDE PELO NOME:");

        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });
        tfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(botaoDelete)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisar))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(botaoDelete)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        abasBaby.addTab("Pesquisar Serviço", jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abasBaby, javax.swing.GroupLayout.PREFERRED_SIZE, 522, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(BabySitter)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BabySitter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abasBaby, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospedeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospedeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospedeeActionPerformed

    private void btProsseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProsseguirMouseClicked
        if (isSelectedRoom()) {
            // QualMarcado();
            abasBaby.setSelectedIndex(1);
            exibeInformacoesCompra();
        }
    }//GEN-LAST:event_btProsseguirMouseClicked

    private void btProsseguirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProsseguirMouseEntered
        btProsseguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/prosseguir2.png")));
    }//GEN-LAST:event_btProsseguirMouseEntered

    private void btProsseguirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProsseguirMouseExited
        btProsseguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/prosseguir1.png")));
    }//GEN-LAST:event_btProsseguirMouseExited

    private void btFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalizarMouseClicked
        if (!tfIdadeCriancas.getText().equals("")) {
            int IdadeCriancas = Integer.valueOf(tfIdadeCriancas.getText());
            //Object[] infobaby = babySelecionado();

            /*if (IdadeCriancas >= 2 && IdadeCriancas <= 9) {
                this.arrayListBabySitter.add(instanceClass());
                //System.out.println(instanceClass().getNomeQuarto());
                JOptionPane.showMessageDialog(null, "Serviço adicionado no contrato");
            } else {
                if (JOptionPane.showConfirmDialog(null, "O serviço só pode ser contrato para crianças de 2 a 9 anos") == 0);
                int cont = IdadeCriancas;

                do {
                    this.arrayListBabySitter.add(instanceClass());
                    JOptionPane.showMessageDialog(null, "Serviço adicionado no contrato");
                    cont -= qtdetotal;
                } while (IdadeCriancas !=);*/
            boolean continuar = true;
            while (continuar) {
                if (IdadeCriancas >= 2 && IdadeCriancas <= 9) {
                    this.arrayListBabySitter.add(instanceClass());
                    //System.out.println(instanceClass().getNomeQuarto());
                    JOptionPane.showMessageDialog(null, "Serviço adicionado no contrato");
                    continuar = false;
                } else {
                    JOptionPane.showConfirmDialog(null, "O serviço só pode ser contrato para crianças de 2 a 9 anos");
                    continuar = false;
                }
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Digite a idade da criança");
        }
    }//GEN-LAST:event_btFinalizarMouseClicked

    private void btFinalizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalizarMouseEntered
        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/finalizar2.png")));
    }//GEN-LAST:event_btFinalizarMouseEntered

    private void btFinalizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalizarMouseExited
        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/finalizar1.png")));
    }//GEN-LAST:event_btFinalizarMouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void botaoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeleteActionPerformed
        Object[] infobaby = babySelecionado();

        String cpf = this.arrayListHospede.get(EscolherHospede.getSelectedIndex()).getCpf();

        for (int i = 0; i < this.arrayListBabySitter.size(); i++) {
            if (cpf.equals(this.arrayListBabySitter.get(i).getHospede_id().getCpf())) {

                this.arrayListBabySitter.remove(i);
                //System.out.println(Integer.valueOf(String.valueOf(infoquarto[2])));

                carregarTableBaby("");

            }
        }

    }//GEN-LAST:event_botaoDeleteActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        String pesquisa = tfPesquisar.getText().trim();

        if (pesquisa.equals("")) {
            carregarTableBaby("");
        } else {
            carregarTableBaby(pesquisa);
        }
    }//GEN-LAST:event_tfPesquisarKeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BabySitter;
    private javax.swing.JComboBox<String> EscolherHospede;
    private javax.swing.JLabel ImgTabela;
    private javax.swing.JTable TableBaby;
    private javax.swing.JTabbedPane abasBaby;
    private javax.swing.JButton botaoDelete;
    private javax.swing.JRadioButton btBaby;
    private javax.swing.JLabel btFinalizar;
    private javax.swing.JLabel btProsseguir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel tabelaBaby;
    private javax.swing.JTextField tfHoras;
    private javax.swing.JTextField tfHospede;
    private javax.swing.JTextField tfIdadeCriancas;
    private javax.swing.JTextField tfOpcao;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField txtHospedee;
    // End of variables declaration//GEN-END:variables

    private void PreencherComboBox() {
        EscolherHospede.removeAllItems();
        for (int i = 0; i < arrayListHospede.size(); i++) {
            EscolherHospede.addItem(i + ". " + arrayListHospede.get(i).getNome());
        }
        //EscolherHospede.setSelectedIndex(-1);
    }

    public boolean isSelectedRoom() {
        if (btBaby.isSelected()) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Selecione uma opção");
        return false;
    }

    public void exibeInformacoesCompra() {
        tfHospede.setText(String.valueOf(EscolherHospede.getSelectedItem()));
        Object[] dados = babySelecionado();
        tfOpcao.setText(String.valueOf(dados[0]));

    }

    private Object[] babySelecionado() {
        if (btBaby.isSelected()) {
            return classBabySitter.listaBaby[0];
        } else {
            return classBabySitter.listaBaby[0];
        }
    }

    private Object[] pegaCampos() {
        int posicao = EscolherHospede.getSelectedIndex();
        Object[] campos = {
            this.tfIdadeCriancas.getText().trim(),
            this.tfHoras.getText().trim(),
            this.arrayListHospede.get(posicao),};
        return campos;
    }

    private int pegarIDLinha(int linha) {
        return Integer.valueOf(TableBaby.getValueAt(linha, 0).toString());
    }

    private void carregarTableBaby(String nome) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Serviço", "Horas", "Data I.", "Data F."}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        if (!nome.equals("")) {
            for (int i = 0; i < this.arrayListHospede.size(); i++) {
                for (int j = 0; j < this.arrayListBabySitter.size(); j++) {

                    if (this.arrayListHospede.get(i).getNome().equals(nome)
                            && this.arrayListHospede.get(i).getCpf().equals(this.arrayListBabySitter.get(j).getHospede_id().getCpf())) {

                        modelo.addRow(new Object[]{
                            i,
                            this.arrayListHospede.get(i).getNome(),
                            this.arrayListBabySitter.get(j).getTipo(), //errado só pra mostrar
                            this.arrayListBabySitter.get(j).getHoras(),
                            this.arrayListHospede.get(i).getData_entrada(),
                            this.arrayListHospede.get(i).getData_saida(),});
                    }
                }
            }

        } else {
            for (int i = 0; i < this.arrayListHospede.size(); i++) {
                for (int j = 0; j < this.arrayListBabySitter.size(); j++) {

                    if (this.arrayListHospede.get(i).getCpf().equals(this.arrayListBabySitter.get(j).getHospede_id().getCpf())) {
                        modelo.addRow(new Object[]{
                            i,
                            this.arrayListHospede.get(i).getNome(),
                            this.arrayListBabySitter.get(j).getTipo(), //errado só pra mostrar
                            this.arrayListBabySitter.get(j).getHoras(),
                            this.arrayListHospede.get(i).getData_entrada(),
                            this.arrayListHospede.get(i).getData_saida(),});
                    }
                }
            }
        }

        TableBaby.setModel(modelo);
    }

    private classBabySitter instanceClass() {
        //public classBabySitter(int idadeCrianca, double horas, String tipo, double valorBaySitter, Hospede hospede_id)
        Object[] dados = pegaCampos();
        Object[] dados1 = babySelecionado();
        classBabySitter bs = new classBabySitter(
                Integer.valueOf(String.valueOf(dados[0])),
                Double.valueOf(String.valueOf(dados[1])),
                String.valueOf(dados1[0]),
                Double.valueOf(String.valueOf(dados1[1])),
                (Hospede) dados[2]
        );
        return bs;
    }
    /* private void QualMarcado() {
        if (btBaby.isSelected()) {
            valorBaby = 45;
            tipoBaby = "Baby Sitter";
        }
    }*/

}