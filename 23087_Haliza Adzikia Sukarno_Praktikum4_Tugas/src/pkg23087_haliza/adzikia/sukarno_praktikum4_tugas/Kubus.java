/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_haliza.adzikia.sukarno_praktikum4_tugas;

/**
 *
 * @author user
 */
class Kubus extends BangunRuang {
    private double sisi;

    // Konstruktor untuk Kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi metode untuk menghitung volume kubus
    public double volume() {
        return sisi * sisi * sisi;
    }

    // Implementasi metode untuk menghitung luas permukaan kubus
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }
}
