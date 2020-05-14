package app;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Width = ");
        double width = input.nextDouble();
        System.out.print("Input Height = ");
        double height = input.nextDouble();
        System.out.print("Input Height = ");
        double depth = input.nextDouble();
        System.out.print("Input Depth = ");
        double mass = input.nextDouble();
        Box box = new Box(width, height, depth);
        box.setMass(mass);
        System.out.println("Massa jenis = " + box.getDensity());
        box.setMass(mass*2);
        System.out.println("Massa jenis = " + box.getDensity());

        input.close();
    }
}