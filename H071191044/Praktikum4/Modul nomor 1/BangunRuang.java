public class BangunRuang extends Bangun{
	
	void luasPermukaan() {
		System.out.printf("Luas Permukaan = %.1f\n",((2*(panjang+lebar)+2*(panjang+tinggi)+2*(tinggi+lebar))));
	}
	
	void volume() {
		System.out.printf("Volume         = %.1f\n",panjang*lebar*tinggi);
	}
}
