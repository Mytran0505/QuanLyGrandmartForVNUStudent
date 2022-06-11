package GUI;

import BUS.BillDetails_BUS;
import BUS.BillManagement_BUS;
import BUS.ProductManagement_BUS;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import DTO.Product_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DelBill2 extends javax.swing.JFrame {

    Bill_DTO dtoBill = null;
    BillDetails_DTO dtoBillDetails = null;
    BillManagement_BUS busBillManagement = new BillManagement_BUS();
    BillDetails_BUS busBillDetails = new BillDetails_BUS();
    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    ArrayList<BillDetails_DTO> list = new ArrayList<>();
    ArrayList<Product_DTO> list2 = new ArrayList<>();
    DefaultTableModel tblBillDetailsModel;
    DefaultTableModel tblProductModel;
    public DelBill2(Bill_DTO bill) {
        initComponents();
        dtoBill = busBillManagement.getBillInfo(bill);
        dtoBillDetails = new BillDetails_DTO(bill.getId());
        setResizable(false);
        setLocationRelativeTo(null);
        txtEmpID.setText(String.valueOf(dtoBill.getEmp_id()));
        txtBillDate.setText(String.valueOf(dtoBill.getBill_date()));
        txtCashCounterID.setText(String.valueOf(dtoBill.getCash_id()));
        txtBillID.setText(String.valueOf(dtoBill.getId()));
        txtStuID.setText(String.valueOf(dtoBill.getStu_id()));
        txtTotalMoney.setText(String.valueOf(dtoBill.getTotal_money()));
        //create table of bill details
        tblBillDetailsModel = new DefaultTableModel();
        String title[] = {"Product ID", "Amount", ""};
        tblBillDetailsModel.setColumnIdentifiers(title);
        tblBillDetailsModel.setRowCount(0);
        list = busBillDetails.getBillDetailsList(bill.getId());
        for(int i = 0; i < list.size(); i++){
            BillDetails_DTO dtoBillDetails = list.get(i);
            String[] rows = {String.valueOf(dtoBillDetails.getPro_id()), String.valueOf(dtoBillDetails.getAmount()) };
            tblBillDetailsModel.addRow(rows);
        }
        tblBillDetails.setModel(tblBillDetailsModel);
        tblBillDetails.setAutoCreateRowSorter(true);
        tblBillDetails.setEnabled(false);
        tblBillDetails.getColumnModel().getColumn(2).setPreferredWidth(10);
        //create table product
        tblProductModel = new DefaultTableModel();
        String title2[] = {"Product name", "VAT(%)", "Original price", "Sale price"};
        tblProductModel.setColumnIdentifiers(title2);
        tblProductModel.setRowCount(0);
        list2 = busProductManagement.getProductList(dtoBillDetails);
        for(int i = 0; i < list2.size(); i++){
            Product_DTO dtoProduct = list2.get(i);
            String[] rows = {dtoProduct.getName(), String.valueOf(dtoProduct.getVAT()), String.valueOf(dtoProduct.getOriginal_price()), String.valueOf(dtoProduct.getSale_price())};
            tblProductModel.addRow(rows);
        }
        tblProduct.setModel(tblProductModel);
        tblProduct.setAutoCreateRowSorter(true);
        tblProduct.setEnabled(false);
        
        //Không được sửa
        txtEmpID.disable();
        txtBillDate.disable();
        txtCashCounterID.disable();
        txtBillID.disable();
        txtStuID.disable();
        txtTotalMoney.disable();
        txtSumUp.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        txtCashCounterID = new javax.swing.JTextField();
        txtBillDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSumUp = new javax.swing.JTextField();
        txtStuID = new javax.swing.JTextField();
        txtTotalMoney = new javax.swing.JTextField();
        btn_Delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtBillID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBillDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/bill.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("DELETE BILL INFORMATION");

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
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        jPanel5.setBackground(new java.awt.Color(239, 250, 252));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bill details");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Employee ID:");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Cashier counter:");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Date:");
        jLabel10.setToolTipText("");

        txtEmpID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpID.setForeground(new java.awt.Color(0, 0, 0));
        txtEmpID.setText("E014");
        txtEmpID.setBorder(null);

        txtCashCounterID.setBackground(new java.awt.Color(255, 255, 255));
        txtCashCounterID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashCounterID.setForeground(new java.awt.Color(0, 0, 0));
        txtCashCounterID.setText("CC2");
        txtCashCounterID.setBorder(null);

        txtBillDate.setBackground(new java.awt.Color(255, 255, 255));
        txtBillDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBillDate.setForeground(new java.awt.Color(0, 0, 0));
        txtBillDate.setText("11/05/2022");
        txtBillDate.setBorder(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Sum up");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Student ID:");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Total money");
        jLabel13.setToolTipText("");

        txtSumUp.setBackground(new java.awt.Color(255, 255, 255));
        txtSumUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSumUp.setForeground(new java.awt.Color(0, 0, 0));
        txtSumUp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSumUp.setText("324000");
        txtSumUp.setBorder(null);

        txtStuID.setBackground(new java.awt.Color(255, 255, 255));
        txtStuID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStuID.setForeground(new java.awt.Color(0, 0, 0));
        txtStuID.setText("S123456");
        txtStuID.setBorder(null);

        txtTotalMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalMoney.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalMoney.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalMoney.setText("324000");
        txtTotalMoney.setBorder(null);

        btn_Delete.setBackground(new java.awt.Color(0, 204, 255));
        btn_Delete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Bill ID:");
        jLabel14.setToolTipText("");

        txtBillID.setBackground(new java.awt.Color(255, 255, 255));
        txtBillID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBillID.setForeground(new java.awt.Color(0, 0, 0));
        txtBillID.setText("B001");
        txtBillID.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduct.setBackground(new java.awt.Color(239, 250, 252));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product name", "VAT", "Original price", "Sales price"
            }
        ));
        tblProduct.setGridColor(new java.awt.Color(239, 250, 252));
        jScrollPane1.setViewportView(tblProduct);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 470, 276));

        tblBillDetails.setBackground(new java.awt.Color(239, 250, 252));
        tblBillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product ID", "Amount", "Title 3"
            }
        ));
        tblBillDetails.setGridColor(new java.awt.Color(239, 250, 252));
        jScrollPane4.setViewportView(tblBillDetails);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 276));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBillID, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtCashCounterID))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalMoney, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                            .addComponent(txtSumUp)
                            .addComponent(txtStuID))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(336, 336, 336))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBillID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCashCounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSumUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtStuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        setVisible(false);
        DelBill1 delBill1 = new DelBill1(dtoBill);
        delBill1.setVisible(true);
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this bill information?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            if(busBillManagement.delete(dtoBill)){
                if(busBillDetails.delete(dtoBillDetails)){
                    JOptionPane.showMessageDialog(this, "Bill information has been deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    new DelBill1(dtoBill).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Cannot delete bill details!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Cannot delete bill!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_turnback;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblBillDetails;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtBillDate;
    private javax.swing.JTextField txtBillID;
    private javax.swing.JTextField txtCashCounterID;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtStuID;
    private javax.swing.JTextField txtSumUp;
    private javax.swing.JTextField txtTotalMoney;
    // End of variables declaration//GEN-END:variables
}
