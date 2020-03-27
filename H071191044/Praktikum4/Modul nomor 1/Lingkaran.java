public class Lingkaran extends BangunDatar{
	double r;
	
	@Override
	void luas() {
		System.out.printf("Luas	 = %.1f\n",pi*r*r);
	}
	
	@Override
	void keliling() {
		System.out.printf("Keliling = %.1f\n",pi*2*r);
	}
	
}
