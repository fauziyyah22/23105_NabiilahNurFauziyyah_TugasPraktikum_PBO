/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author FIFI
 */
public class DemoNilai {
    public static void main(String[] args) {
        // Membuat objek dari kelas Nilai dengan data yang diberikan
        Nilai mahasiswa = new Nilai("2310631170105", "Nabiilah Nur Fauziyyah", 90, 90, 95, 95);
        
        // Memanggil method untuk mencetak nilai dari class Nilai
        mahasiswa.cetakNilai();
    }
}
