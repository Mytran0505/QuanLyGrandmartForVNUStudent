package BUS;

import Connection.Bill_CON;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import DTO.Product_DTO;
import java.util.ArrayList;
//import Connection.Report.iTextPDF_CON;


public class BillManagement_BUS {
    Bill_CON conBill = new Bill_CON();
    //iTextPDF_CON conReport = new iTextPDF_CON();
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
    public Long sumUp(BillDetails_DTO dtoBillDetails, Product_DTO dtoProduct){
        return conBill.sumUp(dtoBillDetails, dtoProduct);
    }
    public Long getTotalMoney(BillDetails_DTO dtoBillDetails, Product_DTO dtoProduct){
        return conBill.getTotalMoney(dtoBillDetails, dtoProduct);
    }
    public void printBill(Bill_DTO dtoBill){
        //conReport.printBill(dtoBill);
    }
}
