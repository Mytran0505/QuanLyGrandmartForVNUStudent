package Connection;

import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BillDetails_CON {
    
    public boolean insert(BillDetails_DTO dtoBillDetails){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "INSERT INTO BILL_DETAILS(BILL_ID, PRODUCT_ID, AMOUNT)" + "VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getId());
            ps.setInt(2, dtoBillDetails.getPro_id());
            ps.setInt(3, dtoBillDetails.getAmount());
            ps.executeUpdate();
            con.close();
            return true;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean update(BillDetails_DTO dtoBillDetails){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "UPDATE BILL_DETAILS SET AMOUNT = ? WHERE BILL_ID = ? AND PRODUCT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getAmount());
            ps.setInt(2, dtoBillDetails.getId());
            ps.setInt(3, dtoBillDetails.getPro_id());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean delete(BillDetails_DTO dtoBillDetails){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "DELETE FROM BILL_DETAILS WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getId());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public BillDetails_DTO getBillDetailsInfo(BillDetails_DTO dtoBillDetails){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM BILL_DETAILS WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoBillDetails = new BillDetails_DTO(rs.getInt(1), rs.getInt(2), rs.getInt(3));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoBillDetails;
    }
    
    public BillDetails_DTO getBillDetailsInfo(Bill_DTO dtoBill){
        BillDetails_DTO dtoBillDetails = null;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT BILL_ID FROM BILL WHERE ROWNUM = 1 ORDER BY BILL_ID DESC";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoBillDetails = new BillDetails_DTO(rs.getInt(1));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoBillDetails;
    }
    
    public BillDetails_DTO getBillDetailsInformation(BillDetails_DTO dtoBillDetails){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM BILL_DETAILS WHERE PRODUCT_ID = ? AND AMOUNT = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoBillDetails.getPro_id());
            ps.setInt(2, dtoBillDetails.getAmount());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoBillDetails = new BillDetails_DTO(rs.getInt(1), rs.getInt(2), rs.getInt(3));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoBillDetails;
    }
    
    public BillDetails_DTO getInformation(int id){
        BillDetails_DTO dtoBillDetails = null;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM BILL_DETAILS WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoBillDetails = new BillDetails_DTO(rs.getInt(1), rs.getInt(2), rs.getInt(3));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoBillDetails;
    }
    
    public ArrayList<BillDetails_DTO> getBillDetailsList(int id){
        ArrayList<BillDetails_DTO> billDetailsList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM BILL_DETAILS WHERE BILL_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BillDetails_DTO dtoBillDetails = new BillDetails_DTO(rs.getInt(1), rs.getInt(2), rs.getInt(3));
                billDetailsList.add(dtoBillDetails);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return billDetailsList;
    }
}
