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
public class datasetRegismember {
     private ArrayList<String> nama;
    private ArrayList<String> alamat;
     private ArrayList<String> daftar;
    private ArrayList<String> batashabis;
     private ArrayList<String> bayar;
      private ArrayList<String> ktp;
    private ArrayList<String> idmember;
     
     public datasetRegismember(){
        nama = new ArrayList<>();
        alamat = new ArrayList<>();
        daftar = new ArrayList<>();
        batashabis = new ArrayList<>();
        bayar = new ArrayList<>();
        ktp = new ArrayList<>();
        idmember = new ArrayList<>();
     }
     
      public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
     public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
     public void addDaftar(String value){
        this.daftar.add(value);
    }
    
    public ArrayList<String> getDataDaftar(){
        return this.daftar;
    }
    
     public void addBatarhabis(String value){
        this.batashabis.add(value);
    }
    
    public ArrayList<String> getDataBatashabis(){
        return this.batashabis;
    }
    
     public void addBayar(String value){
        this.bayar.add(value);
    }
    
    public ArrayList<String> getDataBayar(){
        return this.bayar;
    }
    
     public void addKtp(String value){
        this.ktp.add(value);
    }
    
    public ArrayList<String> getDataKtp(){
        return this.ktp;
    }
    
     public void addIdmember(String value){
        this.idmember.add(value);
    }
    
    public ArrayList<String> getDataIdmember(){
        return this.idmember;
    }
    
      public void Jadwal(String nama, String alamat, String daftar, String batashabis, String bayar,  String ktp,  String idmember){
        addAlamat(alamat);
        addNama(nama);
        addDaftar(daftar);
        addBayar(bayar);
        addKtp(ktp);
        addIdmember(idmember);
        
    }
}
