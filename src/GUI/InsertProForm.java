package GUI;

import BUS.ProductManagement_BUS;
import DTO.Product_DTO;
import DTO.Employee_DTO;
import DTO.Supplier_DTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class InsertProForm extends javax.swing.JFrame {
    
    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    Product_DTO dtoProduct = null;
    Employee_DTO dtoStorekeeper = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    ArrayList<Supplier_DTO> listSupplier = new ArrayList<>();
    
    public InsertProForm(Product_DTO product) {
        initComponents();
        dtoProduct = product;
        setResizable(false);
        setLocationRelativeTo(null);
        txtRemainingQuantity.disable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        txtProName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtProType = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtVAT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtSupID = new javax.swing.JTextField();
        dcImportedDate = new com.toedter.calendar.JDateChooser();
        dcEXP = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtRemainingQuantity = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtOPrice = new javax.swing.JTextField();
        dcMFG = new com.toedter.calendar.JDateChooser();
        txtImportedQuantity = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTurnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert Product Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(239, 250, 252));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtProName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Product name:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 127, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Country:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 127, 30));

        txtCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCountry.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Original price");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 127, 30));

        txtSPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtSPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Sale price");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 127, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("MFG:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 127, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("EXP:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 127, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Imported Quantity:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 160, 30));

        txtProType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProType.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtProType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Product type:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("VAT:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 90, 30));

        txtVAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVAT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Imported date:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 130, 30));

        btnInsert.setBackground(new java.awt.Color(0, 204, 255));
        btnInsert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsert.setForeground(new java.awt.Color(255, 255, 255));
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel7.add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 60));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Supplier ID:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 127, 30));

        txtSupID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSupID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtSupID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 30));

        dcImportedDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(dcImportedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 30));

        dcEXP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(dcEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("(*)");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("(*)");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("(*)");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("(*)");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("(*)");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("(*)");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("(*)");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 51));
        jLabel21.setText("(*)");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 51));
        jLabel23.setText("(*)");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Remaining quantity:");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 170, 30));

        txtRemainingQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRemainingQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtRemainingQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 200, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 51));
        jLabel25.setText("(*)");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        txtOPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtOPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 30));

        dcMFG.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.add(dcMFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 30));

        txtImportedQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImportedQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtImportedQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtImportedQuantityKeyReleased(evt);
            }
        });
        jPanel7.add(txtImportedQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 200, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 440));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/09 - product icon.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("INSERT PRODUCT INFORMATION");

        btnTurnBack.setBackground(new java.awt.Color(239, 250, 252));
        btnTurnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addContainerGap(15, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
                
        if(txtSupID.getText().equals("") || txtProName.getText().equals("") || txtCountry.getText().equals("") || txtOPrice.getText().equals("") || txtSPrice.getText().equals("") || dcMFG.getCalendar() == null || txtProType.getText().equals("") || txtVAT.getText().equals("") || dcImportedDate.getCalendar() == null || txtImportedQuantity.getText().equals("") || txtRemainingQuantity.getText().equals("") )
        {
            JOptionPane.showMessageDialog(this, "Information fields are not entered enough.", "Please fill all required fields...!", JOptionPane.ERROR_MESSAGE);
        }
        else if(!txtSupID.getText().matches("[0-9]*") || !txtOPrice.getText().matches("[0-9]*") || !txtSPrice.getText().matches("[0-9]*") || !txtVAT.getText().matches("[0-9]*") ||  !txtImportedQuantity.getText().matches("[0-9]*") || !txtRemainingQuantity.getText().matches("[0-9]*"))
        {
                JOptionPane.showMessageDialog(this, "Invalid data!", "Error!", JOptionPane.ERROR_MESSAGE);
        }
            else{
                if(sdf.format(dcImportedDate.getDate()).compareTo(sdf.format(dcMFG.getDate())) < 0){
                    JOptionPane.showMessageDialog(this, "Imported date must be equals or after MFG!", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                else if(dcEXP.getCalendar() == null){
                        listSupplier = busProductManagement.getSupplierList();
                        Supplier_DTO dtoSupplier = null;
                        boolean flagNotExist = true;
                        for(int i = 0; i < listSupplier.size(); i++){
                            dtoSupplier = listSupplier.get(i);
                            if(dtoSupplier.getId() == Integer.parseInt(txtSupID.getText())){
                                flagNotExist = false;
                                break;
                            }
                        }
                        if(flagNotExist == true){
                            JOptionPane.showMessageDialog(this, "Supplier_ID NOT EXIST", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            Product_DTO newProduct = new Product_DTO(0, Integer.parseInt(txtSupID.getText()), txtProName.getText(), txtCountry.getText(), Long.parseLong(txtOPrice.getText()), Long.parseLong(txtSPrice.getText()), dcMFG.getDate(), txtProType.getText(), Integer.parseInt(txtVAT.getText()), dcImportedDate.getDate(), Integer.parseInt(txtImportedQuantity.getText()), Integer.parseInt(txtRemainingQuantity.getText()));
                            setVisible(false);
                            new InsertPro2(newProduct).setVisible(true);
                        }                   
                }
                else{
                    if(sdf.format(dcEXP.getDate()).compareTo(sdf.format(dcMFG.getDate())) <= 0){
                        JOptionPane.showMessageDialog(this, "EXP must be after MFG!", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        listSupplier = busProductManagement.getSupplierList();
                        Supplier_DTO dtoSupplier = null;
                        boolean flagNotExist = true;
                        for(int i = 0; i < listSupplier.size(); i++){
                            dtoSupplier = listSupplier.get(i);
                            if(dtoSupplier.getId() == Integer.parseInt(txtSupID.getText())){
                                flagNotExist = false;
                                break;
                            }
                        }
                        if(flagNotExist == true){
                            JOptionPane.showMessageDialog(this, "Supplier_ID NOT EXIST", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                        Product_DTO newProduct = new Product_DTO(0, Integer.parseInt(txtSupID.getText()), txtProName.getText(), txtCountry.getText(), Long.parseLong(txtOPrice.getText()), Long.parseLong(txtSPrice.getText()), dcMFG.getDate(), dcEXP.getDate(), txtProType.getText(), Integer.parseInt(txtVAT.getText()), dcImportedDate.getDate(), Integer.parseInt(txtImportedQuantity.getText()), Integer.parseInt(txtRemainingQuantity.getText()));
                        setVisible(false);
                        new InsertPro2(newProduct).setVisible(true);
                        }                    
                }
            
            }         
        }  
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnTurnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnBackActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to turn back?", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            setVisible(false);
            ManageProduct emp = new ManageProduct(dtoStorekeeper);
            emp.setVisible(true);
        }
    }//GEN-LAST:event_btnTurnBackActionPerformed

    private void txtImportedQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImportedQuantityKeyReleased
        // TODO add your handling code here:
        txtRemainingQuantity.setText(txtImportedQuantity.getText());
    }//GEN-LAST:event_txtImportedQuantityKeyReleased

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnTurnBack;
    private com.toedter.calendar.JDateChooser dcEXP;
    private com.toedter.calendar.JDateChooser dcImportedDate;
    private com.toedter.calendar.JDateChooser dcMFG;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtImportedQuantity;
    private javax.swing.JTextField txtOPrice;
    private javax.swing.JTextField txtProName;
    private javax.swing.JTextField txtProType;
    private javax.swing.JTextField txtRemainingQuantity;
    private javax.swing.JTextField txtSPrice;
    private javax.swing.JTextField txtSupID;
    private javax.swing.JTextField txtVAT;
    // End of variables declaration//GEN-END:variables
}
