package app.threeDimensional;

public class Sphere extends ThreeDimensionalShape {

    public Sphere(double sideA) {
        this.sideA = sideA;
    }

    public double getVolume() {
        return (4 * Math.PI * Math.pow(sideA, 3)) / 4;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(sideA, 2);
    }

    public void show() {
        System.out.println();
        System.out.println("---- Bola ----");
        System.out.printf("Jari - Jari \t: %.2f cm \n", sideA);
        super.show();
    }
}