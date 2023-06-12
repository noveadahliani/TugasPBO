/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class dslogin {
    private ArrayList<Integer> NIPPOS;
    private ArrayList<Integer> Password;
    private ArrayList<Integer>  Login;
    
     public dslogin() {
        NIPPOS = new ArrayList<Integer>();
        Password= new ArrayList<Integer>();
        Login = new ArrayList<Integer>();    
}

   public void insertNIPPOS(int isi){
        this.NIPPOS.add(isi);
    }
    public ArrayList<Integer> getRecordNIPPOS(){
        return this.NIPPOS;
    } 

    public void insertPassword(int isi){
        this.Password.add(isi);
    }
    public ArrayList<Integer> getRecordPassword(){
        return this.Password;
    } 

    public void insertLogin(int isi){
        this. Login.add(isi);
    }
    public ArrayList<Integer> getRecordLogin(){
        return this.Login;
    } 

     public void insertlogin(int NIPPOS, int Password, 
             int Login){ 
        this.NIPPOS.add(NIPPOS);
        this.Password.add(Password);
        this.Login.add(Login);
     }
}