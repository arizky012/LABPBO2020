public class Tabung extends BangunRuang{
	double r;
	
	@Override
	void luasPermukaan() {
		System.out.printf("Luas Permukaan = %.1f\n",2*pi*r*r+2*pi*r*tinggi);
	}
	
	@Override
	void volume() {
		System.out.printf("Volume         = %.1f\n",pi*r*r*tinggi);
	}

}
