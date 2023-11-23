/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts1;

/**
 *
 * @author WINDOWS 10
 */
abstract class MenuMakanan {
    private String nama;
    private double harga;

    public MenuMakanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
    
    public abstract void tampilkanMenu();
}
