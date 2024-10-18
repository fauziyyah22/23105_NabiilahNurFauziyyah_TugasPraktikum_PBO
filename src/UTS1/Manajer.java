/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS1;

/**
 *
 * @author FIFI
 */
public class Manajer extends Karyawan implements Pengelola, Pekerja {
    private String departemen;
    private int jumlahKaryawan;
    
    public Manajer (String namaKaryawan, int idKaryawan, double gaji, String posisi, String departemen, int jumlahKaryawan){
        super(namaKaryawan, idKaryawan, gaji, posisi);
        this.departemen = departemen;
        this.jumlahKaryawan = jumlahKaryawan;
    }
    
    @Override
    public void mengelolaKaryawan(){
        System.out.println("Manajer ini mengelola karyawan di departemen " + this.departemen);
    }
    
    @Override
    public void bekerja(){
        System.out.println("Manajer ini bekerja mengoordinir karyawan.");
    }
    
    public String getNama(){
        return super.getNamaKaryawan();
    }
    
    public int getId(){
        return super.getId();
    }
    
    public void setId(int id){
        super.setId(id);
    }
    
    public String getDepartemen(){
        return departemen;
    }
    
    public void setDepartemen(String departemen){
        this.departemen = departemen;
    }
    
    public int getJumlahKaryawan(){
        return jumlahKaryawan;
    }
    
    public void setJumlahKaryawan(int jumlahKaryawan){
        this.jumlahKaryawan = jumlahKaryawan;
    }
}