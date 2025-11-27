/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.inheritace;

/**
 *
 * @author Admin
 */
public class Makanan {
     protected String nama;
    protected double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
    }
}

