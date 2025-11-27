/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.inheritace;

/**
 *
 * @author Admin
 */
public class Minuman extends Makanan {
    private final boolean dingin;

    public Minuman(String nama, double harga, boolean dingin) {
        super(nama, harga);
        this.dingin = dingin;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Dingin: " + (dingin ? "Ya" : "Tidak"));
    }
}


