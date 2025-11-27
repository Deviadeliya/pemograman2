/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.inheritace;

/**
 *
 * @author Admin
 */
public class GoFoodApp {
    public static void main(String[] args) {

        MakananBerat nasiGoreng = new MakananBerat("Bakso Lumer", 15000, true);
        Minuman esTeh = new Minuman("Es Teh", 5000, true);

        System.out.println("=== Pesanan 1 ===");
        nasiGoreng.info();

        System.out.println("\n=== Pesanan 2 ===");
        esTeh.info();
    }
}


