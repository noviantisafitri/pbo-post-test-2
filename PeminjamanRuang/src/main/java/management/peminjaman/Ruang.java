/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management.peminjaman;

/**
 *
 * @author Novi
 */

// Kelas Ruang adalah turunan dari kelas Peminjaman,
// yang mewakili objek-objek ruang yang dapat dipinjam.
public class Ruang extends Peminjaman{
    // Properti
    private String kodeRuang;
    private static String jenisRuang;

    public Ruang(String kodeRuang, String tanggal, String keperluan, String status) {
        // Memanggil konstruktor kelas parent (Peminjaman) dengan menggunakan super()
        super(tanggal, keperluan, status);
        // Inisialisasi properti
        this.kodeRuang = kodeRuang;
        Ruang.jenisRuang = jenisRuang;
    }

    public final String getKodeRuang() {
        return kodeRuang;
    }

    public final void setKodeRuang(String kodeRuang) {
        this.kodeRuang = kodeRuang;
    }
    
    public static String getJenisRuang() {
        return jenisRuang;
    }

    public void setJenisRuang(String jenisRuang) {
        this.jenisRuang = jenisRuang;
    }
    
    // Mengembalikan nilai "Ruang Kelas" dan mengatur jenisRuang pada saat bersamaan
    @Override
    public String showJenis() {
        return jenisRuang = "Ruang Kelas";
        
    }
}


