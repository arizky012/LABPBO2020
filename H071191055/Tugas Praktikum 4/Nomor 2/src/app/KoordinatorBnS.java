package app;

import java.util.*;

public class KoordinatorBnS extends Anggota {

    private static Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n-- Menu Koordinator Bidang dan Staf --");
            System.out.print("1. Lihat Pengumuman\n" + "2. Buat Event\n" + "3. Hapus Event\n");
            System.out.print(">> ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    lihatAgenda();
                    break;
                case 2:
                    buatEvent();
                    break;
                case 3:
                    hapusEvent();
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

    public void buatEvent() {
        while (true) {
            System.out.println("\nMasukkan event");
            System.out.print(">> ");
            event.add(sc.nextLine());
            showEvent();

            System.out.println("\nMasih ada ? (Y/N)");
            System.out.print(">> ");
            cek = sc.nextLine();
            if (cek.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public void hapusEvent() {
        while (true) {
            showEvent();

            System.out.println("Pilih pengumuman yang akan dihapus : ");
            System.out.print(">> ");
            pilih = sc.nextInt();
            event.remove(pilih - 1);
            showEvent();

            sc.nextLine();
            System.out.println("Masih ada ? (Y/N)");
            System.out.print(">> ");
            cek = sc.nextLine();
            if (cek.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}