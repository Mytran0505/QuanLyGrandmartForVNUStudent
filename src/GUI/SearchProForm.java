/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.ProductManagement_BUS;
import DTO.Employee_DTO;
import DTO.Product_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DELL
 */
public class SearchProForm extends javax.swing.JFrame {

    ProductManagement_BUS busProductManagement = new ProductManagement_BUS();
    Product_DTO dtoProduct = null;
    Employee_DTO dtoStorekeeper = null;
    ArrayList<Product_DTO> list = new ArrayList<>();
    public SearchProForm(Product_DTO product) {
        initComponents();
        dtoProduct = product;
        setResizable(false);
        setLocationRelativeTo(null);
        createTable();
    }

    DefaultTableModel tblProductModel;
    public void createTable(){
        tblProductModel = new DefaultTableModel();
        //Tạo bảng
        String title[] = {"Product ID", "Supplier ID", "Product name", "Country", "Original price", "Sale price", "MFG", "EXP", "Product type", "VAT", "Imported date", "Imported quantity", "Remaining quantity"};
        tblProductModel.setColumnIdentifiers(title);
        tblProductModel.setRowCount(0);
        //Get all employee information
        list = busProductManagement.getProductList();
        //Load employee information into the table
        for(int i = 0; i < list.size(); i++){
            Product_DTO dtoProduct = list.get(i);
            String[] rows = {String.valueOf(dtoProduct.getPro_id()), String.valueOf(dtoProduct.getSup_id()), dtoProduct.getName(), dtoProduct.getCountry(), String.valueOf(dtoProduct.getOriginal_price()), String.valueOf(dtoProduct.getSale_price()), dtoProduct.getMFG().toString(), String.valueOf(dtoProduct.getEXP()), dtoProduct.getType(), String.valueOf(dtoProduct.getVAT()), dtoProduct.getImported_date().toString(), String.valueOf(dtoProduct.getImported_quantity()), String.valueOf(dtoProduct.getRemaining_quantity())}; 
            tblProductModel.addRow(rows);
        }
        tblSearch.setModel(tblProductModel);
        //cho phép sắp xếp từng cột
        tblSearch.setAutoCreateRowSorter(true);
        //không cho sửa dữ liệu trong bảng
        //tblSearch.setEnabled(false);
        tblSearch.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblSearch.getColumnModel().getColumn(0).setPreferredWidth(80);
        tblSearch.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblSearch.getColumnModel().getColumn(2).setPreferredWidth(110);
        tblSearch.getColumnModel().getColumn(3).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(4).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(5).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(6).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(7).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(8).setPreferredWidth(120);
        tblSearch.getColumnModel().getColumn(9).setPreferredWidth(50);
        tblSearch.getColumnModel().getColumn(10).setPreferredWidth(90);
        tblSearch.getColumnModel().getColumn(11).setPreferredWidth(120);
        tblSearch.getColumnModel().getColumn(12).setPreferredWidth(120);
        tblSearch.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if(tblSearch.getSelectedRow() >= 0){
                Product_DTO dtoProduct = new Product_DTO(Integer.valueOf(String.valueOf(tblSearch.getValueAt(tblSearch.getSelectedRow(), 0))));
                setVisible(false);
                new SearchPro2(dtoProduct).setVisible(true);
            }
        });
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearch = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(810, 122));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/09 - product icon - 1.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("SEARCH FOR PRODUCT INFORMATION");

        btn_turnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_turnback.setText("Turn back");
        btn_turnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_turnback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 130));

        jPanel2.setBackground(new java.awt.Color(239, 250, 252));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Search bar:");

        btnSearch.setBackground(new java.awt.Color(0, 204, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Supplier ID", "Product name", "Country", "Original price", "Sale price", "MFG", "EXP", "Product type", "VAT", "Imported date", "Imported quantity", "Remaining quantity"
            }
        ));
        jScrollPane1.setViewportView(tblSearch);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 840, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        // TODO add your handling code here:
        int ret = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to turn back?", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            setVisible(false);
            ManageProduct emp = new ManageProduct(dtoStorekeeper);
            emp.setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
