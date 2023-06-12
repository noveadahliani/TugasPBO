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
public class dsdatapegawai {
    private ArrayList<Integer> NIPPOS;
    private ArrayList<String> Nama;
    private ArrayList<Integer> Password;
    private ArrayList<Integer> Pegawai_sejak;
    private ArrayList<String> Posisi;
    private ArrayList<String> Jadwal;
    private ArrayList<String> Melihat;
    private ArrayList<String> Mengisi;
    
     public dsdatapegawai() {
        NIPPOS = new ArrayList<Integer>();
        Nama = new ArrayList<String>();
        Password = new ArrayList<Integer>();
        Pegawai_sejak = new ArrayList<Integer>();
        Posisi = new ArrayList<String>();
        Jadwal = new ArrayList<String>();
        Melihat = new ArrayList<String>();
        Mengisi = new ArrayList<String>();
    
    }
     
    public void insertNIPPOS(int isi){
        this.NIPPOS.add(isi);
    }
    public ArrayList<Integer> getRecordNIPPOS(){
        return this.NIPPOS;
    }
    
    public void insertNama(String isi){
        this.Nama.add(isi);
    }
    public ArrayList<String> getRecordNama(){
        return this.Nama;
    }
    
     public void insertPassword(int isi){
        this.Password.add(isi);
    }
    public ArrayList<Integer> getRecordPassword(){
        return this.Password;
    }
    
     public void insertPegawai_sejak(int isi){
        this.Pegawai_sejak.add(isi);
    }
    public ArrayList<Integer> getRecordPegawai_sejak(){
        return this.Pegawai_sejak;
    }

     public void insertPosisi(String isi){
        this.Posisi.add(isi);
    }
    public ArrayList<String> getRecordPosisi(){
        return this.Posisi;
    }
    
     public void insertJadwal(String isi){
        this.Jadwal.add(isi);
    }
    public ArrayList<String> getRecordJadwal(){
        return this.Jadwal;
    }
    
     public void insertMelihat(String isi){
        this.Melihat.add(isi);
    }
    public ArrayList<String> getRecordMelihat(){
        return this.Melihat;
    }
    
     public void insertMengisi(String isi){
        this.Mengisi.add(isi);
    }
    public ArrayList<String> getRecordMengisi(){
        return this.Mengisi;
    }
    
     public void insertdatapegawai(int NIPPOS, String Nama, int Password, int Pegawai_sejak,
            String  Posisi, String Jadwal, String Melihat, String Mengisi){
        this.NIPPOS.add(NIPPOS);
        this.Nama.add(Nama);
        this.Password.add(Password);
        this.Pegawai_sejak.add(Pegawai_sejak);
        this. Posisi.add( Posisi);
        this.Jadwal.add(Jadwal);
        this.Melihat.add(Melihat);
        this.Mengisi.add(Mengisi);
    }
}