/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.HealthFacilityManagerRole;

import Business.Drug.Drug;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthFacility.DoctorOrganization;
import Business.Organization.Manufactory.DrugManufactoryOrganization;
import Business.Organization.Organization;
import Business.Patient.Disease;
import Business.Patient.Gene;
import Business.UserAccount.UserAccount;
import Business.Verify.IntegerVerifier;
import Business.Verify.StringVerifier;
import Business.WorkQueue.HealthFacilityManager.RequestToDrugManufactoryForMoreDrug;
import Business.WorkQueue.ScientistRole.RequestToHealthDate;
import Interface.ScientistRole.ScientistWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class RequestMoreDrugJPanel extends javax.swing.JPanel {

      private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Ecosystem business;
    private Network n;
    /**
     * Creates new form RequestMoreDrugJPanel
     */
    public RequestMoreDrugJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        n=new Network();
        jLabel2.setText(enterprise.getName());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        drugJTextField = new javax.swing.JTextField();
        numberJTextField = new javax.swing.JTextField();
        messageJTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Enterprise :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("<Value>");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Drug :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 284, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Number :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Message :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 670, -1, -1));

        drugJTextField.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        drugJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugJTextFieldActionPerformed(evt);
            }
        });
        add(drugJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 809, -1));

        numberJTextField.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        numberJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberJTextFieldActionPerformed(evt);
            }
        });
        add(numberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 809, -1));

        messageJTextField.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 680, 800, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 865, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 870, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void numberJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberJTextFieldActionPerformed

    private void drugJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugJTextFieldActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
          IntegerVerifier intVerify = new IntegerVerifier();
        StringVerifier stringVerify = new StringVerifier();
        
        
        if (intVerify.verify(numberJTextField) && stringVerify.verify(drugJTextField) && stringVerify.verify(messageJTextField)) {
         String drugName = drugJTextField.getText();
         int num=Integer.parseInt(numberJTextField.getText());
         String message=messageJTextField.getText();
         
         Drug d=new Drug();
         d.setDrugName(drugName);
         
        
       
         
        RequestToDrugManufactoryForMoreDrug request = new RequestToDrugManufactoryForMoreDrug();
        
        request.setDrug(d);
        request.setDrugNum(num);
        request.setMessage(messageJTextField.getText());
        request.setSender(userAccount);
        request.setStatus("Sent");
        
        
        Organization org = null;
        
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization organiz : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organiz instanceof DrugManufactoryOrganization) {
                        org = organiz;
                        org.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(null, "Request For More Drug");
                    }
                }
            }
        
        }  
    
        
         userAccount.getWorkQueue().getWorkRequestList().add(request);
        }else {
            JOptionPane.showMessageDialog(null, "Wrong inputs"); 
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SendRequestToDrugManufactoryJPanel dwjp = (SendRequestToDrugManufactoryJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField drugJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTextField numberJTextField;
    // End of variables declaration//GEN-END:variables
}
