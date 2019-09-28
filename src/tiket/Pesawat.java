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
public class Pesawat extends Tiket {

    Scanner input = new Scanner(System.in);
    private int jumlah;

    public Pesawat(String nama, String jenis, int harga) {
        super(nama, jenis, harga);
    }

    public void total() {
        System.out.print("Jumlah tiket: ");
        jumlah = input.nextInt();
        int total = jumlah * harga;
        System.out.println("Total Harga: " + total);
    }
}
