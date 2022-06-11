package DTO;

import java.util.Date;


public class Bill_DTO {
    private int id, emp_id, cash_id, stu_id;
    private Date bill_date;
    private float total_money; 

    public Bill_DTO() {
    }

    public Bill_DTO(int id, int emp_id, int cash_id, int stu_id, Date bill_date, float total_money) {
        this.id = id;
        this.emp_id = emp_id;
        this.cash_id = cash_id;
        this.stu_id = stu_id;
        this.bill_date = bill_date;
        this.total_money = total_money;
    }

    public Bill_DTO(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setCash_id(int cash_id) {
        this.cash_id = cash_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public void setTotal_money(float total_money) {
        this.total_money = total_money;
    }

    public int getId() {
        return id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public int getCash_id() {
        return cash_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public float getTotal_money() {
        return total_money;
    }
    
}
