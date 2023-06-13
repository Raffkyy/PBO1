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
public class datasetSewanonmember {
     private ArrayList<String> notransaksi;
    private ArrayList<String> tanggal;
     private ArrayList<String> nama;
    private ArrayList<String> jammulai;
     private ArrayList<String> jamhabis;
      private ArrayList<String> lapangan;
    private ArrayList<String> harga;
    private ArrayList<String> bayar;
    
    public datasetSewanonmember(){
        notransaksi = new ArrayList<>();
        tanggal = new ArrayList<>();
        nama = new ArrayList<>();
        jammulai = new ArrayList<>();
        jamhabis = new ArrayList<>();
        lapangan = new ArrayList<>();
        harga = new ArrayList<>();
        bayar = new ArrayList<>();
     }
    
    public void addNotransaksi(String value){
        this.notransaksi.add(value);
    }
    
    public ArrayList<String> getDataNotransaksi(){
        return this.notransaksi;
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
    
    public void addJammulai(String value){
        this.jammulai.add(value);
    }
    
    public ArrayList<String> getDataJammulai(){
        return this.jammulai;
    }
    
    public void addJamhabis(String value){
        this.jamhabis.add(value);
    }
    
    public ArrayList<String> getDataJamhabis(){
        return this.jamhabis;
    }
    
    public void addLapangan(String value){
        this.lapangan.add(value);
    }
    
    public ArrayList<String> getDataLapangan(){
        return this.lapangan;
    }
    
    public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getDataHarga(){
        return this.harga;
    }
    
    public void addBayar(String value){
        this.bayar.add(value);
    }
    
    public ArrayList<String> getDataBayar(){
        return this.bayar;
    }
    
    public void Jadwal(String notransaksi, String tanggal, String nama, String jammulai, String jamhabis,  String lapangan,  String harga, String bayar){
        addNotransaksi(notransaksi);
        addTanggal(tanggal);
        addJammulai(jammulai);
        addNama(nama);
        addJamhabis(jamhabis);
         addLapangan(lapangan);
        addHarga(harga);
        addBayar(bayar);
        
        
    }
    
}
