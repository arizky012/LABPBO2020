public class Bola extends BangunRuang{
	double r;
	
	@Override
	void luasPermukaan() {
		System.out.printf("Luas Permukaan = %.1f\n",4*pi*r*r);
	}
	
	@Override
	void volume() {
		System.out.printf("Volume         = %.1f\n",4/3*pi*r*r*r);
	}

}
