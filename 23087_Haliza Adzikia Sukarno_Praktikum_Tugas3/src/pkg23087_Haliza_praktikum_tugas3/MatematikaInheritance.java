/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_Haliza_praktikum_tugas3;

/**
 *
 * @author user
 */
public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 math = new Matematika2();
        
         // Menampilkan hasil operasi
        System.out.println("Pertambahan: 20+10 = " + math.pertambahan(20, 10));
        System.out.println("Pengurangan: 10-5 = " + math.pengurangan(10, 5));
        System.out.println("Perkalian  : 10*3 = " + math.perkalian(10, 3));
        System.out.println("Pembagian  : 21/2 = " + math.pembagian(21, 2));
        System.out.println("Modulus  : 20%2 = " + math.modulus(10, 2));
      
    }
}
