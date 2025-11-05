/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4_modifier;

/**
 *
 * @author Admin
 */
public class class_utama {
    public static void main(String[]args){
    System.out.println("________________________________________________________");
    Mahasiswa m1 = new Mahasiswa("2455201010","Devi Adeliya",3.80) ;
    m1.tampilkanData();
    m1.updateIpk(4.0);
    m1.tampilkanData();
    
    System.out.println("predikat yang diperoleh " + m1.predikat());
    System.out.println("KIP : "+ m1.kip(123));
    System.out.println("________________________________________________________");
    
       }
}
