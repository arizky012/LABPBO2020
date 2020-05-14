package app;

import java.util.*;

public class PengurusInti extends Anggota {

    static Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n-- Menu Pengurus Inti --");
            System.out.print("1. Lihat Pengumuman\n" + "2. Buat Pengumuman\n" + "3. Hapus Pengumuman\n");
            System.out.print(">> ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    lihatAgenda();
                    break;
                case 2:
                    buatPengumuman();
                    break;
                case 3:
                    hapusPengumuman();
                    break;
                default:
                    System.out.println("Inputan salah");
                    break;
            }

            System.out.println("\nKeluar ? (Y/N)");
            System.out.print(">> ");
            cek = sc.nextLine();
            if (cek.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    public void buatPengumuman() {
        while (true) {
            System.out.println("\nMasukkan pengumuman");
            System.out.print(">> ");
            pengumuman.add(sc.nextLine());
            showPengumuman();
            
            System.out.println("\nMasih ada ? (Y/N)");
            System.out.print(">> ");
            cek = sc.nextLine();
            if (cek.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void hapusPengumuman() {
        while (true) {
            showPengumuman();
    
            System.out.println("\nPilih pengumuman yang akan dihapus : ");
            System.out.print(">> ");
            pilih = sc.nextInt();
            pengumuman.remove(pilih - 1);
            showPengumuman();

            sc.nextLine();
            System.out.println("\nMasih ada ? (Y/N)");
            System.out.print(">> ");
            cek = sc.nextLine();
            if (cek.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}