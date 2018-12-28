/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import business.ConfiguraFacil;
import business.gConfig.Componente;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 *
 * @author Pedro
 */
public class AtualizarStockFrame extends javax.swing.JFrame {

    ConfiguraFacil cf;

    private void nova_componente_btnActionPerformed(ActionEvent e) {
        new NovaComponenteFrame().setVisible(true);
    }

    private void atualizar_btnActionPerformed(ActionEvent e) throws SQLException, ClassNotFoundException {
        int id = componente_cbox.getSelectedIndex() + 1;
        int quantidade = Integer.parseInt(qnt_txt.getText());

        this.cf.atualizarStock(id, quantidade);

        this.dispose();
    }



    public AtualizarStockFrame(ConfiguraFacil cf) throws Exception {
        initComponents();
        this.cf = cf;
        List<String> l = new ArrayList<>();
        for(Componente c : this.cf.getComponentes()){
            l.add(c.getID() + " - " + c.getDesignacao());
        }
        componente_cbox.setModel(new DefaultComboBoxModel(l.toArray()));
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
        componente_cbox = new JComboBox<>();
        qnt_txt = new JTextField();
        nova_componente_btn = new JButton();
        atualizar_btn = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Stock");
        Container contentPane = getContentPane();

        //---- componente_cbox ----
        componente_cbox.setModel(new DefaultComboBoxModel<>(new String[] {
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4"
        }));

        //---- nova_componente_btn ----
        nova_componente_btn.setText("Nova Componente");
        nova_componente_btn.addActionListener(e -> nova_componente_btnActionPerformed(e));

        //---- atualizar_btn ----
        atualizar_btn.setText("Atualizar");
        atualizar_btn.addActionListener(e -> {
            try {
                atualizar_btnActionPerformed(e);
            } catch (SQLException e1) {
                e1.printStackTrace();
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            }
        });

        //---- label1 ----
        label1.setText("Componente");

        //---- label2 ----
        label2.setText("Quantidade");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(label2, GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(componente_cbox, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addComponent(qnt_txt, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(nova_componente_btn)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(atualizar_btn)))
                    .addContainerGap(24, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(componente_cbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(qnt_txt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nova_componente_btn)
                        .addComponent(atualizar_btn))
                    .addContainerGap(9, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pedro Moreira
    private JComboBox<String> componente_cbox;
    private JTextField qnt_txt;
    private JButton nova_componente_btn;
    private JButton atualizar_btn;
    private JLabel label1;
    private JLabel label2;
    // End of variables declaration//GEN-END:variables
}
