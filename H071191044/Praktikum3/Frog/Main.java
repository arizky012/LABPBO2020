import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static Random random= new Random();
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		FROG [] frog= new FROG[10];
		
		String kuning, coklat, hijau, warna;
		kuning= "kuning";
		coklat= "coklat";
		hijau=  "hijau";
		
		FIELD [] field= new FIELD[10];
		
		for(int i=0; i<10; i++) {
			//instansiasi frog
			int a= random.nextInt(4);
			if(a==1) warna= kuning;
			else if(a==2) warna= coklat;
			else warna= hijau;
			frog[i]= new FROG(warna, 1);
			
			//setTinggiBambu
			field[i]= new FIELD();
			if(i>0) {
				field[i].setTinggiBambu(i, field[i-1].getTinggiBambu(i-1)+random.nextInt(2));
			}else {
				field[i].setTinggiBambu(i, 1);
			}
		}
		
		boolean masihJalan= true;
		
		for(int i=0; i<10; i++) {
			masihJalan= false;
			
			for(int j=0; j<10; j++) {
				if(frog[j].getRun(field[i])){
					frog[j].getProses(field[i], j, i);
					masihJalan= true;
				}
			}
			
			if(!masihJalan){
				System.out.println("Tidak ada katak yang berhasil melewati semua bambu..");
				return;
			}
			
			System.out.print("\nTekan enter untuk turn selanjutnya...");
			String next= xx.nextLine();
			if(next.equals("") || !next.equals("")) System.out.print("");
				
			if(i==9) {
				System.out.println();
				for(int j=0; j<10; j++) {
					if(frog[j].getRun(field[j])==true) System.out.println("Katak "+(j+1)+" berwarna "+frog[j].getColor()+" Berhasil melewati semua bambu");
				}
			}
			System.out.println();
		}
		
	}
}
