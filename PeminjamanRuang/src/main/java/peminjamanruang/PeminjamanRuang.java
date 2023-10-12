/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package peminjamanruang;

import java.util.Scanner;
import management.peminjaman.*;
import management.peminjaman.Ruang;

/**
 *
 * @author FLOW
 */

final class PeminjamanRuang {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeminjamanManagement peminjamanManagement = new PeminjamanManagement();
        int choice;
        do {
            System.out.println("\n");
            System.out.println("    Menu Peminjaman Ruang");
            System.out.println("=============================");
            System.out.println("|   1. Read Peminjaman      |");
            System.out.println("|   2. Create Peminjaman    |");
            System.out.println("|   3. Update Peminjaman    |");
            System.out.println("|   4. Delete Peminjaman    |");
            System.out.println("|   0. Exit                 |");
            System.out.println("=============================");
            System.out.print("Masukkan pilihan anda: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> peminjamanManagement.readPeminjaman();
                    case 2 -> createPeminjaman(scanner, peminjamanManagement);
                    case 3 -> updatePeminjaman(scanner, peminjamanManagement);
                    case 4 -> deletePeminjaman(scanner, peminjamanManagement);
                    case 0 -> System.out.println("Terimakasih telah menggunakan program ini!\n");
                    default -> System.out.println("Pilihan tidak tersedia, silahkan coba lagi\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Masukkan pilihan dalam bentuk angka\n");
                choice = -1; 
            }
        } while (choice != 0);
        scanner.close();
    }

    private static void createPeminjaman(Scanner scanner, PeminjamanManagement peminjamanManagement) {
        peminjamanManagement.readPeminjaman();
        System.out.println("\n");
        System.out.print("Masukkan Kode Ruang: ");
        String kodeRuang = scanner.nextLine();
        System.out.print("Masukkan Tanggal (dd-mm-yyyy): ");
        String tanggal = scanner.nextLine();
        System.out.print("Masukkan Keperluan: ");
        String keperluan = scanner.nextLine();
        System.out.print("Masukkan Status: ");
        String status = scanner.nextLine();
        
        Ruang peminjamanRuang = new Ruang(kodeRuang,tanggal, keperluan, status);
        peminjamanManagement.createPeminjaman(peminjamanRuang);
        System.out.println("Peminjaman berhasil ditambahkan!\n");
    }

    private static void updatePeminjaman(Scanner scanner, PeminjamanManagement peminjamanManagement) {
        peminjamanManagement.readPeminjaman();
        System.out.println("\n");
        System.out.print("Masukkan Kode Ruang yang ingin diupdate: ");
        String kodeRuangL = scanner.nextLine();
        System.out.print("Masukkan Status yang baru: ");
        String newStatus = scanner.nextLine();

        Peminjaman peminjamanToUpdate = peminjamanManagement.getPeminjamanByKodeRuang(kodeRuangL);

        if (peminjamanToUpdate != null) {
            Peminjaman updatedPeminjaman = new Ruang(
                ((Ruang) peminjamanToUpdate).getKodeRuang(),
                peminjamanToUpdate.getTanggal(),
                peminjamanToUpdate.getKeperluan(),
                newStatus
            );

            // Update peminjaman
            if (peminjamanManagement.updatePeminjaman(kodeRuangL, (Ruang) updatedPeminjaman)) {
                System.out.println("Peminjaman berhasil diupdate!\n");
            } else {
                System.out.println("Gagal mengupdate peminjaman\n");
            }
        } else {
            System.out.println("Peminjaman tidak ditemukan\n");
        }
    }

    private static void deletePeminjaman(Scanner scanner, PeminjamanManagement peminjamanManagement) {
        peminjamanManagement.readPeminjaman();
        System.out.println("\n");
        System.out.print("Masukkan Kode Ruang yang ingin dihapus: ");
        String kodeRuangHapus = scanner.nextLine();
        if (peminjamanManagement.deletePeminjaman(kodeRuangHapus)) {
            System.out.println("Peminjaman berhasil dihapus!\n");
        } else {
            System.out.println("Peminjaman tidak ditemukan\n");
        }
    }
}