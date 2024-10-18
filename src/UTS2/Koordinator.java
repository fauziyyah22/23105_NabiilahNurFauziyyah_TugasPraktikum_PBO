/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author FIFI
 */
public class Koordinator extends Kegiatan implements PengelolaKegiatan, PelaksanaKegiatan {
    private String namaKoordinator;
    private String departemen;

    // Konstruktor untuk kelas Koordinator
    public Koordinator(String namaKegiatan, String tanggalKegiatan, String lokasiKegiatan, int jumlahPeserta, boolean status,
                       String namaKoordinator, String departemen) {
        super(namaKegiatan, tanggalKegiatan, lokasiKegiatan, jumlahPeserta, status); // Memanggil konstruktor dari kelas induk
        this.namaKoordinator = namaKoordinator;
        this.departemen = departemen;
    }

    // Getter dan Setter untuk Koordinator
    public String getNamaKoordinator() {
        return namaKoordinator;
    }

    public void setNamaKoordinator(String namaKoordinator) {
        this.namaKoordinator = namaKoordinator;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public void mengelolaKegiatan() {
        System.out.println("Koordinator " + getNamaKoordinator() + " mengelola kegiatan " + getNamaKegiatan());
    }

    @Override
    public void melaksanakanKegiatan() {
        System.out.println("Koordinator " + getNamaKoordinator() + " melaksanakan kegiatan " + getNamaKegiatan());
    }
}
