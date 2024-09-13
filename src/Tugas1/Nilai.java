/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author FIFI
 */
public class Nilai {
    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;
    
    // Method Nilai()
    public Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }
    
    // Method untuk membuat garis horizontal
    public void cetakGaris() {
        System.out.println("+------------------------------------------+");
    }
    
    // Method cetakNilai()
    public void cetakNilai(){
        cetakGaris();
        System.out.println("NIM                 : " + nim);
        System.out.println("Nama                : " + nama);
        cetakGaris();
        System.out.println("Nilai Absen [10%]   : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]   : " + nilaiTugas);
        System.out.println("Nilai UTS   [30%]   : " + nilaiUTS);
        System.out.println("Nilai UAS   [40%]   : " + nilaiUAS);
        cetakGaris();
        System.out.println("Nilai Akhir         : " + nilaiAkhir);
        cetakGaris();
    }
}
