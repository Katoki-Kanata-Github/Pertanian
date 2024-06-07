/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud;
import java.sql.Connection; // menambahkan connection
import Petani.*;
import java.sql.DriverManager; //  menghubungkan database
import java.sql.PreparedStatement; // perintah sql
/**
 *
 * @author Muhammad Maulidi
 */
public class Database {
    
    private String databaseName = "2210010663_Pertanian";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    // Constructor
    public Database(){
        try {
            String location = "jdbc:mysql://localhost/"+ databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectionDB = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void simpanpetani(String id, String nama, String alamat, String nohp){
        try {
            String sql = "insert into uji(id, nama, alamat, nohp) value(?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.setString(2, nama);
            perintah.setString(3, alamat);
            perintah.setString(4, nohp);
            perintah.executeUpdate();
            System.out.println("Data berhasil tersimpan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void tambahpetani(String id, String nama, String alamat, String nohp){
        try {
            String sql = "insert into uji(id, nama, alamat, telp) value(nik = ?, nama = ?, alamat = ?, nohp = ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            perintah.setString(2, nama);
            perintah.setString(3, alamat);
            perintah.setString(4, nohp);
            perintah.executeUpdate();
            System.out.println("Data berhasil di tambahkan");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    public void ubahpetani(String id, String nama, String alamat, String nohp){
        try {
            String sql = "insert uji set nama = ?, nohp = ?, alamat = ?, where id = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama);
            perintah.setString(2, nohp);
            perintah.setString(3, alamat);
            perintah.setString(4, id);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di ubah ");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapuspetani(String id){
        try {
            String sql = "delete from uji where id = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, id);
            
            perintah.executeUpdate();
            System.out.println("Data berhasil di hapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
    }

}