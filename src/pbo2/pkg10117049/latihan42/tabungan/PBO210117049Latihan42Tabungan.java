/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung sisa tabungan
 * setelah penarikan uang
 */
public class PBO210117049Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlah;
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tbg = new Tabungan(baca.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = baca.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
          
    }
    
}
