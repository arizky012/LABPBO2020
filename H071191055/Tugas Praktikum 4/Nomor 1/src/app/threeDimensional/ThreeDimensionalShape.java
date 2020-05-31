package app.threeDimensional;

/**
 * ThreeDimensionalShape
 */
public class ThreeDimensionalShape {

    double sideA;
    double sideB;
    double sideC;
    double sideD;

    public double getVolume() {
        return 0;
    }

    public double getSurfaceArea() {
        return 0;
    }

    public void show() {
        System.out.printf("Volume           : %.2f cm^3\n", getVolume());
        System.out.printf("Luas Permukaan   : %.2f cm^2\n", getSurfaceArea());
        System.out.println();
    }
}