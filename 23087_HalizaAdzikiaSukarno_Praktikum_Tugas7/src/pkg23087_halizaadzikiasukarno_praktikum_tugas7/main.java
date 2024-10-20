
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23087_halizaadzikiasukarno_praktikum_tugas7;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void  main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        // Deklarasi array
        String[] kodeBarang = new String[3];
        String[] namaBarang = new String[3];
        int[] hargaBarang = new int[3];
        int[] jumlahBeli = new int[3];
        int[] totalBayar = new int[3];
        
        // Input jumlah item
        System.out.print("Masukkan Item Barang: ");
        int jumlahItem = input.nextInt();
        
        // Loop untuk input data barang
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i+1));
            System.out.print("Masukkan Kode Barang: ");
            kodeBarang[i] = input.next();
            
            // Penentuan nama barang dan harga berdasarkan kode barang
            switch (kodeBarang[i]) {
                case "a001":
                    namaBarang[i] = "Buku";
                    hargaBarang[i] = 3000;
                    break;
                case "a002":
                    namaBarang[i] = "Pensil";
                    hargaBarang[i] = 4000;
                    break;
                case "a003":
                    namaBarang[i] = "Pulpen";
                    hargaBarang[i] = 5000;
                    break;
                default:
                    namaBarang[i] = "Tidak Diketahui";
                    hargaBarang[i] = 0;
                    break;
            }
            
            System.out.print("Masukkan jumlah beli: ");
            jumlahBeli[i] = input.nextInt();
            
            // Menghitung total bayar untuk setiap barang
            totalBayar[i] = hargaBarang[i] * jumlahBeli[i];
        }
        
        // Menampilkan hasil dalam bentuk tabel
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************************************");
        System.out.println("No  Kode Barang  Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        int totalKeseluruhan = 0;
        
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i+1) + "    " + kodeBarang[i] + "       " + namaBarang[i] + "        " + hargaBarang[i] + "      " + jumlahBeli[i] + "          " + totalBayar[i]);
            totalKeseluruhan += totalBayar[i];
        }
        
        System.out.println("***************************************");
        System.out.println("Total Bayar: " + totalKeseluruhan);
    }
}
    
    


