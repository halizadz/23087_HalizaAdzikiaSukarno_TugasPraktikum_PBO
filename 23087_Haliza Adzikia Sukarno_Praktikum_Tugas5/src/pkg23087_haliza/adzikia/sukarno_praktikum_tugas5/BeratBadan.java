/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_haliza.adzikia.sukarno_praktikum_tugas5;

/**
 *
 * @author user
 */
public class BeratBadan {
    String BMI(double imt){
        String krit;
        if(imt < 18.4){
            krit = "Berat Badan Kurang";
        }else if(imt <= 24.9){
            krit = "Berat Badan Ideal";
        }else if(imt <= 29.9){
            krit = "Berat Badan Lebih";
        }else if(imt <= 39.9){
            krit = "Gemuk";
        }else{
            krit = "Sangat Gemuk" ;
        }
        return krit;
}
    
}