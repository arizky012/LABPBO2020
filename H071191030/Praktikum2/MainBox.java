//Modul No. 2

import java.util.Scanner;

class Box {
    private double width;
    private double height;
    private double depth;
    private double mass;
    private double density;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return this.mass / (this.width * this.height * this.depth);
    }
}

public class MainBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double height = input.nextDouble();
        double depth = input.nextDouble();
        double mass = input.nextDouble();

        Box box = new Box(width, height, depth);
        box.setMass(mass);
        System.out.println("Massa jenis = " + box.getDensity());
        box.setMass(mass * 2);
        System.out.println("Massa jenis = " + box.getDensity());

        input.close();
    }
}