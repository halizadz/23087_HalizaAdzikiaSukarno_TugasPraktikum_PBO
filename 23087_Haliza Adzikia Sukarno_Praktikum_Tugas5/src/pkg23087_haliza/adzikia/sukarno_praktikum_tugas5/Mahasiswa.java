/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg23087_haliza.adzikia.sukarno_praktikum_tugas5;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String npm;
    private String nama;
    private double nilaiKehadiran;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    // Constructor
    public Mahasiswa(String npm, String nama, double nilaiKehadiran, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.npm = npm;
        this.nama = nama;
        this.nilaiKehadiran = nilaiKehadiran;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method untuk menghitung nilai rata-rata
    public double hitungNilaiAkhir() {
        return (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }

    // Method untuk menentukan grade berdasarkan nilai akhir
    public String tentukanGrade(double nilaiAkhir) {
        if (nilaiAkhir <= 45) return "E";
        else if (nilaiAkhir <= 55) return "D";
        else if (nilaiAkhir <= 65) return "C";
        else if (nilaiAkhir <= 75) return "B";
        else return "A";
    }

    // Method untuk menentukan keterangan berdasarkan grade
    public String tentukanKeterangan(String grade) {
        switch (grade) {
            case "E":
                return "KURANG SEKALI";
            case "D":
                return "KURANG";
            case "C":
                return "CUKUP";
            case "B":
                return "BAIK";
            case "A":
                return "ISTIMEWA";
            default:
                return "TIDAK VALID";
        }
    }

    // Getter untuk NPM dan Nama
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }
}

