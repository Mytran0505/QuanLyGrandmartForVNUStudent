
package DTO;

import java.util.Date;

public class Product_DTO {
    private int pro_id;
    private int sup_id;
    private String name;
    private String country;
    private long original_price;
    private long sale_price;
    private Date MFG;
    private Date EXP;
    private String type;
    private int VAT;
    private Date imported_date;
    private int imported_quantity;
    private int remaining_quantity;
    
    public Product_DTO(){
        
    }
    
    public Product_DTO(int pro_id, int sup_id, String name, String country, long original_price, long sale_price, Date MFG, Date EXP, String type, int VAT, Date imported_date, int imported_quantity, int remaining_quantity){
        this.pro_id = pro_id;
        this.sup_id = sup_id;
        this.name = name;
        this.country = country;
        this.original_price = original_price;
        this.sale_price = sale_price;
        this.MFG = MFG;
        this.EXP = EXP;
        this.type = type;
        this.VAT = VAT;
        this.imported_date = imported_date;
        this.imported_quantity = imported_quantity;
        this.remaining_quantity = remaining_quantity;
    }
    
    public Product_DTO(int pro_id, int sup_id, String name, String country, long original_price, long sale_price, Date MFG, String type, int VAT, Date imported_date, int remaining_quantity, int imported_quantity){
        this.pro_id = pro_id;
        this.sup_id = sup_id;
        this.name = name;
        this.country = country;
        this.original_price = original_price;
        this.sale_price = sale_price;
        this.MFG = MFG;
        this.type = type;
        this.VAT = VAT;
        this.imported_date = imported_date;
        this.imported_quantity = imported_quantity;
        this.remaining_quantity = remaining_quantity;
    }
    
    public Product_DTO(int pro_id){
        this.pro_id = pro_id;
    }
    
    public Product_DTO(int int0, int int1, String string0, String string1, long long0, long long1, java.sql.Date date0, String string2, int int2, java.sql.Date date1, int int3, int int4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setPro_id(int pro_id){
        this.pro_id = pro_id;
    }
    
    public void setSup_id(int sup_id){
        this.sup_id = sup_id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCountry(String country){
        this.country = country;
    }
    
    public void setOriginal_price(long original_price){
        this.original_price = original_price;
    }
    
    public void setSale_price(long sale_price){
        this.sale_price = sale_price;
    }
    
    public void setMFG(Date MFG){
        this.MFG = MFG;
    }
    
    public void setEXP(Date EXP){
        this.EXP = EXP;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setVAT(int VAT){
        this.VAT = VAT;
    }
    
    public void setImported_date(Date imported_date){
        this.imported_date = imported_date;
    }
    
    public void setImported_quantity(int imported_quantity){
        this.imported_quantity = imported_quantity;
    }
    
    public void setRemaining_quantity(int remaining_quantity){
        this.remaining_quantity = remaining_quantity;
    }
    
    public int getPro_id(){
        return pro_id;
    }
    
    public int getSup_id(){
        return sup_id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCountry(){
        return country;
    }
    
    public long getOriginal_price(){
        return original_price;
    }
    
    public long getSale_price(){
        return sale_price;
    }
    
    public Date getMFG(){
        return MFG;
    }
    
    public Date getEXP(){
        return EXP;
    }
    
    public String getType(){
        return type;
    }
    
    public int getVAT(){
        return VAT;
    }
    
    public Date getImported_date(){
        return imported_date;
    }
    
    public int getImported_quantity(){
        return imported_quantity;
    }
    
    public int getRemaining_quantity(){
        return remaining_quantity;
    }
}
