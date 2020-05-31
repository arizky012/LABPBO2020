package app;

import java.util.*;

/**
 * Main
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilih;
        Anggota anggota = new Anggota();
        PengurusInti pInti = new PengurusInti();
        KoordinatorBnS kBnS = new KoordinatorBnS();
        
        while (true) {
            System.out.println("\n-- Sistem Informasi UKM Programmer Unhas --");
            System.out.println("Masuk sebagai : ");
            System.out.print("1. Pengurus Inti\n" + "2. Koordinator Bidang dan Staf\n" + "3. Anggota\n");
            System.out.print(">> ");
            pilih = sc.nextInt();
    
            switch (pilih) {
                case 1:
                    pInti.menu();
                    break;
                case 2:
                    kBnS.menu();
                    
                    break;
                case 3:
                    anggota.menu();
                    break;
                default:
                    System.out.println("Inputan salah");
                    break;
            }
        }
    }
}
