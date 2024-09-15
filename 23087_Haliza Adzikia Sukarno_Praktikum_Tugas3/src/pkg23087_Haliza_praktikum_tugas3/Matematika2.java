/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_Haliza_praktikum_tugas3;

/**
 *
 * @author user
 */
class Matematika2 extends Matematika{
    public int modulus (int a, int b){
        return a % b;
}
    public int pengurangan(int a, int b){
        // Memanggil metode dari kelas induk dan mengembalikan hasilnya
       return super.pengurangan(a, b);
  
    }
    
    public int pertambahan(int a, int b) {
        // Memanggil metode dari kelas induk dan mengembalikan hasilnya
       return super.pertambahan(a,b);
    }
    
    public int perkalian(int a, int b) {
        // Memanggil metode dari kelas induk dan mengembalikan hasilnya
       return super.perkalian(a,b);
    }
    
    public int pembagian(int a, int b) {
        // Memanggil metode dari kelas induk dan mengembalikan hasilnya
       return super.pembagian(a,b);
    }
}
