/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tubes_PBO;

/**
 *
 * @author Naufal
 */
public class Terapi {
    private string jenis_terapi;
    private string deskripsi_penyakit;
    private string jenis_penyakit;
    
    public void setJenis_terapi(String jenis_terapi){
        this.jenis_terapi = jenis_terapi;
    }
    public void setDeskripsi_penyakit(String deskripsi_penyakit){
        this.deskripsi_penyakit = deskripsi_penyakit;
    }
    public void setJenis_penyakit(String jenis_penyakit){
        this.jenis_penyakit = jenis_penyakit;
    }
    
    public String getJenis_terapi(){
        return this.jenis_terapi;
    }
    public String getDeskripsi_penyakit(){
        return this.deskripsi_penyakit;
    }
    public String getJenis_penyakit(){
        return this.jenis_penyakit;
    }
    
    public String informasi_terapi(){
        return this.informasi_terapi;
    }
}