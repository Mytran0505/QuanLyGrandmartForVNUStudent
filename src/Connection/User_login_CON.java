package Connection;

import DTO.Employee_DTO;
import DTO.User_login_DTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class User_login_CON {
    public User_login_DTO getUserLogin(String username){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM USER_LOGIN WHERE USER_NAME = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            User_login_DTO dtoUserLogin = null;
            while(rs.next()){
                dtoUserLogin = new User_login_DTO(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            con.close();
            return dtoUserLogin;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public User_login_DTO getUserLogin(Employee_DTO dtoEmployee){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM USER_LOGIN WHERE USER_LOGIN_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoEmployee.getEmp_id());
            ResultSet rs = ps.executeQuery();
            User_login_DTO dtoUserLogin = null;
            while(rs.next()){
                dtoUserLogin = new User_login_DTO(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
            con.close();
            return dtoUserLogin;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public ArrayList<User_login_DTO> getUserLoginList(){
        ArrayList<User_login_DTO> UserLoginList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM USER_LOGIN ORDER BY USER_LOGIN_ID";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                User_login_DTO dtoUserLogin = new User_login_DTO(rs.getInt(1), rs.getString(2), rs.getString(3));
                UserLoginList.add(dtoUserLogin);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return UserLoginList;
    }
}
