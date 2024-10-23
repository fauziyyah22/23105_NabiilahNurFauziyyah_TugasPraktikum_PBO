/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;
import java.time.YearMonth;
/**
 *
 * @author FIFI
 */
public class HitungHari {
    //Metode untuk menghitung jumlah hari berdasarkan tahun dan bulan
    public int hitung(int tahun, int bulan){
        int jumlahHari = 0;
        //Untuk menemukan jumlah hari berdasarkan bulan
        switch (bulan) {
            case 1 : //Januari
            case 3 : //Maret
            case 5 : //Mei
            case 7 : //Juli
            case 8 : //Agustus
            case 10 ://Oktober
            case 12 ://Desember
                jumlahHari = 31;    //Bulan bulan ini memiliki 31 hari
                break;
            case 4 : //April
            case 6 : //Juni
            case 9 : //September
            case 11 ://November
                jumlahHari = 30;
                break;
            case 2: // Februari
                //Mengecek apakah tahun adalah  tahun kabisat
                if (((tahun % 4 == 0) && !(tahun % 100 == 0)) || (tahun % 400 == 0)) {
                    jumlahHari = 29; // Tahun Kabisat
                } else {
                    jumlahHari = 28;
                }
                break;
        }
        return jumlahHari;  //Kembalikan jumla hari yang dihitung
    }
}
