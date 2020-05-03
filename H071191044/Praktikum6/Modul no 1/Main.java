package Lab6PBO;

public class Main {
	public static void main(String [] args) {
		Pegawai[] pegawai= new Pegawai[3];
		pegawai[0]= new Staf();
		pegawai[1]= new Dosen();
		pegawai[2]= new Pegawai();
		
		for(int i=0; i<3; i++) {
			pegawai[i].setName();
			pegawai[i].setGajiTambahan();
		}
		
		for(int i=0; i<3; i++) pegawai[i].hitungGaji();
		
	}
}
