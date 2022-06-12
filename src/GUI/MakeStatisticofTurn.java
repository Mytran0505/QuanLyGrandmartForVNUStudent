/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.MakeStatistic_BUS;
import DTO.Employee_DTO;
import DTO.Statictis_DTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MakeStatisticofTurn extends javax.swing.JFrame {
    ArrayList<Statictis_DTO> list = new ArrayList<>();
    MakeStatistic_BUS busMakeStatistic = new MakeStatistic_BUS();    Employee_DTO dtoManager = null;
    public MakeStatisticofTurn(Employee_DTO manager) {
        initComponents();
        dtoManager = manager;
        setResizable(false);
        setLocationRelativeTo(null);
        createTable();
    }
    DefaultTableModel tblStatisticsModel;
    public void createTable(){
        tblStatisticsModel = new DefaultTableModel();
        //Tạo bảng
        String title[] = {"Bill ID", "Bill Date","Total money"};
        tblStatisticsModel.setColumnIdentifiers(title);
        tblStatisticsModel.setRowCount(0);
        tblStatistics.setModel(tblStatisticsModel);
        //cho phép sắp xếp từng cột
        tblStatistics.setAutoCreateRowSorter(true);
        //không cho sửa dữ liệu trong bảng
        tblStatistics.setEnabled(false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_turnback = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStatistics = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        dcStartDate = new com.toedter.calendar.JDateChooser();
        dcEndDate = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_MakeStatistics = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MakeStatisticsOfTurnover");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/statistic.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 120));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("MAKE STATISTIC OF TURNOVER");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 0, 418, 120));

        btn_turnback.setBackground(new java.awt.Color(239, 250, 252));
        btn_turnback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_turnback.setForeground(new java.awt.Color(0, 0, 0));
        btn_turnback.setText("Turn back to home"); // NOI18N
        btn_turnback.setFocusTraversalPolicyProvider(true);
        btn_turnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btn_turnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 120));

        jPanel2.setBackground(new java.awt.Color(239, 250, 252));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Start date:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, 112, 38));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("End date:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 35, -1, 37));

        tblStatistics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"B1", "01/05/2022", "157000"},
                {"B2", "01/05/2022", "14000"},
                {"B3", "01/05/2022", "42000"},
                {"B4", "01/05/2022", "88500"},
                {"B5", "01/05/2022", "240900"}
            },
            new String [] {
                "Bill ID", "Bill date", "Total money"
            }
        ));
        jScrollPane1.setViewportView(tblStatistics);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 758, 180));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total turnover:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, 33));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.setText("0");
        jTextField3.setBorder(null);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 164, 33));

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Export PDF");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 343, 165, 59));

        dcStartDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(dcStartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 34, 181, 38));

        dcEndDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(dcEndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 35, 181, 37));

        jPanel3.setBackground(new java.awt.Color(239, 252, 250));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Make statistics");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 80));

        btn_MakeStatistics.setBackground(new java.awt.Color(51, 204, 255));
        btn_MakeStatistics.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_MakeStatistics.setForeground(new java.awt.Color(255, 255, 255));
        btn_MakeStatistics.setBorder(null);
        btn_MakeStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MakeStatisticsActionPerformed(evt);
            }
        });
        jPanel3.add(btn_MakeStatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 820, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_turnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turnbackActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Confirm", "Do you want to turn back?", JOptionPane.YES_NO_OPTION);
        if(ret == JOptionPane.YES_OPTION)
        {
            setVisible(false);
            ManagerHome home = new ManagerHome(dtoManager);
            home.setVisible(true);
        }
    }//GEN-LAST:event_btn_turnbackActionPerformed

    private void btn_MakeStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MakeStatisticsActionPerformed
        // TODO add your handling code here:
         if(dcStartDate.getCalendar() == null || dcEndDate.getCalendar()==null)
            JOptionPane.showMessageDialog(this, "Required start/end date are empty", "Please enter product id!", JOptionPane.ERROR_MESSAGE);
        else{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            tblStatisticsModel.setRowCount(0);
            list = busMakeStatistic.MakeStatisticsOfTurnover(sdf.format(dcStartDate.getDate()), sdf.format(dcEndDate.getDate()));
            //Load employee information into the table
            for(int i = 0; i < list.size(); i++){
                Statictis_DTO dtoStatistics = list.get(i);
                String[] rows = {String.valueOf(dtoStatistics.getBill_id()),dtoStatistics.getBill_date().toString(),String.valueOf(dtoStatistics.getTolalTurnover())}; 
                tblStatisticsModel.addRow(rows);
            }
            if(tblStatisticsModel.getRowCount() < 1){
                JOptionPane.showMessageDialog(this, "No match result.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_MakeStatisticsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_MakeStatistics;
    private javax.swing.JButton btn_turnback;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dcEndDate;
    private com.toedter.calendar.JDateChooser dcStartDate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblStatistics;
    // End of variables declaration//GEN-END:variables
}
