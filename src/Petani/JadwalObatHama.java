/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Petani;

/**
 *
 * @author Muhammad Maulidi
 */
public class JadwalObatHama {
    private String idObat;
    private String namaObat;
    private String jenisObat;
    private String tanggal;
    private String waktu;

    public JadwalObatHama(String idObat, String namaObat, String jenisObat, String tanggal, String waktu) {
        this.idObat = idObat;
        this.namaObat = namaObat;
        this.jenisObat = jenisObat;
        this.tanggal = tanggal;
        this.waktu = waktu;
    }

    // Getter dan Setter
    public String getIdObat() {
        return idObat;
    }

    public void setIdObat(String idObat) {
        this.idObat = idObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getJenisObat() {
        return jenisObat;
    }

    public void setJenisObat(String jenisObat) {
        this.jenisObat = jenisObat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
}
