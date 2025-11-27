/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_7.polimorisme_dinamis;

/**
 *
 * @author Admin
 */
public class mainutama {
    public static void main(String[] args) {
         
        bangundatar bangunD = new bangundatar();
        persegi persegi = new persegi(5);
        segitiga segitiga = new segitiga(5 ,10);
        lingaran lingkaran = new lingaran(10);
        
        //panggil method luas  dan keliing
        bangunD.luas();
        bangunD.keliling();
        
        System.out.println("luas persegi :"+ persegi.luas());
        System.out.println("keliling persegi :"+ persegi.luas());
        System.out.println("luas segitiga :"+ segitiga.luas());
        System.out.println("luas lingkaran :"+ lingkaran.luas());
        System.out.println("Klilng lingkaran :"+ lingkaran.keliling());
    }
}
