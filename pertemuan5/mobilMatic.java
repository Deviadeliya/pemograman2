/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Admin
 */
public class mobilMatic extends mobil{
    // constructor memanggil constructor parent
    public mobilMatic(String nama, int kecepatan) {
        super(nama, kecepatan);
    }

    // override method jalankan() dari Mobil
    @Override
    public void jalankan() {
        System.out.println("Mobil matic dijalankan:");
        System.out.println("Gigi di posisi D, tekan gas");
        System.out.println("Nama Mobil : " + this.nama);
        System.out.println("Kecepatan  : " + this.kecepatan + " km/jam");
    }

    // tambah method khusus mobil matic (opsional)
    public void pindahGigiD() {
        System.out.println("Transmisi otomatis: P -> R -> N -> D");
    }
}