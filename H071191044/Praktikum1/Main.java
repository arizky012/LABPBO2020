
class Rectangle {
	double height;
	double width;
	
	double getArea() {
		return height*width;
	}	
}

public class Main{
	public static void main(String [] args) {
		Rectangle rec= new Rectangle();
		rec.height= 50;
		rec.width= 3;
		System.out.println("Luas = "+rec.getArea());
	}
}
