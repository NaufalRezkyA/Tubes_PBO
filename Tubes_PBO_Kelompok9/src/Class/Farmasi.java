/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Naufal
 */
public class Farmasi {
    private String kode_obat, nama_obat,deskripsi_obat, kode_pasien, harga_obat;

    public Farmasi(String kode_obat, String nama_obat, String deskripsi_obat, String kode_pasien, String harga_obat) {
        this.kode_obat = kode_obat;
        this.nama_obat = nama_obat;
        this.deskripsi_obat = deskripsi_obat;
        this.kode_pasien = kode_pasien;
        this.harga_obat = harga_obat;
    }

    public String getHarga_obat() {
        return harga_obat;
    }

    public void setHarga_obat(String harga_obat) {
        this.harga_obat = harga_obat;
    }
    
    public void setKode_obat(String kode_obat){
        this.kode_obat = kode_obat;
    }
    public void setNama_obat(String nama_obat){
        this.nama_obat = nama_obat;
    }
    public void setDeskripsi_obat(String deskripsi_obat){
        this.deskripsi_obat = deskripsi_obat;
    }
    public void setKode_pasien(String kode_pasien){
        this.kode_pasien = kode_pasien;
    }
    
    public String getKode_obat(){
        return this.kode_obat;
    }
    public String getNama_obat(){
        return this.nama_obat;
    }
    public String getDeskripsi_obat(){
        return this.deskripsi_obat;
    }
    public String getKode_pasien(){
        return this.kode_pasien;
    }
    
    public void display(){
        System.out.println("Kode Obat      :" + this.kode_obat);
        System.out.println("Nama Obat      :" + this.nama_obat);
        System.out.println("Deskripsi Obat :" + this.deskripsi_obat);
        System.out.println("Kode Pasien    :" + this.kode_pasien);
    }
}
