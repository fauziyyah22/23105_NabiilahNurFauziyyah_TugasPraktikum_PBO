/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author FIFI
 */
public class Bingo {

    public Bingo() {
        String lirikAwal = "There was a farmer who had a dog,\nAnd Bingo was his name-o.\n";
        String bingo = "B-I-N-G-O";
        
        for (int i = 0; i <= 5; i++) {
            // Menampilkan lirik awal tanpa spasi tambahan
            System.out.print(lirikAwal);
            for (int j = 0; j < 3; j++) {
                // Print "(clap)-" sebanyak 'i' kali
                for (int k = 0; k < i; k++) {
                    System.out.print("(clap)-");
                }
                // Print sisa dari "B-I-N-G-O" mulai dari indeks ke 'i * 2'
                if (i < 5) { // Pastikan kita tidak melebihi panjang string
                    System.out.println(bingo.substring(i * 2));
                } else {
                    System.out.println(); // Print line kosong saat semuanya digantikan oleh "clap"
                }
            }
            // Menampilkan penutup verse tanpa spasi tambahan
            System.out.println("And Bingo was his name-o.");
            if (i < 5) {
                System.out.println(); // Tambahkan baris kosong hanya di antara bait
            }
        }
    }

    public static void main(String[] args) {
        // Membuat objek dari class Bingo untuk menampilkan lirik
        new Bingo();
    }    
}
