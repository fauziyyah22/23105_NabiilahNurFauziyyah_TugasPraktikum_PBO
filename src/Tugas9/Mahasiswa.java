/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9;

/**
 *
 * @author FIFI
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, mataKuliah;
    private double nilaiAkhir;
    
public Mahasiswa(String NIM, String Nama, String Alamat, String mataKuliah, double nilaiAkhir) {        
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getNIM() {
        return NIM;
    }
    public String getNama() {
        return Nama;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getMataKuliah() {
        return mataKuliah;
    }
    public double getNilaiAkhir(){
        return nilaiAkhir;
    }
}
