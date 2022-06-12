/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import DTO.Statictis_DTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author 20520322
 */
public class MakeStatistic_CON {  
    
    public ArrayList<Statictis_DTO> getProductListForMakeStatisticsImported(String date){
        ArrayList<Statictis_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT PRODUCT_ID, PRODUCT_NAME,IMPORTED_QUANTITY FROM PRODUCT WHERE IMPORTED_DATE = TO_DATE(?, 'yyyy-MM-dd')";
            PreparedStatement ps = con.prepareStatement(SQL);        
            ps.setString(1, date); 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Statictis_DTO dtoPro = new Statictis_DTO(rs.getInt(1), rs.getString(2), rs.getInt(3));
                productList.add(dtoPro);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }  
    public ArrayList<Statictis_DTO> getAllProductListForMakeStatisticsInventory(){
        ArrayList<Statictis_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT PRODUCT_ID, PRODUCT_NAME, IMPORTED_DATE, REMAINING_QUANTITY FROM PRODUCT ORDER BY PRODUCT_ID";
            PreparedStatement ps = con.prepareStatement(SQL);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Statictis_DTO dtoPro = new Statictis_DTO(rs.getInt(1), rs.getString(2),rs.getDate(3), rs.getInt(4));
                productList.add(dtoPro);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }

    public ArrayList<Statictis_DTO> EachProductForMakeStatistcisOfInventory(int id){
        ArrayList<Statictis_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT PRODUCT_ID, PRODUCT_NAME, IMPORTED_DATE, REMAINING_QUANTITY FROM PRODUCT WHERE PRODUCT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Statictis_DTO dtoPro = new Statictis_DTO(rs.getInt(1), rs.getString(2),rs.getDate(3), rs.getInt(4));
                productList.add(dtoPro);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }    

 
    
    public ArrayList<Statictis_DTO> getAllProductForMakeStatisticsSold(String date1, String date2){
        ArrayList<Statictis_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL =    "SELECT P.PRODUCT_ID, PRODUCT_NAME, SALE_PRICE, SUM(AMOUNT), SUM(AMOUNT)*SALE_PRICE\n" +
                            "FROM PRODUCT P, BILL_DETAILS BD, BILL B\n" +
                            "WHERE P.PRODUCT_ID = BD.PRODUCT_ID AND BD.BILL_ID = B.BILL_ID\n" +
                            "      AND BILL_DATE BETWEEN TO_DATE(?, 'yyyy-MM-dd') and TO_DATE(?, 'yyyy-MM-dd')\n" +
                            "GROUP BY P.PRODUCT_ID, PRODUCT_NAME, SALE_PRICE\n" +
                            "ORDER BY  P.PRODUCT_ID";
            PreparedStatement ps = con.prepareStatement(SQL);     
            ps.setString(1, date1); 
            ps.setString(2, date2); 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Statictis_DTO dtoStatistics = new Statictis_DTO(rs.getInt(1), rs.getString(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                productList.add(dtoStatistics);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }  
    
    public ArrayList<Statictis_DTO> getEachProductForMakeStatisticsSold(int id, String date1, String date2){
        ArrayList<Statictis_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL =    "SELECT P.PRODUCT_ID, PRODUCT_NAME, SALE_PRICE, SUM(AMOUNT), SUM(AMOUNT)*SALE_PRICE\n" +
                            "FROM PRODUCT P, BILL_DETAILS BD, BILL B\n" +
                            "WHERE P.PRODUCT_ID = BD.PRODUCT_ID AND BD.BILL_ID = B.BILL_ID AND P.PRODUCT_ID = ? \n" +
                            "      AND BILL_DATE BETWEEN TO_DATE(?, 'yyyy-MM-dd') and TO_DATE(?, 'yyyy-MM-dd')\n" +
                            "GROUP BY P.PRODUCT_ID, PRODUCT_NAME, SALE_PRICE\n" +
                            "ORDER BY  P.PRODUCT_ID";
            PreparedStatement ps = con.prepareStatement(SQL);    
            ps.setInt(1, id);
            ps.setString(2, date1); 
            ps.setString(3, date2); 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Statictis_DTO dtoStatistics = new Statictis_DTO(rs.getInt(1), rs.getString(2), rs.getLong(3), rs.getInt(4), rs.getLong(5));
                productList.add(dtoStatistics);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }  
public ArrayList<Statictis_DTO> MakeStatisticsOfTurnover(String date1, String date2){
        ArrayList<Statictis_DTO> productList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL ="SELECT BILL_ID, BILL_DATE, TOTAL_MONEY FROM BILL WHERE BILL_DATE BETWEEN TO_DATE(?, 'yyyy-MM-dd') and TO_DATE(?, 'yyyy-MM-dd')";
            PreparedStatement ps = con.prepareStatement(SQL);     
            ps.setString(1, date1); 
            ps.setString(2, date2); 
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Statictis_DTO dtoStatistics = new Statictis_DTO(rs.getInt(1), rs.getDate(2),rs.getLong(3));
                productList.add(dtoStatistics);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return productList;
    }  
    
}
