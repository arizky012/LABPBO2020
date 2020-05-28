public class Kubus extends BangunRuang{
	double sisi;
	
	@Override
	void luasPermukaan() {
		System.out.printf("Luas Permukaan = %.1f\n",6*(sisi*sisi));
	}
	
	@Override
	void volume() {
		System.out.printf("Volume         = %.1f\n",sisi*sisi*sisi);
	}
	
}
