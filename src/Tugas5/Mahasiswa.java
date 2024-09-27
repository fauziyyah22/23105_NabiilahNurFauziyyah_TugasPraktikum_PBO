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
public class Mahasiswa {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa seperti pada contoh-contoh sebelumnya
        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // Perhitungan nilai akhir
        double nilaiAkhir = (0.10 * nilaiKehadiran) + 
                            (0.20 * nilaiTugas) + 
                            (0.30 * nilaiUTS) + 
                            (0.40 * nilaiUAS);

        // Menentukan grade dan keterangan sesuai dengan nilai akhir
        char grade;
        String keterangan;

        if (nilaiAkhir >= 76) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46) {
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }

        // Output hasil dengan format yang lebih sederhana seperti contoh sebelumnya
        System.out.println("\nTampilan Output:");
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + nama);
        System.out.println("Nilai Rata-rata : " + nilaiAkhir);
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);

        
    }
}

