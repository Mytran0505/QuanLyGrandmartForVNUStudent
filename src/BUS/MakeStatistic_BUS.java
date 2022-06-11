/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import Connection.MakeStatistic_CON;
import DTO.Statictis_DTO;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class MakeStatistic_BUS {
        MakeStatistic_CON conMakeStatistic = new MakeStatistic_CON();
        public ArrayList<Statictis_DTO> getProductListForMakeStatisticsImported(java.sql.Date date1){
            return conMakeStatistic.getProductListForMakeStatisticsImported(date1);
        }
        public ArrayList<Statictis_DTO> getAllProductListForMakeStatisticsInventory(){
            return conMakeStatistic.getAllProductListForMakeStatisticsInventory();
        }
        public ArrayList<Statictis_DTO> EachProductForMakeStatistcisOfInventory(int id){
            return conMakeStatistic.EachProductForMakeStatistcisOfInventory(id);
        }
        public ArrayList<Statictis_DTO> getAllProductForMakeStatisticsSold(java.sql.Date date1, java.sql.Date date2){
            return conMakeStatistic.getAllProductForMakeStatisticsSold(date1, date2);
        }
        public ArrayList<Statictis_DTO> getEachProductForMakeStatisticsSold(int id, java.sql.Date date1, java.sql.Date date2){
            return conMakeStatistic.getEachProductForMakeStatisticsSold(id, date1, date2);
        }
        public ArrayList<Statictis_DTO> MakeStatisticsOfTurnover(java.sql.Date date1, java.sql.Date date2){
            return conMakeStatistic.MakeStatisticsOfTurnover(date1, date2);
        }


}
