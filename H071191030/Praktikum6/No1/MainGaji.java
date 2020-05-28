//Modul No. 1

import java.util.Scanner;

public class MainGaji {

    public static void main(String[] args) {

        String staffName, lectName, employeeName;
        int attendance, sks;

        Scanner sm = new Scanner(System.in);

        System.out.print("Nama Staf : ");
        staffName = LineScanner(sm);
        System.out.print("Jumlah kehadiran : ");
        attendance = sm.nextInt();
        System.out.print("Nama Dosen : ");
        lectName = LineScanner(sm);
        System.out.print("Jumlah SKS : ");
        sks = sm.nextInt();
        System.out.print("Nama Pegawai : ");
        employeeName = LineScanner(sm);

        GajiPegawai[] gaji = new GajiPegawai[3];
        gaji[0] = new GajiStaf(attendance);
        gaji[1] = new GajiDosen(sks);
        gaji[2] = new GajiPegawai();

        System.out.println();
        System.out.println(staffName + " mendapatkan gaji Rp. " + gaji[0].getSalary());
        System.out.println(lectName + " mendapatkan gaji Rp. " + gaji[1].getSalary());
        System.out.println(employeeName + " mendapatkan gaji Rp. " + gaji[2].getSalary());

       
    }

    static String LineScanner(Scanner sm) {
        String input;
        do {
            input = sm.nextLine();

        } while (input.equals(""));
        return input.trim();
    }

}