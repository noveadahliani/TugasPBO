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
public class dsgaji {
    private ArrayList<Integer> NIPPOS;
    private ArrayList<String> Nama;
    private ArrayList<Integer> Gaji_kotor;
    private ArrayList<Integer> Potongan;
    private ArrayList<Integer> Gaji_bersih;
    
    public dsgaji() {
        NIPPOS = new ArrayList<Integer>();
        Nama = new ArrayList<String>();
        Gaji_kotor = new ArrayList<Integer>();
        Potongan = new ArrayList<Integer>();
        Gaji_bersih = new ArrayList<Integer>();    
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
    
    public void insertGaji_kotor(int isi){
        this.Gaji_kotor.add(isi);
    }
    public ArrayList<Integer> getRecordGaji_kotor(){
        return this.Gaji_kotor;
    }
    
    public void insertPotongan(int isi){
        this.Potongan.add(isi);
    }
    public ArrayList<Integer> getRecordPotongan(){
        return this.Potongan;
    }
    
    public void insertGaji_bersih(int isi){
        this.Gaji_bersih.add(isi);
    }
    public ArrayList<Integer> getRecordGaji_bersih(){
        return this.Gaji_bersih;
    }
    
     public void insertgaji(int NIPPOS, String Nama, int Gaji_kotor, int Potongan, 
            int Gaji_bersih){
        this.NIPPOS.add(NIPPOS);
        this.Nama.add(Nama);
        this.Gaji_kotor.add(Gaji_kotor);
        this.Potongan.add(Potongan);
        this.Gaji_bersih.add(Gaji_bersih);
        
    }
}