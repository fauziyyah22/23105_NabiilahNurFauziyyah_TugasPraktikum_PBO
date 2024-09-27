/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author FIFI
 */
import Tugas2.Matematika;
public class Matematika2 extends Matematika {

    // Method baru untuk menghitung modulus
    public int modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulus dengan 0 tidak diperbolehkan.");
            return 0; // Mengembalikan nilai default untuk menandakan error
        } else {
            return a % b;
        }
    }
}
