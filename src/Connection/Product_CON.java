package Connection;

import DTO.BillDetails_DTO;
import DTO.Employee_DTO;
import DTO.Product_DTO;
import DTO.User_login_DTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Product_CON {
    public boolean insert(Product_DTO dtoProduct){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "INSERT INTO PRODUCT (PRODUCT_ID, SUPPLIER_ID, PRODUCT_NAME, COUNTRY, ORIGINAL_PRICE, SALE_PRICE, MFG, EXP, PRODUCT_TYPE, VAT, IMPORTED_DATE, IMPORTED_QUANTITY, REMAINING_QUANTITY)"
                    + "VALUES (PRODUCT_ID_SEQUENCE.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoProduct.getSup_id());
            ps.setString(2, dtoProduct.getName());
            ps.setString(3, dtoProduct.getCountry());
            ps.setLong(4, dtoProduct.getOriginal_price());
            ps.setLong(5, dtoProduct.getSale_price());
            Date sqlMFG = new java.sql.Date(dtoProduct.getMFG().getTime());
            ps.setDate(6, sqlMFG);
            if(dtoProduct.getEXP() == null){
                ps.setDate(7, null);
            }
            else{
                Date sqlEXP = new java.sql.Date(dtoProduct.getEXP().getTime());
                ps.setDate(7, sqlEXP);
            }
            ps.setString(8, dtoProduct.getType());
            ps.setInt(9, dtoProduct.getVAT());
            Date sqlImportedDate = new java.sql.Date(dtoProduct.getImported_date().getTime());
            ps.setDate(10, sqlImportedDate);
            ps.setInt(11, dtoProduct.getImported_quantity());
            ps.setInt(12, dtoProduct.getRemaining_quantity());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean update(Product_DTO dtoProduct){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "UPDATE PRODUCT SET SUPPLIER_ID = ?, PRODUCT_NAME = ?, COUNTRY = ?, ORIGINAL_PRICE = ?, SALE_PRICE = ?, MFG = ?, EXP = ?, PRODUCT_TYPE = ?, VAT = ?, IMPORTED_DATE = ?, IMPORTED_QUANTITY = ?, REMAINING_QUANTITY = ? WHERE PRODUCT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoProduct.getSup_id());
            ps.setString(2, dtoProduct.getName());
            ps.setString(3, dtoProduct.getCountry());
            ps.setLong(4, dtoProduct.getOriginal_price());
            ps.setLong(5, dtoProduct.getSale_price());
            Date sqlMFG = new java.sql.Date(dtoProduct.getMFG().getTime());
            ps.setDate(6, sqlMFG);
            Date sqlEXP = new java.sql.Date(dtoProduct.getEXP().getTime());
            ps.setDate(7, sqlEXP);
            ps.setString(8, dtoProduct.getType());
            ps.setInt(9, dtoProduct.getVAT());
            Date sqlImportedDate = new java.sql.Date(dtoProduct.getImported_date().getTime());
            ps.setDate(10, sqlImportedDate);
            ps.setInt(11, dtoProduct.getImported_quantity());
            ps.setInt(12, dtoProduct.getRemaining_quantity());
            ps.setInt(13, dtoProduct.getPro_id());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean delete(Product_DTO dtoProduct){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "DELETE FROM PRODUCT WHERE PRODUCT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoProduct.getPro_id());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public Product_DTO getInformation(int id){
        Product_DTO dtoProduct = null;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoProduct = new Product_DTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getLong(5), rs.getLong(6), rs.getDate(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getDate(11), rs.getInt(12), rs.getInt(13));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoProduct;
    }
    
    public Product_DTO getProductInfo(Product_DTO dtoProduct){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM PRODUCT WHERE PRODUCT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoProduct.getPro_id());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoProduct = new Product_DTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getLong(5), rs.getLong(6), rs.getDate(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getDate(11), rs.getInt(12), rs.getInt(13));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoProduct;
    }
    
    public ArrayList<Product_DTO> getProductList(){
        ArrayList<Product_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM PRODUCT ORDER BY PRODUCT_ID";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Product_DTO dtoProduct = new Product_DTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getLong(5), rs.getLong(6), rs.getDate(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getDate(11), rs.getInt(12), rs.getInt(13));
                productList.add(dtoProduct);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }
    
    public ArrayList<Product_DTO> getProductList(BillDetails_DTO dtoBillDetails){
        ArrayList<Product_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM PRODUCT P, BILL_DETAILS B WHERE P.PRODUCT_ID = B.PRODUCT_ID AND BILL_ID = ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Product_DTO dtoProduct = new Product_DTO(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getLong(5), rs.getLong(6), rs.getDate(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getDate(11), rs.getInt(12), rs.getInt(13));
                productList.add(dtoProduct);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }
}