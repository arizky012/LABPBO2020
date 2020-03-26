import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main3 {
	
	static Scanner xx= new Scanner(System.in);
	static ArrayList <Pokemon> daftarPokemon= new ArrayList<>();;
	static ArrayList <String> namaPokemon= new ArrayList<>();
	static int Int(String a) {return Integer.parseInt(a); }
	
	public static void main(String [] args) throws Exception{
		bacaData();
		mainPage();
	}
	
	static void mainPage() throws Exception{

		while(true){
			System.out.println("\n|<>--<<     POKEMON BATTLE     >>--<>|\n");
			System.out.print("1. Buat Pokemon\n2. Info Pokemon\n3. Fight\n4. Keluar\n\n>> ");
			
			String a= xx.nextLine();
			if(a.equals("1")) makePokemon();
			else if(a.equals("2")) infoPokemon();
			else if(a.equals("3")) {
				selectPokemon();
				lanjut("\nTekan Enter untuk melanjutkan...");
			}
			else if(a.equals("4")) return;
			else System.out.print(">> Input salah\n");
		}
	}
	
	static void makePokemon() throws Exception{
		System.out.println("\n|<>--<<      MAKE  POKEMON     >>--<>|\n");
		System.out.print("Name : ");
		Pokemon pokemon= new Pokemon(xx.nextLine());
		
		System.out.println("Pokemon baru telah lahir...\n\nStat Pokemon : ");
		System.out.print(pokemon.description());
		tulisDataBaru(pokemon);
		
		namaPokemon.add(namaPokemon.size(), pokemon.getName());
		kembaliKeMain();
	}
	
	static void selectPokemon() throws Exception{
		System.out.println("\n|<>--<<     SELECT POKEMON     >>--<>|\n");
		
		for(int i=0; i<namaPokemon.size(); i++) {
			System.out.println((i+1)+". "+namaPokemon.get(i));
		}
		System.out.print("\nSelect player 1 : ");
		int p1= xx.nextInt();
		System.out.println("Player 1 telah dipilih! player 1 = "+namaPokemon.get(p1-1));
		
		System.out.print("\nSelect player 2 : ");
		int p2= xx.nextInt();
		System.out.println("Player 2 telah dipilih! player 2 = "+namaPokemon.get(p2-1)+"\n");
		
		System.out.println("|<>--<< "+namaPokemon.get(p1-1)+"    vs    "+namaPokemon.get(p2-1)+" >>--<>|");
		fight(daftarPokemon.get(p1-1), p1-1, daftarPokemon.get(p2-1), p2-1);
	}
	
	static void infoPokemon() throws Exception{
		System.out.println("\n|<>--<<     SELECT POKEMON     >>--<>|\n");
		for(int i=0; i<namaPokemon.size(); i++) {
			System.out.println((i+1)+". "+namaPokemon.get(i));
		}
		System.out.print(">> ");
		int a= xx.nextInt();
		System.out.println(daftarPokemon.get(a-1).description());
		
		kembaliKeMain();
		
	}
	
	static void tulisData()throws IOException{
		PrintWriter tulis= null;
		
		tulis= new PrintWriter("Daftar Pokemon.txt");
		for(int i=0; i<daftarPokemon.size(); i++){
			tulis.write(daftarPokemon.get(i).getName()+"#"+daftarPokemon.get(i).type+
			"#"+daftarPokemon.get(i).getLevel()+"#"+daftarPokemon.get(i).getMaxHealth()+
			"#"+daftarPokemon.get(i).getDamage()+"#"+daftarPokemon.get(i).getDefence()+
			"#"+daftarPokemon.get(i).getXP()+"\n");
		}
		if(tulis!=null) tulis.close();
	}
	
	static void tulisDataBaru(Pokemon a)throws IOException{
		PrintWriter tulis= null;
		
		daftarPokemon.add(daftarPokemon.size(), a);
		
		tulis= new PrintWriter("Daftar Pokemon.txt");
		for(int i=0; i<daftarPokemon.size(); i++){
			tulis.write(daftarPokemon.get(i).getName()+"#"+daftarPokemon.get(i).type+
			"#"+daftarPokemon.get(i).getLevel()+"#"+daftarPokemon.get(i).getMaxHealth()+
			"#"+daftarPokemon.get(i).getDamage()+"#"+daftarPokemon.get(i).getDefence()+
			"#"+daftarPokemon.get(i).getXP()+"\n");
		}
		tulis.write(a.getName()+"#"+a.type+"#"+a.getLevel()+"#"+a.getMaxHealth()+
				"#"+a.getDamage()+"#"+a.getDefence()+"#"+a.getXP());
		if(tulis!=null) tulis.close();
	}
	
	static void bacaData() throws IOException{
		FileReader sumberFile= null;
		BufferedReader pembacaFile= null;
		
		sumberFile= new FileReader("Daftar Pokemon.txt");
		pembacaFile= new BufferedReader(sumberFile);
		
		String baca;
		ArrayList <String> isi= new ArrayList<>();
		
		while((baca= pembacaFile.readLine())!= null){
			isi.add(baca);
		}
		
		String [][] split= new String[isi.size()][7];
		
		for(int i= 0; i<isi.size(); i++){
			split[i]= isi.get(i).split("#");
			namaPokemon.add(split[i][0]);
			
			daftarPokemon.add(i, new Pokemon(split[i][0],Int(split[i][1]),Int(split[i][2]),Int(split[i][3]),
					Int(split[i][4]),Int(split[i][5]),Int(split[i][6])));
		}
		
		if(pembacaFile!=null) pembacaFile.close();
		if(sumberFile!=null) sumberFile.close();
	}
	
	static void kembaliKeMain() throws Exception{
		lanjut("Tekan Enter untuk melanjutkan...");
		mainPage();
	}
	
	static void fight(Pokemon a, int x, Pokemon b, int y) throws Exception{
		a.setHealth(a.getMaxHealth());
		b.setHealth(b.getMaxHealth());
		System.out.println();
		int i= 1;
		
		while(true){
			if(i==1){
				i=2;
				lanjut("");
				continue;
			}
			
			System.out.println("\n"+a.getName()+" menyerang "+b.getName()+"...");
			a.attack(b);
			if(b.getHealth()<=0) b.setHealth(0);
			System.out.println("Sisa darah "+b.getName()+"= "+b.getHealth()+"\n");
			
			if(b.dead()){
				System.out.println(b.result(a, b));
				daftarPokemon.remove(x);
				daftarPokemon.add(x, a);
				if(a.getXP()>=100){
					a.levelUp();
					a.setXP(a.getXP()%100);
				}
				break;
			}
			
			System.out.println(b.getName()+" menyerang "+a.getName()+"...");
			b.attack(a);
			if(a.getHealth()<=0) a.setHealth(0);
			System.out.println("Sisa darah "+a.getName()+"= "+a.getHealth()+"\n");
			
			if(a.dead()){
				System.out.println(a.result(b, a));
				daftarPokemon.remove(y);
				daftarPokemon.add(y, b);
				if(b.getXP()>=100){
					b.levelUp();
					b.setXP(a.getXP()%100);
				}
				break;
			}
			
			lanjut("Tekan Enter untuk melanjutkan...");
		}
		tulisData();
	}
		
	public static void lanjut(String a){
			System.out.print(a);
			String lanjut= xx.nextLine();
			if(lanjut.equals("") || !lanjut.equals("")) return;
	}

}