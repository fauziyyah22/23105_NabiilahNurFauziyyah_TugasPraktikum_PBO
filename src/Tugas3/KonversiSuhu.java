/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author FIFI
 */
public class KonversiSuhu {

    // Variabel suhu private untuk enkapsulasi
    private double suhu;

    // Setter untuk mengatur nilai suhu
    public void setSuhu(double suhu) {
        this.suhu = suhu;
    }

    // Getter untuk mendapatkan nilai suhu
    public double getSuhu() {
        return suhu;
    }

    // Method untuk mengonversi suhu dari Celcius ke Fahrenheit
    public double celciusToFahrenheit() {
        return (suhu * 9/5) + 32;
    }

    // Method untuk mengonversi suhu dari Celcius ke Reamur
    public double celciusToReamur() {
        return suhu * 4/5;
    }
}
