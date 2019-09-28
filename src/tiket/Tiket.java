/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket;

/**
 *
 * @author choiryaya
 */
public class Tiket {

    protected String nama;
    protected String jenis;
    protected int harga;

    public Tiket(String nama, String jenis, int harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }
    public String getnama(){
        return nama;
    }
    public String getjenis(){
        return jenis;
    }
    public int getharga(){
        return harga;
    }
    public void total(){

    }

}
