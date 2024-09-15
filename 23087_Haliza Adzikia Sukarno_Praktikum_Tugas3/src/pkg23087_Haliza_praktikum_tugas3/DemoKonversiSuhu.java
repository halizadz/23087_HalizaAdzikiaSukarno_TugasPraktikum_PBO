/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_Haliza_praktikum_tugas3;

/**
 *
 * @author user
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        System.out.println ("Konversi 30 Celcius");
        KonversiSuhu n1 = new KonversiSuhu ();
        n1.celcius = 30;
        n1.tampilkanHasil();
       
        System.out.println ("Konversi 45 Celcius");
        KonversiSuhu n2 = new KonversiSuhu ();
        n2.celcius = 45;
        n2.tampilkanHasil();
       
        System.out.println ("Konversi 50.5 Celcius");
        KonversiSuhu n3 = new KonversiSuhu ();
        n3.celcius = (float)50.5;
        n3.tampilkanHasil();
       
        System.out.println ("Konversi 120 Celcius");
        KonversiSuhu n4 = new KonversiSuhu ();
        n4.celcius = 120;
        n4.tampilkanHasil();
    }
}
