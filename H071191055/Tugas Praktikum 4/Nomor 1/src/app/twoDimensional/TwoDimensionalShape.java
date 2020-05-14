package app.twoDimensional;

/**
 * TwoDimensionalShape
 */
public class TwoDimensionalShape {

    public double lenght;
    public double width;

    public double getPerimeter() {
        return 0;
    }
    
    public double getArea() {
        return 0;
    }

    public void show() {
        System.out.printf("Keliling \t\t: %.2f cm\n", getPerimeter());
        System.out.printf("Luas \t\t: %.2f cm^2\n", getArea());
        System.out.println();
    }
}