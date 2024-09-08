/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_Haliza_Praktikum2_Tugas;

/**
 *
 * @author user
 */
public class Bingo {
    private String bingo = "BINGO";
    private String clap = "(clap)";
    
    public void sing() {
        // Loop untuk setiap baris yang berbeda
        for (int i = 0; i <= bingo.length(); i++) {
            // Bagian pertama lagu
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            
            // Bagian untuk mengeja B-I-N-G-O dengan substitusi clap
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < bingo.length(); k++) {
                    if (k < i) {
                        System.out.print(clap);
                    } else {
                        System.out.print(bingo.charAt(k));
                    }
                    if (k < bingo.length() - 1) {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            
            // Bagian akhir lagu
            System.out.println("And Bingo was his name-o.");
            System.out.println(); // Baris kosong untuk pemisah
        }
    }
}
