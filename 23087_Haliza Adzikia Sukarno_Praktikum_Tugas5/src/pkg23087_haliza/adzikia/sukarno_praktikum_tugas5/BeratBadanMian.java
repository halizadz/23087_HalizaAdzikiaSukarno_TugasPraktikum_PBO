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

public class BeratBadanMian {
    
 public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        BeratBadan pb = new BeratBadan();
        
        System.out.println("Berat Badan: ");
        double bb = inp.nextDouble();
        System.out.println("Tinggi Badan: ");
        double tb = inp.nextDouble();
        double imt = (bb/(tb*tb));
        System.out.println("IMT Anda : " + imt);
        System.out.println("Dengan Kriteria : " + pb.BMI(imt));
    } 
}

