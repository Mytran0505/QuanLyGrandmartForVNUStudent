package BUS;

import Connection.Bill_CON;
import DTO.Bill_DTO;
import java.util.ArrayList;


public class BillManagement_BUS {
    Bill_CON conBill = new Bill_CON();
    public boolean insert(Bill_DTO dtoBill){
        return conBill.insert(dtoBill);
    }
    public boolean update(Bill_DTO dtoBill){
        return conBill.update(dtoBill);
    }
    public boolean delete(Bill_DTO dtoBill){
        return conBill.delete(dtoBill);
    }
    public Bill_DTO getBillInfo(Bill_DTO dtoBill){
        return conBill.getBillInfo(dtoBill);
    }
    public ArrayList<Bill_DTO> getBillList(){
        return conBill.getBillList();
    }
}
