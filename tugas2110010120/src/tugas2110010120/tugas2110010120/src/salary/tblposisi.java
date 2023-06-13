/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author User
 */
public class tblposisi {
    private int Tarif_per_jam;
    private String Nama_posisi;
   
    public tblposisi(){}
    
    public void setNama_posisi (int Tarif_per_jam){
        this.Tarif_per_jam=Tarif_per_jam;
    }
    public int getTarif_per_jam(){
        return this.Tarif_per_jam;
    }
    public void setNama_posisi (String Nama_posisi){
        this.Nama_posisi=Nama_posisi;
    }
    public String getNama_posisi(){
        return this.Nama_posisi;
    }
}
