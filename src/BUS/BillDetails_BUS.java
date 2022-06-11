package BUS;

import Connection.BillDetails_CON;
import DTO.BillDetails_DTO;
import DTO.Bill_DTO;
import java.util.ArrayList;


public class BillDetails_BUS {
    
    BillDetails_CON conBillDetails = new BillDetails_CON();
    public boolean insert(BillDetails_DTO dtoBillDetails){
        return conBillDetails.insert(dtoBillDetails);
    }
    public boolean update(BillDetails_DTO dtoBillDetails){
        return conBillDetails.update(dtoBillDetails);
    }
    public boolean delete(BillDetails_DTO dtoBillDetails){
        return conBillDetails.delete(dtoBillDetails);
    }
    public BillDetails_DTO getBillDetailsInfo(BillDetails_DTO dtoBillDetails){
        return conBillDetails.getBillDetailsInfo(dtoBillDetails);
    }
    public BillDetails_DTO getBillDetailsInfo(Bill_DTO dtoBill){
        return conBillDetails.getBillDetailsInfo(dtoBill);
    }
    public BillDetails_DTO getInformation(int id){
        return conBillDetails.getInformation(id);
    }
    public BillDetails_DTO getBillDetailsInformation(BillDetails_DTO dtoBillDetails){
        return conBillDetails.getBillDetailsInformation(dtoBillDetails);
    }
    public ArrayList<BillDetails_DTO> getBillDetailsList(int id){
        return conBillDetails.getBillDetailsList(id);
    }
}
