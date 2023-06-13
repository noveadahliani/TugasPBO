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
public class dsadmin {
    private ArrayList<Integer> id;
    private ArrayList<String> Nama_pertama;
    private ArrayList<Integer> Username;
    private ArrayList<Integer> Password;
    private ArrayList<Integer> Dibuat_pada;
    private ArrayList<String> Nama_belakang;
    private ArrayList<String> Mengisi;
    private ArrayList<String> Mengubah;
    private ArrayList<String> Melihat;       
    private ArrayList<String> Menghapus;      
            
    
    public dsadmin() {
        id = new ArrayList<Integer>();
        Nama_pertama = new ArrayList<String>();
        Username = new ArrayList<Integer>();
        Password= new ArrayList<Integer>();
        Dibuat_pada = new ArrayList<Integer>();
        Nama_belakang = new ArrayList<String>();
        Mengisi = new ArrayList<String>();
        Mengubah = new ArrayList<String>();
        Melihat = new ArrayList<String>();
        Menghapus = new ArrayList<String>();
}

    public void insertid(int isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
        
    public void insertNama_pertama(String isi){
        this.Nama_pertama.add(isi);
    }
    public ArrayList<String> getRecordNama_pertama(){
        return this.Nama_pertama;
    }
    
   public void insertUsername(int isi){
        this.Username.add(isi);
    }
    public ArrayList<Integer> getRecordUsername(){
        return this.Username;
    }
    
    public void insertPassword(int isi){
        this.Password.add(isi);
    }
    public ArrayList<Integer> getRecordPassword(){
        return this.Password;
    }
    
    public void insertDibuat_pada(int isi){
        this.Dibuat_pada.add(isi);
    }
    public ArrayList<Integer> getRecordDibuat_pada(){
        return this.Dibuat_pada;
    }
    
     public void insertNama_belakang(String isi){
        this.Nama_belakang.add(isi);
    }
    public ArrayList<String> getRecordNama_belakang(){
        return this.Nama_belakang;
    }
    
     public void insertMengisi(String isi){
        this.Mengisi.add(isi);
    }
    public ArrayList<String> getRecordMengisi(){
        return this.Mengisi;
    }
    
     public void insertMengubah(String isi){
        this.Mengubah.add(isi);
    }
    public ArrayList<String> getRecordMengubah(){
        return this.Mengubah;
    }
    
     public void insertMelihat(String isi){
        this.Melihat.add(isi);
    }
    public ArrayList<String> getRecordMelihat(){
        return this.Melihat;
    }
    
     public void insertMenghapus(String isi){
        this.Menghapus.add(isi);
    }
    public ArrayList<String> getRecordMenghapus(){
        return this.Menghapus;
    }
    
     public void insertadmin(int id, String Nama_pertama, int  Username, int Password, 
             int Dibuat_pada, String Nama_belakang, String Mengisi, String Mengubah,
             String Melihat, String Menghapus){   
        this.id.add(id);
        this.Nama_pertama.add(Nama_pertama);
        this.Username.add( Username);
        this.Password.add(Password);
        this.Dibuat_pada.add(Dibuat_pada);
        this.Nama_belakang.add(Nama_belakang);
        this.Mengisi.add(Mengisi);
        this.Mengubah.add(Mengubah);
        this. Melihat.add( Melihat);
        this.Menghapus.add(Menghapus);
    }
}