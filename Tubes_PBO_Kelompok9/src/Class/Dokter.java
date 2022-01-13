/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


public class Dokter {
    private String kode_dokter,nama_dokter, email_dokter,spesialis;
    
    //constructor kelas dokter
    public Dokter(String kode_dokter,String nama_dokter,String emial_dokter, String spesialis){
        this.kode_dokter = kode_dokter;
        this.nama_dokter = nama_dokter;
        this.email_dokter = email_dokter;
        this.spesialis = spesialis;
    }
    
    // setter kode dokter
    public void setKode_dokter(String kode_dokter){
        this.kode_dokter = kode_dokter;
    }
    
    //setter nama dokter
    public void setNama_dokter(String nama_dokter){
        this.nama_dokter = nama_dokter;
    }
    
    //setter email dokter
    public void setEmail_dokter(String email_dokter){
        this.email_dokter = email_dokter;
    }
    
    //setter spesialis dokter
    public void setSpesialis(String spesialis){
        this.spesialis = spesialis;
    }
    
    //getter kode dokter
    public String getKode_dokter(){
        return kode_dokter;
    }
    
    //getter nama dokter
    public String getNama_dokter(){
        return nama_dokter;
    }
    
    //geetter emial dokter
    public String getEmail_dokter(){
        return email_dokter;
    }
    
    // getter spesialis dokter
    public String getSpesialis(){
        return spesialis;
    }
    
    // method display dokter
    public void display(){
        System.out.println("Kode Dokter          :" + this.kode_dokter);
        System.out.println("Nama Dokter        :" + this.nama_dokter);
        System.out.println("Email Dokter       :" + this.email_dokter);
        System.out.println("Spesialis       :" + this.spesialis);
    }
    
}
