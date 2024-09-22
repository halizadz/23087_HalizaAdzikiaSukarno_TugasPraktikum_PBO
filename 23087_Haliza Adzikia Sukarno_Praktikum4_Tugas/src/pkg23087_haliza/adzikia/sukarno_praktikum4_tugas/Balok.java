/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_haliza.adzikia.sukarno_praktikum4_tugas;

/**
 *
 * @author user
 */

class Balok extends BangunRuang {
    
    private double panjang, lebar, tinggi;

    // Konstruktor untuk Balok
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Implementasi metode untuk menghitung volume balok
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    // Implementasi metode untuk menghitung luas permukaan balok
    @Override
    public double luasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}

