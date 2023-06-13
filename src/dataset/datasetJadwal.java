/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class datasetJadwal {
     private ArrayList<String> tanggal;
    private ArrayList<String> nama;
     private ArrayList<String> kodemember;
    private ArrayList<String> jamsewa;
     private ArrayList<String> username;
     
      public datasetJadwal(){
        tanggal = new ArrayList<>();
        nama = new ArrayList<>();
        kodemember = new ArrayList<>();
        jamsewa = new ArrayList<>();
        username = new ArrayList<>();
    }
      
      public void addUsername(String value){
        this.username.add(value);
    }
    
    public ArrayList<String> getDataUsername(){
        return this.username;
    }
    
    public void addTanggal(String value){
        this.tanggal.add(value);
    }
    
    public ArrayList<String> getDataTanggal(){
        return this.tanggal;
    }
    
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
    public void addKodemember(String value){
        this.kodemember.add(value);
    }
    
    public ArrayList<String> getDataKodemember(){
        return this.kodemember;
    }
    
    public void addJamsewa(String value){
        this.jamsewa.add(value);
    }
    
    public ArrayList<String> getDataJamsewa(){
        return this.jamsewa;
    }
    
     public void Jadwal(String tanggal, String nama, String kodemember, String jamsewa, String username){
        addTanggal(tanggal);
        addNama(nama);
        addKodemember(kodemember);
        addJamsewa(jamsewa);
        addUsername(username);
    }
    
}
