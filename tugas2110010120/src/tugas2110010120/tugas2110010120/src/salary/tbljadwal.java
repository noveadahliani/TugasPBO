/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author User
 */
public class tbljadwal {
    private int id;
    private String Jadwal_masuk, Jadwal_keluar;
    public tbljadwal(){}
    
    
     public void setid (int id){
        this.id=id;
    }
    public int getid(){
        return this.id;
    }
     public void setJadwal_masuk (String Jadwal_masuk){
        this.Jadwal_masuk=Jadwal_masuk;
    }
    public String getJadwal_masuk(){
        return this.Jadwal_masuk;
    }
     public void setJadwal_keluar (String Jadwal_keluar){
        this.Jadwal_keluar=Jadwal_keluar;
    }
    public String getJadwal_keluar(){
        return this.Jadwal_keluar;
    }
    
}
