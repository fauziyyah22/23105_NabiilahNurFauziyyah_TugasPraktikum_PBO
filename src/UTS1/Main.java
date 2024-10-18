/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS1;

/**
 *
 * @author FIFI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Karyawan karyawan = new Karyawan("Ridho", 222, 5000000, "Operator");
    Manajer manajer = new Manajer("Azis", 111, 8000000, "Manajer", "IT", 5);

    
 
    System.out.println("Nama Karyawan: " + karyawan.getNamaKaryawan());
    System.out.println("Id Karyawan: " + karyawan.getId());
    System.out.println("Gaji Karyawan " + karyawan.hitungGaji());
    System.out.println("Posisi Karyawan: " + karyawan.getPosisi());
    
    System.out.println("\nNama Karyawan: " + manajer.getNamaKaryawan());
    System.out.println("Id Karyawan: " + manajer.getId());
    System.out.println("Gaji Karyawan " + manajer.hitungGaji());
    System.out.println("Posisi Karyawan: " + manajer.getPosisi());
    
    manajer.mengelolaKaryawan();
    manajer.bekerja();
    }
}
    
