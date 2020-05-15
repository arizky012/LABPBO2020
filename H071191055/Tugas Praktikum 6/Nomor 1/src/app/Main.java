package app;

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pegawai[] pegawai = new Pegawai[3];

        System.out.print("Nama Staf ::> ");
        pegawai[0] = new Staf(sc.nextLine());
        System.out.print("Jumlah Kehadiran ::> ");
        pegawai[0].gajiPegawai(sc.nextInt());
        
        sc.nextLine();
        System.out.print("Nama Dosen ::> ");
        pegawai[1] = new Dosen(sc.nextLine());
        System.out.print("Jumlah SKS ::> ");
        pegawai[1].gajiPegawai(sc.nextInt());

        sc.nextLine();
        System.out.print("Nama Pegawai ::> ");
        pegawai[2] = new Pegawai(sc.nextLine());

        for (Pegawai pegawai2 : pegawai) {
            pegawai2.showGaji();
        }

        sc.close();
    }
}