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
public class dsjadwal {
    private ArrayList<Integer> id;
    private ArrayList<Integer> Jadwal_masuk;
    private ArrayList<Integer> Jadwal_keluar;
    
    public dsjadwal() {
        id = new ArrayList<Integer>();
        Jadwal_masuk = new ArrayList<Integer>();
        Jadwal_keluar = new ArrayList<Integer>();    
}

    public void insertid(int isi){
        this.id.add(isi);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
    
    public void insertJadwal_masuk(int isi){
        this.Jadwal_masuk.add(isi);
    }
    public ArrayList<Integer> getRecordJadwal_masuk(){
        return this.Jadwal_masuk;
    }
    
    public void insertJadwal_keluar(int isi){
        this.Jadwal_keluar.add(isi);
    }
    public ArrayList<Integer> getRecordJadwal_keluar(){
        return this.Jadwal_keluar;
    }
    
     public void insertjadwal(int id, int Jadwal_masuk,
             int Jadwal_keluar){
        this.id.add(id);
        this.Jadwal_masuk.add(Jadwal_masuk);
        this.Jadwal_keluar.add(Jadwal_keluar);
     }
         
 }