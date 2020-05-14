package app.threeDimensional;

/**
 * Cube
 */
public class Cube extends ThreeDimensionalShape{

    public Cube(double sideA) {
        this.sideA = sideA;
    }

    public double getVolume() {
        return Math.pow(sideA, 3);
    }

    public double getSurfaceArea() {
        return 6 * Math.pow(sideA, 2);
    }

    public void show() {
        System.out.println();
        System.out.println("---- Kubus ----");
        System.out.printf("Sisi \t\t: %.2f cm\n");
        super.show();
    }
}