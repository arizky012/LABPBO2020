package Lab6PBO;

import java.util.Scanner;

public class Pegawai {
	protected String nama;
	protected int gajiAwal= 2500000;
	protected int gajiTambahan;
	
	protected Scanner xx= new Scanner(System.in);
	
	void setName() {
		System.out.print("Nama Pegawai      ::> ");
		nama= xx.nextLine();
	}
	
	void setGajiTambahan() {
		gajiTambahan= 0;
	}
	
	void hitungGaji() {
		System.out.println(nama+" mendapatkan gaji Rp. "+(gajiAwal+gajiTambahan));
	}
}
