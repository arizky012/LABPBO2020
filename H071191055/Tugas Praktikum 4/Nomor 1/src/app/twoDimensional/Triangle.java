package app.twoDimensional;

/**
 * Triangle
 */
public class Triangle extends TwoDimensionalShape{

    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        lenght = sideA;
        width = sideB;
        this.sideC = sideC;
    }

    public double getPerimeter() {
        return lenght + width + sideC;
    }

    public double getArea() {
        return (lenght * width) / 2;
    }

    public void show() {
        System.out.println();
        System.out.println("---- Segitiga ----");
        System.out.printf("Alas         : %.2f cm\n", lenght);
        System.out.printf("Tinggi       : %.2f cm\n", width);
        System.out.printf("Sisi Miring  : %.2f cm\n", sideC);
        super.show();
    }
}