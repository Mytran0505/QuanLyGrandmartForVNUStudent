package BUS;

import Connection.Product_CON;
import DTO.Product_DTO;
import java.util.ArrayList;

public class ProductManagement_BUS {
    Product_CON conProduct = new Product_CON();
    public boolean insert(Product_DTO dtoProduct){
        return conProduct.insert(dtoProduct);
    }
    public boolean update(Product_DTO dtoProduct){
        return conProduct.update(dtoProduct);
    }
    public boolean delete(Product_DTO dtoProduct){
        return conProduct.delete(dtoProduct);
    }
    public Product_DTO getInformation(int id){
        return conProduct.getInformation(id);
    }
    public ArrayList<Product_DTO> getProductList(){
        return conProduct.getProductList();
    }
    public Product_DTO getProductInfo(Product_DTO dtoProduct){
        return conProduct.getProductInfo(dtoProduct);
    }    
}
