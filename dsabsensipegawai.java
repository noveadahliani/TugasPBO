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
public class dsabsensipegawai {
    private ArrayList<Integer> NIPPOS;
    private ArrayList<String>  Nama;
    private ArrayList<Integer> Tanggal;
    private ArrayList<Integer> Waktu_masuk;
    private ArrayList<Integer> Waktu_keluar;
     
    public dsabsensipegawai() {
        NIPPOS = new ArrayList<Integer>();
        Nama   = new ArrayList<String>();
        Tanggal = new ArrayList<Integer>();
       Waktu_masuk = new ArrayList<Integer>();
        Waktu_keluar= new ArrayList<Integer>();   
}

     public void insertNIPPOS (int isi){
        this.NIPPOS.add(isi);
    }
    public ArrayList<Integer> getRecordNIPPOS(){
        return this.NIPPOS;
    }
    
    public void insertNama (String isi){
        this.Nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.Nama;
    }
    
    public void insertTanggal (int isi){
        this.Tanggal.add(isi);
    }
    public ArrayList<Integer> getRecordTanggal(){
        return this.Tanggal;
    }
    
    public void insertWaktu_masuk (int isi){
        this.Waktu_masuk.add(isi);
    }
    public ArrayList<Integer> getRecordWaktu_masuk(){
        return this.Waktu_masuk;
    }
    
     public void insertWaktu_keluar (int isi){
        this. Waktu_keluar.add(isi);
    }
    public ArrayList<Integer> getRecordWaktu_keluar(){
        return this. Waktu_keluar;
    }
    
     public void insertabsensipegawai(int NIPPOS, String Nama, int Tanggal, int Waktu_masuk, 
             int Waktu_keluar){
        this. NIPPOS.add( NIPPOS);
        this.Nama.add(Nama);
        this.Tanggal.add(Tanggal);
        this.Waktu_masuk.add(Waktu_masuk);
        this.Waktu_keluar.add(Waktu_keluar);
        
        }    
}