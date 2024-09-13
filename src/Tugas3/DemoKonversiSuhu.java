/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas3;

/**
 *
 * @author FIFI
 */
public class DemoKonversiSuhu {
    public static void main(String[] args) {
        // Membuat objek dari class KonversiSuhu2
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Set suhu Celcius untuk konversi
        konversi.setSuhu(100.0);
        System.out.println("Suhu dalam Celcius: " + konversi.getSuhu() + "°C");
        
        // Memanggil method untuk konversi dari Celcius ke Fahrenheit
        double fahrenheit = konversi.celciusToFahrenheit();
        System.out.println("100.0°C ke Fahrenheit: " + fahrenheit + "°F");
        
        // Memanggil method untuk konversi dari Celcius ke Reamur
        double reamur = konversi.celciusToReamur();
        System.out.println("100.0°C ke Reamur: " + reamur + "°Re");
        
        // Set suhu Fahrenheit untuk konversi ke Reamur
        konversi.setSuhu(212.0);
        System.out.println("Suhu dalam Fahrenheit: " + konversi.getSuhu() + "°F");
        
        // Memanggil method untuk konversi dari Fahrenheit ke Reamur
        double reamurFromFahrenheit = konversi.fahrenheitToReamur();
        System.out.println("212.0°F ke Reamur: " + reamurFromFahrenheit + "°Re");
    }
}

