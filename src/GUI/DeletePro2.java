/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.Product_DTO;
import BUS.ProductManagement_BUS;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class DeletePro2 extends javax.swing.JFrame {
    
    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    Product_DTO dtoProduct = null;
    
    public DeletePro2(Product_DTO product){
        initComponents();
        dtoProduct = busProductManagement.getProductInfo(product);
        setResizable(false);
        setLocationRelativeTo(null);
        if(dtoProduct.getEXP() == null)
        {
            txtProID.setText(String.valueOf(dtoProduct.getPro_id()));
            txtSupID.setText(String.valueOf(dtoProduct.getSup_id()));
            txtProName.setText(dtoProduct.getName());
            txtCountry.setText(dtoProduct.getCountry());
            txtOPrice.setText(String.valueOf(dtoProduct.getOriginal_price()));
            txtSPrice.setText(String.valueOf(dtoProduct.getSale_price()));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtMFG.setText(sdf.format(dtoProduct.getMFG()));
            txtProType.setText(dtoProduct.getType());
            txtVAT.setText(String.valueOf(dtoProduct.getVAT()));
            txtImportedDate.setText(sdf.format(dtoProduct.getImported_date()));
            txtImportedQuantity.setText(String.valueOf(dtoProduct.getImported_quantity()));
            txtRemainingQuantity.setText(String.valueOf(dtoProduct.getRemaining_quantity()));;
        }
        else
        {
            txtProID.setText(String.valueOf(dtoProduct.getPro_id()));
            txtSupID.setText(String.valueOf(dtoProduct.getSup_id()));
            txtProName.setText(dtoProduct.getName());
            txtCountry.setText(dtoProduct.getCountry());
            txtOPrice.setText(String.valueOf(dtoProduct.getOriginal_price()));
            txtSPrice.setText(String.valueOf(dtoProduct.getSale_price()));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtMFG.setText(sdf.format(dtoProduct.getMFG()));
            txtEXP.setText(sdf.format(dtoProduct.getEXP()));
            txtProType.setText(dtoProduct.getType());
            txtVAT.setText(String.valueOf(dtoProduct.getVAT()));
            txtImportedDate.setText(sdf.format(dtoProduct.getImported_date()));
            txtImportedQuantity.setText(String.valueOf(dtoProduct.getImported_quantity()));
            txtRemainingQuantity.setText(String.valueOf(dtoProduct.getRemaining_quantity()));;
        }
        txtProID.disable();
        txtSupID.disable();
        txtProName.disable();
        txtCountry.disable();
        txtOPrice.disable();
        txtSPrice.disable();
        txtMFG.disable();
        txtEXP.disable();
        txtProType.disable();
        txtVAT.disable();
        txtImportedDate.disable();
        txtImportedQuantity.disable();
        txtRemainingQuantity.disable();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        txtProName = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtImportedDate = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtProType = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtVAT = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtProID = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtRemainingQuantity = new javax.swing.JTextField();
        txtOPrice = new javax.swing.JTextField();
        txtImportedQuantity = new javax.swing.JTextField();
        txtSPrice = new javax.swing.JTextField();
        txtMFG = new javax.swing.JTextField();
        txtEXP = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        txtSupID = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Product Information");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(239, 250, 252));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtProName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setText("Product name:");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 127, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Country:");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 127, 30));

        txtCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCountry.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setText("Original price");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 127, 30));

        txtImportedDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImportedDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtImportedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Sale price");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 127, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setText("MFG:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 127, 30));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setText("EXP:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 127, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setText("Imported Quantity:");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 160, 30));

        txtProType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProType.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtProType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 200, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Product type:");
        jPanel9.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 140, 30));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setText("VAT:");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 90, 30));

        txtVAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVAT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Imported date:");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 130, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setText("Product ID:");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 127, 30));

        txtProID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtProID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 30));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel44.setText("Remaining quantity:");
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 170, 30));

        txtRemainingQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRemainingQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtRemainingQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 200, 30));

        txtOPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtOPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        txtImportedQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImportedQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtImportedQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 200, 30));

        txtSPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtSPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 30));

        txtMFG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMFG.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtMFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 30));

        txtEXP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEXP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        btnDelete.setBackground(new java.awt.Color(0, 204, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel9.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 130, 60));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel38.setText("Supplier ID:");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 127, 30));

        txtSupID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSupID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel9.add(txtSupID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, 30));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 440));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/09 - product icon.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("DELETE PRODUCT INFORMATION");

        btn_turnback.setBackground(new java.awt.Color(239, 250, 252));
        btn_turnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        setVisible(false);
        DeleteProForm deleteForm = new DeleteProForm(dtoProduct);
        deleteForm.setVisible(true);
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this product information?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            if(busProductManagement.delete(dtoProduct)){
                JOptionPane.showMessageDialog(this, "Product information has been deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
                new DeleteProForm(dtoProduct).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Cannot delete product!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btn_turnback;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtEXP;
    private javax.swing.JTextField txtImportedDate;
    private javax.swing.JTextField txtImportedQuantity;
    private javax.swing.JTextField txtMFG;
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
