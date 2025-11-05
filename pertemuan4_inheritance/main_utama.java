/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4_inheritance;

/**
 *
 * @author Admin
 */
public class main_utama {
    public static void main (String[] args){
        Enemy monster = new Enemy();
        Burung kenari = new Burung();
        pocong poci = new pocong();
        Zombie zumbi = new Zombie();
        
        monster.name = "Adel";
        monster.hp = 100;
        monster.attackPoint = 50;
        System.out.println( monster.name + "," + monster.hp +" ," + monster.attackPoint + " Gerakan :");
        monster.attack();
        System.out.println("-----------------------------------------------");
        
        kenari.name = " Rico";
        kenari.hp = 100;
        kenari.attackPoint = 50;
        System.out.println( kenari.name + "," + kenari.hp +" ," + kenari.attackPoint + " Gerakan :");
        kenari.fly();
        kenari.jump();
        kenari.walk();
        kenari.attack();
        System.out.println("-----------------------------------------------");
        
        poci.name = "susanto";
        poci.hp = 100;
        poci.attackPoint = 50;
        System.out.println(poci.name + "," + poci.hp +" ," + poci.attackPoint + " Gerakan :");
        poci.jump();
        poci.attack();
        System.out.println("-----------------------------------------------");
        
        zumbi.name = " zumarni";
        zumbi.hp = 100;
        zumbi.attackPoint = 50;
        System.out.println( zumbi.name + "," + zumbi.hp +" ," + zumbi.attackPoint + " Gerakan :");
        zumbi.walk();
        zumbi.attack();
        System.out.println("-----------------------------------------------");
        
        
        
    }
}