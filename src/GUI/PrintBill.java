package GUI;

import BUS.BillDetails_BUS;
import BUS.BillManagement_BUS;
import BUS.ProductManagement_BUS;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import DTO.Employee_DTO;
import DTO.Product_DTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class PrintBill extends javax.swing.JFrame {

    Bill_DTO dtoBill = null;
    Employee_DTO dtoCashier = null;
    BillDetails_DTO dtoBillDetails = null;
    BillManagement_BUS busBillManagement = new BillManagement_BUS();
    BillDetails_BUS busBillDetails = new BillDetails_BUS();
    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    ArrayList<BillDetails_DTO> list = new ArrayList<>();
    ArrayList<Product_DTO> list2 = new ArrayList<>();
    DefaultTableModel tblBillDetailsModel;
    DefaultTableModel tblProductModel;
    public PrintBill(Bill_DTO bill, Employee_DTO cashier, long sumUp) {
        initComponents();
        dtoCashier = cashier;
        setResizable(false);
        setLocationRelativeTo(null);
        dtoBill = busBillManagement.getBillInfo(bill);
        dtoBillDetails = busBillDetails.getBillDetailsInfo(bill);
        txtSumUp.setText(String.valueOf(sumUp));
        txtEmpID.setText(String.valueOf(dtoBill.getEmp_id()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        txtDate.setText(sdf.format(dtoBill.getBill_date()));
        txtCashCounterID.setText(String.valueOf(dtoBill.getCash_id()));
        txtBillid.setText(String.valueOf(dtoBillDetails.getId()));
        txtStuID.setText(String.valueOf(dtoBill.getStu_id()));
        txtTotalMoney.setText(String.valueOf(dtoBill.getTotal_money()));
        //create table of bill details
        tblBillDetailsModel = new DefaultTableModel();
        String title[] = {"Product ID", "Amount", ""};
        tblBillDetailsModel.setColumnIdentifiers(title);
        tblBillDetailsModel.setRowCount(0);
        list = busBillDetails.getBillDetailsList(dtoBillDetails.getId());
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
        tblProduct.getColumnModel().getColumn(0).setPreferredWidth(90);
        tblProduct.getColumnModel().getColumn(1).setPreferredWidth(60);
        //Không được sửa
        txtEmpID.disable();
        txtDate.disable();
        txtCashCounterID.disable();
        txtBillid.disable();
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
        txtDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSumUp = new javax.swing.JTextField();
        txtStuID = new javax.swing.JTextField();
        txtTotalMoney = new javax.swing.JTextField();
        btn_Print = new javax.swing.JButton();
        btn_Dismiss = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtBillid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBillDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Print Bill");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/bill.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("INSERT BILL INFORMATION");

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
        jLabel7.setText("Do you want print this bill?");

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

        txtEmpID.setBackground(new java.awt.Color(239, 250, 252));
        txtEmpID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpID.setForeground(new java.awt.Color(0, 0, 0));
        txtEmpID.setText("E002");
        txtEmpID.setBorder(null);

        txtCashCounterID.setBackground(new java.awt.Color(239, 250, 252));
        txtCashCounterID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashCounterID.setForeground(new java.awt.Color(0, 0, 0));
        txtCashCounterID.setText("CC1");
        txtCashCounterID.setBorder(null);

        txtDate.setBackground(new java.awt.Color(239, 250, 252));
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(0, 0, 0));
        txtDate.setText("11/05/2022");
        txtDate.setBorder(null);

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

        txtSumUp.setBackground(new java.awt.Color(239, 250, 252));
        txtSumUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSumUp.setForeground(new java.awt.Color(0, 0, 0));
        txtSumUp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSumUp.setText("207410");
        txtSumUp.setBorder(null);

        txtStuID.setBackground(new java.awt.Color(239, 250, 252));
        txtStuID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStuID.setForeground(new java.awt.Color(0, 0, 0));
        txtStuID.setText("S123456");
        txtStuID.setBorder(null);

        txtTotalMoney.setBackground(new java.awt.Color(239, 250, 252));
        txtTotalMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalMoney.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalMoney.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalMoney.setText("197040");
        txtTotalMoney.setBorder(null);

        btn_Print.setBackground(new java.awt.Color(0, 204, 255));
        btn_Print.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Print.setForeground(new java.awt.Color(255, 255, 255));
        btn_Print.setText("Print");
        btn_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrintActionPerformed(evt);
            }
        });

        btn_Dismiss.setBackground(new java.awt.Color(0, 204, 255));
        btn_Dismiss.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Dismiss.setForeground(new java.awt.Color(255, 255, 255));
        btn_Dismiss.setText("Dismiss");
        btn_Dismiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DismissActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Bill ID:");
        jLabel14.setToolTipText("");

        txtBillid.setBackground(new java.awt.Color(239, 250, 252));
        txtBillid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBillid.setForeground(new java.awt.Color(0, 0, 0));
        txtBillid.setText("B123");
        txtBillid.setBorder(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(610, 280));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblProduct);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 350, 280));

        tblBillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblBillDetails);
        if (tblBillDetails.getColumnModel().getColumnCount() > 0) {
            tblBillDetails.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 285, 280));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCashCounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(58, 58, 58)
                                .addComponent(txtBillid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmpID)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(108, 108, 108))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btn_Dismiss, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(53, 53, 53)
                                    .addComponent(txtTotalMoney))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtStuID, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSumUp, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(108, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBillid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCashCounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSumUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtStuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Dismiss, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to turn back?", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            setVisible(false);
            InsBill1 bill1 = new InsBill1(dtoBill, dtoCashier);
            bill1.setVisible(true);
        }
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btn_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrintActionPerformed
        busBillManagement.printBill(dtoBill);
        JOptionPane.showMessageDialog(this, "Print successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        setVisible(false);
        new ManageBillInf(dtoBill, dtoCashier).setVisible(true);
    }//GEN-LAST:event_btn_PrintActionPerformed

    private void btn_DismissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DismissActionPerformed
        setVisible(false);
        InsBill1 bill1 = new InsBill1(dtoBill, dtoCashier);
        bill1.setVisible(true);
    }//GEN-LAST:event_btn_DismissActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dismiss;
    private javax.swing.JButton btn_Print;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblBillDetails;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtBillid;
    private javax.swing.JTextField txtCashCounterID;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtStuID;
    private javax.swing.JTextField txtSumUp;
    private javax.swing.JTextField txtTotalMoney;
    // End of variables declaration//GEN-END:variables
}
