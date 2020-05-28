package Nomor1;

import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga();
        Bola bola = new Bola();
        Tabung tabung = new Tabung();

        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Trapesium trapesium = new Trapesium();

        System.out.println("==== 1. BANGUN RUANG ====");
        System.out.println("==== 2. BANGUN DATAR ====");
        System.out.print("=> ");
        int menu = sc.nextInt();
        
        switch (menu) {
            case 1 :
                System.out.println();
                System.out.println("==== BANGUN RUANG ====");
                System.out.println("1. KUBUS");
                System.out.println("2. BALOK");
                System.out.println("3. PRISMA SEGITIGA");
                System.out.println("4. BOLA");
                System.out.println("5. TABUNG");
                System.out.print("=> ");
                int n = sc.nextInt();
                System.out.println();

                switch (n) {
                    case 1 :
                        System.out.print("Input Sisi Kubus : ");
                        kubus.setSisi(sc.nextDouble());
                        System.out.println();
                        kubus.volume();
                        kubus.luasPermukaan();
                        break;
                    case 2 :
                        System.out.print("Input Panjang Balok : ");
                        balok.setPanjangBalok(sc.nextDouble());
                        System.out.print("Input Lebar Balok : ");
                        balok.setLebarBalok(sc.nextDouble());
                        System.out.print("Input Tinggi Balok : ");
                        balok.setTinggiBalok(sc.nextDouble());
                        System.out.println();
                        balok.volume();
                        balok.luasPermukaan();
                        break;
                    case 3 :
                        System.out.print("Input Tinggi Prisma Segitiga : ");
                        prismaSegitiga.setTinggiPrisma(sc.nextDouble());
                        System.out.print("Input Alas Prisma Segitiga : ");
                        prismaSegitiga.setAlasPrisma(sc.nextDouble());
                        System.out.print("Input Tinggi Alas Prisma Segitiga : ");
                        prismaSegitiga.setTinggiAlasPrisma(sc.nextDouble());
                        System.out.print("Input Sisi 1 Alas Prisma Segitiga :");
                        prismaSegitiga.setSisi1(sc.nextDouble());
                        System.out.print("Input Sisi 2 Alas Prisma Segitiga : ");
                        prismaSegitiga.setSisi2(sc.nextDouble());
                        System.out.println();
                        prismaSegitiga.volume();
                        prismaSegitiga.luasPermukaan();
                        break;
                    case 4 :
                        System.out.print("Input Jari-Jari Bola : ");
                        bola.setJariBola(sc.nextDouble());
                        System.out.println();
                        bola.volume();
                        bola.luasPermukaan();
                        break;
                    case 5 :
                        System.out.print("Input Jari-Jari Tabung : ");
                        tabung.setJariTabung(sc.nextDouble());
                        System.out.print("Input Tinggi Tabung : ");
                        tabung.setTinggiTabung(sc.nextDouble());
                        System.out.println();
                        tabung.volume();
                        tabung.luasPermukaan();
                        break;
                }
                break;
        
            case 2 :
                System.out.println("==== BANGUN DATAR ====");
                System.out.println("1. PERSEGI");
                System.out.println("2. PERSEGI PANJANG");
                System.out.println("3. LINGKARAN");
                System.out.println("4. SEGITIGA");
                System.out.println("5. TRAPESIUM");
                System.out.print("=> ");
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.print("Input Sisi Persegi : ");
                        persegi.setSisi(sc.nextDouble());
                        System.out.println();
                        persegi.luas();
                        persegi.keliling();
                        break;
                    case 2 :
                        System.out.print("Input Panjang Persegi Panjang : ");
                        persegiPanjang.setPanjang(sc.nextDouble());
                        System.out.print("Input Lebar Persegi Panjang : ");
                        persegiPanjang.setLebar(sc.nextDouble());
                        System.out.println();
                        persegiPanjang.luas();
                        persegiPanjang.keliling();
                        break;
                    case 3 :
                        System.out.print("Input Jari-Jari Lingkaran : ");
                        lingkaran.setJari(sc.nextDouble());
                        System.out.println();
                        lingkaran.luas();
                        lingkaran.keliling();
                        break;
                    case 4 :
                        System.out.print("Input Alas Segitiga : ");
                        segitiga.setAlas(sc.nextDouble());
                        System.out.print("Input Tinggi Segitiga : ");
                        segitiga.setTinggi(sc.nextDouble());
                        System.out.print("Input Sisi Segitiga : ");
                        segitiga.setSisi2(sc.nextDouble());
                        System.out.print("Input Sisi Segitiga : ");
                        segitiga.setSisi3(sc.nextDouble());
                        System.out.println();
                        segitiga.luas();
                        segitiga.keliling();
                        break;
                    case 5 :
                        System.out.print("Input Sisi Atas Trapesium : ");
                        trapesium.setSisiAtas(sc.nextDouble());
                        System.out.print("Input Sisi Bawah Trapesium : ");
                        trapesium.setSisiBawah(sc.nextDouble());
                        System.out.print("Input Tinggi Trapesium : ");
                        trapesium.setTinggiTrapesium(sc.nextDouble());
                        System.out.println();
                        trapesium.luas();
                        trapesium.keliling();
                        break;
                }
                break;
            default :
                System.out.println("Inputan Salah \nPilihan antara 1 atau 2!!!");
        }
        
    }
}