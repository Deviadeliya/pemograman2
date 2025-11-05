/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4_modifier;

/**
 *
 * @author Admin
 */
public class Mahasiswa {
    
    private final String nim;// variable private yang hanya bisa di akses di class i saja ,penambahan final di perlukan karena variable nim nilaynya tidak berubah
    private final String nama;
    private double ipk = 0;
    private String predikat;
    private double uang_saya = 0;
    
    
    //constructor adalah metod khusus yang dibuat saat objek baru di buat
    public Mahasiswa(String nim,String nama,double ipk){
        this.nama= nama;
        this.nim = nim;
        this.ipk = ipk;  
        
    }
    //membuat prosedur
    public void tampilkanData(){
        System.out.println("==== Data Mahasiswa====");
        System.out.println("Nim : " + nim );
        System.out.println("Nama : "+ nama );
        System.out.println("Ipk :" + ipk );
        System.out.println("------------------------");
    } 
    //membuat fungsii
    public String predikat() {
        if (ipk >= 4.0 ){
           predikat  = "Cumlaud";
        }else if (ipk >= 3.25 ){
           predikat = "Memuaskan";
        }else if (ipk >= 3.0 ){
           predikat = "Biasa";
        }else if (ipk >= 2.5 ){
           predikat = "mengulang";
        }else{
           predikat = " IPK tidak valid";
        }
        return predikat ;
    }   
    // prosedur  yang ada parameternya
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
        System.out.println("IPK berhasil diperbarui menjadi " + ipk);        
    }
    
    //fungsi yang ada parameternya
    public double kip (int no_req){
        if(no_req == 123){
           if(ipk > 3.6){
               uang_saya = 4000000;
        }
        }
        return uang_saya;
    }
}

