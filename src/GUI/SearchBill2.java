package GUI;

import BUS.BillDetails_BUS;
import BUS.BillManagement_BUS;
import BUS.ProductManagement_BUS;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import DTO.Employee_DTO;
import DTO.Product_DTO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class SearchBill2 extends javax.swing.JFrame {

    Bill_DTO dtoBill = null;
    Employee_DTO dtoCashier;
    BillDetails_DTO dtoBillDetails = null;
    BillManagement_BUS busBillManagement = new BillManagement_BUS();
    BillDetails_BUS busBillDetails = new BillDetails_BUS();
    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    ArrayList<BillDetails_DTO> list = new ArrayList<>();
    ArrayList<Product_DTO> list2 = new ArrayList<>();
    DefaultTableModel tblBillDetailsModel;
    DefaultTableModel tblProductModel;
    public SearchBill2(Bill_DTO bill, Employee_DTO cashier) {
        initComponents();
        dtoBill = busBillManagement.getBillInfo(bill);
        dtoBillDetails = new BillDetails_DTO(bill.getId());
        dtoCashier = cashier;
        setResizable(false);
        setLocationRelativeTo(null);
        txtEmpID.setText(String.valueOf(dtoBill.getEmp_id()));
        txtDate.setText(String.valueOf(dtoBill.getBill_date()));
        txtCashCounterID.setText(String.valueOf(dtoBill.getCash_id()));
        txtBillid.setText(String.valueOf(dtoBill.getId()));
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
        jLabel14 = new javax.swing.JLabel();
        txtBillid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBillDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Bill");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/bill.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("SEARCH FOR BILL INFORMATION");

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
        txtEmpID.setText("E002");
        txtEmpID.setBorder(null);

        txtCashCounterID.setBackground(new java.awt.Color(255, 255, 255));
        txtCashCounterID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashCounterID.setForeground(new java.awt.Color(0, 0, 0));
        txtCashCounterID.setText("CC1");
        txtCashCounterID.setBorder(null);

        txtDate.setBackground(new java.awt.Color(255, 255, 255));
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

        txtSumUp.setBackground(new java.awt.Color(255, 255, 255));
        txtSumUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSumUp.setForeground(new java.awt.Color(0, 0, 0));
        txtSumUp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSumUp.setText("207122");
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
        txtTotalMoney.setText("197293");
        txtTotalMoney.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Bill ID:");
        jLabel14.setToolTipText("");

        txtBillid.setBackground(new java.awt.Color(255, 255, 255));
        txtBillid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBillid.setForeground(new java.awt.Color(0, 0, 0));
        txtBillid.setText("B123");
        txtBillid.setBorder(null);

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 420, 276));

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
        if (tblBillDetails.getColumnModel().getColumnCount() > 0) {
            tblBillDetails.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 276));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmpID))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCashCounterID)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBillid, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11))
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalMoney)
                            .addComponent(txtStuID)
                            .addComponent(txtSumUp, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCashCounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtBillid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSumUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtStuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        setVisible(false);
        SearchBill1 bill1 = new SearchBill1(dtoBill, dtoCashier);
        bill1.setVisible(true);
    }//GEN-LAST:event_btn_turnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField txtBillid;
    private javax.swing.JTextField txtCashCounterID;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtStuID;
    private javax.swing.JTextField txtSumUp;
    private javax.swing.JTextField txtTotalMoney;
    // End of variables declaration//GEN-END:variables
}
