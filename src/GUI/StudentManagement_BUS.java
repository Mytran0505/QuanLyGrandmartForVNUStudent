
package BUS;

import Connection.Student_CON;
import DTO.Student_DTO;
import java.util.ArrayList;

public class StudentManagement_BUS {
    Student_CON conStudent = new Student_CON();
    public boolean insert(Student_DTO dtoStudent){
        return conStudent.insert(dtoStudent);
    }
    public boolean update(Student_DTO dtoStudent){
        return conStudent.update(dtoStudent);
    }
    public boolean delete(Student_DTO dtoStudent){
        return conStudent.delete(dtoStudent);
    }
    public Student_DTO getInformation(int id){
        return conStudent.getInformation(id);
    }
    public ArrayList<Student_DTO> getStudentList(){
        return conStudent.getStudentList();
    }
    public Student_DTO getStudentInfo(Student_DTO dtoStudent){
        return conStudent.getStudentInfo(dtoStudent);
    }
}
