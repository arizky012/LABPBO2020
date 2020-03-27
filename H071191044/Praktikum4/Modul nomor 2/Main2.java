import java.util.Scanner;

public class Main2 {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		PengurusInti a= new PengurusInti();
		KoordinatorBidang b= new KoordinatorBidang();
		Staf c= new Staf();
		
		while(true) {
			System.out.print("<== Sistem Informasi ==>\n1. Mengumumkan informasi\n2. Melihat Informasi yang telah diberikan\n3. Keluar\n==> ");
			String input= xx.nextLine();
			
			if(input.equals("1")) {
				System.out.print("\n<== Destinasi pengiriman informasi ==>\n1. Pengurus inti, koordinator bidang, staf\n2. Pengurus inti dan koordinator bidang\n3. Hanya pengurus inti\n==> ");
				input= xx.nextLine();
				
				if(input.equals("1") || input.equals("2") || input.equals("3")) {
					System.out.print("Informasi yang akan diumumkan ==> ");
					String info= xx.nextLine();
					
					if(input.equals("1")) {
						a.informasi.add(info);
						b.informasi.add(info);
						c.informasi.add(info);
					}else if(input.equals("2")) {
						a.informasi.add(info);
						b.informasi.add(info);
					}else if(input.equals("3")) {
						a.informasi.add(info);
					}
					
				} else System.out.println("==> Input salah");
				
			}else if(input.equals("2")) {
				System.out.print("\n<== Lihat riwayat pengiriman informasi ==>\n1. Pengurus inti\n2. Koordinator bidang\n3. Staf\n==> ");
				input= xx.nextLine();
				
				if(input.equals("1")) a.informasiDiberikan();
				else if(input.equals("2")) b.informasiDiberikan();
				else if(input.equals("3")) c.informasiDiberikan();
				else System.out.println("\n==> Input salah");
					
			}else if(input.equals("3")) {
				System.out.println("==> Keluar dari ruangan informasi..");
				return;
			}else System.out.println("\n==> Input salah");
			
			System.out.println();
		}
		
	}
}
