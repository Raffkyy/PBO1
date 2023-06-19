/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package okibangunpamungkas_2110010377;

import java.util.ArrayList;
import forms.formUtama;

public class OkiBangunPamungkas_2110010377 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    Login obj = new Login();
    
    obj.setUsername("OKI");
    obj.setPassword("1");
    System.out.println("Username : "+ obj.getUsername());
    System.out.println("Password : "+ obj.getPassword());
    
    ArrayList<String> kodemember = new ArrayList<>();
        kodemember.add("1A");
        kodemember.add("1B");
        kodemember.add("1C");
        kodemember.add("1D");
        
        System.out.println(String.valueOf(kodemember.size()));
        System.out.println(kodemember.get(3));
        
        new formUtama().setVisible(true);
    }
    
}
