/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import data.Karyawan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author userl
 */
public class KaryawanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        List<Karyawan>karyawanList = new ArrayList<>();
        
        System.out.println("Selamat datang di program penggajian karyawan");
        
        //input data karyawan
        System.out.print("Masukkan jumlah karyawan : ");
        int jumlahKaryawan = scanner.nextInt();
        
        for (int i = 0; i < jumlahKaryawan; i++){
            System.out.println("\nInput Data Karyawan ke-" + (i + 1));
            System.out.print("ID Karyawan : ");
            int id = scanner.nextInt();
            System.out.print("Nama Karyawan : ");
            String nama = scanner.next();
            System.out.print("Tahun Masuk Kerja : ");
            int tahunMasuk = scanner.nextInt();
            
        //buat objek karyawan
        Karyawan karyawan = new Karyawan(id, nama, tahunMasuk);
        karyawanList.add(karyawan);
        }  
        //input data gaji karyawan
        for(Karyawan karyawan : karyawanList){
            System.out.println("Input Data Gaji Untuk Karyawan");
            System.out.print("Gaji Pokok : ");
            karyawan.gajiPokok = scanner.nextDouble();
            System.out.print("Tunjangan : ");
            karyawan.tunjangan = scanner.nextDouble();
            System.out.print("Transportasi : ");
            karyawan.transportasi = scanner.nextDouble();
        
        //hitung tunjangan berdasarkan lama kerja
        if (2023 - karyawan.tahunMasuk >= 5){
            karyawan.tunjangan += 0.05 * karyawan.tunjangan;
        }
        }
        
        //tampilkan data karyawan dan gaji
        System.out.println("\nData Karyawan dan Gaji :");
        for(Karyawan karyawan : karyawanList){
            System.out.println("ID : " + karyawan.id);
            System.out.println("Nama : " + karyawan.nama);
            System.out.println("Tahun Masuk : " + karyawan.tahunMasuk);
            System.out.println("Gaji Pokok : " + karyawan.gajiPokok);
            System.out.println("Tunjangan : " + karyawan.tunjangan);
            System.out.println("Transportasi : " + karyawan.transportasi);
            System.out.println();
        }
        
    }
    
}
