/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import business.Cliente;
import business.ConfiguraFacil;
import com.mysql.cj.util.StringUtils;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 *
 * @author Pedro
 */
public class NovoClienteFrame extends javax.swing.JFrame {

    ConfiguraFacil cf;

    public static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    private void registar_btnActionPerformed(ActionEvent e) throws SQLException, ClassNotFoundException {
        String nome = this.nome_txt.getText();
        String telemovel = this.telemovel_txt.getText();
        String email = this.email_txt.getText();

        System.out.println(email == ""); // FIXME: 12/23/2018 DEBUGGING

        if(nome != "" && email != ""){ // FIXME: 12/23/2018
            if(isNumeric(telemovel)){
                int id = this.cf.clientes.size()+1;
                Cliente c = new Cliente(id, nome, Integer.parseInt(telemovel), email);

                this.cf.registaCliente(c);
                this.dispose();
            }
            else this.error_txt.setText("Insira um número válido");
        }
        else this.error_txt.setText("Preencha todos os campos");

    }


    /**
     * Creates new form NovoClienteFrame
     */
    public NovoClienteFrame(ConfiguraFacil cf) {
        initComponents();
        this.cf = cf;
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
        nome_txt = new JTextField();
        telemovel_txt = new JTextField();
        email_txt = new JTextField();
        registar_btn = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        sair_btn = new JButton();
        error_txt = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();

        //---- nome_txt ----
        nome_txt.setToolTipText("");

        //---- registar_btn ----
        registar_btn.setText("Registar");
        registar_btn.addActionListener(e -> {
            try {
                registar_btnActionPerformed(e);
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        });

        //---- label1 ----
        label1.setText("Nome");

        //---- label2 ----
        label2.setText("Telem\u00f3vel");

        //---- label3 ----
        label3.setText("E-mail");

        //---- sair_btn ----
        sair_btn.setText("Sair");

        //---- error_txt ----
        error_txt.setForeground(Color.red);
        error_txt.setFont(new Font("Segoe UI", Font.PLAIN, 9));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(sair_btn, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                    .addComponent(registar_btn)
                    .addContainerGap())
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label2)
                        .addComponent(label3)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(telemovel_txt)
                        .addComponent(nome_txt)
                        .addComponent(email_txt, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addComponent(error_txt, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addContainerGap(40, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nome_txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(telemovel_txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(email_txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(error_txt)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(registar_btn)
                        .addComponent(sair_btn))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(NovoClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pedro Moreira
    private JTextField nome_txt;
    private JTextField telemovel_txt;
    private JTextField email_txt;
    private JButton registar_btn;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton sair_btn;
    private JLabel error_txt;
    // End of variables declaration//GEN-END:variables
}
