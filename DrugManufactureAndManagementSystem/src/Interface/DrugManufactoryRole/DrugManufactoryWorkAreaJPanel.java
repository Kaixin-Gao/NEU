/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DrugManufactoryRole;

import Business.Drug.Drug;
import Business.Drug.DrugHistory;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HealthFacility.PatientOrganization;
import Business.Organization.Manufactory.DrugManufactoryOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugManufactory.SendRequestToCompoundManufactory;
import Business.WorkQueue.HealthFacilityManager.RequestToDrugManufactoryForMoreDrug;
import Business.WorkQueue.PatientRequest.RequestToDoctor;
import Business.WorkQueue.ScientistRole.RequestToHealthDate;
import Business.WorkQueue.ScientistRole.SendResultToDrugManufactory;
import Business.WorkQueue.WorkRequest;
import Interface.DoctorRole.ProcessHealthDateJPanel;
import Interface.PatientRole.RequestServiceJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhang
 */
public class DrugManufactoryWorkAreaJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private DrugManufactoryOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Ecosystem ecosystem;
    private DrugHistory drugHistory;
    /**
     * Creates new form DrugManufactoryWorkAreaJPanel
     */
    public DrugManufactoryWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DrugManufactoryOrganization organization, Enterprise enterprise,Ecosystem business) {
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem=ecosystem;
       
        
        drugHistory=new DrugHistory();
        
        populateTable();
        populateTable2();
        populateTable3();
        populateTable4();
    }

    

  

    
     public void populateTable() {
         DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        for (Drug d :drugHistory.getDrugHistory()) {
            Object[] row=new Object[4];
            
            row[0]=d;
            row[1]=d.getDrugNumber();
            row[2]=d.getDescription();
            row[3]=d.getIndication();
            
            dtm.addRow(row);
        }
    }
     
     public void populateTable2() {
          DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof SendRequestToCompoundManufactory) {
            Object[] row = new Object[6];
            row[0]=((SendRequestToCompoundManufactory) request).getCompound();
            row[1]=((SendRequestToCompoundManufactory) request).getCompoundNum();
            row[2]=request;
            row[3]=request.getStatus();
            row[4]=request.getReceiver();
            row[5]=((SendRequestToCompoundManufactory) request).getResult();
            
            
            
            model.addRow(row);
        }
        }
     }
    public void  populateTable3() {
          DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
          if (request instanceof RequestToDrugManufactoryForMoreDrug) {
            Object[] row = new Object[7];
            row[0] = ((RequestToDrugManufactoryForMoreDrug)request).getDrug();
            row[1]=((RequestToDrugManufactoryForMoreDrug)request).getDrugNum();
            row[2]=request;
             row[3] = request.getStatus();
            row[4]=request.getSender();
            row[5]=request.getReceiver();
            row[6]=((RequestToDrugManufactoryForMoreDrug) request).getResult();
            
            model.addRow(row);
          }
        }
     }
    
    
    public void populateTable4() {
         DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
          if (request instanceof SendResultToDrugManufactory) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getStatus();
            row[2]=request.getSender();
            row[3]=request.getReceiver();
            
            
            model.addRow(row);
          }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug", "DrugID", "Description", "indication"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1250, 1620, 230));

        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 1490, -1, -1));

        btnView.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnView.setText("View Detail");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel2.setText("Drug Manufactory Work Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Compound", "Number", "Message", "Status", "Receiver", "Result"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 890, 1620, 240));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1170, -1, -1));

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnSend.setText("Send Request To Compound Manufactory");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 1160, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug", "Number", "Message", "Status", "Sender", "Receiver", "Results"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 1610, 220));

        btnAssign.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnAssign.setText("Assign Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        btnProcess.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Health Facility Manager's Request :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Scientist 's New Research Result");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "Sender", "Receiver"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 1620, 180));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Assign Me");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 740, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.setText("View The Research Detail");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 750, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 1490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Send Request To Compound Manufactory");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 820, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateDrugJPanel panel=new CreateDrugJPanel(userProcessContainer,drugHistory);
        userProcessContainer.add("CreateProductJPanel", panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
         int selectedRow=jTable1.getSelectedRow();
         if (selectedRow<0) {
             JOptionPane.showMessageDialog(null,"Pelase select a row from table first to view details", "warning",JOptionPane.WARNING_MESSAGE);
         }else {
             Drug d=(Drug)jTable1.getValueAt(selectedRow, 0);
             ViewDrugJPanel panel=new ViewDrugJPanel(userProcessContainer, d);
              userProcessContainer.add("ViewDrugJPanel",panel);
               CardLayout layout=(CardLayout)userProcessContainer.getLayout();
              layout.next(userProcessContainer);
         }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestServiceJPanel", new RequestCompoundJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable3.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        RequestToDrugManufactoryForMoreDrug request = (RequestToDrugManufactoryForMoreDrug)jTable3.getValueAt(selectedRow, 2);
     
        request.setStatus("Processing");
         /*RequestToHealthDate r=new RequestToHealthDate();
         for(WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()){
          if (request instanceof RequestToHealthDate && ((RequestToHealthDate) request).getDisease().equals(jTable2.getValueAt(selectedRow, 0)) ) {
               request.setStatus("Processing");
               r=(RequestToHealthDate)request;
                       
          }*/
        
        
        ProcessHealthFacilityManagerRequestJPanel  processHealthFacilityManagerRequestJPanel = new  ProcessHealthFacilityManagerRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel",   processHealthFacilityManagerRequestJPanel );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable3.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)jTable3.getValueAt(selectedRow, 2);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable3();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
          populateTable2();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable4.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)jTable4.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable4();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable4.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        SendResultToDrugManufactory request = (SendResultToDrugManufactory)jTable4.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
         
        
        
        ViewTheResultJPanel  viewTheResultJPanel = new  ViewTheResultJPanel(userProcessContainer, request);
        userProcessContainer.add("viewTheResultJPanel",   viewTheResultJPanel );
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         int selectedRow=jTable1.getSelectedRow();
        if (selectedRow>=0) {
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int dialogResult=JOptionPane.showConfirmDialog(null, "would you want to delete the drug details?","Warning",dialogButton);
            if (dialogResult==JOptionPane.YES_NO_OPTION) {
                Drug d=(Drug)jTable1.getValueAt(selectedRow, 0);
                drugHistory.deleteDrug(d);
                populateTable();
            }
        }else {
            JOptionPane.showMessageDialog(null,"Pelase select a row from table first", "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
}
