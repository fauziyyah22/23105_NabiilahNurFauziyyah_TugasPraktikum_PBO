/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author FIFI
 */
public class Mahasiswa {

    // Method untuk membuat garis horizontal
    public void cetakGaris() {
        System.out.println("+--------------------------------------+");
    }

    // Method membaca()
    public void membaca() {
        cetakGaris();
        System.out.println("| Mahasiswa tersebut sedang membaca    |");
        System.out.println("| sebuah buku.                         |");
        cetakGaris();
    }

    // Method nyontek()
    public void nyontek() {
        cetakGaris();
        System.out.println("| Mahasiswa tersebut sedang menyontek  |");
        System.out.println("| saat ujian.                          |");
        cetakGaris();
    }

    // Method modifikasi()
    public void modifikasi() {
        cetakGaris();
        System.out.println("| Mahasiswa tersebut sedang memodifikasi|");
        System.out.println("| program yang diberi.                 |");
        cetakGaris();
    }
}

