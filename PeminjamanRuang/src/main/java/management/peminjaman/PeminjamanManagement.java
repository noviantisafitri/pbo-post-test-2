/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package management.peminjaman;

import java.util.ArrayList;

/**
 *
 * @author FLOW
 */

// Kelas PeminjamanManagement bertanggung jawab atas manajemen peminjaman ruangan
// Kelas ini memiliki operasi CRUD
public final class PeminjamanManagement {
    private final ArrayList<Ruang> peminjamans = new ArrayList<>();
    
    // Create
    public void createPeminjaman(Ruang peminjaman) {
        peminjamans.add(peminjaman);
    }

    // Read
    public void readPeminjaman() {
        if (peminjamans.isEmpty()) {
            System.out.println("Tidak ada data peminjaman.");
            return;
        }

        // Print table headers
        System.out.printf("%-15s%-20s%-20s%-15s%-15s\n", "Kode Ruang", 
                "Tanggal Peminjaman", 
                "Keperluan", "Status", "Jenis Ruang");

        // Print table rows
        for (Ruang peminjaman : peminjamans) {
            System.out.printf("%-15s%-20s%-20s%-15s%-15s\n",
                    peminjaman.getKodeRuang(), peminjaman.getTanggal(),
                    peminjaman.getKeperluan(), peminjaman.getStatus(),
                    peminjaman.showJenis());
        }
    }


    // Update
    public boolean updatePeminjaman(String kodeRuangL, Ruang kodeRuangB) {
        for (int i = 0; i < peminjamans.size(); i++) {
            Ruang peminjaman = peminjamans.get(i);
            if (peminjaman.getKodeRuang().equals(kodeRuangL)) {
                peminjamans.set(i, kodeRuangB);
                return true;
            }
        }
        return false;
    }

    // Delete
    public boolean deletePeminjaman(String kodeRuang) {
        for (Ruang peminjaman : peminjamans) {
            if (peminjaman.getKodeRuang().equals(kodeRuang)) {
                peminjamans.remove(peminjaman);
                return true;
            }
        }
        return false;
    }
    
    public Ruang getPeminjamanByKodeRuang(String kodeRuang) {
        for (Ruang peminjaman : peminjamans) {
            if (peminjaman.getKodeRuang().equals(kodeRuang)) {
                return peminjaman;
            }
        }
        return null;  // Return null if not found
    }

}