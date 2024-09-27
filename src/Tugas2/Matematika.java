/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author FIFI
 */
public class Matematika implements MatematikaInterface {

    @Override
    public int pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int perkalian(int a, int b) {
        return a * b;
    }

    @Override
    public int pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
            return 0; // Mengembalikan nilai default untuk menandakan error
        } else {
            return a / b;
        }
    }
}
