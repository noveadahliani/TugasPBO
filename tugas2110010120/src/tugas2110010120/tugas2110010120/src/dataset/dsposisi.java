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
public class dsposisi {
    private ArrayList<Integer> Tarif_per_jam;
    private ArrayList<String> Nama_posisi;
    
     public dsposisi() {
        Tarif_per_jam = new ArrayList<Integer>();
        Nama_posisi = new ArrayList<String>();
}
     
    public void insertTarif_per_jam(int isi){
        this.Tarif_per_jam.add(isi);
    }
    public ArrayList<Integer> getRecordTarif_per_jam(){
        return this.Tarif_per_jam;
    }
    
    public void insertNama_posisi(String isi){
        this.Nama_posisi.add(isi);
    }
    public ArrayList<String> getRecordNama_posisi(){
        return this.Nama_posisi;
    }
    
     public void insertposisi(int Tarif_per_jam, 
             String Nama_posisi){
        this.Tarif_per_jam.add(Tarif_per_jam);
        this.Nama_posisi.add(Nama_posisi);
     }
}