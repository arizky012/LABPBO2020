package app.threeDimensional;

/**
 * Cylinder
 */
public class Cylinder extends ThreeDimensionalShape{

    public Cylinder(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getVolume() {
        return Math.PI * Math.pow(sideA, 2) * sideB;
    }

    // 2πrh+2πr2
    public double getSurfaceArea() {
        return (2 * Math.PI * sideA * sideB) + (2 * Math.PI * Math.pow(sideA, 2));
    }

    public void show() {
        System.out.println();
        System.out.println("---- Tabung ----");
        System.out.printf("Jari - Jari  : %.2f cm\n", sideA);
        System.out.printf("Tinggi       : %.2f cm\n", sideB);
        super.show();
    }
}