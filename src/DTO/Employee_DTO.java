package DTO;

import java.util.Date;


public class Employee_DTO {
    private int id;
    private String firstname, lastname, gender;
    private Date birthday;
    private String phone, address;
    private Date start_date;
    private long salary;
    private int emp_id;
    private String role;

    public Employee_DTO() {
    }

    public Employee_DTO(int id, String firstname, String lastname, String gender, Date birthday, String phone, String address, Date start_date, long salary, int emp_id, String role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.start_date = start_date;
        this.salary = salary;
        this.emp_id = emp_id;
        this.role = role;
    }

    public Employee_DTO(int id, String firstname, String lastname, String gender, Date birthday, String phone, String address, Date start_date, long salary, String role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.start_date = start_date;
        this.salary = salary;
        this.role = role;
    }
    

    public Employee_DTO(int id) {
        this.id = id;
    }

    public Employee_DTO(int aInt, String string, String string0, String string1, java.sql.Date date, String string2, String string3, java.sql.Date date0, int aInt0, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(int id) {
        this.id = id;
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

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
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

    public Date getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Date getStart_date() {
        return start_date;
    }

    public long getSalary() {
        return salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getRole() {
        return role;
    }
    
}
