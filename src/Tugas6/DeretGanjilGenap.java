/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6;

/**
 *
 * @author FIFI
 */
//Class ini menghitung dan menampilkan bilangan genap dan ganjil dari 0 sampai 20. 
//Setiap angka dicek apakah genap(jika habis dibagi 2)atau ganjil
public class DeretGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Menampilkan judul tabel
        System.out.println("Bilangan Ganjil dan Genap dari 0 - 20");
        System.out.println("+---------------------------+");
        System.out.println("|   Bilangan  |  Keterangan |");
        System.out.println("+---------------------------+");
        
        //Perulangan dari 0 sampai 20
        for (int i = 0; i <= 20; i++){
            //Jika bilangan genap
            if (i % 2 == 0){
                System.out.printf("|      %2d     |    Genap    |\n", i);
            //Jika bilangan ganjil
            } else {
                System.out.printf("|      %2d     |    Ganjil   |\n", i);
            }   
        }
        //Untuk menutup tabel
        System.out.println("+---------------------------+");
    }
}
    

