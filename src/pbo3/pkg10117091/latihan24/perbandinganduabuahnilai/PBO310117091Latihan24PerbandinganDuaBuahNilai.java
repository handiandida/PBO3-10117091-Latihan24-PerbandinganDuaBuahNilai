/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama         : Dida Handian
 * Kelas        : IF-3 
 * Nim          : 10117091 
 * Deskripsi    : Program ini dapat membandingkan dari dua buah nilai
 */
public class PBO310117091Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        int n2;
        String lagi;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");
        do {            
            System.out.print("Masukkan nilai pertama : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            n2 = scn.nextInt();
            
            if (n1 > n2) {
                System.out.println("Hasil : "+n1+" Lebih besar dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil : "+n1+" Lebih kecil dari "+n2+"\n");
            }else
                System.out.println("Hasil : "+n1+" sama dengan "+n2+"\n");
                
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = scn.next();
            
            System.out.println("");
        } while (!lagi.equals("Tidak"));
    }
    
}
