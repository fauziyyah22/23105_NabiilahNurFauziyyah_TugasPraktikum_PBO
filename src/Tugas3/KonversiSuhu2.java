/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author FIFI
 */
public class KonversiSuhu2 extends KonversiSuhu {

    // Method untuk mengonversi suhu dari Fahrenheit ke Reamur
    public double fahrenheitToReamur() {
        // Mengonversi Fahrenheit ke Celcius terlebih dahulu
        double celcius = (getSuhu() - 32) * 5/9;
        // Lalu dari Celcius ke Reamur
        return celcius * 4/5;
    }
}
