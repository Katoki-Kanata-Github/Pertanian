/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */ 
package Pertanian;
import Petani.*;
import crud.Database;
import java.util.Scanner;

/**
 *
 * @author Muhammad Maulidi
 */

public class Pertanian {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Database dbConnection = new Database();
//        dbConnection.simpanpetani("001", "Muhammad Maulidi", "Jalan Gubernur Soebardjo", "089522301867");
    
        // Membuat objek Petani
        Petani petani1 = new Petani(1, "Maulidi", "Jl. Cempaka Selatan No. 50" ,"08123456789");
        
        // Menampilkan informasi petani
        System.out.println(petani1);

        // Mengubah atribut petani
        petani1.setNamaPetani("Rio");
        petani1.setAlamatPetani("Jl. Kemerdekaan No. 1945");
        petani1.setNoHp("08987654321");

        // Menampilkan informasi petani setelah diubah
        System.out.println(petani1);

        // Membuat objek Lahan
        Lahan lahan1 = new Lahan(1, "Lahan M", 500.0);

        // Menampilkan informasi lahan
        System.out.println(lahan1);

        // Mengubah atribut lahan lahan1.setIdlahan(0);
        lahan1.setNamalahan("Lahan N");
        lahan1.setLuaslahan(600.0);

        // Menampilkan informasi lahan setelah diubah
        System.out.println(lahan1);
    }
    
        
} 