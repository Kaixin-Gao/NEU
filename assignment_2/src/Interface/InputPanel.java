/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Resume_maker.Resume;
import Resume_maker.ResumeList;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Max
 */
public class InputPanel extends javax.swing.JPanel {

    public InputPanel() {
        initComponents();
        
    }
    private ResumeList rl;
    public InputPanel(ResumeList rl) {
        initComponents();
        this.rl=rl;
        displayResumeList(rl);
    }
    
    
   
     private void displayResumeList(ResumeList rl)
    {
            ImageIcon imgThisImg = new ImageIcon("src/2015.png");
            imageLabel.setIcon(imgThisImg);
    }
     
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        UploadimageButton = new javax.swing.JButton();
        line1Textfield = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        line2Textfield = new javax.swing.JTextField();
        cityTextfield = new javax.swing.JTextField();
        countryTextfield = new javax.swing.JTextField();
        stateTextfield = new javax.swing.JTextField();
        firstnameTextfield = new javax.swing.JTextField();
        lastnameTextfield = new javax.swing.JTextField();
        midnameTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        emailTextfield = new javax.swing.JTextField();
        phoneTextfield = new javax.swing.JTextField();
        zipTextfield = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        volTextarea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        affiliationTextfield = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        areaTextfield = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        degree2Textfield = new javax.swing.JTextField();
        university1Textfield = new javax.swing.JTextField();
        time1Textfield = new javax.swing.JTextField();
        degree1Textfield = new javax.swing.JTextField();
        university2Textfield = new javax.swing.JTextField();
        time2Textfield = new javax.swing.JTextField();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        when1Textfield = new javax.swing.JTextField();
        company1Textfield = new javax.swing.JTextField();
        jobdescription1Textfield = new javax.swing.JTextField();
        when2Textfield = new javax.swing.JTextField();
        when3Textfield = new javax.swing.JTextField();
        company2Textfield = new javax.swing.JTextField();
        company3Textfield = new javax.swing.JTextField();
        jobdescription2Textfield = new javax.swing.JTextField();
        jobdescription3Textfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        careerTextarea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        personalTextarea = new javax.swing.JTextArea();
        createBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane3.setPreferredSize(new java.awt.Dimension(800, 208));

        UploadimageButton.setText("Upload Picture");
        UploadimageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadimageButtonActionPerformed(evt);
            }
        });

        line1Textfield.setText("Address Line 1");
        line1Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line1TextfieldActionPerformed(evt);
            }
        });

        imageLabel.setText("Picture");

        line2Textfield.setText("Address Line 2");

        cityTextfield.setText("City");
        cityTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextfieldActionPerformed(evt);
            }
        });

        countryTextfield.setText("Country");

        stateTextfield.setText("State");
        stateTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextfieldActionPerformed(evt);
            }
        });

        firstnameTextfield.setText("First");
        firstnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextfieldActionPerformed(evt);
            }
        });

        lastnameTextfield.setText("Last");
        lastnameTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameTextfieldActionPerformed(evt);
            }
        });

        midnameTextfield.setText("Mid");

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("Picture:");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setText("Address:");

        jLabel18.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel18.setText("Phone:");

        jLabel19.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel19.setText("Email:");

        emailTextfield.setText("gao.k@husky.neu.edu");

        phoneTextfield.setText("123-456-7890");
        phoneTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextfieldActionPerformed(evt);
            }
        });

        zipTextfield.setText("Zip");
        zipTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipTextfieldActionPerformed(evt);
            }
        });

        jLayeredPane3.setLayer(UploadimageButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(line1Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(imageLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(line2Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(cityTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(countryTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(stateTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(firstnameTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(lastnameTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(midnameTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(emailTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(phoneTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(zipTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(line2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel6))
                                .addGap(26, 26, 26)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(line1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                            .addComponent(firstnameTextfield)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(midnameTextfield))
                                        .addComponent(emailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addComponent(lastnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(zipTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(countryTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(UploadimageButton))
                        .addGap(33, 33, 33)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(midnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lastnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(emailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane3Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(UploadimageButton)
                            .addGap(37, 37, 37)
                            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phoneTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(line1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(line2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane4.setPreferredSize(new java.awt.Dimension(800, 201));

        volTextarea.setColumns(20);
        volTextarea.setRows(5);
        volTextarea.setText("123\n456\n789");
        jScrollPane3.setViewportView(volTextarea);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel8.setText("Affiliation:");

        affiliationTextfield.setText("None");

        jLabel20.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel20.setText("Volunteer Experience:");

        jLabel23.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel23.setText("Area OF Expertise:");

        areaTextfield.setText("Computer Science");

        jLabel24.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel24.setText("Education:");

        jLabel30.setText("(1)");

        jLabel31.setText("(2)");

        degree2Textfield.setText("Degree 2");

        university1Textfield.setText("University 1");

        time1Textfield.setText("During...");

        degree1Textfield.setText("Degree 1");
        degree1Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree1TextfieldActionPerformed(evt);
            }
        });

        university2Textfield.setText("University 2");

        time2Textfield.setText("During...");
        time2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time2TextfieldActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(affiliationTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(areaTextfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(degree2Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(university1Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(time1Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(degree1Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(university2Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(time2Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24)
                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel23)
                                .addGap(29, 29, 29)
                                .addComponent(areaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(affiliationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane4Layout.createSequentialGroup()
                                                .addComponent(jLabel31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(degree2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addGap(18, 18, 18)
                                                .addComponent(degree1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10)
                                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(university1Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                            .addComponent(university2Textfield))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(time1Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                            .addComponent(time2Textfield))))))))
                .addContainerGap())
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(affiliationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(areaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel24)
                    .addComponent(university1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degree1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(degree2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(university2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane5.setPreferredSize(new java.awt.Dimension(800, 278));

        when1Textfield.setText("When");

        company1Textfield.setText("Company");

        jobdescription1Textfield.setText("Job description");

        when2Textfield.setText("When");

        when3Textfield.setText("When");

        company2Textfield.setText("Company");
        company2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company2TextfieldActionPerformed(evt);
            }
        });

        company3Textfield.setText("Company");

        jobdescription2Textfield.setText("Job description");
        jobdescription2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobdescription2TextfieldActionPerformed(evt);
            }
        });

        jobdescription3Textfield.setText("Job description");

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel9.setText("Career Object:");

        jLabel15.setText("(3)");

        jLabel16.setText("(2)");

        jLabel17.setText("(1)");

        jLabel21.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel21.setText("Working Experience:");

        jLabel22.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel22.setText("Personal Summary:");

        careerTextarea.setColumns(20);
        careerTextarea.setRows(5);
        careerTextarea.setText("123\n456\n789");
        jScrollPane1.setViewportView(careerTextarea);

        personalTextarea.setColumns(20);
        personalTextarea.setRows(5);
        personalTextarea.setText("123\n456");
        jScrollPane2.setViewportView(personalTextarea);

        jLayeredPane5.setLayer(when1Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(company1Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jobdescription1Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(when2Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(when3Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(company2Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(company3Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jobdescription2Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jobdescription3Textfield, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel22))
                        .addGap(38, 38, 38)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(jLayeredPane5Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(30, 30, 30)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(when3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(company3Textfield))
                            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(when2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(company2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(when1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(company1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jobdescription3Textfield)
                            .addComponent(jobdescription2Textfield)
                            .addComponent(jobdescription1Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(when1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(company1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jobdescription1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(when2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobdescription2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(when3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobdescription3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(510, 510, 510))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        
        String name = firstnameTextfield.getText()+"  "+midnameTextfield.getText()+"  "+lastnameTextfield.getText();
        String address1 = line1Textfield.getText()+" , "+line2Textfield.getText();
        String address2 = zipTextfield.getText()+" , "+cityTextfield.getText()+" , "+countryTextfield.getText()+" , "+stateTextfield.getText();
        String email = emailTextfield.getText();
        String affiliation = affiliationTextfield.getText();
        String phone = phoneTextfield.getText();
        String area = areaTextfield.getText();
        String degree1 = degree1Textfield.getText()+" , "+university1Textfield.getText()+" , "+time1Textfield.getText() ;
        String degree2 = degree2Textfield.getText()+" , "+university2Textfield.getText()+" , "+time2Textfield.getText() ;
        String volunteerexp = volTextarea.getText() ;
        String careerobjective = careerTextarea.getText() ;
        String personsummary = personalTextarea.getText() ;
        String workexp1 = when1Textfield.getText()+" , "+company1Textfield.getText()+" , "+jobdescription1Textfield.getText() ;
        String workexp2 = when2Textfield.getText()+" , "+company2Textfield.getText()+" , "+jobdescription2Textfield.getText() ;
        String workexp3 = when3Textfield.getText()+" , "+company3Textfield.getText()+" , "+jobdescription3Textfield.getText() ;
        
        //Icon image = imageLabel.getIcon();
        String image = imageLabel.getText();
      
      if((!"    ".equals(name) && name.length() != 4) && (name.replaceAll("[\u4e00-\u9fa5]*[a-z]*[A-Z]*\\d*-*_*\\s*", "").length()==0)){
          if((!"".equals(email) && email.length() != 0) && (email.replaceAll("[\u4e00-\u9fa5]*[@]*[.]*[a-z]*[A-Z]*\\d*-*_*\\s*", "").length()==0)){
              if((!"".equals(phone) && phone.length() != 0) && (phone.replaceAll("[\u4e00-\u9fa5]*[a-z]*[A-Z]*\\d*-*_*\\s*", "").length()==0)){
                  
                                    Resume v = rl.addRe();
                                    v.setName(name);
                                    v.setEmail(email);
                                    v.setArea(area);
                                    v.setPhone(phone);
                                    v.setAddress(address1);
                                    v.setAddress2(address2);
                                    v.setAffiliation(affiliation);
                                    v.setDegree1(degree1);
                                    v.setDegree2(degree2);
                                    v.setVolunteerexp(volunteerexp);
                                    v.setCareerobjective(careerobjective);
                                    v.setPersonsummary(personsummary);
                                    v.setWorkexp1(workexp1);
                                    v.setWorkexp2(workexp2);
                                    v.setWorkexp3(workexp3);
                                    v.setImage(image);
                                    
                                    
                                    JOptionPane.showMessageDialog(null,"Resume Added !");
                                    
                                    
                             }else{JOptionPane.showMessageDialog(null,"FAILED! Please check your PHONE.");}       
          }else{JOptionPane.showMessageDialog(null,"FAILED! Please check your EMAIL.");}
      }else{JOptionPane.showMessageDialog(null,"FAILED! Please check your NAME.");}
        affiliationTextfield.setText("");
        areaTextfield.setText("");
        careerTextarea.setText("");
        cityTextfield.setText("");
        company1Textfield.setText("");
        company2Textfield.setText("");
        company3Textfield.setText("");
        countryTextfield.setText("");
        degree1Textfield.setText("");
        degree2Textfield.setText("");
        emailTextfield.setText("");
        firstnameTextfield.setText("");
        midnameTextfield.setText("");
        lastnameTextfield.setText("");
        jobdescription1Textfield.setText("");
        jobdescription2Textfield.setText("");
        jobdescription3Textfield.setText("");
        line1Textfield.setText("");
        line2Textfield.setText("");
        personalTextarea.setText("");
        phoneTextfield.setText("");
        stateTextfield.setText("");
        time1Textfield.setText("");
        time2Textfield.setText("");
        university1Textfield.setText("");
        university2Textfield.setText("");
        volTextarea.setText("");
        when1Textfield.setText("");
        when2Textfield.setText("");
        when3Textfield.setText("");
        zipTextfield.setText("");
        
        ImageIcon imgThisImg = new ImageIcon("src/2015.png");
            imageLabel.setIcon(imgThisImg);
            imageLabel.setText("src/2015.png");
       

    }//GEN-LAST:event_createBtnActionPerformed

    private void stateTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextfieldActionPerformed

    private void lastnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameTextfieldActionPerformed

    private void phoneTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextfieldActionPerformed

    private void cityTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextfieldActionPerformed

    private void zipTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipTextfieldActionPerformed

    private void line1TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_line1TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_line1TextfieldActionPerformed

    private void firstnameTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextfieldActionPerformed

    private void jobdescription2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobdescription2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobdescription2TextfieldActionPerformed

    private void company2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_company2TextfieldActionPerformed

    private void UploadimageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadimageButtonActionPerformed
        
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG Image", "jpg");
        fileChooser.addChoosableFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath()); 
            //String image = selectedFile.getAbsolutePath();
            imageLabel.setText(selectedFile.getAbsolutePath());
            Image temp = imageIcon.getImage();
            Image newimg = temp.getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH);
            ImageIcon imgThisImg = new ImageIcon(newimg);
            imageLabel.setIcon(imgThisImg);
        }
        else{
            ImageIcon imgThisImg = new ImageIcon("src/2015.png");
            imageLabel.setIcon(imgThisImg);
            imageLabel.setText("src/2015.png");
        }
        

    }//GEN-LAST:event_UploadimageButtonActionPerformed

    private void time2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time2TextfieldActionPerformed

    private void degree1TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree1TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degree1TextfieldActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UploadimageButton;
    private javax.swing.JTextField affiliationTextfield;
    private javax.swing.JTextField areaTextfield;
    private javax.swing.JTextArea careerTextarea;
    private javax.swing.JTextField cityTextfield;
    private javax.swing.JTextField company1Textfield;
    private javax.swing.JTextField company2Textfield;
    private javax.swing.JTextField company3Textfield;
    private javax.swing.JTextField countryTextfield;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField degree1Textfield;
    private javax.swing.JTextField degree2Textfield;
    private javax.swing.JTextField emailTextfield;
    private javax.swing.JTextField firstnameTextfield;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jobdescription1Textfield;
    private javax.swing.JTextField jobdescription2Textfield;
    private javax.swing.JTextField jobdescription3Textfield;
    private javax.swing.JTextField lastnameTextfield;
    private javax.swing.JTextField line1Textfield;
    private javax.swing.JTextField line2Textfield;
    private javax.swing.JTextField midnameTextfield;
    private javax.swing.JTextArea personalTextarea;
    private javax.swing.JTextField phoneTextfield;
    private javax.swing.JTextField stateTextfield;
    private javax.swing.JTextField time1Textfield;
    private javax.swing.JTextField time2Textfield;
    private javax.swing.JTextField university1Textfield;
    private javax.swing.JTextField university2Textfield;
    private javax.swing.JTextArea volTextarea;
    private javax.swing.JTextField when1Textfield;
    private javax.swing.JTextField when2Textfield;
    private javax.swing.JTextField when3Textfield;
    private javax.swing.JTextField zipTextfield;
    // End of variables declaration//GEN-END:variables
}
