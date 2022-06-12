/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Statictis_DTO {
    private int pro_id;
    private int bill_id;
    private Date bill_date;
    private String name;
    private long sale_price;
    private Date imported_date;
    private int imported_quantity;
    private int remaining_quantity;
    private int amount;
    private long totalSoldPro;
    private long tolalTurnover;
    
    public Statictis_DTO(){  
    }
    
    public Statictis_DTO(int pro_id, String name, int imported_quantity) {
        this.pro_id = pro_id;
        this.name = name;
        this.imported_quantity = imported_quantity;
    }

    public Statictis_DTO(int pro_id, String name, Date imported_date, int remaining_quantity) {
        this.pro_id = pro_id;
        this.name = name;
        this.imported_date = imported_date;
        this.remaining_quantity = remaining_quantity;
    }

    public Statictis_DTO(int pro_id, String name, long sale_price, int amount, long totalSoldPro) {
        this.pro_id = pro_id;
        this.name = name;
        this.sale_price = sale_price;
        this.amount = amount;
        this.totalSoldPro = totalSoldPro;
    }

    public Statictis_DTO(int bill_id, Date bill_date, long tolalTurnover) {
        this.bill_id = bill_id;
        this.bill_date = bill_date;
        this.tolalTurnover = tolalTurnover;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public void setBill_date(Date bill_date) {
        this.bill_date = bill_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSale_price(long sale_price) {
        this.sale_price = sale_price;
    }

    public void setImported_date(Date imported_date) {
        this.imported_date = imported_date;
    }

    public void setImported_quantity(int imported_quantity) {
        this.imported_quantity = imported_quantity;
    }

    public void setRemaining_quantity(int remaining_quantity) {
        this.remaining_quantity = remaining_quantity;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTotalSoldPro(long totalSoldPro) {
        this.totalSoldPro = totalSoldPro;
    }

    public void setTolalTurnover(long tolalTurnover) {
        this.tolalTurnover = tolalTurnover;
    }

    public int getPro_id() {
        return pro_id;
    }

    public int getBill_id() {
        return bill_id;
    }

    public Date getBill_date() {
        return bill_date;
    }

    public String getName() {
        return name;
    }

    public long getSale_price() {
        return sale_price;
    }

    public Date getImported_date() {
        return imported_date;
    }

    public int getImported_quantity() {
        return imported_quantity;
    }

    public int getRemaining_quantity() {
        return remaining_quantity;
    }

    public int getAmount() {
        return amount;
    }

    public long getTotalSoldPro() {
        return totalSoldPro;
    }

    public long getTolalTurnover() {
        return tolalTurnover;
    }

    
    
    
}
