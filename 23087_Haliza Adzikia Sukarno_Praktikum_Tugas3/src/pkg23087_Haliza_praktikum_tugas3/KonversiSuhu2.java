/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_Haliza_praktikum_tugas3;

/**
 *
 * @author user
 */
public class KonversiSuhu2 extends KonversiSuhu {
    public float fahrenheit;
    private float hasil;
   
    //method
    public float FahrenheitToReamur (){

        this.hasil = (float) ((this.fahrenheit * 4/9)- 32);
        return this.hasil;
    }
    void tampilkanHasil ()
    {
        System.out.println ("Konversi dari Fahrenheit ke Reamur = "+this.FahrenheitToReamur());
    }
}
