
package DTO;

import java.util.Date;

public class Student_DTO {
    private int studentid;
    private String firstname, lastname, gender, address, phone;
    private Date birthday;
    private Date registrationdate;
    private int spentmoney;
    private int point;
    private String schoolname;
    
    public Student_DTO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    public Student_DTO(int studentid, String firstname, String lastname, String gender, String address, String phone, Date birthday, Date registrationdate, int spentmoney, int point, String schoolname) {
        this.studentid = studentid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.birthday = birthday;
        this.registrationdate = registrationdate;
        this.spentmoney = spentmoney;
        this.point = point;
        this.schoolname = schoolname;

    }

  

    public Student_DTO(int id) {
        this.studentid = id;
    }


    public void setStudentID(int studentid) {
        this.studentid = studentid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public void setRegistrationDate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public void setSpentMoney(int spentmoney) {
        this.spentmoney = spentmoney;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    
    public void setSchoolName(String schoolname) {
        this.schoolname = schoolname;
    }

    public int getStudentID() {
        return studentid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getRegistrationDate() {
        return registrationdate;
    }

    public int getSpentMoney() {
        return spentmoney;
    }

    public int getPoint() {
        return point;
    }
    
    public String getSchoolName() {
        return schoolname;
    }
}
