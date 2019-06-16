/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gas.telas;

import com.sun.glass.events.KeyEvent;
import gas.basicas.Doacao;
import gas.regra.RNDoacao;
import gas.util.CustomDocument;
import gas.util.DAOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Augusto
 */
public class CadDoacao extends javax.swing.JInternalFrame {

    private RNDoacao rnDoacao;
    /** Creates new form CadAuxilio */
    public CadDoacao() {
        initComponents();
        rnDoacao = new RNDoacao();
        txtDescricao.setDocument(new CustomDocument());
        lista();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDoacao = new javax.swing.JTable();
        txtDescricao = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setTitle("Cadastro de Doação");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Descrição:");

        tbDoacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doação", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDoacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDoacaoMouseClicked(evt);
            }
        });
        tbDoacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbDoacaoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbDoacao);
        if (tbDoacao.getColumnModel().getColumnCount() > 0) {
            tbDoacao.getColumnModel().getColumn(0).setMinWidth(55);
            tbDoacao.getColumnModel().getColumn(0).setPreferredWidth(55);
            tbDoacao.getColumnModel().getColumn(0).setMaxWidth(55);
        }

        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyPressed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        btnCadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrarKeyPressed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gas/util/imagens/miniGAS.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSair)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        
        Doacao doacao = new Doacao();
        
        doacao.setDescricao(txtDescricao.getText());
       
        
        try {
            rnDoacao.inserir(doacao);
            txtDescricao.setText("");
            lista();
        } catch (DAOException | SQLException ex) {
            
        }
        
   
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyPressed
        
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnCadastrar.grabFocus();
        }
        
        
    }//GEN-LAST:event_txtDescricaoKeyPressed

    private void btnCadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarKeyPressed
       
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnCadastrar.doClick();
            
        }
        
        
    }//GEN-LAST:event_btnCadastrarKeyPressed

    private void tbDoacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDoacaoMouseClicked
  
    }//GEN-LAST:event_tbDoacaoMouseClicked

    private void tbDoacaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDoacaoKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_DELETE ){
            
            Doacao doacaoEx = new Doacao();
            
                int linha;
   
                        linha = tbDoacao.getSelectedRow();
                        doacaoEx.setNr_Doacao(Integer.parseInt(tbDoacao.getValueAt(linha,0).toString()));
                        
              try {
                   int confirma = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir esta doação?","Excluir Doação",JOptionPane.YES_NO_CANCEL_OPTION);
                if(confirma == JOptionPane.YES_OPTION){
                 rnDoacao.excluir(doacaoEx);
                 JOptionPane.showMessageDialog(null,"Excluido com Sucesso!","",JOptionPane.INFORMATION_MESSAGE);
                 lista();
                }
                  
              } catch (DAOException | SQLException ex) {
                 
              }

          
        }
        
        
        
        
        
    }//GEN-LAST:event_tbDoacaoKeyPressed

    
    public void lista(){
        RNDoacao rnDoacao = new RNDoacao(); //CRIAR A INSTANCIA DA FACHADA
        DefaultTableModel modelo = new DefaultTableModel(); // INSTANCIA O OBJETO PADRÃO DE TABELA - ADICIONE A IMPORTAÇÃO
        ArrayList<Doacao> lista = new ArrayList(); // CRIA UMA LISTA, DE ARRAYLIST DE LIVRO
        try {
            lista =  rnDoacao.listarDoacao(); // BUSCA OS DADOS DO BANCO PARA A LISTA
        } catch (Exception ex) {
            
        }   
       modelo = (DefaultTableModel) tbDoacao.getModel(); // CHECA O JTABLE PARA RECEBER OS DADOS
        if(modelo.getRowCount() > 0){  //se existir linha 
            modelo.setRowCount(0); // apaga todas as linhas
        }
        for (Doacao doacao : lista) { 
            modelo.addRow(new Object[]{doacao.getNr_Doacao(),
                                       doacao.getDescricao()
                                       
            });
        } // TRAS AS INFORMAÇÕES NA TABELA COM OS DADOS SOLICITADOS.
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDoacao;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables

}
