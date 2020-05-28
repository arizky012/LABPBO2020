import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner xx= new Scanner(System.in);
		
		System.out.println(" ===== BANGUN RUANG ===== ");
		System.out.println("1. KUBUS\n2. BALOK\n3. PRISMA SEGITIGA\n4. BOLA\n5. TABUNG");
		System.out.println(" ===== BANGUN DATAR ===== ");
		System.out.print("6. PERSEGI\n7. PERSEGI PANJANG\n8. LINGKARAN\n9. SEGITIGA\n10. TRAPESIUM\n>> ");
		
		int input= 0;
		
		try {
			input= xx.nextInt();
		}catch(Exception e) {
			System.out.println("Input salah");
			return;
		}
		
		if(input==1) {
			Kubus a= new Kubus();
			
			System.out.print("Sisi : ");
			a.sisi= xx.nextDouble();
			
			desc(a);
		}else if(input==2) {
			Balok a= new Balok();
			
			System.out.print("Panjang : ");
			a.panjang= xx.nextDouble();
			System.out.print("Lebar   : ");
			a.lebar= xx.nextDouble();
			System.out.print("Tinggi  : ");
			a.tinggi= xx.nextDouble();
			
			desc(a);
		}else if(input==3) {
			PrismaSegitiga a= new PrismaSegitiga();
			
			System.out.print("Tinggi Alas  : ");
			a.tinggiAlas= xx.nextDouble();
			System.out.print("Panjang Alas : ");
			a.panjangAlas= xx.nextDouble();
			System.out.print("Tinggi       : ");
			a.tinggi= xx.nextDouble();
			System.out.print("Luas Selimut : ");
			a.luasSelimut= xx.nextDouble();
			
			desc(a);
		}else if(input==4) {
			Bola a= new Bola();
			
			System.out.print("Jari-jari : ");
			a.r= xx.nextDouble();
			
			desc(a);
		}else if(input==5) {
			Tabung a= new Tabung();
			
			System.out.print("Jari-jari : ");
			a.r= xx.nextDouble();
			System.out.print("Tinggi : ");
			a.tinggi= xx.nextDouble();
			
			desc(a);
		}else if(input==6) {
			Persegi a= new Persegi();
			
			System.out.print("Sisi : ");
			a.sisi= xx.nextDouble();
			
			desc(a);
		}else if(input==7) {
			PersegiPanjang a= new PersegiPanjang();
			
			System.out.print("Panjang : ");
			a.panjang= xx.nextDouble();
			System.out.print("Lebar   : ");
			a.lebar= xx.nextDouble();
			
			desc(a);
		}else if(input==8) {
			Lingkaran a= new Lingkaran();
			
			System.out.print("Jari-jari : ");
			a.r=  xx.nextDouble();
			
			desc(a);
		}else if(input==9) {
			Segitiga a= new Segitiga();
			
			System.out.print("Alas           : ");
			a.alas= xx.nextDouble();
			System.out.print("Tinggi         : ");
			a.tinggi= xx.nextDouble();
			
			System.out.print("Panjang sisi 1 : ");
			a.a= xx.nextDouble();
			System.out.print("Panjang sisi 2 : ");
			a.b= xx.nextDouble();
			System.out.print("Panjang sisi 3 : ");
			a.c= xx.nextDouble();
			
			desc(a);
		}else if(input==10) {
			Trapesium a= new Trapesium();
			
			System.out.print("Sisi miring 1 : ");
			a.miring1= xx.nextDouble();
			System.out.print("Sisi datar  1 : ");
			a.datar1= xx.nextDouble();
			System.out.print("Sisi miring 2 : ");
			a.miring2= xx.nextDouble();
			System.out.print("Sisi datar  2 : ");
			a.datar2= xx.nextDouble();
			System.out.print("Tinggi        : ");
			a.tinggi= xx.nextDouble();
			
			desc(a);
		}else System.out.println("Input salah");
		
	}
	
	public static void desc(BangunDatar a) {
		a.luas();
		a.keliling();
	}
	
	public static void desc(BangunRuang a) {
		a.luasPermukaan();
		a.volume();
	}
}
