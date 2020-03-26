import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

class Pokemon{
	
	private String name;
	int type;
	private int maxHealth;
	private int defence;
	private int damage;
	private int xp;
	private int level;
	private int health;
	
	String setType() {
		System.out.println("\nPilih Elemen : ");
		System.out.println("1. Air		3. Api ");
		System.out.print("2. Tanah	4. Petir\n>> ");

		String a= Main3.xx.nextLine();
		type= Integer.parseInt(a);
		return setTypeNext(a);
	}
	
	public Pokemon(String a){
		name= a;
		level= 1;
		xp= 0;
		setType();
		Random random= new Random();
		maxHealth= 100+random.nextInt(10);
		damage= 35+random.nextInt(5);
		defence= 5+random.nextInt(3);
		health= maxHealth;
	}
	
	public Pokemon(String name, int type, int level, int maxHealth, int damage, int defence, int xp) {
		this.name= name;
		this.type= type;
		this.level= level;
		this.maxHealth= maxHealth;
		this.damage= damage;
		this.defence= defence;
		this.xp= xp;
	}
	
	public String getName() {return name;}
	public int getLevel() {return level;}
	public int getType() {return type;}
	public int getMaxHealth() {return maxHealth;}
	public int getHealth() {return health;}
	public int getDamage() {return damage;}
	public int getDefence() {return defence;}
	public int getXP() {return xp;}

	public void setHealth(int a){health= a;}
	public void setXP(int a){xp= a;}
	
	
	public String setTypeNext(String a) {
		if(a.equals("1")) return "Air";
		if(a.equals("2")) return "Tanah";
		if(a.equals("3")) return "Api";
		if(a.equals("4")) return "Petir";
		else {
			System.out.println("Input salah..");
			return setType();
		}
	}
	
	public void attack(Pokemon b){
		Random random = new Random();
		int additional= random.nextInt(5);
		boolean crit= false;
		
		if(type==1 && b.getType()==3 || type==3 && b.getType()==2 || type==2 && b.getType()==4 || type==4 && b.getType()==1) crit= true;
		
		if(random.nextInt(101)<=15 || crit==true){
			additional+= 15;
			System.out.print("Critical damage! ");
		}
		
		int damage= (this.damage+additional)-b.getDefence();
		b.setHealth(b.getHealth()-damage);
		System.out.println(b.getName()+" terkena "+damage+" damage");
		
	}
	
	public boolean dead(){
		if(health<=0) return true;
		return false;
	}
	
	public String result(Pokemon a, Pokemon b){
		int xpLama= a.getXP();
		
		Random random= new Random();
		a.setXP(a.getXP()+random.nextInt(20)+40);
		return (a.getName()+" Menang dari "+b.getName()+"\nEXP "+a.getName()+" bertambah "+(a.getXP()-xpLama)+" %");
	}
	
	public void levelUp(){
		System.out.println("\n"+name+" telah naik Level! Level "+name+" = "+(level+1));
		maxHealth+=10;
		damage+=4;
		defence+=2;
		
		System.out.print("Pilih stat untuk ditingkatkan : \n1. Health Point\n2. Attack Point\n3. Defence Point\n>> ");
		String a= Main3.xx.next();
		
		if(a.equals("1")) maxHealth+= 20;
		if(a.equals("2")) damage+= 8;
		if(a.equals("3")) defence+= 4;
		System.out.println();
		
		level++;
		description();
	}
	
	public String description() {
		return  "\nName	: "+name+
				"\nType	: "+setTypeNext(type+"")+
				"\nLevel	: "+level+
				"\nHealth	: "+maxHealth+
				"\nDamage	: "+damage+
				"\nDefence	: "+defence+
				"\nXp	: "+xp+" %\n\n";
	}
	
}
