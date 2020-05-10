

import java.util.Scanner;

/**
 * MainMenu
 */
public class MainMenu {

    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        try {

            boolean cont = true;

            while (cont) {

                System.out.println("\n====== Menu ======");
                System.out.println("1. Bangun Ruang");
                System.out.println("2. Bangun Datar");
                System.out.println("3. Exit");
                System.out.println("\nInput angka sesuai dengan Menu yang diinginkan");
                int menu = sm.nextInt();

                switch (menu) {
                    case 1:
                        BangunRuang br = new BangunRuang();
                        System.out.println("==== BANGUN RUANG ====");
                        System.out.println("1.  KUBUS\n2.  BALOK\n3.  PRISMA SEGITIGA\n4.  BOLA\n5.  TABUNG\n");
                        int bangunRuang = sm.nextInt();

                        switch (bangunRuang) {
                            case 1:
                                Kubus kubus = new Kubus();
                                System.out.println("Input rusuk");
                                kubus.rusuk = sm.nextDouble();
                                kubus.luasPermukaan();
                                kubus.volume();

                                break;
                            case 2:
                                Balok balok = new Balok();
                                System.out.println("Input panjang");
                                balok.panjang = sm.nextDouble();
                                System.out.println("Input lebar");
                                balok.lebar = sm.nextDouble();
                                System.out.println("Input tinggi");
                                balok.tinggi = sm.nextDouble();
                                balok.luasPermukaan();

                                balok.volume();

                                break;

                            case 3:
                                PrismaSegitiga prisma = new PrismaSegitiga();

                                System.out.println("Input alas");
                                prisma.alas = sm.nextDouble();
                                System.out.println("Input tinggi segitiga");
                                prisma.tinggiSegitiga = sm.nextDouble();
                                System.out.println("Input tinggi prisma");
                                prisma.tinggiPrisma = sm.nextDouble();
                                prisma.luasPermukaan();

                                prisma.volume();
                                break;
                            case 4:
                                Bola bola = new Bola();
                                System.out.println("Input jari jari bola");
                                bola.r = sm.nextDouble();
                                bola.luasPermukaan();
                                bola.volume();
                                break;
                            case 5:
                                Tabung tabung = new Tabung();
                                System.out.println("Input jari jari tabung");
                                tabung.r = sm.nextDouble();
                                System.out.println("Input tinggi tabung");
                                tabung.tinggiTabung = sm.nextDouble();
                                tabung.luasPermukaan();
                                tabung.volume();
                                break;

                            default:
                                System.out.println("Inputan tidak valid");
                                break;
                        }

                        break;

                    case 2:

                        System.out.println("==== BANGUN DATAR ====");
                        System.out.println(
                                "1.  PERSEGI\n2.  PERSEGI PANJANG\n3.  LINGKARAN\n4.  SEGITIGA\n5.  TRAPESIUM\n");
                        int bangunDatar = sm.nextInt();
                        BangunDatar bd = new BangunDatar();

                        switch (bangunDatar) {
                            case 1:
                                Persegi persegi = new Persegi();
                                System.out.println("Input sisi");
                                persegi.sisi = sm.nextDouble();
                                persegi.luas();
                                persegi.keliling();

                                break;

                            case 2:
                                PersegiPanjang persegiP = new PersegiPanjang();
                                System.out.println("Input panjang");
                                persegiP.panjang = sm.nextDouble();
                                System.out.println("Input lebar");
                                persegiP.lebar = sm.nextDouble();
                                persegiP.luas();
                                persegiP.keliling();
                                break;
                            case 3:
                                Lingkaran lingkaran = new Lingkaran();
                                System.out.println("Input jari-jari lingkaran");
                                lingkaran.r = sm.nextDouble();
                                lingkaran.luas();
                                lingkaran.keliling();
                                break;
                            case 4:
                                Segitiga segitiga = new Segitiga();
                                System.out.println("Input alas");
                                segitiga.alas = sm.nextDouble();
                                System.out.println("Input tinggi");
                                segitiga.tinggi = sm.nextDouble();
                                System.out.println("Input sisi 1");
                                segitiga.s1 = sm.nextDouble();
                                System.out.println("Input sisi 2");
                                segitiga.s2 = sm.nextDouble();
                                System.out.println("Input sisi 3");
                                segitiga.s3 = sm.nextDouble();
                                segitiga.luas();
                                segitiga.keliling();
                                break;
                            case 5:
                                Trapesium trapesium = new Trapesium();
                                System.out.println("Input sisi atas");
                                trapesium.sa = sm.nextDouble();
                                System.out.println("Input sisi bawah");
                                trapesium.sb = sm.nextDouble();
                                System.out.println("Input sisi miring");
                                trapesium.sm = sm.nextDouble();
                                System.out.println("Input tinggi trapesium");
                                trapesium.t = sm.nextDouble();
                                trapesium.luas();
                                trapesium.keliling();
                                break;
                            default:
                                System.out.println("Inputan tidak valid");
                                break;
                        }
                        break;
                    case 3:
                        cont = false;

                        break;
                    default:
                        System.out.println("Inputan tidak valid");
                        break;
                }

            }
        } catch (

        Exception e) {
            System.out.println("Inputan tidak valid");
        }

        sm.close();
    }
}