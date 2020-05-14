package app;

import app.twoDimensional.*;
import app.threeDimensional.*;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int input;
    static double sideA, sideB, sideC, sideD, tinggi;

    public static void main(String[] args) {
        while(true) {
            System.out.println("==== Menu ====");
            System.out.println("1. Bangun Datar");
            System.out.println("2. Bangun Ruang");
            System.out.print("Command : ");
            input = sc.nextInt();
            System.out.println();
            switch (input) {
                case 1:
                    menuBangunDatar();
                    break;
                case 2:
                    menuBangunRuang();    
                    break;
                default:
                    System.out.println("Input Salah");
                    break;
            }
        }
    }

    private static void menuBangunRuang() {
        System.out.println("==== Bangun Ruang ====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Prisma Segitiga");
        System.out.println("4. Bola");
        System.out.println("5. Tabung");
        System.out.print("Command : ");
        input = sc.nextInt();
        System.out.println();

        switch (input) {
            case 1:
                System.out.println("---- Kubus ----");
                System.out.print("Input Sisi \t: ");
                sideA = sc.nextDouble();
                Cube cube = new Cube(sideA);
                cube.show();
                break;
            case 2:
                System.out.println("---- Balok ----");
                System.out.print("Input Panjang \t: ");
                sideA = sc.nextDouble();
                System.out.print("Input Lebar \t: ");
                sideB = sc.nextDouble();
                System.out.print("Input Tinggi \t: ");
                sideC = sc.nextDouble();
                Box box = new Box(sideA, sideB, sideC);
                box.show();
                break;
            case 3:
                System.out.println("---- Prisma Segitiga ----");
                System.out.print("Input Alas Segitiga        : ");
                sideA = sc.nextDouble();
                System.out.print("Input Tinggi Segitiga      : ");
                sideB = sc.nextDouble();
                System.out.print("Input Sisi Miring Segitiga : ");
                sideC = sc.nextDouble();
                System.out.print("Input Tinggi Prisma        : ");
                sideD = sc.nextDouble();
                TriangularPrism triangularPrism = new TriangularPrism(sideA, sideB, sideC, sideD);
                triangularPrism.show();
                break;
            case 4:
                System.out.println("---- Bola ----");
                System.out.print("Input Jari - Jari \t: ");
                sideA = sc.nextDouble();
                Sphere sphere = new Sphere(sideA);
                sphere.show();
                break;
            case 5:
                System.out.println("---- Tabung ----");
                System.out.print("Input Jari - Jari     : ");
                sideA = sc.nextDouble();
                System.out.print("Input Tinggi          : ");
                sideB = sc.nextDouble();
                Cylinder tabung = new Cylinder(sideA, sideB);
                tabung.show();
            default:
                System.out.println("Inputan Salah ! Mohon Untuk Menginput dari 1 sampai 5");
                break;
        }
    }

    public static void menuBangunDatar() {
        System.out.println("==== Bangun Datar ====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.println("5. Trapesium");
        System.out.print("Command : ");
        input = sc.nextInt();
        System.out.println();

        switch (input) {
            case 1:
                System.out.println("---- Persegi ----");
                System.out.print("Input Sisi \t: ");
                sideA = sc.nextDouble();
                Square square = new Square(sideA);
                square.show();
                break;
            case 2:
                System.out.println("---- Persegi Panjang ----");
                System.out.print("Input Panjang \t: ");
                sideA = sc.nextDouble();
                System.out.print("Input Lebar \t: ");
                sideB = sc.nextDouble();
                Rectangle rectangle = new Rectangle(sideA, sideB);
                rectangle.show();
                break;
            case 3:
                System.out.println("---- Lingkaran ----");
                System.out.print("Input Jari - Jari \t: ");
                sideA = sc.nextDouble();
                Circle circle = new Circle(sideA);
                circle.show();
                break;
            case 4:
                System.out.println("---- Segitiga ----");
                System.out.print("Input Alas        : ");
                sideA = sc.nextDouble();
                System.out.print("Input Tinggi      : ");
                sideB = sc.nextDouble();
                System.out.print("Input Sisi Miring : ");
                sideC = sc.nextDouble();
                Triangle triangle = new Triangle(sideA, sideB, sideC);
                triangle.show();
                break;
            case 5:
                System.out.println("---- Trapesium ----");
                System.out.print("Input Sisi Miring 1 \t: ");
                sideA = sc.nextDouble();
                System.out.print("Input Sisi Miring 2 \t: ");
                sideB = sc.nextDouble();
                System.out.print("Input Sisi Alas \t: ");
                sideC = sc.nextDouble();
                System.out.print("Input Sisi Atap \t: ");
                sideD = sc.nextDouble();
                System.out.print("Input Tinggi \t\t: ");
                tinggi = sc.nextDouble();
                Trapezoid trapezoid = new Trapezoid(sideA, sideB, sideC, sideD, tinggi);
                trapezoid.show();
                break;
            default:
                System.out.println("Inputan Salah ! Mohon Untuk Menginput dari 1 sampai 5");
                break;
        }
    }
}