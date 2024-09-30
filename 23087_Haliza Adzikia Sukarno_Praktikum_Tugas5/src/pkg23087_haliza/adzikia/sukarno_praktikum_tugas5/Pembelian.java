/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_haliza.adzikia.sukarno_praktikum_tugas5;

/**
 *
 * @author user
 */
public class Pembelian {
    private double totalPembelian;

    // Constructor
    public Pembelian(double totalPembelian) {
        this.totalPembelian = totalPembelian;
    }

    // Method untuk menghitung potongan
    public double hitungPotongan() {
        if (totalPembelian < 50000) {
            return totalPembelian * 0.05;
        } else {
            return totalPembelian * 0.2;
        }
    }

    // Method untuk menghitung total yang harus dibayarkan
    public double hitungJumlahBayar(double potongan) {
        return totalPembelian - potongan;
    }
}

