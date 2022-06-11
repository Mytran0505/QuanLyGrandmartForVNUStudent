package DTO;


public class BillDetails_DTO {
    private int id, pro_id;
    private int amount;

    public BillDetails_DTO() {
    }

    public BillDetails_DTO(int id) {
        this.id = id;
    }
    public BillDetails_DTO(int pro_id, int amount){
        this.pro_id = pro_id;
        this.amount = amount;
    }

    public BillDetails_DTO(int id, int pro_id, int amount) {
        this.id = id;
        this.pro_id = pro_id;
        this.amount = amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public int getAmount() {
        return amount;
    }
    
}
