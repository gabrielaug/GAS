/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.telas;

import gas.basicas.Parametros;
import gas.basicas.Voluntario;
import gas.regra.RNVoluntario;
import gas.util.CustomDocument;
import gas.util.DAOException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Augusto
 */
public class ParanUsuario extends javax.swing.JInternalFrame {

    private RNVoluntario rnVoluntario;
    private Voluntario voluntario;

    /**
     * Creates new form ParanUsuario
     */
    public ParanUsuario() {
        initComponents();
        voluntario = new Voluntario();
        rnVoluntario = new RNVoluntario();
        txtLogin.setDocument(new CustomDocument());

    }

    /**
     * CONSTRUTOR USADO PARA ALTERAR PERMISSÕES LOGO APÓS O CADASTRO
     *
     * @param x
     */
    public ParanUsuario(Voluntario x) {
        initComponents();
        voluntario = x;
        rnVoluntario = new RNVoluntario();
        txtLogin.setDocument(new CustomDocument());
    }

    public ParanUsuario(Voluntario x, Parametros y) {
        initComponents();
        voluntario = x;
        rnVoluntario = new RNVoluntario();
        txtLogin.setDocument(new CustomDocument());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnPesq = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        chkInativarUsuario = new javax.swing.JCheckBox();
        chkResetSenha = new javax.swing.JCheckBox();
        chkCadVolun = new javax.swing.JCheckBox();
        chkAlterDadosVolun = new javax.swing.JCheckBox();
        chkCadFamilia = new javax.swing.JCheckBox();
        chkCadMorador = new javax.swing.JCheckBox();
        chkExcDoacao = new javax.swing.JCheckBox();
        chkAlterDadosFamilia = new javax.swing.JCheckBox();
        chkAlterDadosMorador = new javax.swing.JCheckBox();
        chkAlterConfigSistema = new javax.swing.JCheckBox();
        chkGerarRelatorio = new javax.swing.JCheckBox();
        chkCadDoacao = new javax.swing.JCheckBox();
        chkAlterDoacao = new javax.swing.JCheckBox();
        chkGerenUsuario = new javax.swing.JCheckBox();
        chkExcAux = new javax.swing.JCheckBox();
        chkCadAux = new javax.swing.JCheckBox();
        chkAlterAux = new javax.swing.JCheckBox();
        txtNome = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnDesabilitarTodos = new javax.swing.JButton();
        btnHabilitarTodos = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setTitle("Permissões de Usuário");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Login:");

        txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginFocusLost(evt);
            }
        });
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLoginKeyPressed(evt);
            }
        });

        btnPesq.setText("...");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });
        btnPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnPesqKeyPressed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chkInativarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkInativarUsuario.setText("Inativo");
        chkInativarUsuario.setEnabled(false);

        chkResetSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkResetSenha.setText("Resetar a Senha");
        chkResetSenha.setEnabled(false);

        chkCadVolun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkCadVolun.setText("Cadastra Voluntário");
        chkCadVolun.setEnabled(false);

        chkAlterDadosVolun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAlterDadosVolun.setText("Altera Dados de Voluntário");
        chkAlterDadosVolun.setEnabled(false);

        chkCadFamilia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkCadFamilia.setText("Cadastra Família");
        chkCadFamilia.setEnabled(false);

        chkCadMorador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkCadMorador.setText("Cadastra Morador");
        chkCadMorador.setEnabled(false);

        chkExcDoacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkExcDoacao.setText("Excluir Doações");
        chkExcDoacao.setEnabled(false);

        chkAlterDadosFamilia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAlterDadosFamilia.setText("Altera Dados da Família");
        chkAlterDadosFamilia.setEnabled(false);

        chkAlterDadosMorador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAlterDadosMorador.setText("Altera Dados do Morador");
        chkAlterDadosMorador.setEnabled(false);

        chkAlterConfigSistema.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAlterConfigSistema.setText("Configurações do Sistema");
        chkAlterConfigSistema.setEnabled(false);

        chkGerarRelatorio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkGerarRelatorio.setText("Gerar Relatórios");
        chkGerarRelatorio.setEnabled(false);

        chkCadDoacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkCadDoacao.setText("Cadastra Doações");
        chkCadDoacao.setEnabled(false);

        chkAlterDoacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAlterDoacao.setText("Altera Doações");
        chkAlterDoacao.setEnabled(false);

        chkGerenUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkGerenUsuario.setText("Gerenciar Usuário");
        chkGerenUsuario.setEnabled(false);

        chkExcAux.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkExcAux.setText("Excluir Auxílio");
        chkExcAux.setEnabled(false);

        chkCadAux.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkCadAux.setText("Cadastra Auxílio");
        chkCadAux.setEnabled(false);

        chkAlterAux.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkAlterAux.setText("Altera Auxílio");
        chkAlterAux.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCadVolun)
                            .addComponent(chkAlterDadosVolun)
                            .addComponent(chkAlterConfigSistema)
                            .addComponent(chkGerenUsuario)
                            .addComponent(chkGerarRelatorio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkExcAux)
                            .addComponent(chkAlterAux)
                            .addComponent(chkCadAux)
                            .addComponent(chkAlterDadosFamilia)
                            .addComponent(chkCadFamilia))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkCadMorador)
                                    .addComponent(chkAlterDadosMorador))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkCadDoacao)
                                    .addComponent(chkAlterDoacao)
                                    .addComponent(chkExcDoacao))
                                .addGap(61, 61, 61))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(chkInativarUsuario)
                .addGap(18, 18, 18)
                .addComponent(chkResetSenha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSeparator2)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkInativarUsuario)
                    .addComponent(chkResetSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkCadVolun)
                            .addComponent(chkCadMorador)))
                    .addComponent(chkCadFamilia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkAlterDadosVolun)
                            .addComponent(chkAlterDadosFamilia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chkAlterDadosMorador)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkAlterConfigSistema)
                            .addComponent(chkCadDoacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkAlterDoacao)
                            .addComponent(chkGerenUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkExcDoacao)
                            .addComponent(chkGerarRelatorio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkCadAux)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAlterAux)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkExcAux)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        txtNome.setEnabled(false);

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnDesabilitarTodos.setText("Desabilitar Todos");
        btnDesabilitarTodos.setEnabled(false);
        btnDesabilitarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesabilitarTodosActionPerformed(evt);
            }
        });

        btnHabilitarTodos.setText("Habilitar Todos");
        btnHabilitarTodos.setEnabled(false);
        btnHabilitarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabilitarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHabilitarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesabilitarTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGravar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHabilitarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesabilitarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gas/util/imagens/miniGAS.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesq)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnHabilitarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabilitarTodosActionPerformed
        if (!this.txtNome.getText().trim().isEmpty() || !this.txtNome.getText().equalsIgnoreCase("")) {
            chkAlterConfigSistema.setSelected(true);
            chkAlterDadosFamilia.setSelected(true);
            chkAlterDadosMorador.setSelected(true);
            chkAlterDadosVolun.setSelected(true);
            chkAlterDoacao.setSelected(true);
            chkCadDoacao.setSelected(true);
            chkCadFamilia.setSelected(true);
            chkCadMorador.setSelected(true);
            chkCadVolun.setSelected(true);
            chkExcDoacao.setSelected(true);
            chkGerarRelatorio.setSelected(true);
            chkGerenUsuario.setSelected(true);
            chkCadAux.setSelected(true);
            chkAlterAux.setSelected(true);
            chkExcAux.setSelected(true);
        }

    }//GEN-LAST:event_btnHabilitarTodosActionPerformed

    private void btnDesabilitarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesabilitarTodosActionPerformed

        if (!this.txtNome.getText().trim().isEmpty() || !this.txtNome.getText().equalsIgnoreCase("")) {
            chkAlterConfigSistema.setSelected(false);
            chkAlterDadosFamilia.setSelected(false);
            chkAlterDadosMorador.setSelected(false);
            chkAlterDadosVolun.setSelected(false);
            chkAlterDoacao.setSelected(false);
            chkCadDoacao.setSelected(false);
            chkCadFamilia.setSelected(false);
            chkCadMorador.setSelected(false);
            chkCadVolun.setSelected(false);
            chkExcDoacao.setSelected(false);
            chkGerarRelatorio.setSelected(false);
            chkGerenUsuario.setSelected(false);
            chkCadAux.setSelected(false);
            chkAlterAux.setSelected(false);
            chkExcAux.setSelected(false);
        }

    }//GEN-LAST:event_btnDesabilitarTodosActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed

        pesquisar();

    }//GEN-LAST:event_btnPesqActionPerformed

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!this.txtLogin.getText().equalsIgnoreCase("") || !this.txtLogin.getText().trim().isEmpty()) {
                this.voluntario.setLogin(txtLogin.getText());
                try {
                    voluntario = rnVoluntario.pesquisar(voluntario);
                    txtNome.setText(voluntario.getNome());
                    acessos();
                    btnHabilitarTodos.setEnabled(true);
                    btnDesabilitarTodos.setEnabled(true);
                    chkAlterConfigSistema.setEnabled(true);
                    chkAlterDadosFamilia.setEnabled(true);
                    chkAlterDadosMorador.setEnabled(true);
                    chkAlterDadosVolun.setEnabled(true);
                    chkAlterDoacao.setEnabled(true);
                    chkCadDoacao.setEnabled(true);
                    chkCadFamilia.setEnabled(true);
                    chkCadMorador.setEnabled(true);
                    chkCadVolun.setEnabled(true);
                    chkExcDoacao.setEnabled(true);
                    chkGerarRelatorio.setEnabled(true);
                    chkGerenUsuario.setEnabled(true);
                    chkInativarUsuario.setEnabled(true);
                    chkResetSenha.setEnabled(true);
                    chkCadAux.setEnabled(true);
                    chkAlterAux.setEnabled(true);
                    chkExcAux.setEnabled(true);

                    btnGravar.setEnabled(true);

                } catch (DAOException | SQLException ex) {
                }
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_F1) {

            pesquisar();
        }

    }//GEN-LAST:event_txtLoginKeyPressed

    private void pesquisar() {
        PesqUsuario pesqUsuario = new PesqUsuario(null, true, this);
        pesqUsuario.setVisible(true);

        if (pesqUsuario.retornoPesq().getLogin() != null) {
            this.voluntario = pesqUsuario.retornoPesq();

            txtLogin.setText(this.voluntario.getLogin());
            txtNome.setText(this.voluntario.getNome());

            acessos();

            btnHabilitarTodos.setEnabled(true);
            btnDesabilitarTodos.setEnabled(true);
            chkAlterConfigSistema.setEnabled(true);
            chkAlterDadosFamilia.setEnabled(true);
            chkAlterDadosMorador.setEnabled(true);
            chkAlterDadosVolun.setEnabled(true);
            chkAlterDoacao.setEnabled(true);
            chkCadDoacao.setEnabled(true);
            chkCadFamilia.setEnabled(true);
            chkCadMorador.setEnabled(true);
            chkCadVolun.setEnabled(true);
            chkExcDoacao.setEnabled(true);
            chkGerarRelatorio.setEnabled(true);
            chkGerenUsuario.setEnabled(true);
            chkInativarUsuario.setEnabled(true);
            chkResetSenha.setEnabled(true);
            chkCadAux.setEnabled(true);
            chkAlterAux.setEnabled(true);
            chkExcAux.setEnabled(true);

            btnGravar.setEnabled(true);

        }
    }

    private void acessos() {

        if (this.voluntario.getAcessoUsuario().getAltParan().equalsIgnoreCase("S")) {
            chkAlterConfigSistema.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getAltDoa().equalsIgnoreCase("S")) {
            chkAlterDoacao.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getAltFami().equalsIgnoreCase("S")) {
            chkAlterDadosFamilia.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getAltMora().equalsIgnoreCase("S")) {
            chkAlterDadosMorador.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getAltVolun().equalsIgnoreCase("S")) {
            chkAlterDadosVolun.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getCadDoa().equalsIgnoreCase("S")) {
            chkCadDoacao.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getCadMora().equalsIgnoreCase("S")) {
            chkCadMorador.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getCadFami().equalsIgnoreCase("S")) {
            chkCadFamilia.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getCadVolun().equalsIgnoreCase("S")) {
            chkCadVolun.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getExcDoa().equalsIgnoreCase("S")) {
            chkExcDoacao.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getGerRel().equalsIgnoreCase("S")) {
            chkGerarRelatorio.setSelected(true);
        }
        if (this.voluntario.getAcessoUsuario().getGerenUser().equalsIgnoreCase("S")) {
            chkGerenUsuario.setSelected(true);
        }

        if (this.voluntario.getAcessoUsuario().getCadAux().equalsIgnoreCase("S")) {
            chkCadAux.setSelected(true);
        }

        if (this.voluntario.getAcessoUsuario().getAltAux().equalsIgnoreCase("S")) {
            chkAlterAux.setSelected(true);
        }

        if (this.voluntario.getAcessoUsuario().getExcAux().equalsIgnoreCase("S")) {
            chkExcAux.setSelected(true);
        }

        if (this.voluntario.getStatus().equalsIgnoreCase("I")) {
            chkInativarUsuario.setSelected(true);
        }

    }

    private void txtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusLost

        if (this.txtLogin.getText().equalsIgnoreCase("") || this.txtLogin.getText().trim().isEmpty()) {
            this.voluntario.setLogin("");
            this.voluntario.setNome("");
            txtNome.setText("");
            chkAlterConfigSistema.setSelected(false);
            chkAlterDadosFamilia.setSelected(false);
            chkAlterDadosMorador.setSelected(false);
            chkAlterDadosVolun.setSelected(false);
            chkAlterDoacao.setSelected(false);
            chkCadDoacao.setSelected(false);
            chkCadFamilia.setSelected(false);
            chkCadMorador.setSelected(false);
            chkCadVolun.setSelected(false);
            chkExcDoacao.setSelected(false);
            chkGerarRelatorio.setSelected(false);
            chkGerenUsuario.setSelected(false);
            chkInativarUsuario.setSelected(false);
            chkResetSenha.setSelected(false);
            chkCadAux.setSelected(false);
            chkAlterAux.setSelected(false);
            chkExcAux.setSelected(false);

            btnDesabilitarTodos.setEnabled(false);
            btnHabilitarTodos.setEnabled(false);
            chkAlterConfigSistema.setEnabled(false);
            chkAlterDadosFamilia.setEnabled(false);
            chkAlterDadosMorador.setEnabled(false);
            chkAlterDadosVolun.setEnabled(false);
            chkAlterDoacao.setEnabled(false);
            chkCadDoacao.setEnabled(false);
            chkCadFamilia.setEnabled(false);
            chkCadMorador.setEnabled(false);
            chkCadVolun.setEnabled(false);
            chkExcDoacao.setEnabled(false);
            chkGerarRelatorio.setEnabled(false);
            chkGerenUsuario.setEnabled(false);
            chkInativarUsuario.setEnabled(false);
            chkResetSenha.setEnabled(false);
            chkCadAux.setEnabled(false);
            chkAlterAux.setEnabled(false);
            chkExcAux.setEnabled(false);

            btnGravar.setEnabled(false);

        }

    }//GEN-LAST:event_txtLoginFocusLost

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        if (chkInativarUsuario.isSelected()) {
            this.voluntario.setStatus("I");
        } else {
            this.voluntario.setStatus("A");
        }

        if (chkResetSenha.isSelected()) {
            this.voluntario.setStatusSenha(0);
        } else {
            this.voluntario.setStatusSenha(1);
        }

        if (chkAlterConfigSistema.isSelected()) {
            this.voluntario.getAcessoUsuario().setAltParan("S");
        } else {
            this.voluntario.getAcessoUsuario().setAltParan("N");
        }

        if (chkAlterDadosFamilia.isSelected()) {
            this.voluntario.getAcessoUsuario().setAltFami("S");
        } else {
            this.voluntario.getAcessoUsuario().setAltFami("N");
        }

        if (chkAlterDadosMorador.isSelected()) {
            this.voluntario.getAcessoUsuario().setAltMora("S");
        } else {
            this.voluntario.getAcessoUsuario().setAltMora("N");
        }

        if (chkAlterDadosVolun.isSelected()) {
            this.voluntario.getAcessoUsuario().setAltVolun("S");
        } else {
            this.voluntario.getAcessoUsuario().setAltVolun("N");
        }

        if (chkAlterDoacao.isSelected()) {
            this.voluntario.getAcessoUsuario().setAltDoa("S");
        } else {
            this.voluntario.getAcessoUsuario().setAltDoa("N");
        }

        if (chkCadDoacao.isSelected()) {
            this.voluntario.getAcessoUsuario().setCadDoa("S");
        } else {
            this.voluntario.getAcessoUsuario().setCadDoa("N");
        }

        if (chkCadFamilia.isSelected()) {
            this.voluntario.getAcessoUsuario().setCadFami("S");
        } else {
            this.voluntario.getAcessoUsuario().setCadFami("N");
        }

        if (chkCadMorador.isSelected()) {
            this.voluntario.getAcessoUsuario().setCadMora("S");
        } else {
            this.voluntario.getAcessoUsuario().setCadMora("N");
        }

        if (chkCadVolun.isSelected()) {
            this.voluntario.getAcessoUsuario().setCadVolun("S");
        } else {
            this.voluntario.getAcessoUsuario().setCadVolun("N");
        }

        if (chkExcDoacao.isSelected()) {
            this.voluntario.getAcessoUsuario().setExcDoa("S");
        } else {
            this.voluntario.getAcessoUsuario().setExcDoa("N");
        }

        if (chkGerarRelatorio.isSelected()) {
            this.voluntario.getAcessoUsuario().setGerRel("S");
        } else {
            this.voluntario.getAcessoUsuario().setGerRel("N");
        }

        if (chkGerenUsuario.isSelected()) {
            this.voluntario.getAcessoUsuario().setGerenUser("S");
        } else {
            this.voluntario.getAcessoUsuario().setGerenUser("N");
        }

        if (chkCadAux.isSelected()) {
            this.voluntario.getAcessoUsuario().setCadAux("S");
        } else {
            this.voluntario.getAcessoUsuario().setCadAux("N");
        }

        if (chkAlterAux.isSelected()) {
            this.voluntario.getAcessoUsuario().setAltAux("S");
        } else {
            this.voluntario.getAcessoUsuario().setAltAux("N");
        }

        if (chkExcAux.isSelected()) {
            this.voluntario.getAcessoUsuario().setExcAux("S");
        } else {
            this.voluntario.getAcessoUsuario().setExcAux("N");
        }

        try {
            if (rnVoluntario.AtualizarAcessos(voluntario)) {
                JOptionPane.showMessageDialog(this, "Gravado !", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (DAOException | SQLException ex) {
        }

    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnPesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnPesqKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPesq.doClick();
        }
    }//GEN-LAST:event_btnPesqKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesabilitarTodos;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnHabilitarTodos;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnSair;
    private javax.swing.JCheckBox chkAlterAux;
    private javax.swing.JCheckBox chkAlterConfigSistema;
    private javax.swing.JCheckBox chkAlterDadosFamilia;
    private javax.swing.JCheckBox chkAlterDadosMorador;
    private javax.swing.JCheckBox chkAlterDadosVolun;
    private javax.swing.JCheckBox chkAlterDoacao;
    private javax.swing.JCheckBox chkCadAux;
    private javax.swing.JCheckBox chkCadDoacao;
    private javax.swing.JCheckBox chkCadFamilia;
    private javax.swing.JCheckBox chkCadMorador;
    private javax.swing.JCheckBox chkCadVolun;
    private javax.swing.JCheckBox chkExcAux;
    private javax.swing.JCheckBox chkExcDoacao;
    private javax.swing.JCheckBox chkGerarRelatorio;
    private javax.swing.JCheckBox chkGerenUsuario;
    private javax.swing.JCheckBox chkInativarUsuario;
    private javax.swing.JCheckBox chkResetSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
