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
public class datasetSewamember {
    private ArrayList<String> notransaksi;
    private ArrayList<String> tanggal;
     private ArrayList<String> kodemember;
    private ArrayList<String> nama;
     private ArrayList<String> jamsewa;
      private ArrayList<String> lapangan;
    private ArrayList<String> jmlbermain;
    private ArrayList<String> batasbermain;
    
     public datasetSewamember(){
        notransaksi = new ArrayList<>();
        tanggal = new ArrayList<>();
        kodemember = new ArrayList<>();
        nama = new ArrayList<>();
        jamsewa = new ArrayList<>();
        lapangan = new ArrayList<>();
        jmlbermain = new ArrayList<>();
        batasbermain = new ArrayList<>();
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
    
    public void addKodemember(String value){
        this.kodemember.add(value);
    }
    
    public ArrayList<String> getDataKodemember(){
        return this.kodemember;
    }
    
    public void addNama(String value){
        this.nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
    public void addJamsewa(String value){
        this.jamsewa.add(value);
    }
    
    public ArrayList<String> getDataJamsewa(){
        return this.jamsewa;
    }
    
    public void addLapangan(String value){
        this.lapangan.add(value);
    }
    
    public ArrayList<String> getDataLapangan(){
        return this.lapangan;
    }
    
    public void addJmlbermain(String value){
        this.jmlbermain.add(value);
    }
    
    public ArrayList<String> getDataJmlbermain(){
        return this.jmlbermain;
    }
    
    public void addBatasbermain(String value){
        this.batasbermain.add(value);
    }
    
    public ArrayList<String> getDataBatasbermain(){
        return this.batasbermain;
    }
    
    public void Jadwal(String notransaksi, String tanggal, String kodemember, String nama, String jamsewa,  String lapangan,  String jmlbermian, String batasbermain){
        addNotransaksi(notransaksi);
        addTanggal(tanggal);
        addKodemember(kodemember);
        addNama(nama);
        addJamsewa(jamsewa);
         addBatasbermain(batasbermain);
        addBatasbermain(batasbermain);
        
        
    }
}
