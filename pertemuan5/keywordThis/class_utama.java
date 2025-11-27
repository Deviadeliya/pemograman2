/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5.keywordThis;

/**
 *
 * @author Admin
 */
public class class_utama {
    public static void main(String[]args){
    Mahasiswa m1 = new Mahasiswa (" Ahmad rifa'i", "2455201010" ," ilmu komputer", 3.80) ;
    Mahasiswa m2 = new Mahasiswa ("Muhammad arifudin", "2455201011" ," ilmu komputer", 3.75) ;
    m1.tampilkanData();
   
    m1.cekspp(true);
    System.out.println("predikat yang diperoleh " + m1.predikat());
    
    m2.tampilkanData();
   
    m2.cekspp(true);
    System.out.println("predikat yang diperoleh " + m2.predikat());
    }}