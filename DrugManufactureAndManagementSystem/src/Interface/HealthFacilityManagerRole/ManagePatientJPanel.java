/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.HealthFacilityManagerRole;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HealthFacility.HealthFacilityManagerOrganization;
import Business.Organization.HealthFacility.PatientOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRequest.RequestToDoctor;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhang
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
    private HealthFacilityManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Ecosystem business;
    Patient patient;
    /**
     * Creates new form ManagePatientJPanel
     */
    public ManagePatientJPanel(JPanel userProcessContainer, UserAccount account, HealthFacilityManagerOrganization organization, Enterprise enterprise, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        
        patient = new Patient();
        
        populateTable();
    }
    
     public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) patientJTable.getModel();

        model.setRowCount(0);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof  PatientOrganization) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    //Object should be passed
                    
                       
                            //consumer = ((Consumer) emp);
                            Object[] row = new Object[2];
                            row[0] = ua.getEmployee();
                            row[1] = ((Patient)ua.getEmployee()).getPatientID();
                            model.addRow(row);

                        
                    }

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
        patientJTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel1.setText("Manage Patient Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 116, -1, -1));

        patientJTable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        patientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Address"
            }
        ));
        patientJTable.setRowHeight(30);
        jScrollPane1.setViewportView(patientJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 284, 1301, 173));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnAdd.setText("Add Patient");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 525, -1, -1));

        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnRemove.setText("Remove Patient");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 525, 416, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 702, 277, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddPatientJPanel  addPatientJPanel = new  AddPatientJPanel(userProcessContainer, userAccount, organization, enterprise, business, patient);
        userProcessContainer.add("addPatientJPanel", addPatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAddActionPerformed

     private void RemoveConsumerFromWorkQueue1(Patient selectedConsumer) {
        Boolean flag = false;
        Organization org = null;
        WorkRequest workReq = null;
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType() == Enterprise.EnterpriseType.HealthFacility) {
                    {
                        for (Organization organiz : e.getOrganizationDirectory().getOrganizationList()) {
                            if (organiz instanceof HealthFacilityManagerOrganization) {
                                org = organiz;

                                for (WorkRequest wr : org.getWorkQueue().getWorkRequestList()) {
                                    if (wr instanceof RequestToDoctor) {
                                        //Consumer Found here
                                        if (selectedConsumer == ((RequestToDoctor) wr).getPatient()) {
                                            workReq = wr;
                                            flag = true;
                                            JOptionPane.showMessageDialog(null, "His request for local Energy deleted");
                                        }

                                    }
                                }
                                if (flag = true) {
                                    org.getWorkQueue().getWorkRequestList().remove(workReq);
                                    userAccount.getWorkQueue().getWorkRequestList().remove(workReq);
                                    JOptionPane.showMessageDialog(null, "Removing consumer from work queue!");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Consumer not found in work queue!");
                                }
                            }
                        }
                    }
                }
            }

        }

    }
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
         int selectedRow = patientJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        Patient selectedConsumer = (Patient) patientJTable.getValueAt(selectedRow, 0);
        UserAccount removeUserAccount = null;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof PatientOrganization) {

                org.getEmployeeDirectory().removePatient(selectedConsumer);
               
                RemoveConsumerFromWorkQueue1(selectedConsumer);
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getEmployee().equals((Employee) selectedConsumer)) {
                        removeUserAccount = ua;
                    }
                }
                org.getUserAccountDirectory().getUserAccountList().remove(removeUserAccount);

            }
        }

        populateTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientJTable;
    // End of variables declaration//GEN-END:variables
}
