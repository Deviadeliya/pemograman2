/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author Admin
 */
class Makanan {
    // Class Makanan merepresentasikan data makanan
    String nama;
    double harga;

    // Konstruktor (dipanggil saat membuat objek)
    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method untuk menampilkan informasi makanan
    public void tampilkanInfo() {
        System.out.println("Nama Makanan : " + nama);
        System.out.println("Harga        : Rp" + harga);
    }
}

