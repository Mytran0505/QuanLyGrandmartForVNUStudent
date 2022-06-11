package Connection;

import DTO.Student_DTO;
import DTO.User_login_DTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Student_CON {
     public boolean insert(Student_DTO dtoStudent){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "INSERT INTO STUDENT (STUDENT_ID, FIRST_NAME, LAST_NAME, GENDER, ADDRESS, PHONE, BIRTHDAY, REG_DATE, SPENT_MONEY, POINT, SCHOOL_NAME)"
                    + "VALUES (STUDENT_ID_SEQUENCE.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dtoStudent.getFirstname());
            ps.setString(2, dtoStudent.getLastname());
            ps.setString(3, dtoStudent.getGender());
            ps.setString(4, dtoStudent.getAddress());
            ps.setString(5, dtoStudent.getPhone());
            Date sqlBirthday = new java.sql.Date(dtoStudent.getBirthday().getTime());
            ps.setDate(6, sqlBirthday);
            Date sqlRegistrationDate = new java.sql.Date(dtoStudent.getRegistrationDate().getTime());
            ps.setDate(7, sqlRegistrationDate);
            ps.setInt(8, dtoStudent.getSpentMoney());
            ps.setInt(9, dtoStudent.getPoint());
            ps.setString(10, dtoStudent.getSchoolName());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean update(Student_DTO dtoStudent){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "UPDATE STUDENT SET FIRST_NAME = ?, LAST_NAME = ?, GENDER = ?, ADDRESS = ?, PHONE = ?, BIRTHDAY = ?, REG_DATE = ?, SPENT_MONEY = ?, POINT = ?, SCHOOL_NAME = ? WHERE STUDENT_ID = ?";
            
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dtoStudent.getFirstname());
            ps.setString(2, dtoStudent.getLastname());
            ps.setString(3, dtoStudent.getGender());
            ps.setString(4, dtoStudent.getAddress());
            ps.setString(5, dtoStudent.getPhone());
            Date sqlBirthday = new java.sql.Date(dtoStudent.getBirthday().getTime());
            ps.setDate(6, sqlBirthday);
            Date sqlRegistrationDate = new java.sql.Date(dtoStudent.getRegistrationDate().getTime());
            ps.setDate(7, sqlRegistrationDate);
            ps.setInt(8, dtoStudent.getSpentMoney());
            ps.setInt(9, dtoStudent.getPoint());
            ps.setString(10, dtoStudent.getSchoolName());
            ps.setInt(11, dtoStudent.getStudentID());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public boolean delete(Student_DTO dtoStudent){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "DELETE FROM STUDENT WHERE STUDENT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoStudent.getStudentID());
            ps.executeUpdate();
            con.close();
            return true;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
    
    public Student_DTO getInformation(int id){
        Student_DTO dtoStudent = null;
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoStudent = new Student_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getInt(10), rs.getString(11));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoStudent;
    }
    
    public Student_DTO getStudentInfo(Student_DTO dtoStudent){
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoStudent.getStudentID());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoStudent = new Student_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getInt(10), rs.getString(11));
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return dtoStudent;
    }
    
    public Student_DTO getStudentInfo(User_login_DTO dtoUserLogin){
        try {
            Connection con = DBConnection.getDBConnection();
            Student_DTO dtoStudent = null;
            String SQL = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, dtoUserLogin.getId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                dtoStudent = new Student_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getInt(10), rs.getString(11));
            }
            con.close();
            return dtoStudent;
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    
    public ArrayList<Student_DTO> getStudentList(){
        ArrayList<Student_DTO> studentList = new ArrayList<>();
        try {
            Connection con = DBConnection.getDBConnection();
            String SQL = "SELECT * FROM STUDENT ORDER BY LAST_NAME";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Student_DTO dtoStudent = new Student_DTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getDate(8), rs.getInt(9), rs.getInt(10), rs.getString(11));
                studentList.add(dtoStudent);
            }
            con.close();
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return studentList;
    }
}
