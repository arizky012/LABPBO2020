package app.twoDimensional;

/**
 * Trapezoidal
 */
public class Trapezoid extends TwoDimensionalShape{
    
    private double sideA2;
    private double sideB1;
    private double sideB2, height;

    public Trapezoid(double lenght, double sideA2, double sideB1, double sideB2, double height) {
        this.lenght = lenght;
        this.sideA2 = sideA2;
        this.sideB1 = sideB1;
        this.sideB2 = sideB2;
        this.height = height;
    }

    public double getPerimeter() {
        return lenght + sideA2 + sideB1 + sideB2;
    }

    public double getArea() {
        return height * ((sideB1 + sideB2)/2) ;
    }

    public void show() {
        System.out.println();
        System.out.println("---- Trapesium ----");
        System.out.printf("Sisi Miring 1    : %.2f cm\n", lenght);
        System.out.printf("Sisi Miring 2    : %.2f cm\n", sideA2);
        System.out.printf("Sisi Alas        : %.2f cm\n", sideB1);
        System.out.printf("Sisi Atap        : %.2f cm\n", sideB2);
        System.out.printf("Tinggi           : %.2f cm\n", height);
        super.show();
    }
}