/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.keywordThis;

/**
 *
 * @author Admin
 */
public class Mahasiswa {
    //Atribut (ncapssulation) private artinya hanya bisa diakses di dalam kelas ini (enkapsulasi).
    String nama = " ";
    String nim = " ";
    String jurusan= " ";
    double ipk = 0;
    private String predikat;
    
    //constructor adalah metod khusus yang dibuat saat objek baru di buat
    public Mahasiswa(String nama ,String nim ,String jurusan,double ipk ){
        this.nama = nama ;
        this.nim = nim ;
        this.jurusan = jurusan ;
        this.ipk = ipk ;  
        
    }
    //method buat nampilin data siswa
    public void tampilkanData(){
        System.out.println("==== Data Mahasiswa====");
        System.out.println("Nama : "+ nama );
        System.out.println("Nim : " + nim );
        System.out.println("jurusan :" + jurusan );
        System.out.println("Ipk :" + ipk );
        System.out.println("------------------------");
    }
    String predikat() {
        if (ipk >= 3.5 ){
           predikat  = "Cumlaud";
        }else if (ipk >= 3.25 ){
           predikat = "Sangat Memuaskan";
        }

        return predikat ;
    }   
    // Method untuk update IPK
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
        System.out.println("IPK berhasil diperbarui menjadi " + ipk);        
    }
    boolean cekspp(boolean spp){
        if(spp == true){
            System.out.println("Lunas");
        }else {
            System.out.println("Belum lunas");
        }
        return spp;
    }
}

