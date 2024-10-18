/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas6;

/**
 *
 * @author FIFI
 */
//Class ini mengecek apakah bilangan dari 0 smapai 20 termasuk bilangan prima atau bukan
//Dengan mengunakan fungsi isPrima
public class DeretPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Menampilkan judul tabel
        System.out.println("Bilangan Prima dan Bukan Prima dari 0-20");
        System.out.println("+---------------------------+");
        System.out.println("|   Bilangan  |  Keterangan |");
        System.out.println("+---------------------------+");
        
        //Perulangan dari 0 sampai 20
        for (int i = 0; i <= 20; i++){
            //Mengecek apakah termasuk bilangan prima
            if (isPrima(i)){
                System.out.printf("|      %2d     |    Prima    |\n", i);
            //Jika bukan termasuk bilangan prima
            } else {
                System.out.printf("|      %2d     | Bukan Prima |\n", i);
            }   
        }
        //Untuk menutup tabel
        System.out.println("+---------------------------+");
    }
    
    //Fungsi untuk mengecek apakah bilangan prima
    public static boolean isPrima(int n){
        if (n < 2) //Bilangan kurang dari 2 bukan termasuk bilangan prima
            return false;
        for (int i = 2; i <= n / 2; i ++){
            if (n % i == 0) //Jika habis dibagi bilangan lain, bukan termasuk prima
                return false;
        }
        return true; //Bilangan termasuk prima
    }
}
