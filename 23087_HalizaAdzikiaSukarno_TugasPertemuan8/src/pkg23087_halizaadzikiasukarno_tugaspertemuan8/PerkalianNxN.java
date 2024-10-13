/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23087_halizaadzikiasukarno_tugaspertemuan8;

/**
 *
 * @author user
 */
import java.util.Scanner;  // Mengimpor kelas Scanner untuk menerima input dari pengguna

public class PerkalianNxN{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Membuat objek Scanner untuk menerima input

        // Meminta pengguna memasukkan nilai n (maksimal 10)
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();  // Menyimpan input pengguna ke dalam variabel n

        // Mengecek apakah nilai n lebih besar dari 10 atau lebih kecil dari 1
        if (n > 10 || n < 1) {
            System.out.println("Nilai n harus antara 1 dan 10.");
            return;  // Menghentikan program jika input tidak valid
        }

        // Menampilkan header kolom (angka 1 sampai n)
        System.out.print("\t");  // Menambahkan tab di awal untuk keselarasan
        int i = 1;
        while (i <= n) {
            System.out.print(i + "\t");  // Mencetak angka header kolom dari 1 sampai n
            i++;
        }
        System.out.println();  // Pindah baris setelah header kolom selesai

        // Menggunakan perulangan untuk mencetak tabel perkalian dengan header baris
        i = 1;  // Menginisialisasi variabel i untuk baris
        while (i <= n) {
            System.out.print(i + "\t");  // Mencetak header baris
            int j = 1;
            while (j <= n) {  // Perulangan dalam untuk kolom
                System.out.print(i * j + "\t");  // Mencetak hasil perkalian
                j++;
            }
            System.out.println();  // Pindah baris setelah satu baris selesai
            i++;
        }
    }
}

