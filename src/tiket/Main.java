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
public class Main {

    public static void main(String[] args) {
        String lanjut = null;
        Scanner input = new Scanner(System.in);
        int totalsemua;

        do {
            System.out.println("PEMBELIAN TIKET");
            System.out.println("1. Tiket Kereta");
            System.out.println("2. Tiket Pesawat");
            System.out.print("pilih: ");
            int pilihan = input.nextInt();
                            System.out.println("============step 1================");
            switch (pilihan) {
                case 1:
                    System.out.println("a. kereta sanjaya(bandung-jakarta)         -Rp250000");
                    System.out.println("b. kereta maharani(bandung-surabaya)       -Rp500000");
                    System.out.print("pilih kereta: ");
                    String beliker = input.next();
                    switch (beliker) {
                        case "a":
                            System.out.println("***************************************");
                            Kereta k = new Kereta("SANJAYA ", "KENDARAAN DARAT", 250000);
                            System.out.println("  Nama Kereta: " + k.getnama());
                            System.out.println("  Jenis      : " + k.getjenis());
                            System.out.println("  Harga      : " + k.getharga());
                            k.total();
                            System.out.println("***************************************");
                            pembayaran pembayaran = new pembayaran();
                            pembayaran.pembayarankereta();
                            break;
                        case "b":
                            Kereta a = new Kereta("MAHARANI", "KENDARAAN DARAT", 500000);
                            System.out.println("Nama Kereta: " + a.getnama());
                            System.out.println("Jenis      : " + a.getjenis());
                            System.out.println("Harga      : " + a.getharga());
                            a.total();
                            pembayaran pembayaran2 = new pembayaran();
                            pembayaran2.pembayarankereta();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("a. pesawat garuda(bandung-yogya)           -Rp100000");
                    System.out.println("b. pesawat batik(jakarta-malang)           -Rp1500000");
                    System.out.print("pilih pesawat: ");
                    String belipes = input.next();
                    switch (belipes) {
                        case "a":
                            Pesawat p = new Pesawat("GARUDA", "KENDARAAN UDARA", 1000000);
                            System.out.println("***************************************");
                            System.out.println("Nama Pesawat: " + p.getnama());
                            System.out.println("Jenis      : " + p.getjenis());
                            System.out.println("Harga      : " + p.getharga());
                            p.total();
                            System.out.println("***************************************");
                            pembayaran pembayaran3 = new pembayaran();
                            pembayaran3.pembayaranpesawat();
                            break;
                        case "b":
                            Pesawat b = new Pesawat("BATIK", "KENDARAAN UDARA", 1500000);
                            System.out.println("Nama Pesawat: " + b.getnama());
                            System.out.println("Jenis      : " + b.getjenis());
                            System.out.println("Harga      : " + b.getharga());
                            b.total();
                            pembayaran pembayaran4 = new pembayaran();
                            pembayaran4.pembayaranpesawat();
                            break;
                    }
                    break;

            }
            System.out.print("Apakah ingin melanjutkan? [Y/N]: ");
            lanjut = input.next();
        } while (lanjut.equalsIgnoreCase("y"));
    }

}
