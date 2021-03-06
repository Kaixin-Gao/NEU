/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DrugManufactoryRole;

import Business.Drug.Drug;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class ViewDrugJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
     private Drug drug;
    /**
     * Creates new form ViewDrugJPanel
     */
    public ViewDrugJPanel(JPanel userProcessContainer, Drug drug) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
         this.drug=drug;
         populateAccountDetails();
         btnSave.setEnabled(false);
         btnUpdate.setEnabled(true);
    }
    
     private void populateAccountDetails() {
        nameJTextField.setText(drug.getDrugName());
        idJTextField.setText(String.valueOf(drug.getDrugNumber()));
        descriptionJTextField.setText(drug.getDescription());
        indicationJTextField.setText(drug.getIndication());
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        idJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        indicationJTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel1.setText("View Drug");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 84, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Drug Name ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 239, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Drug Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 236, 0, -1));

        idJTextField.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        idJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1175, 228, 211, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Description :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 488, -1, -1));

        descriptionJTextField.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(descriptionJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 485, 800, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Indication :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 616, -1, -1));

        indicationJTextField.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(indicationJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 601, 800, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 884, -1, -1));

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 183, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 884, 198, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1029, 884, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idJTextFieldActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DrugManufactoryWorkAreaJPanel p = (DrugManufactoryWorkAreaJPanel) component;
        p.populateTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        drug.setDrugName(nameJTextField.getText());
        drug.setDrugNumber(Integer.parseInt(idJTextField.getText()));
        drug.setDescription(descriptionJTextField.getText());
        drug.setIndication(indicationJTextField.getText());
        
         nameJTextField.setEnabled(false);
         idJTextField.setEnabled(false);
          descriptionJTextField.setEnabled(false);
          indicationJTextField.setEnabled(false);      
        
          
          btnSave.setEnabled(false);
          btnUpdate.setEnabled(true);
        
        JOptionPane.showMessageDialog(null,"Drug Updataed Successfully");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
         nameJTextField.setEnabled(true);
         idJTextField.setEnabled(true);
          descriptionJTextField.setEnabled(true);
          indicationJTextField.setEnabled(true);
         
          
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField descriptionJTextField;
    private javax.swing.JTextField idJTextField;
    private javax.swing.JTextField indicationJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nameJTextField;
    // End of variables declaration//GEN-END:variables
}
