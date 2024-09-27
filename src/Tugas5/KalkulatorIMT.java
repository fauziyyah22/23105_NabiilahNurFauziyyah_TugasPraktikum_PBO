/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;

/**
 *
 * @author FIFI
 */
import java.util.Scanner;

public class KalkulatorIMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan berat badan dan tinggi badan
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menampilkan hasil IMT
        System.out.println("IMT Anda adalah: " + imt);

        // Menentukan kategori berat badan berdasarkan nilai IMT
        String kategori;
        
        if (imt < 18.5) {
            kategori = "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            kategori = "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            kategori = "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }
        System.out.println("Kategori      : " + kategori);
        
       
    }
}
