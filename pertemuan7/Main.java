/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Admin
 */import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        phone hp = new Xiaomi();   // Objek HP

        int pilihan;

        do {
            System.out.println("\n===================================");
            System.out.println("        MENU HP XIAOMI");
            System.out.println("===================================");
            System.out.println("1. Nyalakan HP");
            System.out.println("2. Matikan HP");
            System.out.println("3. Volume UP");
            System.out.println("4. Volume DOWN");
            System.out.println("5. Keluar Program");
            System.out.println("===================================");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1 -> hp.poweron();

                case 2 -> hp.poweroff();

                case 3 -> hp.volumeup();

                case 4 -> hp.volumeDown();

                case 5 -> System.out.println("Terima kasih sudah menggunakan program ini!");

                default -> System.out.println("Pilihan tidak valid! Coba lagi.");
            }

        } while (pilihan != 5);
    }
}
