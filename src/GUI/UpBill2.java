package GUI;

import BUS.BillDetails_BUS;
import BUS.BillManagement_BUS;
import BUS.ProductManagement_BUS;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import DTO.Employee_DTO;
import DTO.Product_DTO;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

public class UpBill2 extends javax.swing.JFrame {

    Employee_DTO dtoCashier = null;
    Bill_DTO dtoBill = null;
    BillDetails_DTO dtoBillDetails = null;
    Product_DTO Product = null;
    BillManagement_BUS busBillManagement = new BillManagement_BUS();
    BillDetails_BUS busBillDetails = new BillDetails_BUS();
    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    ArrayList<BillDetails_DTO> list = new ArrayList<>();
    ArrayList<Product_DTO> list2 = new ArrayList<>();
    DefaultTableModel tblBillDetailsModel;
    DefaultTableModel tblProductModel;
    public UpBill2(Bill_DTO bill, Employee_DTO cashier) {
        initComponents();
        dtoCashier = cashier;
        dtoBill = busBillManagement.getBillInfo(bill);
        dtoBillDetails = new BillDetails_DTO(bill.getId());
        Product = busProductManagement.getInformation(dtoBillDetails.getPro_id());
        setResizable(false);
        setLocationRelativeTo(null);
        txtSumUp.setText(String.valueOf(busBillManagement.sumUp(dtoBillDetails, Product)));
        txtEmpID.setText(String.valueOf(dtoBill.getEmp_id()));
        dcBillDate.setDate(dtoBill.getBill_date());
        txtCashCounterID.setText(String.valueOf(dtoBill.getCash_id()));
        txtBillID.setText(String.valueOf(dtoBill.getId()));
        txtStuID.setText(String.valueOf(dtoBill.getStu_id()));
        txtTotalMoney.setText(String.valueOf(dtoBill.getTotal_money()));
        //create table of bill details
        tblBillDetailsModel = new DefaultTableModel();
        String title[] = {"Product ID", "Amount"};
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
        //chọn thông tin cần cập nhật
        tblBillDetails.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if(tblBillDetails.getSelectedRow() >= 0){
                BillDetails_DTO BillDetails = new BillDetails_DTO(Integer.valueOf(String.valueOf(tblBillDetails.getValueAt(tblBillDetails.getSelectedRow(), 0))), Integer.valueOf(String.valueOf(tblBillDetails.getValueAt(tblBillDetails.getSelectedRow(), 1))));
                BillDetails_DTO chooseBillDetails = busBillDetails.getBillDetailsInformation(BillDetails);
                txtProductID.setText(String.valueOf(chooseBillDetails.getPro_id()));
                txtProductID.disable();
                txtAmount.setText(String.valueOf(chooseBillDetails.getAmount()));
            }
        });
        //create table product
        tblProductModel = new DefaultTableModel();
        String title2[] = {"Product name", "Sale price"};
        tblProductModel.setColumnIdentifiers(title2);
        tblProductModel.setRowCount(0);
        list2 = busProductManagement.getProductList(dtoBillDetails);
        for(int i = 0; i < list2.size(); i++){
            Product_DTO dtoProduct = list2.get(i);
            String[] rows = {dtoProduct.getName(), String.valueOf(dtoProduct.getSale_price())};
            tblProductModel.addRow(rows);
        }
        tblProduct.setModel(tblProductModel);
        tblProduct.setAutoCreateRowSorter(true);
        tblProduct.enable(false);
        txtBillID.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_Update = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        txtCashCounterID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtSumUp = new javax.swing.JTextField();
        txtStuID = new javax.swing.JTextField();
        txtTotalMoney = new javax.swing.JTextField();
        btn_Confirm = new javax.swing.JButton();
        btn_Dismiss = new javax.swing.JButton();
        txtBillID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        dcBillDate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBillDetails = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Bill");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/bill.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("UPDATE BILL INFORMATION");

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

        jPanel1.setBackground(new java.awt.Color(239, 250, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(239, 250, 252));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Amount:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Product ID:");

        btn_Update.setBackground(new java.awt.Color(0, 204, 255));
        btn_Update.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        txtAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(0, 0, 0));

        txtProductID.setBackground(new java.awt.Color(255, 255, 255));
        txtProductID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtProductID.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtAmount))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 133, 350, 360));

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
        txtEmpID.setText("200010");
        txtEmpID.setBorder(null);

        txtCashCounterID.setBackground(new java.awt.Color(255, 255, 255));
        txtCashCounterID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCashCounterID.setForeground(new java.awt.Color(0, 0, 0));
        txtCashCounterID.setText("600001");
        txtCashCounterID.setBorder(null);

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
        txtSumUp.setText("15709");
        txtSumUp.setBorder(null);

        txtStuID.setBackground(new java.awt.Color(255, 255, 255));
        txtStuID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStuID.setForeground(new java.awt.Color(0, 0, 0));
        txtStuID.setText("300010");
        txtStuID.setBorder(null);

        txtTotalMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalMoney.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalMoney.setForeground(new java.awt.Color(0, 0, 0));
        txtTotalMoney.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotalMoney.setText("14273");
        txtTotalMoney.setBorder(null);

        btn_Confirm.setBackground(new java.awt.Color(0, 204, 255));
        btn_Confirm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Confirm.setForeground(new java.awt.Color(255, 255, 255));
        btn_Confirm.setText("Confirm");
        btn_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmActionPerformed(evt);
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

        txtBillID.setBackground(new java.awt.Color(255, 255, 255));
        txtBillID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBillID.setForeground(new java.awt.Color(0, 0, 0));
        txtBillID.setText("700010");
        txtBillID.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Bill ID:");
        jLabel14.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(239, 250, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProduct.setBackground(new java.awt.Color(239, 250, 252));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product name", "Sale price"
            }
        ));
        jScrollPane3.setViewportView(tblProduct);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 0, 200, 277));

        tblBillDetails.setBackground(new java.awt.Color(239, 250, 252));
        tblBillDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Product ID", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tblBillDetails);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 277));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtBillID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCashCounterID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcBillDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(5, 5, 5)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStuID)
                                    .addComponent(txtTotalMoney)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btn_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btn_Dismiss, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(29, 29, 29)
                                .addComponent(txtSumUp))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBillID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtCashCounterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(dcBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSumUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtStuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Dismiss, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 410, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        setVisible(false);
        UpBill1 bill1 = new UpBill1(dtoBill, dtoCashier);
        bill1.setVisible(true);
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btn_DismissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DismissActionPerformed
        setVisible(false);
        UpBill1 bill1 = new UpBill1(dtoBill, dtoCashier);
        bill1.setVisible(true);
    }//GEN-LAST:event_btn_DismissActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        if(txtProductID.getText().equals("") || txtAmount.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Information fields are not entered enough.", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            BillDetails_DTO billDetails = new BillDetails_DTO(Integer.parseInt(txtBillID.getText()),Integer.parseInt(txtProductID.getText()), Integer.parseInt(txtAmount.getText()));
            busBillDetails.update(billDetails);
            Product = busProductManagement.getInformation(billDetails.getPro_id());
            String rows[] = new String[2];
            rows[0] = String.valueOf(txtProductID.getText());
            rows[1] = String.valueOf(txtAmount.getText());
            tblBillDetails.setValueAt(rows[0], tblBillDetails.getSelectedRow(), 0);
            tblBillDetails.setValueAt(rows[1], tblBillDetails.getSelectedRow(), 1);
            txtSumUp.setText(String.valueOf(busBillManagement.sumUp(billDetails, Product)));
            txtTotalMoney.setText(String.valueOf(busBillManagement.getTotalMoney(billDetails, Product)));
            txtAmount.disable();
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmActionPerformed
        if(txtCashCounterID.getText().equals("") || txtEmpID.getText().equals("") || txtStuID.getText().equals("") || dcBillDate.getDate().toString().equals("")){
            JOptionPane.showMessageDialog(this, "Information fields are not entered enough.", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Bill_DTO Bill = new Bill_DTO(Integer.parseInt(txtBillID.getText()), Integer.parseInt(txtEmpID.getText()), Integer.parseInt(txtCashCounterID.getText()), Integer.parseInt(txtStuID.getText()), dcBillDate.getDate(), Long.parseLong(txtTotalMoney.getText()));
            if(busBillManagement.update(Bill)){
                JOptionPane.showMessageDialog(this, "Bill information is updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                UpBill1 bill1 = new UpBill1(dtoBill, dtoCashier);
                bill1.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Confirm;
    private javax.swing.JButton btn_Dismiss;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_turnback;
    private com.toedter.calendar.JDateChooser dcBillDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblBillDetails;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBillID;
    private javax.swing.JTextField txtCashCounterID;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtStuID;
    private javax.swing.JTextField txtSumUp;
    private javax.swing.JTextField txtTotalMoney;
    // End of variables declaration//GEN-END:variables
}
