public class Trapesium extends BangunDatar{
	double datar1, datar2;
	double miring1, miring2;
	
	@Override
	void luas() {
		System.out.printf("Luas	 = %.1f\n",(datar1+datar2)*tinggi/2);
	}
	
	@Override
	void keliling() {
		System.out.printf("Keliling = %.1f\n",(datar1+datar2+miring1+miring2));
	}
	
}
