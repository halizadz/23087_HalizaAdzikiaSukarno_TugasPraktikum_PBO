/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_Haliza_praktikum_tugas3;

/**
 *
 * @author user
 */
public class KonversiSuhu {
    public float celcius;
    private float hasil;
   
    //method
    public float CelciusToFahrenheit ()
    {
        this.hasil = (float) (this.celcius * 1.8 + 32);
        return this.hasil;
    }
    public float CelciusToReamur()
    {
      this.hasil = (float) (this.celcius * 0.8);
      return this.hasil;
    }
   
    void tampilkanHasil ()
    {
        System.out.println ("Konversi dari Celcius ke Fahrenheit = "+this.CelciusToFahrenheit());
        System.out.println ("Konversi dari Celcius ke Reamur = "+this.CelciusToReamur());
    }
}
