/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS2;

/**
 *
 * @author FIFI
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Koordinator dan Kegiatan
        Koordinator koordinator1 = new Koordinator("Seminar Teknologi", "12 Oktober 2024", "Auditorium", 100, true, "Ahmad", "IT");
        
        // Menampilkan detail kegiatan
        koordinator1.tampilkanDetailKegiatan();
        
        // Koordinator mengelola dan melaksanakan kegiatan
        koordinator1.mengelolaKegiatan();
        koordinator1.melaksanakanKegiatan();
        
        // Menampilkan informasi koordinator
        System.out.println("Nama Koordinator: " + koordinator1.getNamaKoordinator());
        System.out.println("Departemen: " + koordinator1.getDepartemen());
    }
}

   