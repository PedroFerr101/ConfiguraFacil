/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.awt.event.*;

import business.ConfiguraFacil;
import business.gConta.Funcionario;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 *
 * @author Pedro
 */
public class StandFrame extends javax.swing.JFrame {

    ConfiguraFacil cf;
    Funcionario f;

    /**
     * Creates new form StandFrame
     */
    private void clientes_btnActionPerformed(ActionEvent e) {
        new ClientesFrame(cf).setVisible(true);
    }

    private void sair_btnActionPerformed(ActionEvent e) {
        this.dispose();
        new LoginFrame().setVisible(true);
    }

    public StandFrame(ConfiguraFacil cf, Funcionario f) {
        initComponents();
        this.cf = cf;
        this.f = f;
        this.login_lbl.setText("Logged in as " + f.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Pedro Moreira
    private void initComponents() {
        config_btn = new JButton();
        clientes_btn = new JButton();
        sair_btn = new JButton();
        jLabel1 = new JLabel();
        login_lbl = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stand");
        Container contentPane = getContentPane();

        //---- config_btn ----
        config_btn.setFont(new Font("Tahoma", Font.PLAIN, 12));
        config_btn.setText("Iniciar Configura\u00e7\u00e3o");
        config_btn.addActionListener(e -> {
            try {
                config_btnActionPerformed(e);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });

        //---- clientes_btn ----
        clientes_btn.setFont(new Font("Tahoma", Font.PLAIN, 12));
        clientes_btn.setText("Consultar Clientes");
        clientes_btn.addActionListener(e -> clientes_btnActionPerformed(e));

        //---- sair_btn ----
        sair_btn.setText("Sair");
        sair_btn.addActionListener(e -> sair_btnActionPerformed(e));

        //---- jLabel1 ----
        jLabel1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/presentation/logo.png")));
        jLabel1.setText("- STAND");

        //---- login_lbl ----
        login_lbl.setFont(new Font("Tahoma", Font.PLAIN, 8));
        login_lbl.setText("Logged in as");
        login_lbl.setHorizontalAlignment(SwingConstants.RIGHT);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(sair_btn, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                    .addComponent(login_lbl, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                    .addGap(9, 9, 9))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(79, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(config_btn, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(clientes_btn, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addGap(78, 78, 78))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                    .addComponent(config_btn, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(clientes_btn, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(login_lbl)
                        .addComponent(sair_btn, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
                    .addGap(5, 5, 5))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void config_btnActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_config_btnActionPerformed
        new ConfiguracaoFrame(this.cf).setVisible(true);
    }//GEN-LAST:event_config_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandFrame().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pedro Moreira
    private JButton config_btn;
    private JButton clientes_btn;
    private JButton sair_btn;
    private JLabel jLabel1;
    private JLabel login_lbl;
    // End of variables declaration//GEN-END:variables
}
