/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS1;

/**
 *
 * @author FIFI
 */
public class Karyawan {
    private String namaKaryawan;
    private int idKaryawan;
    private double gaji;
    private String posisi;
    private int hariKerja;
    
    public Karyawan(String nama, int idKaryawan, double gaji, String posisi) {
    this.namaKaryawan = nama;
    this.idKaryawan = idKaryawan;
    this.gaji = gaji;
    this.posisi = posisi;
    this.hariKerja = 0;
    }
    
    public String getNamaKaryawan(){
        return namaKaryawan;
    }
    
    public void setNamaKaryawan(String namaKaryawan){
        this.namaKaryawan = namaKaryawan;
    }
    
    public int getId(){
        return idKaryawan;
    }
    
    public void setId(int idKaryawan){
        this.idKaryawan = idKaryawan;
    }
    
    public double getGaji(){
        return gaji;
    }
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    
    public String getPosisi(){
        return posisi;
    }
    
    public void setPosisi(String posisi){
        this.posisi = posisi;
    }
    
    public int getHariKerja(){
        return hariKerja;
    }
    
    public void setHariKerja(int hariKerja){
        this.hariKerja = hariKerja;
    }
    
    public double hitungGaji(){
        return gaji;
    }
    
    public int hitungHariKerja(){
        for (int i = 1; i <= 30; i++){
            hariKerja++;
        }
        return hariKerja;
    }
    
    
}
