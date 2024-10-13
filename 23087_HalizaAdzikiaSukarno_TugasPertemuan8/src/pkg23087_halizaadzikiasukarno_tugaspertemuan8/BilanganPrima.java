/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_halizaadzikiasukarno_tugaspertemuan8;

/**
 *
 * @author user
 */
public class BilanganPrima {
    public static void main(String[] args) {
        System.out.println("Bilangan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) { //Perulangan dari 0 hingga 20
            if (isPrime(i)) { //Memeriksa apakah i merupakah bilangan prima
                System.out.print(i + " "); //Jika prima, cetak i
            }
        }

        System.out.println("\n\nBilangan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) { // perulangan dari 0 hingga 20
            if (!isPrime(i)) { //mencetak apakah i bukan bilangan prima
                System.out.print(i + " "); //jika bukan prima, cetak i
            }
        }
    }

    public static boolean isPrime(int n) { //Fungsi untuk memeriksa apakah bilangan n merupakan bilangan prima
        if (n <= 1) return false; //Bilangan 0 dan 1 bukan bilangan prima
        for (int i = 2; i <= Math.sqrt(n); i++) { //periksa pembagi dari 2 hingga akar kuadrat n
            if (n % i == 0) return false; //jika habis dibagi, n bukan bilangan prima
        }
        return true;
    }
}

