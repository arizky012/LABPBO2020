package app;

import java.util.*;

/**
 * Anggota
 */
public class Anggota {

    static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> pengumuman = new ArrayList<>();
    public static ArrayList<String> event = new ArrayList<>();
    public int pilih;
    public String cek;
    
    public void menu() {
        while (true) {
            System.out.println("\n-- Menu Anggota --");
            System.out.println("1. Lihat Pengumuman");
            System.out.print(">> ");
            pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                lihatAgenda();
            }

            System.out.println("\nKeluar ? (Y/N)");
            System.out.print(">> ");
            cek = sc.nextLine();
            if (cek.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    public void showPengumuman() {
        if (pengumuman.size() != 0) {
            System.out.println("\n-- Pengumuman --");
            for (int i = 0; i < pengumuman.size(); i++) {
                System.out.println((i + 1) + ". " + pengumuman.get(i)); 
            }
        }
    }

    public void showEvent() {
        if (event.size() != 0) {
            System.out.println("\n-- Event --");
            for (int i = 0; i < event.size(); i++) {
                System.out.println((i + 1) + ". " + event.get(i));
            } 
        }
    }

    public void lihatAgenda() {
        if (pengumuman.size() == 0 && event.size() == 0) {
            System.out.println("\nTidak ada pengumuman dan event");
        }
        showPengumuman();  
        showEvent();   
    }
    
}