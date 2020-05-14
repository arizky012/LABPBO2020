package app;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMh, NIM, kelas, namaMK;
        double nUTS, nUAS;
        
        System.out.print("Nama ::> ");
        namaMh = sc.nextLine();
        System.out.print("NIM ::> ");
        NIM = sc.nextLine();
        System.out.print("Kelas ::> ");
        kelas = sc.nextLine();
        System.out.print("Mata Kuliah ::> ");
        namaMK = sc.nextLine();
        System.out.print("Nilai UTS ::> ");
        nUTS = sc.nextDouble();
        System.out.print("Nilai UAS ::> ");
        nUAS = sc.nextDouble();
        
        KHS_Mahasiswa kMahasiswa = new KHS_Mahasiswa(namaMh, NIM, kelas, namaMK, nUTS, nUAS);
        kMahasiswa.show();

        sc.close();
    }
}