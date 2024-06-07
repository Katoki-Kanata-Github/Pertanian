/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petani;

/**
 *
 * @author Muhammad Maulidi
 */
public class Petani { 
    private int id_petani;
    private String nama_petani;
    private String alamat_petani;
    private String no_hp;
  
    // Constructor
    public Petani(int id_petani, String nama_petani, String alamat_petani, String no_hp) {
        this.id_petani = id_petani;
        this.nama_petani = nama_petani;
        this.alamat_petani = alamat_petani;
        this.no_hp = no_hp;
    }
    
     // Getter methods
    public void setIdPetani(int id_petani){
        this.id_petani = id_petani;
    }
    
    public int getIdPetani() {
        return this.id_petani;
    }
    
    public void setNamaPetani(String nama_petani){
        this.nama_petani = nama_petani;
    }
    public String getNamaPetani() {
        return this.nama_petani;
    }

    public void setNoHp(String no_hp){
        this.no_hp = no_hp;
    }
    public String getNoHp() {
        return this.no_hp;
    }
    
    public void setAlamatPetani(String alamat_petani){
        this.alamat_petani = alamat_petani;
    }
    public String getAlamatPetani() {
        return alamat_petani;
    }
    
     // Metode untuk menampilkan informasi petani
    @Override
    public String toString() {
        return "Petani{" +
                "  idPetani=" + id_petani +
                ", namaPetani='" + nama_petani + '\'' +
                ", alamatPetani='" + alamat_petani + '\'' +
                ", nohp='" + no_hp + '\'' +
                '}';
    }
}

