package Lab6PBO;


public class Staf extends Pegawai{
	
	@Override
	void setName() {
		System.out.print("Nama Staf         ::> ");
		nama= xx.nextLine();
	}
	
	@Override
	void setGajiTambahan() {
		System.out.print("Jumlah Kehadiran  ::> ");
		gajiTambahan= xx.nextInt()*50000;
	}
	
}
