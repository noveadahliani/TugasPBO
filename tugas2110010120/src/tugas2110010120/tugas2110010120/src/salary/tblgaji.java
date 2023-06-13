/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author User
 */
public class tblgaji {
    private int NIPPOS, Gaji_kotor, Potongan, Gaji_bersih;
    private String Nama;
    
    
    public tblgaji(){}
    
    public void setNIPPOS (int NIPPOS){
        this.NIPPOS=NIPPOS;
    }
    public int getNIPPOS(){
        return this.NIPPOS;
    }
    public void setGaji_kotor(int Gaji_kotor){
        this.Gaji_kotor= Gaji_kotor;
    }
    public int getGaji_kotor(){
        return this.Gaji_kotor;
    }
    public void setPotongsn (int Potongan){
        this.Potongan=Potongan;
    }
    public int getPotongan(){
        return this.Potongan;
    }
    public void setGaji_bersih (int Gaji_bersih){
        this.Gaji_bersih=Gaji_bersih;
    }
    public int getGaji_bersih(){
        return this.Gaji_bersih;
    }
    public void setNama(String Nama){
        this.Nama=Nama;
    }
    public String getNama(){
        return this.Nama;
    }
    
}
