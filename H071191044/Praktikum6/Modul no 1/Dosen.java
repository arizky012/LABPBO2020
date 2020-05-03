package Lab6PBO;

public class Dosen extends Pegawai{
	@Override
	void setName() {
		System.out.print("Nama Dosen        ::> ");
		nama= xx.nextLine();
	}
	
	@Override
	void setGajiTambahan() {
		System.out.print("Jumlah SKS        ::> ");
		gajiTambahan= xx.nextInt()*120000;
	}
	
}
