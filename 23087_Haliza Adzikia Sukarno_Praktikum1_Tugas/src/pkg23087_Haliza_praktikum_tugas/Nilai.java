/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_Haliza_praktikum_tugas;

/**
 *
 * @author user
 */
public class Nilai {
    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    void Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    double NilaiAkhir() {
        return (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void CetakNilai() {
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Nilai Absen    [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas    [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS      [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS      [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir         : " + NilaiAkhir());
    }
}
  
