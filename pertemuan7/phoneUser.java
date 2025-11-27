/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Admin
 */
public class phoneUser {
    private final phone phone;
    
    public phoneUser(phone phone){
        this.phone = phone;
    }
    
    void turnOnThePhone(){
        this.phone.poweron();
    }
        
    void turnOffThePhone(){
        this.phone.poweroff();
    }
     void makePhoneLouder(){
        this.phone.volumeup();
       
}

 void makePhoneient(){
        this.phone.volumeDown();

    }
}