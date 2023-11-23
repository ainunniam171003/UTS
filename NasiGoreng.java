/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts1;

/**
 *
 * @author WINDOWS 10
 */
class NasiGoreng extends MenuMakanan implements Makanan {
    private String bumbu;

    public NasiGoreng(String nama, double harga, String bumbu) {
        super(nama, harga);
        this.bumbu = bumbu;
    }

    public String getBumbu() {
        return bumbu;
    }

    @Override
    public void tampilkanMenu() {
        System.out.println("Level: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Bumbu: " + getBumbu());
    }

    @Override
    public void pesan() {
        System.out.println("Anda telah memesan nasi goreng " + getNama()); }
}
