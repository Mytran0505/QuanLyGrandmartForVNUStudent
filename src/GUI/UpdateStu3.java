
package GUI;

import BUS.StudentManagement_BUS;
import DTO.Student_DTO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class UpdateStu3 extends javax.swing.JFrame {
    Student_DTO dtoStudent = null;
    StudentManagement_BUS busStudentManagement = new StudentManagement_BUS();

    public UpdateStu3(Student_DTO newStudent){
        initComponents();
        dtoStudent = newStudent;
        setResizable(false);
        setLocationRelativeTo(null);
        txtStuID.setText(String.valueOf(dtoStudent.getStudentID()));
        txtFirstName.setText(newStudent.getFirstname());
        txtLastName.setText(newStudent.getLastname());
        txtGender.setText(newStudent.getGender());
        txtAddress.setText(newStudent.getAddress());
        txtPhone.setText(newStudent.getPhone());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        txtBirthday.setText(sdf.format(newStudent.getBirthday()));
        txtRegDate.setText(sdf.format(newStudent.getRegistrationDate()));
        txtSpentMoney.setText(String.valueOf(newStudent.getSpentMoney()));
        txtPoint.setText(String.valueOf(newStudent.getPoint()));
        txtSchoolName.setText(newStudent.getSchoolName());
        txtStuID.disable();
        txtFirstName.disable();
        txtLastName.disable();
        txtGender.disable();
        txtAddress.disable();
        txtPhone.disable();
        txtBirthday.disable();
        txtRegDate.disable();
        txtSpentMoney.disable();
        txtPoint.disable();
        txtSchoolName.disable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtSchoolName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPoint = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtStuID = new javax.swing.JTextField();
        txtRegDate = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnDismiss = new javax.swing.JButton();
        txtSpentMoney = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(239, 250, 252));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("First name:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 127, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Last name:");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 127, 30));

        txtGender.setBackground(new java.awt.Color(255, 255, 255));
        txtGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Gender:");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 127, 30));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Address:");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 127, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Phone:");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 127, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Birthday:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 127, 30));

        txtBirthday.setBackground(new java.awt.Color(255, 255, 255));
        txtBirthday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBirthday.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBirthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthdayActionPerformed(evt);
            }
        });
        jPanel8.add(txtBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("School name:");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 127, 30));

        txtSchoolName.setBackground(new java.awt.Color(255, 255, 255));
        txtSchoolName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSchoolName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtSchoolName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Registration date:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 150, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Spent money:");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 120, 30));

        txtPoint.setBackground(new java.awt.Color(255, 255, 255));
        txtPoint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPoint.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Point:");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 60, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Student ID");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 127, 30));

        txtStuID.setBackground(new java.awt.Color(255, 255, 255));
        txtStuID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStuID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtStuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 30));

        txtRegDate.setBackground(new java.awt.Color(255, 255, 255));
        txtRegDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRegDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtRegDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 200, 30));

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 30));

        btnDismiss.setBackground(new java.awt.Color(0, 204, 255));
        btnDismiss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDismiss.setForeground(new java.awt.Color(255, 255, 255));
        btnDismiss.setText("Dismiss");
        btnDismiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDismissActionPerformed(evt);
            }
        });
        jPanel8.add(btnDismiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 130, 40));

        txtSpentMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtSpentMoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSpentMoney.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtSpentMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 30));

        btnConfirm.setBackground(new java.awt.Color(0, 204, 255));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel8.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 130, 40));

        jPanel9.setBackground(new java.awt.Color(0, 204, 255));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/08 - student icon.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("UPDATE STUDENT INFORMATION");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBirthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthdayActionPerformed

    private void btnDismissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDismissActionPerformed
        setVisible(false);
        UpdateStu2 up2 = new UpdateStu2(dtoStudent);
        up2.setVisible(true);
    }//GEN-LAST:event_btnDismissActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if(busStudentManagement.update(dtoStudent)){
            JOptionPane.showMessageDialog(this, "Student information is updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid data!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        setVisible(false);
        UpdateStudent1 up = new UpdateStudent1(dtoStudent);
        up.setVisible(true);
    }//GEN-LAST:event_btnConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDismiss;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtRegDate;
    private javax.swing.JTextField txtSchoolName;
    private javax.swing.JTextField txtSpentMoney;
    private javax.swing.JTextField txtStuID;
    // End of variables declaration//GEN-END:variables
}
