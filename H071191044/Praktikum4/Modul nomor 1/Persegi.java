public class Persegi extends BangunDatar{
	double sisi;
	
	@Override
	void luas() {
		System.out.printf("Luas	 = %.1f\n",sisi*sisi);
	}
	
	@Override
	void keliling() {
		System.out.printf("Keliling = %.1f\n",4*sisi);
	}
	
}
