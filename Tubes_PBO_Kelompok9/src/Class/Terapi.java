/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;


public abstract class Terapi {
    private String jenis_terapi, deskripsi_penyakit, jenis_penyakit;

    // constructor kelas terapi
    public Terapi(String jenis_terapi, String jenis_penyakit, String deskripsi_penyakit) {
        this.jenis_terapi = jenis_terapi;
        this.deskripsi_penyakit = deskripsi_penyakit;
        this.jenis_penyakit = jenis_penyakit;
    }
    
    //setter jenis terapi
    public void setJenis_terapi(String jenis_terapi){
        this.jenis_terapi = jenis_terapi;
    }
    
    //setter deskripsi penyakit
    public void setDeskripsi_penyakit(String deskripsi_penyakit){
        this.deskripsi_penyakit = deskripsi_penyakit;
    }
    
    //setter jenis penyakit
    public void setJenis_penyakit(String jenis_penyakit){
        this.jenis_penyakit = jenis_penyakit;
    }
    
    // getter jenis terapi
    public String getJenis_terapi(){
        return this.jenis_terapi;
    }
    
    //getter deskripsi penyakit
    public String getDeskripsi_penyakit(){
        return this.deskripsi_penyakit;
    }
    
    //getter jenis penyakit
    public String getJenis_penyakit(){
        return this.jenis_penyakit;
    }
    
    // abstrak method informasi terapi
    public abstract String informasi_terapi();
    
    //method display terapi
    public void display(){
        System.out.println("Jenis Terapi       :" + this.jenis_terapi);
        System.out.println("Deskripsi Penyakit :" + this.deskripsi_penyakit);
        System.out.println("Jenis Penyakit     :" + this.jenis_penyakit);
    }
}
