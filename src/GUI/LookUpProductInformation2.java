package GUI;

import BUS.ProductManagement_BUS;
import DTO.Product_DTO;
import java.text.SimpleDateFormat;

public class LookUpProductInformation2 extends javax.swing.JFrame {

    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    Product_DTO dtoProduct = null;

    public LookUpProductInformation2(Product_DTO dtoProduct) {
        initComponents();
        dtoProduct = busProductManagement.getInformation(dtoProduct.getPro_id());
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnTurnBack = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSupID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtProName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtOPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSPrice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMFG = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEXP = new javax.swing.JTextField();
        txtProType = new javax.swing.JTextField();
        txtImportedDate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProID = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtVAT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtImportedQuantity = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtRemainingQuantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/lookup.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("LOOK UP PRODUCT INFORMATION");

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

        jPanel7.setBackground(new java.awt.Color(239, 250, 252));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("EXP:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 127, 30));

        txtSupID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSupID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtSupID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Supplier ID:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 127, 30));

        txtProName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtProName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Product name:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 127, 30));

        txtOPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtOPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 200, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Country:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 127, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("MFG:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 127, 30));

        txtSPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtSPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Sale price:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 127, 30));

        txtMFG.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMFG.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtMFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 200, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Original price:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 127, 30));

        txtEXP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEXP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtEXP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, 30));

        txtProType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProType.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtProType, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 200, 30));

        txtImportedDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImportedDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtImportedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 200, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Product type:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("VAT:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 140, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Imported date:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Product ID:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 127, 30));

        txtProID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtProID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, 30));

        txtCountry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCountry.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 30));

        txtVAT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtVAT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtVAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 200, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Imported quantity:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 160, 30));

        txtImportedQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtImportedQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtImportedQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 200, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Remaining quantity:");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 160, 30));

        txtRemainingQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRemainingQuantity.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel7.add(txtRemainingQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 200, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 810, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTurnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTurnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        LookUpProductInformation LookUp = new LookUpProductInformation(dtoProduct);
        LookUp.setVisible(true);
    }//GEN-LAST:event_btnTurnBackActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTurnBack;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
