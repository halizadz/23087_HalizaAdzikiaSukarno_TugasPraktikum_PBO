/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23087_halizaadzikiasukarno_tugaspertemuan8;

/**
 *
 * @author user
 */
public class BilanganGanjilGenap {
    public static void main(String[] args) {
        System.out.println("Bilangan Genap dari 0 - 20:");
        for (int i = 0; i <= 20; i += 2) { // Melakukan perulangan dengan interval 2, mulai dari 0
            System.out.print(i + " "); //mencetak bilangan genap
        }

        System.out.println("\n\nBilangan Ganjil dari 0 - 20:");
        for (int i = 1; i <= 20; i += 2) { // Melakukan perulangan dengan interval 2,mulai dari 1
            System.out.print(i + " "); //mencetak bilangan ganjil
        }
    }
}

