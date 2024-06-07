/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petani;

/**
 *
 * @author Muhammad Maulidi
 */
public class Lahan{
    private int id_lahan;
    private String nama_lahan;
    private double luas_lahan; // dalam hektar
  
    // Constructor
    public Lahan(int idlahan, String namalahan, double luaslahan) {
        this.id_lahan = idlahan;
        this.nama_lahan = namalahan;
        this.luas_lahan = luaslahan;
    }
    // Getter dan Setter untuk idLahan
    public int getIdLahan() {
        return this.id_lahan;
    }
    public void setIdlahan(int idlahan){
        this.id_lahan= idlahan;
    }
    
    // Getter dan Setter untuk idLahan
    public String getNamaLahan() {
        return this.nama_lahan;
    }
    public void setNamalahan(String namalahan){
        this.nama_lahan= namalahan;
    }
    
    // Getter dan Setter untuk idLahan
    public double getLuasLahan() {
        return this.luas_lahan;
    }
    public void setLuaslahan(double luaslahan){
        this.luas_lahan= luaslahan;
    }
    
    @Override
    public String toString() {
        return "Lahan{" +
                "idLahan=" + id_lahan +
                ", namaLahan='" + nama_lahan + '\'' +
                ", luasLahan=" + luas_lahan +
                '}';
    }
}
