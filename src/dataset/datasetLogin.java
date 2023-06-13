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
public class datasetLogin {
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    public datasetLogin(){
        username = new ArrayList<>();
        password = new ArrayList<>();
    }
    public void addUsername(String value){
        this.username.add(value);
    }
    
    public ArrayList<String> getDataUsername(){
        return this.username;
    }
    
    public void addPassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getDataPassword(){
        return this.password;
    }
    
    public void Login(String username, String password){
        addUsername(username);
        addPassword(password);
    }
    
}
