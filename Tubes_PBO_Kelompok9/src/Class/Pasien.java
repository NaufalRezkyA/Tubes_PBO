package Class;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Class.Payment;
import java.time.LocalDate;


public class Pasien {
    private String kode_pasien, keluhan, dokter_rujukan, kode_terapi;
    private LocalDate tgl_pendaftaran;
    private Payment[] invoice;

    //constructor pasien
    public Pasien(String kode_pasien, String keluhan, String dokter_rujukan, LocalDate tgl_pendaftaran) {
        this.kode_pasien = kode_pasien;
        this.keluhan = keluhan;
        this.dokter_rujukan = dokter_rujukan;
        this.tgl_pendaftaran = tgl_pendaftaran;
        this.invoice = invoice;
    }
    
    // setter kode pasien
    public void setKode_pasien(String kode_pasien){
        this.kode_pasien = kode_pasien;
    }

    // setter tanggal pendaftaran pasien
    public void setTgl_pendaftaran(LocalDate tgl_pendaftaran) {
        this.tgl_pendaftaran = tgl_pendaftaran;
    }
    
    // getter kode pasien
    public String getKode_pasien(){
        return kode_pasien;
    }
    
    // setter keluhan pasien
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    // getter keluhan pasien
    public String getKeluhan() {
        return keluhan;
    }

    // setter kode terapi
    public void setKode_terapi(String kode_terapi) {
        this.kode_terapi = kode_terapi;
    }

    // getter kode terapi
    public String getKode_terapi() {
        return kode_terapi;
    }

    // setter invoice pasien
    public void setInvoice(Payment[] invoice) {
        this.invoice = invoice;
    }

    // getter invoice pasien
    public Payment[] getInvoice(){
        return invoice;
    }
    
    // getter tanggal pendaftaran
    public LocalDate getTgl_pendaftaran(){
        return tgl_pendaftaran;
    }
    
    //  setter dokter rujukan
    public void setDokter_rujukan(String dokter_rujukan){
        this.dokter_rujukan = dokter_rujukan;
    }
    
    // method display pasien
    public void display(){
        System.out.println("Kode Pasien         :" + this.kode_pasien);
        System.out.println("Dokter Rujukan      :" + this.dokter_rujukan);
        System.out.println("Tanggal Pendaftaran :" + this.tgl_pendaftaran);
    }
    
}
