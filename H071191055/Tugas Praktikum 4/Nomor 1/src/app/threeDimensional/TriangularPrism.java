package app.threeDimensional;

/**
 * TriangularPrism
 */
public class TriangularPrism extends ThreeDimensionalShape {

    double height;

    public TriangularPrism(double sideA, double sideB, double sideC, double sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        height = sideD;
    }

    public double getLateralArea() {
        return (sideA + sideB + sideC) * height;
    }

    public double getBaseArea() {
        return (sideA * sideC) / 2;
    }

    public double getVolume() {
        return ((sideA * sideC) / 2) * height;
    }

    public double getSurfaceArea() {
        return getLateralArea() + (2 * getBaseArea());
    }
    
    public void show() {
        System.out.println();
        System.out.println("---- Prisma Segitiga ----");
        System.out.printf("Alas Segitiga        : %.2f cm\n", sideA);
        System.out.printf("Tinggi Segitiga      : %.2f cm\n", sideB);
        System.out.printf("Sisi Miring Segitiga : %.2f cm\n", sideC);
        System.out.printf("Tinggi Prisma        : %.2f cm\n", height);
        super.show();
    }
}