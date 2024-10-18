/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author FIFI
 */
//Kelas DataBarang mengimplementasikan interface BarangInterface
//Kelas ini bertanggung jawab menyimpan data barang seperti kode, nama, dan harga
public class DataBarang implements BarangInterface {
    //Atribut untuk menyimpan kode, nama, dan harga barang
    private String kode;
    private String nama;
    private int harga;

    //Konstruktor menginialisasi data barang
    public DataBarang(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    //Implementasi metode dari interface barang untuk mendapatkan kode barang
    @Override
    public String getKode() {
        return kode;
    }

    //Implementasi metode dari interface barang untuk mendapatkan nama barang
    @Override
    public String getNama() {
        return nama;
    }
    
    //Implementasi metode dari interface barang untuk mendapatkan harga barang
    @Override
    public int getHarga() {
        return harga;
    }
}
