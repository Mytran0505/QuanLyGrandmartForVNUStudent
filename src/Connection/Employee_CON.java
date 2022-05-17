package Connection;

import DTO.Employee_DTO;
import DTO.User_login_DTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Employee_CON {
    public boolean insert(Employee_DTO dtoEmployee){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "INSERT INTO EMPLOYEE (EMP_ID, FIRST_NAME, LAST_NAME, GENDER, BIRTHDAY, PHONE, ADDRESS, START_DATE, SALARY, EMP_LOGIN_ID, ROLE)"
                    + "VALUES (EMPLOYEE_ID_SEQUENCE.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dtoEmployee.getFirstname());
            ps.setString(2, dtoEmployee.getLastname());
            ps.setString(3, dtoEmployee.getGender());
            Date sqlBirthday = new java.sql.Date(dtoEmployee.getBirthday().getTime());
            ps.setDate(4, sqlBirthday);
            ps.setString(5, dtoEmployee.getPhone());
            ps.setString(6, dtoEmployee.getAddress());
            Date sqlStartDate = new java.sql.Date(dtoEmployee.getStart_date().getTime());
            ps.setDate(7, sqlStartDate);
            ps.setLong(8, dtoEmployee.getSalary());
            ps.setInt(9, dtoEmployee.getEmp_id());
            ps.setString(10, dtoEmployee.getRole());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean update(Employee_DTO dtoEmployee){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "UPDATE EMPLOYEE SET FIRST_NAME = ?, LAST_NAME = ?, GENDER = ?, BIRTHDAY = ?, PHONE = ?, ADDRESS = ?, START_DATE = ?, SALARY = ?, EMP_LOGIN_ID = ?, ROLE = ? WHERE EMPLOYEE_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dtoEmployee.getFirstname());
            ps.setString(2, dtoEmployee.getLastname());
            ps.setString(3, dtoEmployee.getGender());
            Date sqlBirthday = new java.sql.Date(dtoEmployee.getBirthday().getTime());
            ps.setDate(4, sqlBirthday);
            ps.setString(5, dtoEmployee.getPhone());
            ps.setString(6, dtoEmployee.getAddress());
            Date sqlStartDate = new java.sql.Date(dtoEmployee.getStart_date().getTime());
            ps.setDate(7, sqlStartDate);
            ps.setLong(8, dtoEmployee.getSalary());
            ps.setInt(9, dtoEmployee.getEmp_id());
            ps.setString(10, dtoEmployee.getRole());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean delete(Employee_DTO dtoEmployee){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "DELETE FROM EMPLOYEE WHERE EMP_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoEmployee.getId());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public Employee_DTO getInformation(int id){
        Employee_DTO dtoEmployee = null;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoEmployee = new Employee_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getLong(9), rs.getInt(10), rs.getString(11));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoEmployee;
    }
    
    public Employee_DTO getEmployeeInfo(Employee_DTO dtoEmployee){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoEmployee = new Employee_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getLong(9), rs.getInt(10), rs.getString(11));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoEmployee;
    }
    
    public Employee_DTO getEmployeeInfo(User_login_DTO dtoUserLogin){
        try {
            Connection con = DBConnection.getDBConnection();
            Employee_DTO dtoEmployee = null;
            String SQL = "SELECT * FROM EMPLOYEE WHERE EMP_LOGIN_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoUserLogin.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoEmployee = new Employee_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getLong(9), rs.getInt(10), rs.getString(11));
            }
            con.close();
            return dtoEmployee;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public String getRole(User_login_DTO dtoUserLogin){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT ROLE FROM EMPLOYEE WHERE EMP_LOGIN_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoUserLogin.getId());
            ResultSet rs = ps.executeQuery();
            String role = "";
            while(rs.next()){
                role = rs.getString(1);
            }
            con.close();
            return role;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public ArrayList<Employee_DTO> getEmployeeList(){
        ArrayList<Employee_DTO> employeeList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM EMPLOYEE ORDER BY EMP_ID";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Employee_DTO dtoEmployee = new Employee_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getDate(8), rs.getLong(9), rs.getInt(10), rs.getString(11));
                employeeList.add(dtoEmployee);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return employeeList;
    }
}
