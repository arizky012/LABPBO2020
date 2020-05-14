package app.twoDimensional;

/**
 * Circle
 */
public class Circle extends TwoDimensionalShape{

    public Circle(double lenght) {
        this.lenght = lenght;
    }

    public double getPerimeter() {
        return 2 * Math.PI *lenght;
    }

    public double getArea() {
        return Math.pow(lenght, 2) * Math.PI;
    }

    public void show() {
        System.out.println();
        System.out.println("---- Lingkaran ----");
        System.out.printf("Jari - Jari      : %.2f cm\n", lenght);
        System.out.printf("Diameter         : %.2f cm\n", lenght * 2);
        super.show();
    }
}