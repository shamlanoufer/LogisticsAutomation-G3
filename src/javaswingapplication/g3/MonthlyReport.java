/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswingapplication.g3;

/**
 *
 * @author asus
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
public class MonthlyReport {
    public void insertReport(String month, int year, int total, int delivered, int pending) {
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO monthly_reports (month, year, total_shipments, delivered, pending) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, month);
            ps.setInt(2, year);
            ps.setInt(3, total);
            ps.setInt(4, delivered);
            ps.setInt(5, pending);
            ps.executeUpdate();
            System.out.println("Report added.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
