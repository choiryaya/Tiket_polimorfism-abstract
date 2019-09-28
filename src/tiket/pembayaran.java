/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

import java.util.Scanner;

/**
 *
 * @author choiryaya
 */
public class pembayaran extends detail {

    Scanner input = new Scanner(System.in);

    @Override
    void pembayarankereta() {
        System.out.println("============step 2================");
        System.out.println("         PILIH MODEL PEMBAYARAN");
        System.out.println("1. Bayar ke Indomaret\n2. Transfer");
        System.out.print("=>");
        int bayar = input.nextInt();
        switch (bayar) {
            case 1:
                System.out.print("Kode Pembayaran: ");
                for (int i = 1; i <= 1; i++) {
                    for (int j = 1; j <= 5; j++) {
                        double t = 65 + Math.random() * ((90 - 65) + 1);
                        int x = (int) t;
                        char a = (char) x;
                        System.out.print( a);

                    }

                    System.out.println(" ");
                }
                System.out.println("======================================");
                System.out.println("----SILAHKAN KE INDOMARET TERDEKAT----");
                System.out.println("======================================");
                break;
            case 2:
                System.out.println("Masukkan Nomor Rekening: ");
                int rek = input.nextInt();
                System.out.println("Masukkan Total Pembayaran: ");
                int pembayaran = input.nextInt();
                System.out.println("========================");
                System.out.println("---TRANSAKSI BERHASIL---");
                System.out.println("========================");
                break;
        }
        }

    @Override
    void pembayaranpesawat() {
                System.out.println("============step 2================");
       System.out.println("         PILIH MODEL PEMBAYARAN");
        System.out.println("1. Bayar ke Indomaret\n2. Transfer");
        System.out.print("=>");
        int bayar = input.nextInt();
        switch (bayar) {
            case 1:
                System.out.print("Kode Pembayaran: ");
                for (int i = 1; i <= 1; i++) {
                    for (int j = 1; j <= 5; j++) {
                        double t = 65 + Math.random() * ((90 - 65) + 1);
                        int x = (int) t;
                        char a = (char) x;
                        System.out.print( a);

                    }

                    System.out.println(" ");
                }
                
                System.out.println("======================================");
                System.out.println("----SILAHKAN KE INDOMARET TERDEKAT----");
                System.out.println("======================================");
                break;
            case 2:
                System.out.println("Masukkan Nomor Rekening: ");
                int rek = input.nextInt();
                System.out.println("Masukkan Total Pembayaran: ");
                int pembayaran = input.nextInt();
                System.out.println("========================");
                System.out.println("---TRANSAKSI BERHASIL---");
                System.out.println("========================");
                break;
        }
    }

    }

