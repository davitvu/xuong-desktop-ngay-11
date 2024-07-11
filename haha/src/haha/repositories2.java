/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haha;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author vit
 */
public class repositories2 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String query = null;
    
    public ArrayList<model> getAll() {
        ArrayList<model> list = new ArrayList<>();
        query = "SELECT maSV, hoTen FROM sinhVien";
        
        try {
            con = db.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                list.add(new model(rs.getString("maSV"), rs.getString("hoTen")));
            }
            return list;
//            rs.close();
//            ps.close();
//            con.close();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
