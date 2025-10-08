/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Admin
 */

public class PesananMakanan {
    public static void main(String[] args) {
        // Membuat 2 objek dari class Makanan
        Makanan makanan1 = new Makanan("Nasi Goreng", 20000);
        Makanan makanan2 = new Makanan("Mie Ayam", 15000);

        System.out.println("=== PROGRAM PESANAN MAKANAN ===\n");

        // Menampilkan info makanan
        makanan1.tampilkanInfo();
        System.out.println(); // baris kosong
        makanan2.tampilkanInfo();

        // Menghitung total harga
        double total = makanan1.harga + makanan2.harga;
        System.out.println("\nTotal Harga : Rp" + total);
    }
}

