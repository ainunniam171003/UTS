/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts1;

/**
 *
 * @author WINDOWS 10
 */
class TehHangat implements Makanan {
    private double harga;

    public TehHangat(double harga) {
        this.harga = harga;
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("Menu: Teh Hangat");
        System.out.println("Harga: " + harga);
    }

    @Override
    public void pesan(){
        System.out.println("Anda telah memesan Teh Hangat"); }
    
}
