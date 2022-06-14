package Connection.Report;

import Connection.DBConnection;
import DTO.Bill_DTO;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.Document;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class iTextPDF_CON {
    public void printBill(Bill_DTO dtoBill){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Document document = new Document(PageSize.A5);
        Date date = new Date();
        String filename = "Hoa don ngay " + sdf.format(date) + "_" + dtoBill.getId();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\Java\\"+ filename + ".pdf"));
            document.open();
            File filefontTieuDe = new File("D:\\Java\\DoAn\\src\\Connection\\Report\\fonts\\vuArialBold.ttf");
            BaseFont bfTieuDe = BaseFont.createFont(filefontTieuDe.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontTieuDe1 = new Font(bfTieuDe, 16);
            Font fontTieuDe2 = new Font(bfTieuDe, 13);
            Font fontTieuDe3 = new Font(bfTieuDe, 12);
            
            File filefontNoiDung = new File("D:\\Java\\DoAn\\src\\Connection\\Report\\fonts\\vuArial.ttf");
            BaseFont bfNoiDung = BaseFont.createFont(filefontNoiDung.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font fontNoiDung1 = new Font(bfNoiDung, 13);
            Font fontNoiDung2 = new Font(bfNoiDung, 12);
            Font fontNoiDung3 = new Font(bfNoiDung, 11);
            
            Paragraph prgTenHD = new Paragraph("GRANDMART FOR VNUHCM'S STUDENT SYSTEM", fontTieuDe2);
            prgTenHD.setAlignment(Element.ALIGN_CENTER);
            document.add(prgTenHD);
            
            Paragraph prgDiaChiHD = new Paragraph("35 Tan lap, khu pho 6, phuong Linh Trung, TP Thu Duc", fontNoiDung2);
            prgDiaChiHD.setAlignment(Element.ALIGN_CENTER);
            document.add(prgDiaChiHD);
            
            Paragraph prgSoDTHD = new Paragraph("Tel: 04-8243524/8245716", fontNoiDung2);
            prgSoDTHD.setAlignment(Element.ALIGN_CENTER);
            document.add(prgSoDTHD);
            
            Paragraph thanhngang = new Paragraph("------------------------------------------------------", fontNoiDung2);
            thanhngang.setAlignment(Element.ALIGN_CENTER);
            document.add(thanhngang);
            
            Paragraph prgTieuDe = new Paragraph("HOA DON", fontTieuDe1);
            prgTieuDe.setAlignment(Element.ALIGN_CENTER);
            prgTieuDe.setSpacingBefore(10);
            prgTieuDe.setSpacingAfter(10);
            document.add(prgTieuDe);
            
            List list = new List(List.UNORDERED);
            list.add(new ListItem("Employee ID: " + dtoBill.getEmp_id() + "                     Cashier counter ID: " + dtoBill.getCash_id(), fontNoiDung2));
            list.add(new ListItem("Bill ID: " + dtoBill.getId() +"                                              Date: " + sdf.format(dtoBill.getBill_date()), fontNoiDung2));
            document.add(list);
            Paragraph tn = new Paragraph("---------------------------------------------------------------------------------------", fontNoiDung2);
            tn.setAlignment(Element.ALIGN_CENTER);
            document.add(tn);
            
            //Tao bang
            PdfPTable tableHD = new PdfPTable(5);
            tableHD.setWidthPercentage(100);
            tableHD.setSpacingBefore(10);
            tableHD.setSpacingAfter(5);
            float[] tableDV_ColumWidths = {250,90,150,100,160};
            tableHD.setWidths(tableDV_ColumWidths);
            
            PdfPCell cellTDTenSP = new PdfPCell(new Paragraph("Ten SP",fontTieuDe3));
            cellTDTenSP.setHorizontalAlignment(Element.ALIGN_LEFT);
            cellTDTenSP.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDTenSP.setBorder(0);
            tableHD.addCell(cellTDTenSP);
            
            PdfPCell cellTDVat = new PdfPCell(new Paragraph("VAT\n(%)",fontTieuDe3));
            cellTDVat.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDVat.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDVat.setBorder(0);
            tableHD.addCell(cellTDVat);
            
            PdfPCell cellTDDongia = new PdfPCell(new Paragraph("Don gia",fontTieuDe3));
            cellTDDongia.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDDongia.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDDongia.setBorder(0);
            tableHD.addCell(cellTDDongia);
            
            PdfPCell cellTDSoluong = new PdfPCell(new Paragraph("So luong",fontTieuDe3));
            cellTDSoluong.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDSoluong.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDSoluong.setBorder(0);
            tableHD.addCell(cellTDSoluong);
            
            PdfPCell cellTDSotien = new PdfPCell(new Paragraph("So tien",fontTieuDe3));
            cellTDSotien.setHorizontalAlignment(Element.ALIGN_CENTER);
            cellTDSotien.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTDSotien.setBorder(0);
            tableHD.addCell(cellTDSotien);
            
            PdfPCell t = new PdfPCell(new Paragraph("----------------------------",fontNoiDung2));//24
            t.setHorizontalAlignment(Element.ALIGN_CENTER);
            t.setVerticalAlignment(Element.ALIGN_MIDDLE);
            t.setBorder(0);
            tableHD.addCell(t);
            
            PdfPCell h = new PdfPCell(new Paragraph("-------",fontNoiDung2));//7
            h.setHorizontalAlignment(Element.ALIGN_CENTER);
            h.setVerticalAlignment(Element.ALIGN_MIDDLE);
            h.setBorder(0);
            tableHD.addCell(h);
            
            PdfPCell a = new PdfPCell(new Paragraph("----------------",fontNoiDung2));//18
            a.setHorizontalAlignment(Element.ALIGN_CENTER);
            a.setVerticalAlignment(Element.ALIGN_MIDDLE);
            a.setBorder(0);
            tableHD.addCell(a);
            
            PdfPCell n = new PdfPCell(new Paragraph("---------",fontNoiDung2));//9
            n.setHorizontalAlignment(Element.ALIGN_CENTER);
            n.setVerticalAlignment(Element.ALIGN_MIDDLE);
            n.setBorder(0);
            tableHD.addCell(n);
            
            PdfPCell g = new PdfPCell(new Paragraph("-----------------",fontNoiDung2));//17
            g.setHorizontalAlignment(Element.ALIGN_CENTER);
            g.setVerticalAlignment(Element.ALIGN_MIDDLE);
            g.setBorder(0);
            tableHD.addCell(g);
            
            try {
                Connection con = DBConnection.getDBConnection();
                String SQL = "SELECT  PRODUCT_NAME, VAT, SALE_PRICE, AMOUNT, AMOUNT*SALE_PRICE*(1 + VAT/100)\n" +
                             "FROM    PRODUCT P, BILL B, BILL_DETAILS BD\n" +
                             "WHERE   P.PRODUCT_ID = BD.PRODUCT_ID AND B.BILL_ID = BD.BILL_ID AND B.BILL_ID = ?";
                PreparedStatement ps = con.prepareStatement(SQL);
                ps.setInt(1, dtoBill.getId());
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    
                    PdfPCell cellTenSP = new PdfPCell(new Paragraph(rs.getString(1),fontNoiDung2));
                    cellTenSP.setHorizontalAlignment(Element.ALIGN_LEFT);
                    cellTenSP.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellTenSP.setBorder(0);
                    tableHD.addCell(cellTenSP);
                    
                    PdfPCell cellVat = new PdfPCell(new Paragraph(String.valueOf(rs.getInt(2)),fontNoiDung2));
                    cellVat.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellVat.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellVat.setBorder(0);
                    tableHD.addCell(cellVat);
                    
                    PdfPCell cellDongia = new PdfPCell(new Paragraph(String.format("%, d d",rs.getLong(3))));
                    cellDongia.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellDongia.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellDongia.setBorder(0);
                    tableHD.addCell(cellDongia);
                    
                    PdfPCell cellSoluong = new PdfPCell(new Paragraph(String.valueOf(rs.getInt(4)),fontNoiDung2));
                    cellSoluong.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellSoluong.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellSoluong.setBorder(0);
                    tableHD.addCell(cellSoluong);
                    
                    PdfPCell cellSotien = new PdfPCell(new Paragraph(String.format("%, d d",rs.getLong(5))));
                    cellSotien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellSotien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellSotien.setBorder(0);
                    tableHD.addCell(cellSotien);
                }
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
            
            PdfPCell c = new PdfPCell(new Paragraph("----------------------------------------------------------------",fontNoiDung2));
            c.setColspan(4);
            c.setHorizontalAlignment(Element.ALIGN_CENTER);
            c.setVerticalAlignment(Element.ALIGN_MIDDLE);
            c.setBorder(0);
            tableHD.addCell(c);
            
            PdfPCell b = new PdfPCell(new Paragraph("-----------------",fontNoiDung2));
            b.setHorizontalAlignment(Element.ALIGN_CENTER);
            b.setVerticalAlignment(Element.ALIGN_MIDDLE);
            b.setBorder(0);
            tableHD.addCell(b);
            
            PdfPCell cellTongcong = new PdfPCell(new Paragraph("TONG CONG: ", fontTieuDe2));
            cellTongcong.setColspan(4);
            cellTongcong.setHorizontalAlignment(Element.ALIGN_LEFT);
            cellTongcong.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTongcong.setMinimumHeight(20);
            cellTongcong.setBorder(0);
            tableHD.addCell(cellTongcong);
            try {
                Connection con = DBConnection.getDBConnection();
                String SQL = "SELECT  SUM(AMOUNT*SALE_PRICE*(1 + VAT/100))\n" +
                             "FROM    PRODUCT P, BILL B, BILL_DETAILS BD\n" +
                             "WHERE   P.PRODUCT_ID = BD.PRODUCT_ID AND B.BILL_ID = BD.BILL_ID AND B.BILL_ID = ?";
                PreparedStatement ps = con.prepareStatement(SQL);
                ps.setInt(1, dtoBill.getId());
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    PdfPCell cellTongtien = new PdfPCell(new Paragraph(String.format("%, d d",rs.getLong(1))));
                    cellTongtien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellTongtien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellTongtien.setMinimumHeight(20);
                    cellTongtien.setBorder(0);
                    tableHD.addCell(cellTongtien);
                }
            } 
            catch (SQLException e) {
            }
            
            //table thanh tien
            PdfPTable tableTT = new PdfPTable(5);
            tableTT.setWidthPercentage(100);
            tableTT.setSpacingBefore(10);
            tableTT.setSpacingAfter(5);
            float[] tableTT_columnwidth = {250,90,150,100,160};
            tableTT.setWidths(tableTT_columnwidth);
            
            PdfPCell cellDTStuID = new PdfPCell(new Paragraph("- Student ID: ", fontNoiDung2));
            cellDTStuID.setHorizontalAlignment(Element.ALIGN_LEFT);
            cellDTStuID.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellDTStuID.setMinimumHeight(20);
            cellDTStuID.setBorder(0);
            tableTT.addCell(cellDTStuID);
            
            PdfPCell cellStuID = new PdfPCell(new Paragraph(String.valueOf(dtoBill.getStu_id()), fontNoiDung2));
            cellStuID.setColspan(4);
            cellStuID.setHorizontalAlignment(Element.ALIGN_LEFT);
            cellStuID.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellStuID.setMinimumHeight(20);
            cellStuID.setBorder(0);
            tableTT.addCell(cellStuID);
            
            PdfPCell cellDTThanhtien = new PdfPCell(new Paragraph("THANH TIEN: ", fontTieuDe2));
            cellDTThanhtien.setColspan(4);
            cellDTThanhtien.setHorizontalAlignment(Element.ALIGN_LEFT);
            cellDTThanhtien.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellDTThanhtien.setMinimumHeight(20);
            cellDTThanhtien.setBorder(0);
            tableTT.addCell(cellDTThanhtien);
            try {
                Connection con = DBConnection.getDBConnection();
                String SQL = "SELECT TOTAL_MONEY FROM BILL WHERE BILL_ID = ?";
                PreparedStatement ps = con.prepareStatement(SQL);
                ps.setInt(1, dtoBill.getId());
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    PdfPCell cellThanhtien = new PdfPCell(new Paragraph(String.format("%, d d",rs.getLong(1))));
                    cellThanhtien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellThanhtien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellThanhtien.setMinimumHeight(20);
                    cellThanhtien.setBorder(0);
                    tableTT.addCell(cellThanhtien);
                }
            } 
            catch (SQLException e) {
            }
      
            document.add(tableHD);
            document.add(tableTT);
            //loi ket
            Paragraph prg4 = new Paragraph("Chuc Quy khach vui ve, hen gap lai !", fontNoiDung1);
            prg4.setAlignment(Element.ALIGN_CENTER);
            prg4.setSpacingBefore(30);  
            document.add(prg4); 
            document.close();
            writer.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        try
        {
            File file = new File("D:\\Java\\"+ filename + ".pdf");
            if(!Desktop.isDesktopSupported())
            {
                System.out.println("Not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if(file.exists())
                desktop.open(file);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
