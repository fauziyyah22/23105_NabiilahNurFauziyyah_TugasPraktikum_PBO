/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6;

/**
 *
 * @author jia
 */
public class LaguAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 6; //Jumlah anak ayam
        
        //Menampilkan bagian pertama
        for(int i = 0; i < 4; i++){
            System.out.println("Tek-kotek-kotek-kotek");
            System.out.println("Anak ayam turun berkotek");
            System.out.println(); //Baris kosong sebagai pemisah (spasi)
        }
        
        //Perulangan untuk meampilkan turunnya anak ayam
        for (int i = n; i > 0; i--){
            //Menampilkan jumlah anak ayam yang turun
            System.out.println("Anak ayam turunlah " + i);
            //Jika anak ayam tinggal satu
            if (i == 1){
                System.out.println("Pergi satu tinggal induknya");
            } else {
                //Menampilkan sisa anak ayam
                System.out.println("Pergi satu, tinggallah " + (i - 1));
            }
            System.out.println();
            
            //Jika jumlah anak ayam adalah 5,3, atau 1 menampilkan lirik Tek-kotek-kotek-kotek lagi
            if (i == 5 || i == 3 || i == 1){
                System.out.println("Tek-kotek-kotek-kotek");
                System.out.println("Anak ayam turun berkotek");
                System.out.println();
            }
        }
        
        //Menampilkan bagian akhir ketika induk ayam mencari anaknya (2 kali)
        for (int i = 0; i < 2; i++){
            System.out.println("Tek-kotek-kotek-kotek");
            System.out.println("Induk ayam cari anaknya");
            System.out.println();
        }
        
        //Lirik akhir
        System.out.println("Akhirnya, ketemu semua");
        System.out.println();
        System.out.println("Tek-kotek-kotek-kotek");
        System.out.println("Induk ayam cari anaknya");
        System.out.println("Akhirnya ketemu semua");
    }
}
