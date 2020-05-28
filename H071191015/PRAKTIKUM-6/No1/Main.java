package No1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pegawai pegawai;

        System.out.print("Nama Staf ::> ");
        String namaStaff = sc.next();
        System.out.print("Jumlah Kehadiran ::> ");
        int jumlahKehadiran = sc.nextInt();
        
        System.out.print("Nama Dosen ::> ");
        String namaDosen = sc.next();
        System.out.print("Jumlah SKS ::> ");
        int sks = sc.nextInt();
        
        System.out.print("Nama Pegawai ::> ");
        String nama = sc.next();
        System.out.println();
        
        pegawai = new Staff(namaStaff,jumlahKehadiran);
        pegawai.showSalary();
        pegawai = new Dosen(namaDosen,sks);
        pegawai.showSalary();
        pegawai = new Pegawai(nama);
        pegawai.showSalary();
    }
}