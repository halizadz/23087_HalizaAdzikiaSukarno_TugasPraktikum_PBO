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

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("NPM: ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);

        // Menghitung nilai akhir dan menentukan grade
        double nilaiAkhir = mahasiswa.hitungNilaiAkhir();
        String grade = mahasiswa.tentukanGrade(nilaiAkhir);
        String keterangan = mahasiswa.tentukanKeterangan(grade);

        // Output
        System.out.println("\n=== Output Nilai Mahasiswa ===");
        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
