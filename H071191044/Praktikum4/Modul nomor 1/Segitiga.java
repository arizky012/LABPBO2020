public class Segitiga extends BangunDatar{
	double alas;
	double a, b, c;
	
	@Override
	void luas() {
		System.out.printf("Luas	 = %.1f\n",alas*tinggi/2);
	}
	
	@Override
	void keliling() {
		System.out.printf("Keliling = %.1f\n", (a+b+c));
	}
	
}
