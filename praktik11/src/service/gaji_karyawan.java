/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.Scanner;

/**
 *
 * @author muham
 */
public class gaji_karyawan {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan data gaji karyawan
        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();

        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Masukkan Tunjangan: ");
        double tunjangan = scanner.nextDouble();

        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Menampilkan hasil
        System.out.println("\nData Gaji Karyawan:");
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + totalGaji);

        // Menutup Scanner untuk mencegah resource leak
        scanner.close();
    }
}

    

