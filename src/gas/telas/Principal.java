/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gas.telas;

import gas.basicas.Parametros;
import gas.basicas.Voluntario;
import gas.dados.DAOParametros;
import gas.util.DAOException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;


/**
 *
 * @author Gabriel Augusto
 */
public class Principal extends javax.swing.JFrame {

    private Voluntario voluntario;
    private Parametros parametros;
    private DAOParametros daoParam;
    
    /**
     * Creates new form Principal
     */
    public Principal() { 
        System.exit(0); // COMANDO DE PROTEÇÃO  CASO NÃO ABRA PELO LOGIN
        initComponents();
    }
     
    
    public Principal(Voluntario voluntario){
        initComponents();
        this.voluntario = voluntario;
        daoParam = new DAOParametros();
        try {
            this.parametros = daoParam.buscarParametros();
        } catch (DAOException | SQLException ex) {
            
        }
        acessos();
        configParam();
    }
    
    
    
    
    
    
    
    /**
     * BLOQUEIO DE MENUS POR REGAR DE PERMISSÕES
     */
    private void acessos(){
        
        if(voluntario.getAcessoUsuario().getGerenUser().equalsIgnoreCase("N")){
            this.menuGerenUser.setEnabled(false);
            
        }
        
        if(voluntario.getAcessoUsuario().getAltParan().equalsIgnoreCase("N")){
            this.menuParamGeral.setEnabled(false);
            
        } 
    }
    
     private void configParam(){
            
         if(this.parametros.getSysMaximizado().equalsIgnoreCase("S")){
             this.setExtendedState(MAXIMIZED_BOTH);
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

        jDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuDashBoard = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuGerenUser = new javax.swing.JMenuItem();
        menuParamGeral = new javax.swing.JMenuItem();
        MenuSobre = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Assistencia Social");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1023, 767));
        setMinimumSize(new java.awt.Dimension(1023, 767));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1023, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );

        MenuDashBoard.setText("DashBoard");
        jMenuBar1.add(MenuDashBoard);

        jMenu8.setText("Administração");

        jMenu1.setText("Cadastro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Família");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Voluntário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Auxílio");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Doação");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenu8.add(jMenu1);

        jMenu7.setText("Relatórios");

        jMenuItem7.setText("Voluntarios");
        jMenu7.add(jMenuItem7);

        jMenuItem8.setText("Famílias");
        jMenu7.add(jMenuItem8);

        jMenuItem9.setText("Doações por Familia");
        jMenu7.add(jMenuItem9);

        jMenuItem4.setText("SQL Avançado");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem4);

        jMenu8.add(jMenu7);

        jMenuBar1.add(jMenu8);

        jMenu6.setText("Sistema");

        jMenu2.setText("Configurações");

        jMenu5.setText("Parametros");

        menuGerenUser.setText("Usuários");
        menuGerenUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenUserActionPerformed(evt);
            }
        });
        jMenu5.add(menuGerenUser);

        menuParamGeral.setText("Geral");
        menuParamGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuParamGeralActionPerformed(evt);
            }
        });
        jMenu5.add(menuParamGeral);

        jMenu2.add(jMenu5);

        jMenu6.add(jMenu2);

        MenuSobre.setText("Sobre");
        MenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSobreMouseClicked(evt);
            }
        });
        MenuSobre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                MenuSobreKeyPressed(evt);
            }
        });
        jMenu6.add(MenuSobre);

        jMenuBar1.add(jMenu6);

        jMenu3.setText("Trocar de Usuário");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu3KeyPressed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CadFamilia cadFamilia = new CadFamilia(this.voluntario);
         this.jDesktop.add(cadFamilia);
         cadFamilia.setVisible(true);
         
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        CadVoluntario cadVoluntario = new CadVoluntario();
        jDesktop.add(cadVoluntario);
        cadVoluntario.setVisible(true);
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuGerenUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenUserActionPerformed
        
        ParanUsuario paranUsuario = new ParanUsuario();
        jDesktop.add(paranUsuario);
        paranUsuario.setVisible(true);
        
        
    }//GEN-LAST:event_menuGerenUserActionPerformed

    private void menuParamGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuParamGeralActionPerformed
        
        ParanGeral paranGeral = new ParanGeral();
        jDesktop.add(paranGeral);
        paranGeral.setVisible(true);
        paranGeral.aviso();
        
    }//GEN-LAST:event_menuParamGeralActionPerformed

    private void MenuSobreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MenuSobreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuSobreKeyPressed

    private void MenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobreMouseClicked
       
        Sobre sobre = new Sobre(null,true,this.voluntario);
        sobre.setVisible(true);
        
        
    }//GEN-LAST:event_MenuSobreMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        CadAuxilio cadAuxilio = new CadAuxilio(this.voluntario);
        jDesktop.add(cadAuxilio);
        cadAuxilio.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       
        CadDoacao cadDoacao = new CadDoacao(this.voluntario);
        jDesktop.add(cadDoacao);
        cadDoacao.setVisible(true);  
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu3KeyPressed
        
    
        
    }//GEN-LAST:event_jMenu3KeyPressed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       TelaLogin telaLogin =  new TelaLogin();
        telaLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        SqlAvan sqlAvan = new SqlAvan();
        jDesktop.add(sqlAvan);
        sqlAvan.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_F10){
            TelaAtualizacao telaAtu = new TelaAtualizacao(this,true);
            telaAtu.setLocationRelativeTo(this);
            telaAtu.setVisible(true);
        }
    }//GEN-LAST:event_formKeyPressed
   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuDashBoard;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menuGerenUser;
    private javax.swing.JMenuItem menuParamGeral;
    // End of variables declaration//GEN-END:variables
}
