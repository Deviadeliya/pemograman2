/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 * 
 * @author Admin
 */
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        PBO_Master master = new PBO_Master();
        Scanner input = new Scanner(System.in);

        System.out.print("M3asukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine(); // buang enter

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + i);

            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("NIM  : ");
            String nim = input.nextLine();

            master.tampilkanDataMahasiswa(nama, nim);
        }

        input.close();
    }
}