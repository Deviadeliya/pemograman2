/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6.constructor;

/**
 *
 * @author Admin
 */
public class class_user {
      String nama;
    String nim;

    // Konstruktor
    public class_user(String nama, String nim) {
        this.nama = nama;  // mengisi atribut nama
        this.nim = nim;    // mengisi atribut nim
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        
    }
}