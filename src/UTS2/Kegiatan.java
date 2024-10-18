/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS2;

/**
 *
 * @author FIFI
 */
public class Kegiatan {
    private String namaKegiatan;
    private String tanggalKegiatan;
    private String lokasiKegiatan;
    private int jumlahPeserta;
    private boolean status;

    // Konstruktor untuk kelas Kegiatan
    public Kegiatan(String namaKegiatan, String tanggalKegiatan, String lokasiKegiatan, int jumlahPeserta, boolean status) {
        this.namaKegiatan = namaKegiatan;
        this.tanggalKegiatan = tanggalKegiatan;
        this.lokasiKegiatan = lokasiKegiatan;
        this.jumlahPeserta = jumlahPeserta;
        this.status = status;
    }

    // Getter dan Setter untuk Kegiatan
    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public String getTanggalKegiatan() {
        return tanggalKegiatan;
    }

    public void setTanggalKegiatan(String tanggalKegiatan) {
        this.tanggalKegiatan = tanggalKegiatan;
    }

    public String getLokasiKegiatan() {
        return lokasiKegiatan;
    }

    public void setLokasiKegiatan(String lokasiKegiatan) {
        this.lokasiKegiatan = lokasiKegiatan;
    }

    public int getJumlahPeserta() {
        return jumlahPeserta;
    }

    public void setJumlahPeserta(int jumlahPeserta) {
        this.jumlahPeserta = jumlahPeserta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Metode untuk menampilkan detail kegiatan
    public void tampilkanDetailKegiatan() {
        System.out.println("Nama Kegiatan: " + namaKegiatan);
        System.out.println("Tanggal: " + tanggalKegiatan);
        System.out.println("Lokasi: " + lokasiKegiatan);
        System.out.println("Jumlah Peserta: " + jumlahPeserta);
        System.out.println("Status: " + (status ? "Aktif" : "Tidak Aktif"));
        System.out.println("-----------------------------");
    }

    // Metode untuk menampilkan beberapa kegiatan dengan perulangan
    public void tampilkanKegiatanStatis() {
        String[] kegiatan = {"Seminar", "Workshop", "Lomba"};
        for (String event : kegiatan) {
            System.out.println("Nama Kegiatan: " + event);
        }
    }
}
