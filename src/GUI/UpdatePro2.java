package GUI;

import BUS.ProductManagement_BUS;
import DTO.Product_DTO;
import DTO.Supplier_DTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class UpdatePro2 extends javax.swing.JFrame {

    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    Product_DTO dtoProduct = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    ArrayList<Supplier_DTO> listSupplier = new ArrayList<>();
    public UpdatePro2(Product_DTO product) {
        initComponents();
        dtoProduct = busProductManagement.getProductInfo(product);
        setResizable(false);
        setLocationRelativeTo(null);
        
        txtProID.setText(String.valueOf(dtoProduct.getPro_id()));
        txtSupID.setText(String.valueOf(dtoProduct.getSup_id()));
        txtProName.setText(dtoProduct.getName());
        txtCountry.setText(dtoProduct.getCountry());
        txtOPrice.setText(String.valueOf(dtoProduct.getOriginal_price()));
        txtSPrice.setText(String.valueOf(dtoProduct.getSale_price()));
        dcMFG.setDate(dtoProduct.getMFG());
        if(dtoProduct.getEXP() != null){
            dcEXP.setDate(dtoProduct.getEXP());
        }
        txtProType.setText(dtoProduct.getType());
        txtVAT.setText(String.valueOf(dtoProduct.getVAT()));
        dcImportedDate.setDate(dtoProduct.getImported_date());
        txtImportedQuantity.setText(String.valueOf(dtoProduct.getImported_quantity()));
        txtRemainingQuantity.setText(String.valueOf(dtoProduct.getRemaining_quantity()));;
        
        txtProID.disable();
        txtRemainingQuantity.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTurnBack = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        txtProName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSPrice = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtProType = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtVAT = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtSupID = new javax.swing.JTextField();
        dcImportedDate = new com.toedter.calendar.JDateChooser();
        dcEXP = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtRemainingQuantity = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtOPrice = new javax.swing.JTextField();
        dcMFG = new com.toedter.calendar.JDateChooser();
        txtImportedQuantity = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtProID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Product Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/09 - product icon.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("UPDATE PRODUCT INFORMATION");

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

        jPanel8.setBackground(new java.awt.Color(239, 250, 252));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtProName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Product name:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 127, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Country:");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 127, 30));

        txtCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCountry.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Original price");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 127, 30));

        txtSPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtSPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Sale price");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 127, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("MFG:");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 127, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("EXP:");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 127, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Imported Quantity:");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 160, 30));

        txtProType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProType.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtProType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 200, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Product type:");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 140, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("VAT:");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 90, 30));

        txtVAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVAT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Imported date:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 130, 30));

        btnUpdate.setBackground(new java.awt.Color(0, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel8.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 60));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Supplier ID:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 127, 30));

        txtSupID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSupID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtSupID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, 30));

        dcImportedDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(dcImportedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 30));

        dcEXP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(dcEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("(*)");
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 51));
        jLabel28.setText("(*)");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("(*)");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("(*)");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 51));
        jLabel29.setText("(*)");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 0, 51));
        jLabel30.setText("(*)");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("(*)");
        jPanel8.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setText("(*)");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, -1, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setText("(*)");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Remaining quantity:");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 170, 30));

        txtRemainingQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRemainingQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtRemainingQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 200, 30));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 51));
        jLabel35.setText("(*)");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, -1, -1));

        txtOPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtOPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        dcMFG.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.add(dcMFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 30));

        txtImportedQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImportedQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtImportedQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtImportedQuantityKeyReleased(evt);
            }
        });
        jPanel8.add(txtImportedQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 200, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("Product ID:");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 127, 30));

        txtProID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel8.add(txtProID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 30));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTurnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnBackActionPerformed
        setVisible(false);
        UpdateProForm updateForm = new UpdateProForm(dtoProduct);
        updateForm.setVisible(true);
    }//GEN-LAST:event_btnTurnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
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
                            Product_DTO dtoProduct = new Product_DTO(Integer.parseInt(txtProID.getText()), Integer.parseInt(txtSupID.getText()), txtProName.getText(), txtCountry.getText(), Long.parseLong(txtOPrice.getText()), Long.parseLong(txtSPrice.getText()), dcMFG.getDate(), dcEXP.getDate(), txtProType.getText(), Integer.parseInt(txtVAT.getText()), dcImportedDate.getDate(), Integer.parseInt(txtImportedQuantity.getText()), Integer.parseInt(txtRemainingQuantity.getText()));
                            setVisible(false);
                            new UpdatePro3(dtoProduct).setVisible(true);
                        }
                    }

                }
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtImportedQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImportedQuantityKeyReleased
        // TODO add your handling code here:
        if(!txtImportedQuantity.getText().equals("") && txtImportedQuantity.getText().matches("[0-9]*")){
        int x = Integer.parseInt(txtImportedQuantity.getText()) - dtoProduct.getImported_quantity();
        txtRemainingQuantity.setText(String.valueOf(dtoProduct.getRemaining_quantity() + x));
        }
    }//GEN-LAST:event_txtImportedQuantityKeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTurnBack;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dcEXP;
    private com.toedter.calendar.JDateChooser dcImportedDate;
    private com.toedter.calendar.JDateChooser dcMFG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtImportedQuantity;
    private javax.swing.JTextField txtOPrice;
    private javax.swing.JTextField txtProID;
    private javax.swing.JTextField txtProName;
    private javax.swing.JTextField txtProType;
    private javax.swing.JTextField txtRemainingQuantity;
    private javax.swing.JTextField txtSPrice;
    private javax.swing.JTextField txtSupID;
    private javax.swing.JTextField txtVAT;
    // End of variables declaration//GEN-END:variables
}
