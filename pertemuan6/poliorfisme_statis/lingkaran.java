/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6.poliorfisme_statis;

/**
 *
 * @author Admin
 */
public class lingkaran {
    //method menghitung luas denan jarijari overloading calss nama metod sama tapi memiiki parameter da tipedata berbeda
     // menghitung luas dengan jari-jari (float)
    float luas(float jarijari) {
        return (float) (Math.PI * jarijari * jarijari);
    }

    // menghitung luas dengan diameter (double)
    double luas(double d) {
        return (Math.PI * d * d) / 4;
    }

    public static void main(String[] args) {
       lingkaran L = new lingkaran();

        float jari2 = 10;
        double d = 20;

        System.out.println("Luas lingkaran dengan jari-jari = " + L.luas(jari2));
        System.out.println("Luas lingkaran dengan diameter = " + L.luas(d));
    }
}
