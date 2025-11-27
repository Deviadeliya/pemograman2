/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.inheritace;

/**
 *
 * @author Admin
 */
public class MakananBerat extends Makanan {
     private final boolean pedas;

    public MakananBerat(String nama, double harga, boolean pedas) {
        super(nama, harga); // memanggil konstruktor induk
        this.pedas = pedas;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Pedas: " + (pedas ? "Ya" : "Tidak"));
    }
}

