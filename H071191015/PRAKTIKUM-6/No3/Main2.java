package No3;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SistemAkademik si = new SistemAkademik();
        Mahasiswa mhs = new Mahasiswa();
        Nilai nil = new Nilai();
        Kelas kls = new Kelas();

        System.out.print("Nama ::> ");
        mhs.setNama(sc.nextLine());
        System.out.print("NIM ::> ");
        mhs.setNim(sc.nextLine());
        System.out.print("Kelas ::> ");
        String kelas = sc.nextLine();
        System.out.print("Mata Kuliah ::> ");
        kls.setMatkul(sc.nextLine());
        System.out.print("Nilai UTS ::> ");
        nil.setUTS(sc.nextDouble());
        System.out.print("Nilai UAS ::> ");
        nil.setUAS(sc.nextDouble());
        nil.hitungNilai();
        System.out.println();

        si.isiData();
        si = mhs;
        si.isiData();
        si = kls;
        si.isiData();
        si = nil;
        si.isiData();



    }
}