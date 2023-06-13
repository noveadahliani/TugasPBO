/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salary;
import dataset.*;
/**
 *
 * @author User
 */
public class Tugas2110010120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        tblabsensipegawai absensipegawai = new tblabsensipegawai();
        tbladmin admin = new tbladmin();
        tbldatapegawai datapegawai = new tbldatapegawai();
        tblgaji gaji = new tblgaji();
        tbljadwal jadwal = new tbljadwal();
        tbllogin login = new tbllogin();
        tblposisi posisi= new tblposisi();
        tblpotongan potongan = new tblpotongan();

        //Set
        absensipegawai.setNIPPOS(01);
        absensipegawai.setNama("Novea Dahliani");
        absensipegawai.setTanggal("11-10-2022");
        absensipegawai.setWaktu_masuk("07.30");
        absensipegawai.setWaktu_keluar("05.00");
        
        admin.setid(01);
        admin.setNama_pertama("Novea Dahliani");
        admin.setNama_belakang("Dahliani");
        admin.setUsername("Novea Dahliani");
        admin.setPassword(123);
        admin.setDibuat_pada("1-02-2020");
        admin.setMengisi("");
        admin.setMengubah("");
        admin.setMelihat("");
        admin.setMenghapus(""); 
              

        //Get
        System.out.println("NIPPOS : " + absensipegawai.getNIPPOS());
        System.out.println("Nama : " + absensipegawai.getNama());
        System.out.println("Tanggal : " + absensipegawai.getTanggal());
        System.out.println("Waktu_masuk : " + absensipegawai.getWaktu_masuk());
        System.out.println("Waktu_keluar : " + absensipegawai.getWaktu_keluar());
        
        System.out.println("------------------------------------------");
        System.out.println("id admin :" + admin.getid());
        System.out.println("Nama_pertama : " + admin.getNama_pertama());
        System.out.println("Nama_belakang : " + admin.getNama_belakang());
        System.out.println("Username : " + admin.getUsername());
        System.out.println("Password : " + admin.getPassword());
        System.out.println("Dibuat_pada : " + admin.getDibuat_pada());
        System.out.println("Mengisi : " + admin.getMengisi());
        System.out.println("Mengubah : " + admin.getMengubah());
        System.out.println("Melihat : " + admin.getMelihat());
        System.out.println("Menghapus : " + admin.getMenghapus()); 
        */
        //Memasukkan Array List kedalam Object
        dsabsensipegawai absensipegawai= new dsabsensipegawai();
        dsadmin admin = new dsadmin();
        dsdatapegawai datapegawai = new dsdatapegawai();
        dsgaji gaji = new dsgaji();
        dsjadwal jadwal = new dsjadwal();
        dslogin login = new dslogin();
        dsposisi posisi = new dsposisi();
        dspotongan potongan = new dspotongan();
        
        //Menginput data ArrayList pada masing-masing tabel
        absensipegawai.insertNIPPOS(01);
        absensipegawai.insertNama("Novea Dahliani");
        absensipegawai.insertTanggal(11-10-2022);
        absensipegawai.insertWaktu_masuk("07.30");
        absensipegawai.insertWaktu_keluar("05.00");
        
        admin.insertid(01);
        admin.insertNama_pertama("Novea Dahliani");
        admin.insertNama_belakang("Dahliani");
        admin.insertUsername(234);
        admin.insertPassword(123);
        admin.insertDibuat_pada(1-02-2020);
        admin.insertMengisi("");
        admin.insertMengubah("");
        admin.insertMelihat("");
        admin.insertMenghapus(""); 
        
        datapegawai.insertNIPPOS(02);
        datapegawai.insertNama("Bagus Setiawan");
        datapegawai.insertPassword(234);
        datapegawai.insertPegawai_sejak(2017);
        datapegawai.insertPosisi("Staff");
        datapegawai.insertJadwal("Senin");
        datapegawai.insertMelihat("");
        datapegawai.insertMengisi("");
        
        gaji.insertNIPPOS(03);
        gaji.insertNama("Dewi Sartika");
        gaji.insertGaji_kotor(3000000);
        gaji.insertPotongan(50000);
        gaji.insertGaji_bersih(2950000);
        
        jadwal.insertid(04);
        jadwal.insertJadwal_masuk("07.30");
        jadwal.insertJadwal_keluar("05.00");
        
        login.insertNIPPOS(05);
        login.insertPassword(456);
        login.insertLogin(111);
        
        posisi.insertTarif_per_jam(5000);
        posisi.insertNama_posisi("Admin");
      
        potongan.insertPotongan(5000);
        potongan.insertJumlah(111);
        
        
        
        System.out.println("\t");
        System.out.println("===============DATA ABSENSIPEGAWAI==============");
        System.out.println(absensipegawai.getRecordNIPPOS());
        System.out.println(absensipegawai.getRecordNama());
        System.out.println(absensipegawai.getRecordTanggal());
        System.out.println(absensipegawai.getRecordWaktu_masuk());
        System.out.println(absensipegawai.getRecordWaktu_keluar());
        
        
        System.out.println("\t");
        System.out.println("===============DATA ADMIN==============");
        System.out.println(admin.getRecordid());
        System.out.println(admin.getRecordNama_pertama());
        System.out.println(admin.getRecordNama_belakang());
        System.out.println(admin.getRecordUsername());
        System.out.println(admin.getRecordPassword());
        System.out.println(admin.getRecordDibuat_pada());
        System.out.println(admin.getRecordMengisi());
        System.out.println(admin.getRecordMengubah());
        System.out.println(admin.getRecordMelihat());
        System.out.println(admin.getRecordMenghapus());
        
        System.out.println("\t");
        System.out.println("===============DATA PEGAWAI==============");
        System.out.println(datapegawai.getRecordNIPPOS());
        System.out.println(datapegawai.getRecordNama());
        System.out.println(datapegawai.getRecordPassword());
        System.out.println(datapegawai.getRecordPegawai_sejak());
        System.out.println(datapegawai.getRecordPosisi());
        System.out.println(datapegawai.getRecordJadwal());
        System.out.println(datapegawai.getRecordMelihat());
        System.out.println(datapegawai.getRecordMengisi());
        
        System.out.println("\t");
        System.out.println("===============DATA GAJI==============");
        System.out.println(gaji.getRecordNIPPOS());
        System.out.println(gaji.getRecordNama());
        System.out.println(gaji.getRecordGaji_kotor());
        System.out.println(gaji.getRecordPotongan());
        System.out.println(gaji.getRecordGaji_bersih());
        
        System.out.println("\t");
        System.out.println("===============DATA JADWAL==============");
        System.out.println(jadwal.getRecordid());
        System.out.println(jadwal.getRecordJadwal_masuk());
        System.out.println(jadwal.getRecordJadwal_keluar());
        
        System.out.println("\t");
        System.out.println("===============DATA LOGIN==============");
        System.out.println(login.getRecordNIPPOS());
        System.out.println(login.getRecordPassword());
        System.out.println(login.getRecordLogin());
        
        System.out.println("\t");
        System.out.println("===============DATA POSISI==============");
        System.out.println(posisi.getRecordTarif_per_jam());
        System.out.println(posisi.getRecordNama_posisi());
        
        System.out.println("\t");
        System.out.println("===============DATA POTONGAN==============");
        System.out.println(potongan.getRecordPotongan());
        System.out.println(potongan.getRecordJumlah());
    }
    
}

