/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_haliza.adzikia.sukarno_praktikum_tugas5;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class PembelianMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();

        // Membuat objek Pembelian
        Pembelian pembelian = new Pembelian(totalPembelian);

        // Menghitung potongan dan jumlah yang harus dibayarkan
        double potongan = pembelian.hitungPotongan();
        double jumlahBayar = pembelian.hitungJumlahBayar(potongan);

        // Output
        System.out.println("Besarnya potongan Rp. = " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + jumlahBayar);
    }
}
