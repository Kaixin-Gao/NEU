/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdminWorkArea;

/**
 *
 * @author zhang
 */
public class IntroductionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalysisJPanel
     */
    public IntroductionJPanel() {
        initComponents();
    }

      public static  void openExe(String file) {    
          
        try   
        {   
            Runtime.getRuntime().exec("\"D:\\PotPlayer\\PotPlayerMini.exe\""+file);    
              
        } catch (Exception e)  
        {    
            System.out.println("Error!");    
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
        btnWatch = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 80)); // NOI18N
        jLabel1.setText("Welcome To The  Biogen");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        btnWatch.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnWatch.setText("Watch Our Introduction Video");
        btnWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWatchActionPerformed(evt);
            }
        });
        add(btnWatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 730, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWatchActionPerformed
        // TODO add your handling code here:
        
        IntroductionJPanel.openExe("E:\\final.mp4");
      /* Runtime.getRuntime().exec("\"f:\\Program Files (x86)\\Thunder Network\\Xmp\\Program\\XMP.exe\" e:\\mp4\\high歌.mp4");*/
    }//GEN-LAST:event_btnWatchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnWatch;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
