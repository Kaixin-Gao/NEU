/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ClinicalTrialManagerRole;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicalTrial.ClinicalTrialManagerOrganization;
import Business.Organization.HealthFacility.HealthFacilityManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalTrialManager.RequestForResearch;
import Business.WorkQueue.PatientRequest.RequestToDoctor;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author zhang
 */
public class ClinicalTrialManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ClinicalTrialManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Ecosystem business;
    /**
     * Creates new form ClinicalTrialManagerWorkAreaJPanel
     */
    public ClinicalTrialManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ClinicalTrialManagerOrganization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        valueJLabel.setText(enterprise.getName());
        populateTable();
        
    }
    
    public void populateTable() {
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof RequestForResearch) {
            Object[] row = new Object[5];
           
        row[0] = request.getMessage();
        row[1]=((RequestForResearch) request).getFunding();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((RequestForResearch) request).getResult();
            row[4] = result == null ? "Waiting" : result;
        
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        valueJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel1.setText("Clinical Trial Manager Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 66, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Study Topic", "Funding", "Receiver", "Status", "Result"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 512, 1168, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 423, -1, -1));

        btnRequest.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnRequest.setText("Send Request ");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(1064, 1069, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Enterprise :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 254, -1, -1));

        valueJLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        valueJLabel.setText("<Value>");
        add(valueJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Send Research Request To Scientist Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 327, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestResearchJPanel", new RequestResearchJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        // TODO add your handling code here:
          populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel valueJLabel;
    // End of variables declaration//GEN-END:variables
}
