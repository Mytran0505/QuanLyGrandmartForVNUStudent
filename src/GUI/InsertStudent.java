package GUI;

import BUS.StudentManagement_BUS;
import DTO.Employee_DTO;
import DTO.Student_DTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


import javax.swing.JOptionPane;


public class InsertStudent extends javax.swing.JFrame {

    StudentManagement_BUS busStudentManagement = new StudentManagement_BUS();
    Employee_DTO dtoCustomerService = null;
    Student_DTO dtoStudent = null;
    public InsertStudent(Student_DTO student) {
        initComponents();
        dtoStudent = student;
        setResizable(false);
        setLocationRelativeTo(null);
        txtSpentMoney.disable();
        txtPoint.disable();
    }
    
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtSchoolName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtPoint = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        cbGender = new javax.swing.JComboBox<>();
        dcBirthday = new com.toedter.calendar.JDateChooser();
        dcRegistrationDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtSpentMoney = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert Student Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/08 - student icon.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("INSERT STUDENT INFORMATION");

        btn_turnback.setBackground(new java.awt.Color(239, 250, 252));
        btn_turnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_turnback.setForeground(new java.awt.Color(0, 0, 0));
        btn_turnback.setText("Turn back");
        btn_turnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel7.setBackground(new java.awt.Color(239, 250, 252));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("School name:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 127, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("First Name:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 127, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Gender:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 127, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Birthday:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 127, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Last Name:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 127, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Address:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 127, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Phone:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 127, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Spent money:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 140, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Point:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 140, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Registration date:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 140, 30));

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel7.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 30));

        txtSchoolName.setBackground(new java.awt.Color(255, 255, 255));
        txtSchoolName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSchoolName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtSchoolName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 200, 30));

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        jPanel7.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 200, 30));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 30));

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 200, 30));

        txtPoint.setBackground(new java.awt.Color(255, 255, 255));
        txtPoint.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPoint.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPoint.setText("0");
        jPanel7.add(txtPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 200, 30));

        btnInsert.setBackground(new java.awt.Color(0, 204, 255));
        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel7.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 130, 60));

        cbGender.setBackground(new java.awt.Color(255, 255, 255));
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose gender", "Male", "Female" }));
        cbGender.setToolTipText("");
        jPanel7.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, 30));

        dcBirthday.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(dcBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 200, 30));

        dcRegistrationDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(dcRegistrationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("(*)");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("(*)");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("(*)");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("(*)");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("(*)");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("(*)");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("(*)");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        txtSpentMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtSpentMoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSpentMoney.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSpentMoney.setText("0");
        jPanel7.add(txtSpentMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 200, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 51));
        jLabel30.setText("(*)");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 470));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
      int ret = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to turn back?", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            setVisible(false);
            ManageStudentInformation stu = new ManageStudentInformation(dtoCustomerService);
            stu.setVisible(true);
        }
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if(txtFirstName.getText().equals("") || txtLastName.getText().equals("") || cbGender.getSelectedIndex()<1 || txtAddress.getText().equals("") || txtPhone.getText().equals("") || dcBirthday.getCalendar() == null || txtSchoolName.getText().equals("") || dcRegistrationDate.getCalendar()==null || txtSpentMoney.getText().equals("") || txtPoint.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Information fields are not entered enough.", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else
            if(dcBirthday.getCalendar().after(dcRegistrationDate.getCalendar())){
                JOptionPane.showMessageDialog(this, "Registration Date must be before Birthday!", "Error!", JOptionPane.ERROR_MESSAGE);
                }
        else if(!txtPhone.getText().matches("[0-9]*") || !txtPoint.getText().matches("[0-9]*") || !txtSpentMoney.getText().matches("[0-9]*")){
                JOptionPane.showMessageDialog(this, " Invalid data!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else if(sdf.format(dcBirthday.getDate().getTime()).compareTo(sdf.format(dcRegistrationDate.getDate().getTime()))==1){
                JOptionPane.showMessageDialog(this, " Birthday must be less than start date", "Error!", JOptionPane.ERROR_MESSAGE);
            }   
        else
        {
            Student_DTO newStudent = new Student_DTO (0, txtFirstName.getText(), txtLastName.getText(), cbGender.getSelectedItem().toString(), txtAddress.getText(), txtPhone.getText(), dcBirthday.getDate(), dcRegistrationDate.getDate(), Integer.parseInt(txtSpentMoney.getText()), Integer.parseInt(txtPoint.getText()), txtSchoolName.getText());
            setVisible(false);
            new InsertStudent2(newStudent).setVisible(true);
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btn_turnback;
    private javax.swing.JComboBox<String> cbGender;
    private com.toedter.calendar.JDateChooser dcBirthday;
    private com.toedter.calendar.JDateChooser dcRegistrationDate;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtSchoolName;
    private javax.swing.JTextField txtSpentMoney;
    // End of variables declaration//GEN-END:variables
}
