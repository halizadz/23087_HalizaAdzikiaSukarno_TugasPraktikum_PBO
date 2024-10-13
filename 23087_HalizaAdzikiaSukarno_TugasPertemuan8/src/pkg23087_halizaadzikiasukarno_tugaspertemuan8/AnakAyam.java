/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23087_halizaadzikiasukarno_tugaspertemuan8;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = scanner.nextInt();

        int i = n;  // Inisialisasi i dengan nilai n
        do {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu habis.");
            }
            i--;  // Dekrementasi i
        } while (i > 0);  // Kondisi perulangan selama i lebih dari 0
    }
}
