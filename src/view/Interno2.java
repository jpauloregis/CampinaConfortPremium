/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Classes.Hospede;
import Classes.Quartos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public class Interno2 extends javax.swing.JDialog {

    /*String tipoQuarto;
    double valorQuarto;*/
    ArrayList<Quartos> arrayListQuartos;
    ArrayList<Hospede> arrayListHospede;

    /**
     * Creates new form Interno2
     */
    public Interno2(java.awt.Frame parent, boolean modal, ArrayList<Quartos> rt, ArrayList<Hospede> rt2) {
        super(parent, modal);
        initComponents();
        this.arrayListQuartos = rt;
        this.arrayListHospede = rt2;
        PreencherComboBox();
        carregarTableHospede("");

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cadastrarquartos = new javax.swing.JLabel();
        abasEscolherQuarto = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        txtHospede = new javax.swing.JTextField();
        EscolherHospede = new javax.swing.JComboBox<>();
        ImgTabela = new javax.swing.JLabel();
        imgTabela = new javax.swing.JLabel();
        btPresidencial = new javax.swing.JRadioButton();
        btLuxoS = new javax.swing.JRadioButton();
        btLuxoD = new javax.swing.JRadioButton();
        btLuxoT = new javax.swing.JRadioButton();
        btExeS = new javax.swing.JRadioButton();
        btExeD = new javax.swing.JRadioButton();
        btExeT = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btProsseguir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfOpcao = new javax.swing.JTextField();
        tfPessoas = new javax.swing.JTextField();
        btFinalizar = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        tfHospede = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableQuartos = new javax.swing.JTable();
        botaoDelete = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(207, 207, 207));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        cadastrarquartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/cadastrarquartos.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtHospede.setEditable(false);
        txtHospede.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHospede.setText("Hospede:");
        txtHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospedeActionPerformed(evt);
            }
        });

        EscolherHospede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EscolherHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscolherHospedeActionPerformed(evt);
            }
        });

        imgTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/tabelaquartos.png"))); // NOI18N

        btPresidencial.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btPresidencial);
        btPresidencial.setText("Escolher");

        btLuxoS.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btLuxoS);
        btLuxoS.setText("Escolher");

        btLuxoD.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btLuxoD);
        btLuxoD.setText("Escolher");

        btLuxoT.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btLuxoT);
        btLuxoT.setText("Escolher");

        btExeS.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btExeS);
        btExeS.setText("Escolher");

        btExeD.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btExeD);
        btExeD.setText("Escolher");

        btExeT.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btExeT);
        btExeT.setText("Escolher");

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EscolherHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imgTabela))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btLuxoD)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btLuxoS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btPresidencial))
                                    .addComponent(btLuxoT)
                                    .addComponent(btExeD)
                                    .addComponent(btExeT))
                                .addGap(197, 197, 197)
                                .addComponent(ImgTabela))
                            .addComponent(btExeS)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btProsseguir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(578, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(EscolherHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ImgTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPresidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLuxoS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLuxoD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLuxoT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExeS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExeD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExeT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgTabela)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProsseguir)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(txtHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EscolherHospede, txtHospede});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btExeD, btExeS, btExeT, btLuxoD, btLuxoS, btLuxoT, btPresidencial});

        abasEscolherQuarto.addTab("Escolher Quarto", jPanel3);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/opcao.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/pessoas.png"))); // NOI18N

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

        tfHospede.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfOpcao, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                            .addComponent(tfPessoas)
                            .addComponent(tfHospede)))
                    .addComponent(btFinalizar))
                .addGap(381, 381, 381)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHospede, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfOpcao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPessoas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        abasEscolherQuarto.addTab("Dados Quarto", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        TableQuartos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableQuartos);

        botaoDelete.setText("Deletar");
        botaoDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeleteActionPerformed(evt);
            }
        });

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

        jLabel3.setText("PESQUISE O HOSPEDE PELO NOME:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(botaoDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(botaoDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                .addContainerGap())
        );

        abasEscolherQuarto.addTab("Pesquisar Serviço", jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarquartos)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(abasEscolherQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarquartos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abasEscolherQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospedeActionPerformed

    private void btFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btFinalizarMouseClicked
        Object[] dados = pegaCampos();

        if (!tfPessoas.getText().equals("")) {
            if (Quartos.temVaga(retornaPosicao())) {
                int qtde_pessoa = Integer.valueOf(tfPessoas.getText());
                Object[] infoquarto = quartoSelecionado();
                int pessoas_permitidas = Integer.valueOf(String.valueOf(infoquarto[3]));

                if (qtde_pessoa <= pessoas_permitidas) {
                    this.arrayListQuartos.add(instanceClass());
                    //System.out.println(instanceClass().getNomeQuarto());
                    JOptionPane.showMessageDialog(null, "Quarto adicionado no contrato");
                    Quartos.removerVaga(retornaPosicao());
                    //System.out.println(Integer.valueOf(String.valueOf(infoquarto[2])));
                } else {
                    if (JOptionPane.showConfirmDialog(null, "O quarto possui uma quantidade limite de pessoas, deseja aumentar o numero de quartos?") == 0);
                    int cont = qtde_pessoa;
                    int qtdetotal = pessoas_permitidas;

                    do {
                        this.arrayListQuartos.add(instanceClass());
                        JOptionPane.showMessageDialog(null, "Quarto adicionado no contrato");
                        Quartos.removerVaga(retornaPosicao());
                        cont -= qtdetotal;
                    } while (cont > 0);
                }
            } else {
                JOptionPane.showConfirmDialog(null, "Nao tem quartos disponiveis");
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Digite o numero de pessoas");
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

    private void btProsseguirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProsseguirMouseClicked
        if (isSelectedRoom()) {
            // QualMarcado();
            abasEscolherQuarto.setSelectedIndex(1);
            exibeInformacoesCompra();
        }
    }//GEN-LAST:event_btProsseguirMouseClicked

    private void btProsseguirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProsseguirMouseEntered
        btProsseguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/prosseguir2.png")));
    }//GEN-LAST:event_btProsseguirMouseEntered

    private void btProsseguirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProsseguirMouseExited
        btProsseguir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/prosseguir1.png")));
    }//GEN-LAST:event_btProsseguirMouseExited

    private int pegarIDLinha(int linha) {
        return Integer.valueOf(TableQuartos.getValueAt(linha, 0).toString());
    }

    private void botaoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeleteActionPerformed
        Object[] infoquarto = quartoSelecionado();

        String cpf = this.arrayListHospede.get(EscolherHospede.getSelectedIndex()).getCpf();

        for (int i = 0; i < this.arrayListQuartos.size(); i++) {
            if (cpf.equals(this.arrayListQuartos.get(i).getHospede_id().getCpf())) {

                this.arrayListQuartos.remove(i);
                Quartos.adicionarVaga(retornaPosicao());
                //System.out.println(Integer.valueOf(String.valueOf(infoquarto[2])));

                carregarTableHospede("");

            }
        }
    }//GEN-LAST:event_botaoDeleteActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void tfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarKeyReleased
        String pesquisa = tfPesquisar.getText().trim();

        if (pesquisa.equals("")) {
            carregarTableHospede("");
        } else {
            carregarTableHospede(pesquisa);
        }
    }//GEN-LAST:event_tfPesquisarKeyReleased

    private void EscolherHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscolherHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscolherHospedeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EscolherHospede;
    private javax.swing.JLabel ImgTabela;
    private javax.swing.JTable TableQuartos;
    private javax.swing.JTabbedPane abasEscolherQuarto;
    private javax.swing.JButton botaoDelete;
    private javax.swing.JRadioButton btExeD;
    private javax.swing.JRadioButton btExeS;
    private javax.swing.JRadioButton btExeT;
    private javax.swing.JLabel btFinalizar;
    private javax.swing.JRadioButton btLuxoD;
    private javax.swing.JRadioButton btLuxoS;
    private javax.swing.JRadioButton btLuxoT;
    private javax.swing.JRadioButton btPresidencial;
    private javax.swing.JLabel btProsseguir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cadastrarquartos;
    private javax.swing.JLabel imgTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField tfHospede;
    private javax.swing.JTextField tfOpcao;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JTextField tfPessoas;
    private javax.swing.JTextField txtHospede;
    // End of variables declaration//GEN-END:variables

    private void PreencherComboBox() {
        EscolherHospede.removeAllItems();
        for (int i = 0; i < arrayListHospede.size(); i++) {
            EscolherHospede.addItem(i + ". " + arrayListHospede.get(i).getNome());
        }
        //EscolherHospede.setSelectedIndex(-1);
    }

    /*private void QualMarcado() {
        if (btPresidencial.isSelected()) {
            valorQuarto = 1200;
            tipoQuarto = "Presidencial";
        } else if (btLuxoS.isSelected()) {
            valorQuarto = 520;
            tipoQuarto = "Luxo Simples";
        } else if (btLuxoD.isSelected()) {
            valorQuarto = 570;
            tipoQuarto = "Luxo Duplo";
        } else if (btLuxoT.isSelected()) {
            valorQuarto = 620;
            tipoQuarto = "Luxo Triplo";
        } else if (btExeS.isSelected()) {
            valorQuarto = 360;
            tipoQuarto = "Executivo Simples";
        } else if (btExeD.isSelected()) {
            valorQuarto = 385;
            tipoQuarto = "Executivo Duplo";
        } else if (btExeT.isSelected()) {
            valorQuarto = 440;
            tipoQuarto = "Executivo Triplo";
        }
    }*/
    public boolean isSelectedRoom() {
        if (btPresidencial.isSelected() || btLuxoS.isSelected()
                || btLuxoD.isSelected() || btLuxoT.isSelected() || btExeS.isSelected()
                || btExeD.isSelected() || btExeT.isSelected()) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "Selecione um quarto");
        return false;
    }

    public void exibeInformacoesCompra() {
        tfHospede.setText(String.valueOf(EscolherHospede.getSelectedItem()));
        Object[] dados = quartoSelecionado();
        tfOpcao.setText(String.valueOf(dados[0]));

    }

    private int retornaPosicao() {
        if (btPresidencial.isSelected()) {
            return 0;
        } else if (btLuxoS.isSelected()) {
            return 1;
        } else if (btLuxoD.isSelected()) {
            return 2;
        } else if (btLuxoT.isSelected()) {
            return 3;
        } else if (btExeS.isSelected()) {
            return 4;
        } else if (btExeD.isSelected()) {
            return 5;
        } else {
            return 6;
        }
    }

    private Object[] quartoSelecionado() {
        if (btPresidencial.isSelected()) {
            return Quartos.lista_de_quartos[0];
        } else if (btLuxoS.isSelected()) {
            return Quartos.lista_de_quartos[1];
        } else if (btLuxoD.isSelected()) {
            return Quartos.lista_de_quartos[2];
        } else if (btLuxoT.isSelected()) {
            return Quartos.lista_de_quartos[3];
        } else if (btExeS.isSelected()) {
            return Quartos.lista_de_quartos[4];
        } else if (btExeD.isSelected()) {
            return Quartos.lista_de_quartos[5];
        } else {
            return Quartos.lista_de_quartos[6];
        }

    }

    private Object[] pegaCampos() {
        int posicao = EscolherHospede.getSelectedIndex();
        Object[] campos = {
            this.tfPessoas.getText().trim(),
            this.arrayListHospede.get(posicao),};
        return campos;
    }

    /*
    private void carregarTable() {

        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Quarto", "Data I.", "Data F."}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (int i = 0; i < this.arrayListHospede.size(); i++) {
        
                modelo.addRow(new Object[]{
                    i,
                    this.arrayListHospede.get(i).getNome(),
                    this.arrayListHospede.get(i).getNome(), //errado só pra mostrar
                    this.arrayListHospede.get(i).getData_entrada(),
                    this.arrayListHospede.get(i).getData_saida(),});

            
        }

        TableQuartos.setModel(modelo);
    }
     */
    private void carregarTableHospede(String nome) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Quarto", "Data I.", "Data F."}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        if (!nome.equals("")) {
            for (int i = 0; i < this.arrayListHospede.size(); i++) {
                for (int j = 0; j < this.arrayListQuartos.size(); j++) {

                    if (this.arrayListHospede.get(i).getNome().equals(nome)
                            && this.arrayListHospede.get(i).getCpf().equals(this.arrayListQuartos.get(j).getHospede_id().getCpf())) {

                        modelo.addRow(new Object[]{
                            i,
                            this.arrayListHospede.get(i).getNome(),
                            this.arrayListQuartos.get(j).getNomeQuarto(), //errado só pra mostrar
                            this.arrayListHospede.get(i).getData_entrada(),
                            this.arrayListHospede.get(i).getData_saida(),});
                    }
                }
            }

        } else {
            for (int i = 0; i < this.arrayListHospede.size(); i++) {
                for (int j = 0; j < this.arrayListQuartos.size(); j++) {

                    if (this.arrayListHospede.get(i).getCpf().equals(this.arrayListQuartos.get(j).getHospede_id().getCpf())) {
                        modelo.addRow(new Object[]{
                            i,
                            this.arrayListHospede.get(i).getNome(),
                            this.arrayListQuartos.get(j).getNomeQuarto(), //errado só pra mostrar
                            this.arrayListHospede.get(i).getData_entrada(),
                            this.arrayListHospede.get(i).getData_saida(),});
                    }
                }
            }
        }

        TableQuartos.setModel(modelo);
    }

    private Quartos instanceClass() {
        //Hospede(String nome, String cpf, String telefone, int cartao_credito, Date data_entrada, Date data_saida)
        Object[] dados = pegaCampos();
        Object[] dados1 = quartoSelecionado();
        Quartos q = new Quartos(
                Double.valueOf(String.valueOf(dados1[1])),
                Integer.valueOf(String.valueOf(dados1[2])),
                Integer.valueOf(String.valueOf(dados[0])),
                (Hospede) dados[1],
                String.valueOf(dados1[0])
        );
        return q;
    }

}