/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.EmployeeManagement_BUS;
import DTO.Employee_DTO;
import javax.swing.JOptionPane;


public class UpdateEmp2 extends javax.swing.JFrame {

    EmployeeManagement_BUS busEmployeeManagement = new EmployeeManagement_BUS();
    Employee_DTO dtoEmployee;
    public UpdateEmp2(Employee_DTO employee) {
            initComponents();
            dtoEmployee = busEmployeeManagement.getInformation(employee.getId());
            setResizable(false);
            setLocationRelativeTo(null);
            txtEmpID.setText(String.valueOf(dtoEmployee.getId()));
            txtEmpLoginID.setText(String.valueOf(dtoEmployee.getEmp_id()));
            txtFirstName.setText(dtoEmployee.getFirstname());
            txtLastName.setText(dtoEmployee.getLastname());
            cbGender.setSelectedItem(dtoEmployee.getGender());
            dcBirthday.setDate(dtoEmployee.getBirthday());
            txtPhone.setText(dtoEmployee.getPhone());
            txtAddress.setText(dtoEmployee.getAddress());
            dcStartDate.setDate(dtoEmployee.getStart_date());
            txtSalary.setText(String.valueOf(dtoEmployee.getSalary()));
            cbRole.setSelectedItem(dtoEmployee.getRole());
            txtEmpID.disable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTurnBack = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtEmpLoginID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        cbRole = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        dcStartDate = new com.toedter.calendar.JDateChooser();
        dcBirthday = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 153, 102));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/emp.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("UPDATE EMPLOYEE INFORMATION");

        btnTurnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnTurnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTurnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnTurnBack.setText("Turn back");
        btnTurnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(btnTurnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmpLoginID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpLoginID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmpLoginID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtEmpLoginID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Emp_login ID:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 127, 30));

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

        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Gender:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 127, 30));

        cbGender.setBackground(new java.awt.Color(255, 255, 255));
        cbGender.setForeground(new java.awt.Color(0, 0, 0));
        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose gender", "Male", "Female" }));
        cbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenderActionPerformed(evt);
            }
        });
        jPanel7.add(cbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 200, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Birthday:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 127, 30));

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Start date:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 90, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Salary:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 90, 30));

        txtSalary.setBackground(new java.awt.Color(255, 255, 255));
        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalary.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 200, 30));

        cbRole.setBackground(new java.awt.Color(255, 255, 255));
        cbRole.setForeground(new java.awt.Color(0, 0, 0));
        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose role", "Manager", "Cashier", "Salesperson", "Storekeeper", "Customer Service Assistant", "Security Guard", "Sanitation Worker", "Quality Checker" }));
        cbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRoleActionPerformed(evt);
            }
        });
        jPanel7.add(cbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 200, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Role:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 90, 30));

        btnUpdate.setBackground(new java.awt.Color(255, 153, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel7.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Employee ID:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 127, 30));

        txtEmpID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEmpID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 200, 30));

        dcStartDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(dcStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 200, 30));

        dcBirthday.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(dcBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 200, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenderActionPerformed

    private void cbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRoleActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(cbRole.getSelectedItem().toString().equals("Security Guard") || cbRole.getSelectedItem().toString().equals("Sanitation Worker") || cbRole.getSelectedItem().toString().equals("Quality Checker")){
            if(txtFirstName.getText().equals("") || txtLastName.getText().equals("") || cbGender.getSelectedIndex() < 1 || dcBirthday.getDate().toString().equals("")  || txtPhone.getText().equals("") || txtAddress.getText().equals("") || dcStartDate.getDate().toString().equals("") || txtSalary.getText().equals("") || cbRole.getSelectedIndex() < 1 )
            {
                JOptionPane.showMessageDialog(this, "Information fields are not entered enough.", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Employee_DTO newEmployee = new Employee_DTO(0, txtFirstName.getText(), txtLastName.getText(), cbGender.getSelectedItem().toString(), dcBirthday.getDate() , txtPhone.getText(), txtAddress.getText(), dcStartDate.getDate(), Long.parseLong(txtSalary.getText()), cbRole.getSelectedItem().toString());
                setVisible(false);
                new UpdateEmp3(newEmployee).setVisible(true);              
            }
        }
        else{
            if(txtEmpLoginID.getText().equals("") || txtFirstName.getText().equals("") || txtLastName.getText().equals("") || cbGender.getSelectedIndex() < 1 || dcBirthday.getDate().toString().equals("")  || txtPhone.getText().equals("") || txtAddress.getText().equals("") || dcStartDate.getDate().toString().equals("") || txtSalary.getText().equals("") || cbRole.getSelectedIndex() < 1 )
            {
                JOptionPane.showMessageDialog(this, "Information fields are not entered enough.", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Employee_DTO newEmployee = new Employee_DTO(0, txtFirstName.getText(), txtLastName.getText(), cbGender.getSelectedItem().toString(), dcBirthday.getDate() , txtPhone.getText(), txtAddress.getText(), dcStartDate.getDate(), Long.parseLong(txtSalary.getText()), Integer.parseInt(txtEmpLoginID.getText()), cbRole.getSelectedItem().toString());
                setVisible(false);
                new UpdateEmp3(dtoEmployee).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnTurnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        UpdateEmpForm updateForm = new UpdateEmpForm(dtoEmployee);
        updateForm.setVisible(true);
    }//GEN-LAST:event_btnTurnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTurnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JComboBox<String> cbRole;
    private com.toedter.calendar.JDateChooser dcBirthday;
    private com.toedter.calendar.JDateChooser dcStartDate;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpLoginID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
