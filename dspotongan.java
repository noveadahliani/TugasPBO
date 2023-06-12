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
public class dspotongan {
    private ArrayList<Integer>  Potongan;
    private ArrayList<Integer> Jumlah;
    
     public dspotongan() {
        Potongan = new ArrayList<Integer>();
        Jumlah = new ArrayList<Integer>();   
}

     public void insertPotongan(int isi){
        this.Potongan.add(isi);
    }
    public ArrayList<Integer> getRecordPotongan(){
        return this.Potongan;
    }
    
    public void insertJumlah (int isi){
        this.Jumlah .add(isi);
    }
    public ArrayList<Integer> getRecordJumlah(){
        return this.Jumlah ;
    }
    
     public void insertpotongan(int Potongan, 
             int Jumlah){
        this.Potongan.add(Potongan);
        this.Jumlah.add(Jumlah);
     } 
}