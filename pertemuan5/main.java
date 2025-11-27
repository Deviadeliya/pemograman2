/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[]args){
        
       mobil m1 = new mobil("Toyota Avanza", 60);
        m1.jalankan();
        System.out.println();

        // buat objek mobil matic (subclass)
        mobilMatic mm = new mobilMatic("Honda Jazz", 80);
        mm.jalankan();
        mm.pindahGigiD();
       
       
    }
}

       
