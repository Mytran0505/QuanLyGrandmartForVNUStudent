package Connection;

import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import DTO.Product_DTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Bill_CON {
    
    public boolean insert(Bill_DTO dtoBill){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "INSERT INTO BILL (BILL_ID, EMP_ID, CASHIER_COUNTER_ID, STUDENT_ID, BILL_DATE, TOTAL_MONEY)"
                    + "VALUES (BILL_ID_SEQUENCE.NEXTVAL, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBill.getEmp_id());
            ps.setInt(2, dtoBill.getCash_id());
            ps.setInt(3, dtoBill.getStu_id());
            Date sqlBillDate = new java.sql.Date(dtoBill.getBill_date().getTime());
            ps.setDate(4, sqlBillDate);
            ps.setLong(5, dtoBill.getTotal_money());
            ps.executeUpdate();
            ps.close();
            con.close();
            return true;
        } 
        catch (SQLException e) {
        }
        return false;
    }
    
    public boolean update(Bill_DTO dtoBill){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "UPDATE BILL SET EMP_ID = ?, CASHIER_COUNTER_ID = ?, STUDENT_ID = ?, BILL_DATE = ?, TOTAL_MONEY = ? WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBill.getEmp_id());
            ps.setInt(2, dtoBill.getCash_id());
            ps.setInt(3, dtoBill.getStu_id());
            Date sqlBillDate = new java.sql.Date(dtoBill.getBill_date().getTime());
            ps.setDate(4, sqlBillDate);
            ps.setLong(5, dtoBill.getTotal_money());
            ps.setInt(6, dtoBill.getId());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean delete(Bill_DTO dtoBill){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "DELETE FROM BILL WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBill.getId());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public Bill_DTO getBillInfo(Bill_DTO dtoBill){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM BILL WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBill.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoBill = new Bill_DTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getLong(6));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoBill;
    }
    
    public Bill_DTO getInformation(int id){
        Bill_DTO dtoBill = null;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM BILL WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoBill = new Bill_DTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getLong(6));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoBill;
    }
    
    public ArrayList<Bill_DTO> getBillList(){
        ArrayList<Bill_DTO> billList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM BILL ORDER BY BILL_ID";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Bill_DTO dtoBill = new Bill_DTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getLong(6));
                billList.add(dtoBill);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return billList;
    }
    
    public Long sumUp(BillDetails_DTO dtoBillDetails, Product_DTO dtoProduct){
        long sumUp = 0;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT SUM(AMOUNT*SALE_PRICE*(1+VAT/100))\n" +
                        "FROM BILL_DETAILS BD, PRODUCT P\n" +
                        "WHERE BD.PRODUCT_ID = P.PRODUCT_ID AND BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sumUp = rs.getLong(1);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return sumUp;
    }
    
    public Long getTotalMoney(BillDetails_DTO dtoBillDetails, Product_DTO dtoProduct){
        long totalMoney = 0;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT SUM(AMOUNT*SALE_PRICE*(1+VAT/100)*(1-0.05))\n" +
                        "FROM BILL_DETAILS BD, PRODUCT P\n" +
                        "WHERE BD.PRODUCT_ID = P.PRODUCT_ID AND BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                totalMoney = rs.getLong(1);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return totalMoney;
    }
}
