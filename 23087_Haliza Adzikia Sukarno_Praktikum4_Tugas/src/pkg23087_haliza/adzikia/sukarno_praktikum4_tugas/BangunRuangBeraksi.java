/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_haliza.adzikia.sukarno_praktikum4_tugas;

/**
 *
 * @author user
 */
public class BangunRuangBeraksi {
    public static void main(String[] args) {
        // Membuat objek Balok dan Kubus menggunakan referensi dari BangunRuang (polimorfisme)
        BangunRuang balok = new Balok(5, 3, 2);
        BangunRuang kubus = new Kubus(4);

        // Menghitung dan menampilkan volume dan luas permukaan balok
        System.out.println("Balok:");
        System.out.println("Volume: " + balok.volume());
        System.out.println("Luas Permukaan: " + balok.luasPermukaan());

        // Menghitung dan menampilkan volume dan luas permukaan kubus
        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.volume());
        System.out.println("Luas Permukaan: " + kubus.luasPermukaan());
    }
}
