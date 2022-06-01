/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.EmployeeManagement_BUS;
import DTO.Employee_DTO;
import java.text.SimpleDateFormat;
import javax.swing.*;


public class UpdateEmp3 extends javax.swing.JFrame {

    EmployeeManagement_BUS busEmployeeManagement = new EmployeeManagement_BUS();
    Employee_DTO dtoEmployee = null;
    public UpdateEmp3(Employee_DTO employee) {
        initComponents();
        dtoEmployee = employee;
        setResizable(false);
        setLocationRelativeTo(null);
        txtEmpID.setText(String.valueOf(dtoEmployee.getId()));
        txtEmpLoginID.setText(String.valueOf(dtoEmployee.getEmp_id()));
        txtFirstName.setText(dtoEmployee.getFirstname());
        txtLastName.setText(dtoEmployee.getLastname());
        txtGender.setText(dtoEmployee.getGender());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        txtBirthday.setText(sdf.format(dtoEmployee.getBirthday()));
        txtPhone.setText(dtoEmployee.getPhone());
        txtAddress.setText(dtoEmployee.getAddress());
        txtStartDate.setText(sdf.format(dtoEmployee.getStart_date()));
        txtSalary.setText(String.valueOf(dtoEmployee.getSalary()));
        txtRole.setText(dtoEmployee.getRole());
        txtEmpID.disable();
        txtEmpLoginID.disable();
        txtFirstName.disable();
        txtLastName.disable();
        txtGender.disable();
        txtBirthday.disable();
        txtPhone.disable();
        txtAddress.disable();
        txtStartDate.disable();
        txtSalary.disable();
        txtRole.disable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEmpLoginID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnDismiss = new javax.swing.JButton();
        txtStartDate = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/emp.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("UPDATE EMPLOYEE INFORMATION");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel7.setBackground(new java.awt.Color(239, 250, 252));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Emp_login ID:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 127, 30));

        txtEmpLoginID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpLoginID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmpLoginID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtEmpLoginID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("First Name:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 127, 30));

        txtFirstName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Last Name:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 127, 30));

        txtRole.setBackground(new java.awt.Color(255, 255, 255));
        txtRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRole.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Gender:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 127, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Birthday:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 127, 30));

        txtBirthday.setBackground(new java.awt.Color(255, 255, 255));
        txtBirthday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBirthday.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 200, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Phone:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 127, 30));

        txtPhone.setBackground(new java.awt.Color(255, 255, 255));
        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPhone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 200, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Address:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 127, 30));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAddress.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 200, 30));

        btnDismiss.setBackground(new java.awt.Color(0, 204, 255));
        btnDismiss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDismiss.setForeground(new java.awt.Color(255, 255, 255));
        btnDismiss.setText("Dismiss");
        btnDismiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDismissActionPerformed(evt);
            }
        });
        jPanel7.add(btnDismiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 130, 40));

        txtStartDate.setBackground(new java.awt.Color(255, 255, 255));
        txtStartDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStartDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 200, 30));

        txtSalary.setBackground(new java.awt.Color(255, 255, 255));
        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalary.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Start date:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 90, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Salary:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 90, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Role:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 90, 30));

        btnConfirm.setBackground(new java.awt.Color(0, 204, 255));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel7.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 130, 40));

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));

        txtGender.setBackground(new java.awt.Color(255, 255, 255));
        txtGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Employee ID:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 127, 30));

        txtEmpID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmpID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 200, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDismissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDismissActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        UpdateEmp2 updateEmp;
        updateEmp = new UpdateEmp2(dtoEmployee);
        updateEmp.setVisible(true);
    }//GEN-LAST:event_btnDismissActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        if(busEmployeeManagement.update(dtoEmployee)){
            JOptionPane.showMessageDialog(this, "Employee information is updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid data!", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        setVisible(false);
        UpdateEmpForm upd = new UpdateEmpForm(dtoEmployee);
        upd.setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpLoginID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
