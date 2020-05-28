package Nomor2;                                           

import java.util.HashMap;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PengurusInti pInti = new PengurusInti();
        Koordinator koo = new Koordinator();
        
        HashMap<Integer,Anggota> list = new HashMap<>();

        boolean turn = true;

        while (turn) {
            System.out.println("\n== Sistem Informasi UKM Programmer ==");
            System.out.println("1. Daftar Pengurus Inti");
            System.out.println("2. Daftar Koordinator Bidang & Staff");
            System.out.println("3. Lihat Daftar Anggota");
            System.out.println("0. Keluar");
            int n = sc.nextInt();
            
            switch (n) {
                case 1:
                    System.out.println("\nPilih Angka Jabatan Anda!");
                    pInti.showPengurusInti();

                    System.out.print("Nim : ");
                    String nim = sc.next();
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    System.out.print("Prodi : ");
                    String prodi = sc.next();
                    System.out.print("Jabatan : ");
                    int p = sc.nextInt();

                    pInti = new PengurusInti(nim, nama, prodi);
                    pInti.setJabatan(p);
                    list.put(p, pInti);
                    break;
                case 2:
                    System.out.println("\nPilih Angka Jabatan Anda!");
                    koo.showKoordinatorStaff();

                    System.out.print("Nim : ");
                    String nim2 = sc.next();
                    System.out.print("Nama : ");
                    String nama2 = sc.next();
                    System.out.print("Prodi : ");
                    String prodi2 = sc.next();
                    System.out.print("Jabatan : ");
                    int k = sc.nextInt();
    
                    koo = new Koordinator(nim2, nama2, prodi2);
                    koo.setJabatan(k);
                    list.put(k, koo);
                    break;
                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Tidak ada data!");
                    } else {
                        for (Integer a : list.keySet()) {
                            list.get(a).showStatus();
                        } 
                    }
                    break;
                case 0:
                    turn=false;
                    break;
                default:
                    System.out.println("Inputan Salah");
                    break;
            }
        }
        sc.close();
    }
}