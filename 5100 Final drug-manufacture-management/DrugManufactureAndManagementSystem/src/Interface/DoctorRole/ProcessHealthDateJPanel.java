/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DoctorRole;

import Business.Drug.Drug;
import Business.WorkQueue.PatientRequest.RequestToDoctor;
import Business.WorkQueue.ScientistRole.RequestToHealthDate;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class ProcessHealthDateJPanel extends javax.swing.JPanel {

     JPanel userProcessContainer;
      RequestToHealthDate request;
    /**
     * Creates new form ProcessHealthDateJPanel
     */
    public ProcessHealthDateJPanel(JPanel userProcessContainer, RequestToHealthDate request) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.request = request;
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
        jTextField1 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel1.setText("Process Health Date");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 106, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Drug");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 469, 162, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 466, 621, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 847, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 857, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String drugMessage=jTextField1.getText();
        Drug d=new Drug();
        d.setDrugName(drugMessage);
        
         request.setDrug(d);
        request.setStatus("Completed");
        
        
        JOptionPane.showMessageDialog(null, "Send The Result To Scientists");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
