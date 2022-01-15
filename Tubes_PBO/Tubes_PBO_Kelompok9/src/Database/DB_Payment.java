/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Class.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author kamil
 */
public class DB_Payment {
    private int jumlah_tagihan, no_pembayaran;
    private String deskripsi_pembayaran, metodePembayaran;

    //constructor
    public DB_Payment(int no_pembayaran, int jumlah_tagihan, String deskripsi_pembayaran, String metodePembayaran) {
        this.no_pembayaran = no_pembayaran;
        this.jumlah_tagihan = jumlah_tagihan;
        this.deskripsi_pembayaran = deskripsi_pembayaran;
        this.metodePembayaran = metodePembayaran;
    }
    
    //Melakukan insert database Payment
    public void insert(){
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/puskesmas", 
                "root", 
                "");
            Statement stmt = conn.createStatement();
            String sqlHandleFK = "SET foreign_key_checks = 0";
            stmt.execute(sqlHandleFK);
            String sql = "INSERT INTO payment VALUES('"+no_pembayaran+"', '"+jumlah_tagihan+"', '"+deskripsi_pembayaran+"', '"+metodePembayaran+"')";
            System.out.println(sql);
            stmt.execute(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Melakukan delete database Payment
    public void delete(){
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/puskesmas", 
                "root", 
                "");
            Statement stmt = conn.createStatement();
            String sqlHandleFK = "SET foreign_key_checks = 0";
            stmt.execute(sqlHandleFK);
            String sql = "DELETE FROM payment WHERE noPembayaran='"+no_pembayaran+"'";
            System.out.println(sql);
            stmt.execute(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Melakukan update database Payment
    public void update(){
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/puskesmas", 
                "root", 
                "");
            Statement stmt = conn.createStatement();
            String sqlHandleFK = "SET foreign_key_checks = 0";
            stmt.execute(sqlHandleFK);
            String sql = "UPDATE payment SET no_pembayaran = '"+no_pembayaran+"', "
                    + "jumlah_tagihan='"+jumlah_tagihan+"', "
                    + "deskripsi_pembayaran='"+deskripsi_pembayaran+"', "
                    + "metodePembayaran = '"+metodePembayaran+"' WHERE noPembayaran = '"+no_pembayaran+"'";
            System.out.println(sql);
            stmt.execute(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // melakukan reset database Payment
    public void reset(){
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/puskesmas", 
                "root", 
                "");
            Statement stmt = conn.createStatement();
            String sqlHandleFK = "SET foreign_key_checks = 0";
            stmt.execute(sqlHandleFK);
            String sql = "TRUNCATE TABLE payment";
            System.out.println(sql);
            stmt.execute(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Mengambil data dari database Payment
    public ArrayList<Payment> getData(){
        ArrayList<Payment> list_payment = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/puskesmas", 
                "root", 
                "");
            Statement stmt = conn.createStatement();
            String sqlHandleFK = "SET foreign_key_checks = 0";
            stmt.execute(sqlHandleFK);
            String sql = "SELECT * FROM payment";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                this.no_pembayaran = rs.getInt("noPembayaran");
                this.jumlah_tagihan = rs.getInt("jumlah_tagihan");
                this.deskripsi_pembayaran = rs.getString("deskripsi_pembayaran");
                this.metodePembayaran = rs.getString("metodePembayaran");
                
                list_payment.add(new Payment(jumlah_tagihan, no_pembayaran, deskripsi_pembayaran, metodePembayaran));
             }
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list_payment;
    }
    
    public static void main(String[] args) {
//        DB_Payment test = new DB_Payment(1, 50000, "Biaya temu dan biaya obat Ibuprofen", "cash");
//        test.getData();
//        System.out.println();
//        System.out.println("berhasil");
    }
}
