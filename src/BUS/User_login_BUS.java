package BUS;

import Connection.Employee_CON;
import Connection.User_login_CON;
import DTO.Employee_DTO;
import DTO.User_login_DTO;
import java.util.ArrayList;


public class User_login_BUS {
    User_login_CON conUserLogin = new User_login_CON();
    Employee_CON conEmployee = new Employee_CON();
    public User_login_DTO getUserLogin(String username){
        return conUserLogin.getUserLogin(username);
    }
    public User_login_DTO getUserLogin(Employee_DTO dtoEmployee){
        return conUserLogin.getUserLogin(dtoEmployee);
    }
    public Employee_DTO getEmployeeInfo(User_login_DTO dtoUserLogin){
        return conEmployee.getEmployeeInfo(dtoUserLogin);
    }
    public String getRole(User_login_DTO dtoUserLogin){
        return conEmployee.getRole(dtoUserLogin);
    }
    public ArrayList<User_login_DTO> getUserLoginList(){
        return conUserLogin.getUserLoginList();
    }
}

