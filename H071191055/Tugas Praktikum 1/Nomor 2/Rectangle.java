/**
 * Rectangle
 */
public class Rectangle {

    double height;
    double width;

    double getArea() {
        return height * width;
    }


    
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.height = 15;
        rec.width = 10;
        System.out.println("Luas = " + rec.getArea());
    }
}