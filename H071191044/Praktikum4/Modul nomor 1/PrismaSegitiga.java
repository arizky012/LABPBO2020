public class PrismaSegitiga extends BangunRuang{
	double tinggiAlas;
	double panjangAlas;
	double luasSelimut;
	
	@Override
	void luasPermukaan() {
		System.out.printf("Luas Permukaan = %.1f\n",2*(tinggiAlas*panjangAlas/2+luasSelimut));
	}
	
	@Override
	void volume() {
		System.out.printf("Volume         = %.1f\n",tinggiAlas*panjangAlas*tinggi/2);
	}
	
}
