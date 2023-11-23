/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts1;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Meminta input dari pengguna
        System.out.print("Masukkan Level untuk Nasi Goreng : ");
        String namaNasiGoreng = scanner.nextLine();
        System.out.print("Masukkan harga untuk Nasi Goreng : ");
        double hargaNasiGoreng = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan newline character
        System.out.print("Masukkan bumbu untuk Nasi Goreng : ");
        String bumbuNasiGoreng = scanner.nextLine();

        // Membuat objek NasiGoreng
        Makanan nasiGoreng = new NasiGoreng(namaNasiGoreng, hargaNasiGoreng, bumbuNasiGoreng);

        // Meminta input untuk Teh Hangat
        System.out.print("Masukkan harga untuk Teh Hangat : ");
        double hargaTehHangat = scanner.nextDouble();

        // Membuat objek TehHangat
        TehHangat tehHangat = new TehHangat(hargaTehHangat);

        // Menampilkan informasi di konsol
        System.out.println("\nInformasi Nasi Goreng :");
        nasiGoreng.tampilkanMenu();
        nasiGoreng.pesan();

        System.out.println("\nInformasi Teh Hangat :");
        tehHangat.tampilkanMenu();
        tehHangat.pesan();

        // Menutup scanner
        scanner.close(); }
}
