package BUS;

import Connection.Employee_CON;
import DTO.Employee_DTO;
import java.util.ArrayList;


public class EmployeeManagement_BUS {
    Employee_CON conEmployee = new Employee_CON();
    public boolean insert(Employee_DTO dtoEmployee){
        return conEmployee.insert(dtoEmployee);
    }
    public boolean update(Employee_DTO dtoEmployee){
        return conEmployee.update(dtoEmployee);
    }
    public boolean delete(Employee_DTO dtoEmployee){
        return conEmployee.delete(dtoEmployee);
    }
    public Employee_DTO getInformation(int id){
        return conEmployee.getInformation(id);
    }
    public ArrayList<Employee_DTO> getEmployeeList(){
        return conEmployee.getEmployeeList();
    }
}
