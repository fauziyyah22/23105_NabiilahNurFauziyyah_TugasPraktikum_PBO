/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas7;
import java.util.Scanner;
/**
 *
 * @author FIFI
 */

public class TokoSerbaAda {
    public static void main(String[] args) {
        
        //Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        //Array barang dengan data kode, nama, dan harga
        DataBarang[] barangList = {
            new DataBarang("a001", "Buku", 3000),   //Data barang 1
            new DataBarang("a002", "Pensil", 4000), //Data barang 2
            new DataBarang("a003", "Pulpen", 5000)  //Data barang 3
        };

        //Menampilkan nama toko
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************");

        //Meminta pengguna untuk memasukkan jumlah item yang ingin dibeli
        System.out.print("Masukkan Item Barang : ");
        //Variabel jumlahItem akan menyimpan jumlah item yang diinput oleh pengguna
        int jumlahItem = input.nextInt();   

        //Deklarasi array untuk menyimpan kode barang dan jumlah yang dibeli
        String[] kodeInput = new String[jumlahItem];
        int[] jumlahBeli = new int[jumlahItem];
        //Variabel untuk menyimpan total biaya keseluruhan belanja
        int totalBayar = 0;

        //Loop untuk meminta kode barang dan jumlah yang ingin dibeli dari pengguna
        for (int i = 0; i < jumlahItem; i++) {
            //Menampilkan nomor urut
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode        : ");
            kodeInput[i] = input.next();    //Menyimpan kode barang yang diinput
            System.out.print("Masukkan jumlah beli : ");
            jumlahBeli[i] = input.nextInt();    //Menyimpan jumlah barang yang dibeli
        }

        //Output
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("***************");
        System.out.printf("%-3s %-12s %-12s %-6s %-10s %-12s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("===============================================================");

        //Loop untuk proses pengecekan dan perhitungan setiap barang yang diinput oleh pengguna
        for (int i = 0; i < jumlahItem; i++) {
            //Variabel index untuk mencari barang sesuai kode diinput
            int index = -1; //Nilai default -1 artinya barang belum ditemukan
            //Loop untuk mencocokkan kode input dengan kode barang yang ada
            for (int j = 0; j < barangList.length; j++) {
                //Jika kode barang cocok dengan yang diinput, simpan indeksnya
                if (kodeInput[i].equalsIgnoreCase(barangList[j].getKode())) {
                    index = j;  //Simpan indeks baranng yang ditemukan
                    break;
                }
            }
            
            //Jika barang ditemukan (indeks tidak -1), hitung total belanja
            if (index != -1) {
                //Hitung jumlah bayar untuk item tersebut
                int jumlahBayar = barangList[index].getHarga() * jumlahBeli[i];
                //Tambahkan ke  total biaya
                totalBayar += jumlahBayar;
                //Menampilkan detail barang yang dibeli
                System.out.printf("%-3d %-12s %-12s %-6d        %-10d %-12d\n", (i + 1), kodeInput[i], barangList[index].getNama(), barangList[index].getHarga(), jumlahBeli[i], jumlahBayar);
            } else {
                //Jika barang tidak ditemukan, menampilkan pesan barang tidak ditemukan
                System.out.printf("%-3d %-12s %-12s %-6s        %-10d %-12s\n", (i + 1), kodeInput[i], "Barang tidak ditemukan", "-", jumlahBeli[i], "-");
            }
        }

        System.out.println("===============================================================");
        System.out.printf("Total Bayar : %50d\n", totalBayar);
        System.out.println("===============================================================");
    }
}

