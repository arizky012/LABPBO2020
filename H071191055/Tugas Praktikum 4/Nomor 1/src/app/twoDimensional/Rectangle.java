package app.twoDimensional;

/**
 * Rectangle
 */
public class Rectangle extends TwoDimensionalShape{

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }
    
    public double getPerimeter() {
        return 2* (lenght + width);
    }

    public double getArea() {
        return lenght * width;
    }

    public void Show() {
        System.out.println();
        System.out.println("---- Persegi Panjang ----");
        System.out.printf("Panjang \t\t: %.2f cm\n", lenght);
        System.out.printf("Lebar \t\t: %.2f cm\n", width);
        super.show();
    }
}