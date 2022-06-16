package GUI;

import BUS.StudentManagement_BUS;
import DTO.Student_DTO;
import DTO.Employee_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class LookUpStudentInformation extends javax.swing.JFrame {
    Student_DTO dtoStudent = null;
    Employee_DTO dtoCashier =null;
    StudentManagement_BUS busStudentManagement = new StudentManagement_BUS();
    ArrayList<Student_DTO> list = new ArrayList<>();

    public LookUpStudentInformation(Student_DTO student) {
        initComponents();
        dtoStudent = student;
        setResizable(false);
        setLocationRelativeTo(null);
        createTable();
    }
    
    DefaultTableModel tblStudentModel;
    public void createTable(){
        tblStudentModel = new DefaultTableModel();
        //Tạo bảng
        String title[] = {"StudentID", "First Name", "Last Name", "Gender", "Address", "Phone", "Birthday", "Registration date", "Spent money", "Point", "School Name"};
        tblStudentModel.setColumnIdentifiers(title);
        tblStudentModel.setRowCount(0);
        //Get all student information
        list = busStudentManagement.getStudentList();
        //Load student information into the table
        for(int i = 0; i < list.size(); i++){
            Student_DTO dtoStudent2 = list.get(i);
            String[] rows = {String.valueOf(dtoStudent2.getStudentID()), dtoStudent2.getFirstname(), dtoStudent2.getLastname(), dtoStudent2.getGender(), dtoStudent2.getAddress(), dtoStudent2.getPhone(), dtoStudent2.getBirthday().toString(), dtoStudent2.getRegistrationDate().toString(),String.valueOf(dtoStudent2.getSpentMoney()) , String.valueOf(dtoStudent2.getPoint()), dtoStudent2.getSchoolName()}; 
            tblStudentModel.addRow(rows);
        }
        tblSearch.setModel(tblStudentModel);
        //cho phép sắp xếp từng cột
        tblSearch.setAutoCreateRowSorter(true);
        //không cho sửa dữ liệu trong bảng
        //tblSearch.setEnabled(false);
        tblSearch.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblSearch.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(1).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblSearch.getColumnModel().getColumn(5).setPreferredWidth(120);
        tblSearch.getColumnModel().getColumn(6).setPreferredWidth(100);
        tblSearch.getColumnModel().getColumn(7).setPreferredWidth(220);
        tblSearch.getColumnModel().getColumn(8).setPreferredWidth(110);
        tblSearch.getColumnModel().getColumn(10).setPreferredWidth(170);
        tblSearch.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if(tblSearch.getSelectedRow() >= 0){
                Student_DTO dtoStudent2 = new Student_DTO(Integer.valueOf(String.valueOf(tblSearch.getValueAt(tblSearch.getSelectedRow(), 0))));
                setVisible(false);
                new LookUpStudentInformation2(dtoStudent2).setVisible(true);
            }
        });
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Look Up Student Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/lookup.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("LOOK UP STUDENT INFORMATION");

        btn_turnback.setBackground(new java.awt.Color(239, 250, 252));
        btn_turnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_turnback.setText("Turn back to home");
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
                .addComponent(btn_turnback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel7.setBackground(new java.awt.Color(239, 250, 252));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Search bar:");

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(0, 204, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Look up");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Emp_login ID", "First Name", "Last Name", "Gender", "Birthday", "Phone", "Address", "Start date", "Salary", "Role"
            }
        ));
        jScrollPane1.setViewportView(tblSearch);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to turn back?", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            setVisible(false);
            CashierHome look = new CashierHome(dtoCashier);
            look.setVisible(true);
        }
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel searchTable = (DefaultTableModel) tblSearch.getModel();
        //khởi tạo row sorter với tất cả dữ liệu trên tblSearch
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(searchTable);
        tblSearch.setRowSorter(sorter);//chỉ định bộ lọc cho tblSearch
        String search = txtSearch.getText();
        sorter.setRowFilter(RowFilter.regexFilter(search));//sử dụng đối tượng Rowfilter để lọc dựa trên giá trị trong textfield
        if(tblSearch.getRowCount() < 1){
            JOptionPane.showMessageDialog(this, "No match result.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btn_turnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
