/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;
import java.util.Scanner;
/**
 *
 * @author FIFI
 */
public class Pembelian {
    public static void main(String[] args) {
        // Membuat Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Masukkan total pembelian: Rp ");
        double totalPembelian = input.nextDouble();

        // Deklarasi variabel untuk potongan dan total bayar
        double potongan = 0;
        double totalBayar;

        // Logika menentukan potongan berdasarkan total pembelian
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05; // Potongan 5% untuk pembelian di bawah 50.000
        } else {
            potongan = totalPembelian * 0.20; // Potongan 20% untuk pembelian 50.000 atau lebih
        }

        // Menghitung total yang harus dibayar
        totalBayar = totalPembelian - potongan;

        // Output hasil perhitungan
        System.out.println("\nTotal pembelian: Rp " + totalPembelian);
        System.out.println("Besarnya potongan: Rp " + potongan);
        System.out.println("Jumlah yang harus dibayarkan: Rp " + totalBayar);
        
    }
}
