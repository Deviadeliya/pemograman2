/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Admin
 */
public class Xiaomi implements phone {

    private int volume;
    private boolean isPoweron;
    private int MIN_VOLUME;

    public Xiaomi() {
        this.volume = 50;
    }

    @Override
    public void poweron() {
        isPoweron = true;
        System.out.println("Handphone Menyala......");
        System.out.println("Selamat Datang Di XIAOMI PHONE");
        System.out.println("Android Version 100");
    }

    @Override
    public void poweroff() {
        isPoweron = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeup() {
        if (isPoweron) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Dulu HP-nya Brow......!!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPoweron) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume MIN");
                System.out.println("Sudah " + this.getVolume() + "%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang : " + this.getVolume());
            }
        } else {
            System.out.println("Nyalakan Dulu HP-nya Brow......!!");
        }
    }

    private int getVolume() {
        return this.volume;
    }
}



