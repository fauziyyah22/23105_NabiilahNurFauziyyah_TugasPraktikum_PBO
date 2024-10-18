/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6;

/**
 *
 * @author FIFI
 */
//Class ini menampilkan huruf dari Z sampai A dalam bentuk tabel
//Menggunakan perulangan mundur pada tipe data char
public class HurufZA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Menampilkan judul tabel
        System.out.println("Urutan Huruf dari Z sampai dengan A");
        System.out.println("+------------------+");
        System.out.println("|   Urutan Huruf   |");
        System.out.println("+------------------+");
        
        //Perulangan dari huruf Z sampai A
        for (char c = 'Z'; c>= 'A'; c--){
            //Menampilkan huruf
            System.out.printf("|         %c        |\n", c);
        }
        //Untuk menutup tabel
        System.out.println("+------------------+");
    }
}
