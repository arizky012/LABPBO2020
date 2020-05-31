package app.threeDimensional;

/**
 * Box
 */
public class Box extends ThreeDimensionalShape{

    double width, lenght, height;

    public Box(double sideA, double sideB, double sideC) {
        width = sideA;
        lenght = sideB;
        height = sideC;
    }

    public double getVolume() {
        return width * lenght * height;
    }

    public double getSurfaceArea() {
        return 2 * (lenght * width + width * height + lenght * height);
    }

    public void show() {
        System.out.println();
        System.out.println("---- Balok ----");
        System.out.printf("Panjang \t\t: %.2f cm\n", lenght);
        System.out.printf("Lebar \t\t: %.2f cm\n", width);
        System.out.printf("Tinggi \t\t: %.2f cm\n", height);
        super.show();
    }
}