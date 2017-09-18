/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ScientistRole;

import Business.Compound.Compound;
import Business.Drug.Drug;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClinicalTrial.ScientistOrganization;
import Business.Organization.HealthFacility.PatientOrganization;
import Business.Patient.Disease;
import Business.Patient.Gene;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalTrialManager.RequestForResearch;
import Business.WorkQueue.PatientRequest.RequestToDoctor;
import Business.WorkQueue.ScientistRole.Analysis;
import Business.WorkQueue.ScientistRole.RequestToHealthDate;
import Business.WorkQueue.WorkRequest;
import Interface.PatientRole.RequestServiceJPanel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.PieChart;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author zhang
 */
public class ScientistWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ScientistOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private Ecosystem business;
    private boolean Isselected;
    /*Analysis analysis;*/
    /**
    /**
     * Creates new form ScientistWorkAreaJPanel
     */
    public ScientistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ScientistOrganization organization, Enterprise enterprise,Ecosystem business) {
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business=business;
        jLabel3.setText(enterprise.getName());
        populateRequestTable();
        
        populateTable2();
        
        populateTable3();
        Isselected=false;
       /* analysis=new Analysis();*/
    }
    
    
     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof RequestToHealthDate) {
            Object[] row = new Object[6];
            row[0] = ((RequestToHealthDate) request).getDisease();
            row[1]= ((RequestToHealthDate)request).getGene();
            row[2]=request;
            row[3] = ((RequestToHealthDate)request).getDrug();
            row[4] = request.getStatus();
            
            row[5]=request.getReceiver();
           
            
           /* String result = ((RequestToDoctor) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;*/
            
            
            
            model.addRow(row);
        }
        }
    }

     public void populateTable2() {
           DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
            if (request instanceof Analysis) {
            Object[] row = new Object[6];
            row[0] = ((Analysis) request).getDisease();
            row[1]= ((Analysis)request).getGene();
            row[2]=((Analysis) request).getDrug();
            Compound[] ca=((Analysis)request).getCompoundArray();
            row[3] = ca[0];
            row[4] = ca[1]; 
            row[5]= ca[2];
           
            
          
            
            
            model.addRow(row);
        }
        }
     }
     
     public void populateTable3() {
          DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            if (request instanceof RequestForResearch) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1]=((RequestForResearch) request).getFunding();
            row[2] = request.getSender().getEmployee().getName();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnSend = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnResearch = new javax.swing.JButton();
        btnRefresh2 = new javax.swing.JButton();
        btnShowBarChart = new javax.swing.JButton();
        btnShowBieChart = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnAssignMe = new javax.swing.JButton();
        btnRe = new javax.swing.JButton();
        btnPro = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 64)); // NOI18N
        jLabel1.setText("Scientists Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Enterprise :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 126, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("<Value>");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disease", "Gene", "Message", "Drug", "Status", "Receiver"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 800, 1500, 263));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnRefresh.setText("RefreshTable");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 1090, -1, -1));

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnSend.setText("Send Request To Doctor");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        add(btnSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 1090, -1, -1));

        btnSelect.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnSelect.setText("Select For Research");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1090, -1, -1));

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disease", "Gene", "Drug", "Compound1", "Compound2", "Compound3"
            }
        ));
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1290, 1500, 227));

        btnResearch.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnResearch.setText("Research");
        btnResearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResearchActionPerformed(evt);
            }
        });
        add(btnResearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 1560, -1, -1));

        btnRefresh2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnRefresh2.setText("Refresh ");
        btnRefresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh2ActionPerformed(evt);
            }
        });
        add(btnRefresh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 1550, -1, -1));

        btnShowBarChart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnShowBarChart.setText("Show Bar Charts ");
        btnShowBarChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowBarChartActionPerformed(evt);
            }
        });
        add(btnShowBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1550, -1, -1));

        btnShowBieChart.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnShowBieChart.setText("Show Bie Charts");
        btnShowBieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowBieChartActionPerformed(evt);
            }
        });
        add(btnShowBieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 1550, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Study Topic", "Funding", "Sender", "Receiver", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 1480, 237));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("Step1 : ClinicalTrial Manager 's Request");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        btnAssignMe.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnAssignMe.setText("Assign Me");
        btnAssignMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignMeActionPerformed(evt);
            }
        });
        add(btnAssignMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, -1, -1));

        btnRe.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnRe.setText("Refresh");
        btnRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReActionPerformed(evt);
            }
        });
        add(btnRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 570, 260, -1));

        btnPro.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnPro.setText("Process");
        btnPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProActionPerformed(evt);
            }
        });
        add(btnPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("Step2 : Get Health Date From Doctor Organization");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 690, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Step3 :Analysis The Drug");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1200, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Send The New Research Result To DrugManufactory");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1650, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SendRequestToDoctorJPanel", new SendRequestToDoctorJPanel(userProcessContainer, userAccount, enterprise,business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
         populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
         Isselected = true;
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        Disease selectedDisease = (Disease) jTable1.getValueAt(selectedRow, 0);
        Gene selectedGene=(Gene)jTable1.getValueAt(selectedRow,1);
        Drug selectedDrug=(Drug)jTable1.getValueAt(selectedRow, 3);
        
      
        Analysis analysis=new Analysis();
        
        analysis.setDisease(selectedDisease);
        analysis.setDrug(selectedDrug);
        analysis.setGene(selectedGene);
        
        userAccount.getWorkQueue().getWorkRequestList().add(analysis);
        
        populateTable2();
        
        
       
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResearchActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable2.getSelectedRow();
          Disease d = (Disease) jTable2.getValueAt(selectedRow, 0);
          
          
          for (WorkRequest request :userAccount.getWorkQueue().getWorkRequestList()) {
              if (request instanceof Analysis) {
                  if (((Analysis) request).getDisease().equals(d)) {
                      
                       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ResearchJPanel", new ResearchJPanel(userProcessContainer, userAccount, organization,enterprise,request));
        layout.next(userProcessContainer);
                  }
                          
              }
          }
        
        
       
        
    }//GEN-LAST:event_btnResearchActionPerformed

    private void btnRefresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh2ActionPerformed
        // TODO add your handling code here:
        populateTable2();
    }//GEN-LAST:event_btnRefresh2ActionPerformed

    private void btnShowBieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowBieChartActionPerformed
        // TODO add your handling code here:
         JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1,2,10,10));
       
        List<WorkRequest> requestList= userAccount.getWorkQueue().getWorkRequestList();
        Map<String,Map<String, Integer>> geneMap;
        geneMap = new HashMap<>();
        for (WorkRequest request : requestList){
            if (request instanceof Analysis) {
                Object[] row = new Object[6];
                row[0] = ((Analysis) request).getDisease();
                row[1]= ((Analysis)request).getGene();
                row[2]=((Analysis) request).getDrug();
                Compound[] ca=((Analysis)request).getCompoundArray();
                row[3] = ca[0];
                row[4] = ca[1]; 
                row[5]= ca[2];
                String geneName = ((Analysis) request).getGene().getName();             
                if(geneMap.containsKey(geneName)){
                    Integer co1count = 1;
                    if(geneMap.get(geneName).containsKey(ca[0].getName())){
                         co1count = geneMap.get(geneName).get(ca[0].getName()) + 1; 
                    }else{
                         co1count = 1;
                    }
                    
                    Integer co2count = 1;
                    if(geneMap.get(geneName).containsKey(ca[1].getName())){
                         co2count = geneMap.get(geneName).get(ca[1].getName()) + 1; 
                    }else{
                         co2count = 1;
                    }
                    
                    Integer co3count = 1;
                    if(geneMap.get(geneName).containsKey(ca[2].getName())){
                         co3count = geneMap.get(geneName).get(ca[2].getName()) + 1; 
                    }else{
                         co3count = 1;
                    }
                    geneMap.get(geneName).put(ca[0].getName(), co1count);
                    geneMap.get(geneName).put(ca[1].getName(), co2count);
                    geneMap.get(geneName).put(ca[2].getName(), co3count);
                }else{
                    Map<String, Integer> columeMap = new HashMap<String, Integer>();
                    columeMap.put(ca[0].getName(), 1);
                    columeMap.put(ca[1].getName(), 1);
                    columeMap.put(ca[2].getName(), 1);
                    geneMap.put(geneName,columeMap);    
                }
            }
        }

        int i =0;
        for (Map.Entry<String, Map<String, Integer>> entry : geneMap.entrySet()) {  
            if(i<4){
                String gene = entry.getKey();
                frame.add(new Interface.ScientistRole.PieChart(gene,entry.getValue()).getPieChartPanel());
            }
        }
        frame.setSize(1200, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
        
       
       
        
    }//GEN-LAST:event_btnShowBieChartActionPerformed

    private void btnShowBarChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowBarChartActionPerformed
        // TODO add your handling code here:
         JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.add(new Interface.ScientistRole.BarChart(userAccount.getWorkQueue().getWorkRequestList()).getChartPanel());
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      
    }//GEN-LAST:event_btnShowBarChartActionPerformed

    private void btnProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProActionPerformed
        // TODO add your handling code here:
         int selectedRow = jTable3.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        RequestForResearch request = (RequestForResearch)jTable3.getValueAt(selectedRow, 0);
     
        request.setStatus("Processing");
        
        ProcessRequestFromClinicalManagerJPanel  processRequestFromClinicalManagerJPanel = new ProcessRequestFromClinicalManagerJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel",  processRequestFromClinicalManagerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnProActionPerformed

    private void btnAssignMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable3.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        WorkRequest request = (WorkRequest)jTable3.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable3();
    }//GEN-LAST:event_btnAssignMeActionPerformed

    private void btnReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReActionPerformed
        // TODO add your handling code here:
         populateTable3();
    }//GEN-LAST:event_btnReActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        SendResearchResultJPanel sendResearchResultJPanel = new  SendResearchResultJPanel(userProcessContainer, userAccount, enterprise, business);
        userProcessContainer.add("localMaintainenceWorkRequestJPanel", sendResearchResultJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignMe;
    private javax.swing.JButton btnPro;
    private javax.swing.JButton btnRe;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh2;
    private javax.swing.JButton btnResearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnShowBarChart;
    private javax.swing.JButton btnShowBieChart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}



