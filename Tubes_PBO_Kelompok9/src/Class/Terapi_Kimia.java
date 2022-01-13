/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


public class Terapi_Kimia extends Terapi implements Biaya_Terapi{
    private String kode_terapi, nama_terapi, deskripsi_terapi, kode_dokter;

    // constructor kelas terapi kimia
    public Terapi_Kimia(String kode_terapi, String nama_terapi, String deskripsi_terapi, String kode_dokter, String jenis_terapi, String deskripsi_penyakit, String jenis_penyakit) {
        super(jenis_terapi, deskripsi_penyakit, jenis_penyakit);
        this.kode_terapi = kode_terapi;
        this.nama_terapi = nama_terapi;
        this.deskripsi_terapi = deskripsi_terapi;
        this.kode_dokter = kode_dokter;
    }
    
    // setter kode terapi
    public void setKode_terapi(String kode_terapi){
        this.kode_terapi = kode_terapi;
    }
    
    //setter nama terapi
    public void setNama_terapi(String nama_terapi){
        this.nama_terapi = nama_terapi;
    }
    
    //setter deskripsi terapi
    public void setDeskripsi_terapi(String deskripsi_terapi){
        this.deskripsi_terapi = deskripsi_terapi;
    }
    
    //getter kode terapi
    public String getKode_terapi(){
        return this.kode_terapi;
    }
    
    // getter nama terapi
    public String getNama_terapi(){
        return this.nama_terapi;
    }
    
    //getter deskripsi terapi
    public String getDeskripsi_terapi(){
        return this.deskripsi_terapi;
    }
    
    // getter kode dokter
    public String getKode_dokter(){
        return this.kode_dokter;
    }

    // method display terapi kimia
    public void display(){
        System.out.println("Kode Terapi      :" + this.kode_terapi);
        System.out.println("Nama Terapi      :" + this.nama_terapi);
        System.out.println("Deskripsi Terapi :" + this.deskripsi_terapi);
        System.out.println("Kode Dokter      :" + this.kode_dokter);
    }

    //override abtark method total biaya terapi
    @Override
    public void totalBiayaTerapi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //override abstrak method informasi terapi dari kelas terapi
    @Override
    public String informasi_terapi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
