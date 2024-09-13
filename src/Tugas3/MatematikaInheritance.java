/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

/**
 *
 * @author FIFI
 */
import Tugas2.Matematika;
public class MatematikaInheritance {
    public static void main(String[] args) {
        // Membuat objek dari class Matematika2
        Matematika2 matematika = new Matematika2();
        
        // Memanggil method dari class Matematika
        int hasilPertambahan = matematika.pertambahan(10, 5);
        System.out.println("Hasil pertambahan: " + hasilPertambahan);
        
        int hasilPengurangan = matematika.pengurangan(10, 5);
        System.out.println("Hasil pengurangan: " + hasilPengurangan);
        
        int hasilPerkalian = matematika.perkalian(10, 5);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        
        int hasilPembagian = matematika.pembagian(10, 5);
        System.out.println("Hasil pembagian: " + hasilPembagian);
        
        // Memanggil method dari class Matematika2 (method baru)
        int hasilModulus = matematika.modulus(10, 3);
        System.out.println("Hasil modulus: " + hasilModulus);
    }
}
