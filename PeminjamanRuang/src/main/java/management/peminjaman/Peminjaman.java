/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management.peminjaman;

/**
 *
 * @author Novi
 */

// Kelas abstrak Peminjaman
// Digunakan sebagai dasar untuk kelas-kelas peminjaman khusus
public abstract class Peminjaman {
    // Properti-properti yang bersifat private agar hanya dapat diakses di dalam kelas ini
    private String tanggal;     // Tanggal peminjaman
    private String keperluan;   // Keperluan peminjaman
    private String status;      // Status peminjaman


    // Konstruktor untuk inisialisasi properti tanggal, keperluan, dan status
    protected Peminjaman(String tanggal, String keperluan, String status) {
        this.tanggal = tanggal;
        this.keperluan = keperluan;
        this.status = status;
    }
     
    // Method
    public final String getTanggal() {
        return tanggal;
    }

    public final String getKeperluan() {
        return keperluan;
    }

    public final String getStatus() {
        return status;
    }

    public final void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public final void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }

    public final void setStatus(String status) {
        this.status = status;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    // untuk menunjukkan jenis peminjaman
    // @return Jenis peminjaman
    public abstract String showJenis();
}
