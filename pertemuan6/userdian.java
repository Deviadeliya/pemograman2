/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Admin
 */
public class userdian {
    public static void main(String[]args){
    //membuat objek dari keka user
    user dian = new user();
    
    //menggunakan mtode senter
    dian.setUsername("dian");
    dian.setPassword("kopi java");
    
    //menggunakan meotod getter
      System.out.println("Username : " + dian.getUsername());
      System.out.println("Password : " + dian.getPassword());

}
}

