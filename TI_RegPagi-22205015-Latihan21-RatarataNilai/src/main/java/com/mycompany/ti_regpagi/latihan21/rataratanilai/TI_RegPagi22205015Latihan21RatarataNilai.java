/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan21.rataratanilai;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang menghitung rara-rata nilai
 * @author 62895
 */
public class TI_RegPagi22205015Latihan21RatarataNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===LATIHAN 21===");
        System.out.print("Masukan Banyaknya Mahasiswa: ");
        int banyak = scanner.nextInt();
        
//        variable
        double nilaiakhir = 0;
        int i = 1;
        double rata;
        
//        proses perulangan
        while (i <= banyak ){
            System.out.print("Nilai mahasiswa ke-"+i+":");
            double nilai = scanner.nextInt();
            nilaiakhir += nilai;
            i++;
        }
        rata = nilaiakhir/banyak;
        System.out.println("\nMaka, Rata-rata nilainya adalah " +rata );
    }
}
