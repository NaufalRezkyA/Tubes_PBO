/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.time.LocalDate;


public class Rekam_Medik extends Pasien{
    private String kode_terapi,nama_terapi,deskripsi_terapi,kode_dokter, kode_pasien;

    // constructor kelas rekam medik
    public Rekam_Medik(String kode_terapi, String nama_terapi, String deskripsi_terapi, String kode_dokter, String kode_pasien, String penyakit, String dokter_rujukan, LocalDate tgl_pendaftaran) {
        super(kode_pasien, penyakit, dokter_rujukan, tgl_pendaftaran);
        this.kode_terapi = kode_terapi;
        this.nama_terapi = nama_terapi;
        this.deskripsi_terapi = deskripsi_terapi;
        this.kode_dokter = kode_dokter;
        this.kode_pasien = kode_pasien;
    }
    
    //setter kode terapi
    public void setKode_terapi(String kode_terapi){
        this.kode_terapi = kode_terapi;
    }
    
    // setter nama terapi
    public void setNama_terapi(String nama_terapi){
        this.nama_terapi = nama_terapi;
    }
    
    // setter deskripsi terapi
    public void setDeskripsi_terapi(String deskripsi_terapi){
        this.deskripsi_terapi = deskripsi_terapi;
    }
    
    //getter kode terapi
    public String getKode_terapi(){
        return kode_terapi;
    }
    
    //getter nama terapi
    public String getNama_terapi(){
        return nama_terapi;
    }
    
    //getter deskripsi terapi
    public String getDeskripsi_terapi(){
        return deskripsi_terapi;
    }
    
    // getter kode terapi
    public String getKode_dokter(){
        return kode_dokter;
    }
    
    //getter kode pasien
    public String getKode_pasien(){
        return kode_pasien;
    }
    
    //method display rekam medik
    public void display(){
        System.out.println("Kode Terapi          :" + this.kode_terapi);
        System.out.println("Nama Terapi        :" + this.nama_terapi);
        System.out.println("Deskripsi Terapi    :" + this.deskripsi_terapi);
        System.out.println("Kode Dokter       :" + this.kode_dokter);
        System.out.println("Kode Pasien       :" + this.kode_pasien);
    }
}
