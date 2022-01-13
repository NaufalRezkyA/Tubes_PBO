/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


public class Farmasi {
    private String kode_obat, nama_obat,deskripsi_obat, kode_pasien;

    //constructor kelas farmasi
    public Farmasi(String kode_obat, String nama_obat, String deskripsi_obat, String kode_pasien) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //setter kode obat
    public void setKode_obat(String kode_obat){
        this.kode_obat = kode_obat;
    }
    
    //setter nama obat
    public void setNama_obat(String nama_obat){
        this.nama_obat = nama_obat;
    }
    
    //setter deskripsi obat
    public void setDeskripsi_obat(String deskripsi_obat){
        this.deskripsi_obat = deskripsi_obat;
    }
    
    //setter kode pasien
    public void setKode_pasien(String kode_pasien){
        this.kode_pasien = kode_pasien;
    }
    
    //getter kode obat
    public String getKode_obat(){
        return this.kode_obat;
    }
    
    //getter nama obat
    public String getNama_obat(){
        return this.nama_obat;
    }
    
    //getter deskripsi obat
    public String getDeskripsi_obat(){
        return this.deskripsi_obat;
    }
    
    // getter kode pasien
    public String getKode_pasien(){
        return this.kode_pasien;
    }
    
    // method display farmasai
    public void display(){
        System.out.println("Kode Obat      :" + this.kode_obat);
        System.out.println("Nama Obat      :" + this.nama_obat);
        System.out.println("Deskripsi Obat :" + this.deskripsi_obat);
        System.out.println("Kode Pasien    :" + this.kode_pasien);
    }
}
