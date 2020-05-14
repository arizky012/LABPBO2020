package app.twoDimensional;

/**
 * Square
 */
public class Square extends TwoDimensionalShape{

    public Square(double lenght) {
        this.lenght = lenght;
    }

    public double getPerimeter() {
        return 4 * lenght;
    }

    public double getArea() {
        return Math.pow(lenght, 2);
    }

    public void show() {
        System.out.println();
        System.out.println("---- Persegi ----");
        System.out.printf("Sisi \t\t: %.2f cm\n", lenght);
        super.show();
    }
}