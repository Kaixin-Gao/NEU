/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Resume_maker.Resume;
import javax.swing.JOptionPane;

/**
 *
 * @author Max
 */
public class InputPanel extends javax.swing.JPanel {

    
    private Resume resume;
    public InputPanel(Resume resume) {
        initComponents();
        this.resume=resume;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        firstnameTextfield = new javax.swing.JTextField();
        lastnameTextfield = new javax.swing.JTextField();
        midnameTextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        line1Textfield = new javax.swing.JTextField();
        line2Textfield = new javax.swing.JTextField();
        cityTextfield = new javax.swing.JTextField();
        countryTextfield = new javax.swing.JTextField();
        stateTextfield = new javax.swing.JTextField();
        affiliationTextfield = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        careerTextarea = new javax.swing.JTextArea();
        emailTextfield = new javax.swing.JTextField();
        phoneTextfield = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        personalTextarea = new javax.swing.JTextArea();
        areaTextfield = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        zipTextfield = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        degree2Textfield = new javax.swing.JTextField();
        university1Textfield = new javax.swing.JTextField();
        time1Textfield = new javax.swing.JTextField();
        degree1Textfield = new javax.swing.JTextField();
        university2Textfield = new javax.swing.JTextField();
        time2Textfield = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        when1Textfield = new javax.swing.JTextField();
        company1Textfield = new javax.swing.JTextField();
        jobdescription1Textfield = new javax.swing.JTextField();
        when2Textfield = new javax.swing.JTextField();
        when3Textfield = new javax.swing.JTextField();
        company2Textfield = new javax.swing.JTextField();
        company3Textfield = new javax.swing.JTextField();
        jobdescription2Textfield = new javax.swing.JTextField();
        jobdescription3Textfield = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
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

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel8.setText("Affiliation:");

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel9.setText("Career Object:");

        line1Textfield.setText("Insert address here!");
        line1Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                line1TextfieldActionPerformed(evt);
            }
        });

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

        jLabel15.setText("(3)");

        jLabel16.setText("(2)");

        jLabel17.setText("(1)");

        jLabel18.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel18.setText("Phone:");

        jLabel19.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel19.setText("Email:");

        jLabel20.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel20.setText("Volunteer Experience:");

        jLabel21.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel21.setText("Working Experience:");

        jLabel22.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel22.setText("Personal Summary:");

        jLabel23.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel23.setText("Area OF Expertise:");

        careerTextarea.setColumns(20);
        careerTextarea.setRows(5);
        jScrollPane1.setViewportView(careerTextarea);

        phoneTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextfieldActionPerformed(evt);
            }
        });

        personalTextarea.setColumns(20);
        personalTextarea.setRows(5);
        jScrollPane2.setViewportView(personalTextarea);

        jLabel24.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel24.setText("Education:");

        zipTextfield.setText("Zip");
        zipTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipTextfieldActionPerformed(evt);
            }
        });

        jLabel30.setText("(1)");

        jLabel31.setText("(2)");

        university1Textfield.setText("University");

        time1Textfield.setText("During...");

        degree1Textfield.setText("Degree");
        degree1Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree1TextfieldActionPerformed(evt);
            }
        });

        time2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time2TextfieldActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        when1Textfield.setText("When");

        company1Textfield.setText("Company");

        jobdescription1Textfield.setText("Job description");

        company2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company2TextfieldActionPerformed(evt);
            }
        });

        jobdescription2Textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobdescription2TextfieldActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addComponent(line2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(zipTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cityTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(95, 95, 95)
                                            .addComponent(countryTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel23)
                                            .addGap(29, 29, 29)
                                            .addComponent(areaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(432, 432, 432)
                                            .addComponent(stateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(88, 88, 88)
                                                    .addComponent(midnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lastnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(23, 23, 23)
                                                    .addComponent(jLabel5))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(256, 256, 256)
                                                    .addComponent(jLabel19)))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1))
                                .addComponent(affiliationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel24)
                            .addGap(123, 123, 123)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(degree2Textfield))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(degree1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(university2Textfield)
                                .addComponent(university1Textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(time2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(time1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel22))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel21)
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(when3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(company3Textfield))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(when2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(company2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(when1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(company1Textfield)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jobdescription3Textfield)
                                .addComponent(jobdescription2Textfield)
                                .addComponent(jobdescription1Textfield, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel6))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(line1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(createBtn)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(midnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(lastnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(emailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(line1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(line2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countryTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(affiliationTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(areaTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel24)
                    .addComponent(university1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degree1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(degree2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(university2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel17)
                    .addComponent(when1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobdescription1Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(when2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobdescription2Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(when3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(company3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobdescription3Textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addComponent(createBtn)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        resume.setName(firstnameTextfield.getText()+" "+midnameTextfield.getText()+" "+lastnameTextfield.getText());
        
       
        JOptionPane.showMessageDialog(null,"Create Resume Successfully!\nPress view to check out.");

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

    private void degree1TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree1TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degree1TextfieldActionPerformed

    private void time2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time2TextfieldActionPerformed

    private void jobdescription2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobdescription2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobdescription2TextfieldActionPerformed

    private void company2TextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company2TextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_company2TextfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
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
    private javax.swing.JTextField when1Textfield;
    private javax.swing.JTextField when2Textfield;
    private javax.swing.JTextField when3Textfield;
    private javax.swing.JTextField zipTextfield;
    // End of variables declaration//GEN-END:variables
}
