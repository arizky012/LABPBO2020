import java.util.ArrayList;

public class Player{
	
	private String name, role, passive, active, passiveEffect, activeEffect;
	private int level, money, exp, STR, INT, VIT, usedItems= -1;
	private double defaultDamage, damage; 
	private double defaultDefense, defense, hpRgn, enRgn;
	private double defaultHp, maxHp, hp;
	private double defaultEnergy, maxEnergy, energy;
	private boolean charging= false, stunned= false, guarding= false;
	
	private ArrayList<Item> items= new ArrayList<>();
	private ArrayList<Item> itemsBought= new ArrayList<>();
	private ArrayList<Item> anotherItems= new ArrayList<>();
	private ArrayList<Monster> monster= new ArrayList<>();
	
	public Player(int r) {
		int a= Main3.random.nextInt(r);
		if(a==0) name= "Pedagang";
		else if(a==1) name= "Penduduk Kota Biasa";
		else if(a==2) name= "Kakek Misterius";
		else if(a==3) name= "Pengembara";
		else if(a==4) name= "Bandit";
		else if(a==5) name= "Petualang";
		else if(a==6) name= "Prajurit Kerajaan";
		else if(a==7) name= "Petarung Jalanan";
		else if(a==8) name= "Prajurit Kerajaan";
		level= 1;
		money= 0;
		STR= 1;
		INT= 1;
		VIT= 1;
		defaultHp= 950+Main3.random.nextInt(100); maxHp= defaultHp; 
		defaultEnergy= 100; maxEnergy= defaultEnergy; 
		defaultDamage= 200; damage= defaultDamage;
		defaultDefense= 10; defense= defaultDefense;
		enRgn= 5;
		hpRgn= 20;
		role= selectWarrior();
		hp= maxHp;
		energy= maxEnergy;
	}
	
	public Player(String a){
		name= a;
		level= 1;
		money= 0;
		STR= 1;
		INT= 1;
		VIT= 1;
		defaultHp= 1000; 
		defaultEnergy= 110; 
		defaultDamage= 200; 
		defaultDefense= 10; 
		enRgn= 5;
		hpRgn= 20;
		role= selectRole();
		maxHp= defaultHp; hp= maxHp;
		maxEnergy= defaultEnergy; energy= maxEnergy;
		damage= defaultDamage;
		defense= defaultDefense;
	}
	
	public String getName() {return name;}
	public String getRole() {return role;}
	public String getActive() {return active;}
	public String getPassive() {return passive;}
	public double getDefense() {return defense;}
	public double getEnergy() {return energy;}
	public double getMaxEnergy() {return maxEnergy;}
	public double getHp() {return hp;}
	public double getMaxHp() {return maxHp;}
	public int getLevel() {return level;}
	public int getMoney() {return money;}
	public int getXp() {return exp;}
	public Item getItemsGift() {return itemsBought.get(itemsBought.size()-1);}
	public Monster getMonster(int a) {return monster.get(a);}
	public boolean getGuarding() {return guarding;}
	
	public void setHp(double a) {hp= a;}
	public void setEnergy(double a) {energy= a;}
	public void setMoney(int a) {money= a;}
	public void setItemsGift(int a) {
		itemsBought.add(items.get(a));
	}
	public void setStunned(boolean a) {stunned= a;}
	public void setGuarding(boolean a) {guarding= a;}
	
	private String selectRole(){
		System.out.println("\n|=======>  SELECT ROLE  <========|========> SKILL PASIF ROLE  <========|");
		System.out.println("| 1. Warrior                     | Skill pasif : Amarah petarung       |");
		System.out.println("| 2. Mage                        | Skill pasif : Kebijaksanaan penyihir|");
		System.out.println("| 3. Archer                      | Skill pasif : Batin altair          |");
		System.out.println("|_4._Tanker______________________|_Skill_pasif_:_Tangisan perang_______|");
		System.out.print(">> ");
		String a= Main3.xx.next();
		if(a.equals("1")) {
			strUp();
			return selectWarrior();
		}
		if(a.equals("2")) {
			intUp();
			return selectMage();
		}
		if(a.equals("3")) {
			strUp();
			return selectArcher();
		}
		if(a.equals("4")) {
			vitUp();
			return selectTanker();
		}
		System.out.println("Input salah");
		return selectRole();
	}

	public String selectWarrior() {
		defaultDamage+=12; damage+= 12;
		maxHp+= 31; defaultHp+= 31;
		defaultDefense+=5; defense+=5;
		passive= "Amarah prajurit";
		active= "Tebasan horizontal";
		return "Warrior";
	}
	
	public String selectMage() {
		passive= "Kebijaksanaan penyihir";
		active= "Jeratan sihir es";
		damage+=10; defaultDamage+=10;
		energy+= 20; defaultEnergy+= 20;
		enRgn+= 5;
		return "Mage";
	}
	
	public String selectArcher() {
		passive= "Batin Altair";
		active= "Hujan panah";
		enRgn+=2;
		hpRgn+= 30;
		damage+=30; defaultDamage+=30;
		maxHp-= 119; defaultHp-= 119;
		return "Archer";
	}

	public String selectTanker() {
		passive= "Tangisan perang";
		active= "Bertahan";
		hpRgn+= 30;
		maxHp+= 252; defaultHp+= 252;
		damage-= 10; defaultDamage-= 10;
		defense++; defaultDefense++;
		return "Tanker";
	}
	
	public void strUp() {
		STR++;
		defaultDamage+= 6; damage+=6;
		defaultHp+= 45; maxHp+=45;
	}
	
	public void intUp() {
		INT++;
		defaultDamage+= 2; damage+=2;
		defaultEnergy+= 10; maxEnergy+=10;
	}
	
	public void vitUp() {
		VIT++;
		defaultHp+= 150; maxHp+=150;
		defaultDefense+= 2; defense+=2;
		defaultEnergy++; maxEnergy++;
		
	}
	
	public void levelUp() {
		level++;
		System.out.println(">> Kamu naik level! level = "+level);
		defaultHp+=102; maxHp+=102;
		defaultDamage+= 5; damage+= 5;
		defaultEnergy+= 2; maxEnergy+= 2;
		defaultDefense++; defense++;
		
		selectStatToUpgrade();
	}
	
	public void selectStatToUpgrade() {
		System.out.print("Pilih stats untuk diupgrade : \n1. Strong\n2. Intelligency\n3. Vitality\n>> ");
		String a= Main3.xx.next();
		if(a.equals("1")) strUp();
		else if(a.equals("2")) intUp(); 
		else if(a.equals("3")) vitUp();
		else {
			System.out.println("Input salah..");
			selectStatToUpgrade();
		}
	}
	
	public void roleInfo() {
		String a= role, skillPasif, skillAktif;
		
		if(a.equals("Warrior")) a+= " ";
		else if(a.equals("Mage")) a+= "    ";
		else a+= "  ";
		
		System.out.println(" _________________________________________________________________________________________________________");
		System.out.println("|           Role           :                                  "+a+"                                    |");
		System.out.println("|_________________________________________________________________________________________________________|");
						   
		if(role.equals("Warrior")) {
			skillPasif= "Kesempatan untuk serangan kritikal 15%                                      |";
			skillAktif= "Menebas, menghasilkan gelombang kejut dan luka yang besar                |";
		}
		else if(role.equals("Mage")) {
			skillPasif= "Meng-stun lawan dengan keberhasilan 10%                              |";
			skillAktif= "Mengeluarkan sihir es yang mengunci pergerakan lawan, akibatkan efek stun  |";
		}
		else if(role.equals("Archer")) {
			skillPasif= "Kesempatan menghindari serangan lawan naik 22%                                 |";
			skillAktif= "Menyerang lawan dua kali                                                        |";
		}
		else {
			skillPasif= "Kesempatan 25% mereduksi 25% luka dari serangan lawan                       |";
			skillAktif= "Berfokus untuk bertahan dan memulihkan diri, menerima 0% luka dari serangan lawan  |";
		}
			
		System.out.println("| Pasif [["+passive+"]] : "+skillPasif);
		System.out.println("|                                                                                                         |");
		System.out.println("| Aktif [["+active+"]] : "+skillAktif);
		
		if(role.equals("Mage")) System.out.println("| Aktif [[Bola Api]] : Menembakkan bola api berskala besar, menimbulkan luka yang besar                   |");
		
		System.out.println("|_________________________________________________________________________________________________________|");
	}
	
	public void showStatus(){
		System.out.printf(" ______________________________");
		System.out.printf("\n||           PROFIL           ||");
		System.out.printf("\n|| Name   : %s",name);
		System.out.printf("\n|| Role   : %s",role);
		System.out.printf("\n|| Level  : %d",level);
		System.out.printf("\n|| Money  : %d gold",money);
		System.out.printf("\n||____________________________||");
		System.out.printf("\n||            STATS           ||");
		System.out.printf("\n|| Strong        : %d", STR);
		System.out.printf("\n|| Intelligency  : %d", INT);
		System.out.printf("\n|| Vitality      : %d", VIT);
		System.out.printf("\n||____________________________||");
		System.out.printf("\n|| HP      : %d/%d",(int)hp,(int)maxHp);
		System.out.printf("\n|| Energy  : %d/%d",(int)energy,(int)maxEnergy);
		System.out.printf("\n|| Damage  : %d",(int)damage);
		System.out.printf("\n|| Defense : %d\n",(int)defense);
		System.out.println("|| Exp     : "+exp+" %");
		System.out.printf("||____________________________||\n");
	}
	
	public void showItemsBought(){
		System.out.println("     ____________________	");
		System.out.println("    /        TAS         \\	");
		System.out.println(" __|========[___]=========|__");
		System.out.println(" //|                      |\\\\");
		if(itemsBought.size()==0) {
			System.out.println("|| |                      | ||");
			System.out.println("|| |                      | ||");
			System.out.println("|| |      --Kosong--      | || ");
			System.out.println("|| |                      | || ");
			System.out.println("|| |                      | ||");
		}
		else {
			for(int i=0; i<itemsBought.size(); i++) {
				String a= itemsBought.get(i).getName()+"\t";
				System.out.println("|| |"+(i+1)+". "+a+"  | ||");
			}
		}
		System.out.println("|| |______________________| ||");
		System.out.println("\\\\_\\                      /_//");
		System.out.println("    \\____________________/	 ");
	}
	
	public void showItems(){
		System.out.println("   ___________________________	");
		System.out.println("  /   / TOKO PERLENGKAPAN \\   \\	");
		System.out.println("  ====\\___________________/====");
		System.out.println("  ||                         ||");
		for(int i=0; i<items.size(); i++) {
			String a= items.get(i).getName()+"\t";
			System.out.println("  ||"+(i+1)+". "+a+"     ||");
		}
		System.out.println("  ||_________________________||");
		System.out.print(" Pilih perlengkapan untuk dibeli (input (b) untuk kembali)\n>> ");
		String a= Main3.xx.next();
		if(a.equals("b")) {
			System.out.println(">> Kembali ke rumah..");
			return;
		}
		try {
		if(Integer.parseInt(a)-1<items.size()) {
			int b= Integer.parseInt(a);
			if(buy(items.get(b-1))) {
				System.out.println(">> Kamu membeli "+items.get(b-1).getName());
				money-= items.get(b-1).getPrice();
				itemsBought.add(items.get(b-1));
			}
			else System.out.println(">> Kamu kekurangan uang.. kamu tidak bisa membeli "+items.get(b-1).getName());
		}
		}catch(Exception e) {
			System.out.println("Input salah");
			showItems();
		}
		
	}
	
	public void showPotions(){
		System.out.println("( Info : Ramuan meningkatkan statmu secara instan dan permanen.. )");
		System.out.println("  _/\\________________________________________/\\_");
		System.out.println(" \\            /    TOKO ALKEMIS   \\             /");
		System.out.println("  ------------\\___________________/-------------");
		System.out.println("  ||                                           ||");
		System.out.println("  || 1. Minuman jahe (+18 hp) -100             ||");
		System.out.println("  || 2. Ramuan energy (+2 energy) -150         ||");
		System.out.println("  || 3. Jamu keluarga Apollon (+10 damage) -430||");
		System.out.println("  || 4. Teh daun Rosegard (+3 defense) -180    ||");
		System.out.println("  || 5. Madu lebah merah (+4 damage) -175      ||");
		System.out.println("  || 6. Keringat elf (+6 energy) -440          ||");
		System.out.println("  || 7. Darah Naga (+200 hp) -1000             ||");
		System.out.println("  ||___________________________________________||");
		System.out.print(" Pilih ramuan untuk dibeli (input (b) untuk kembali)\n>> ");
		
		String a= Main3.xx.next();
		if(a.equals("b")) {
			System.out.println(">> Kembali ke rumah..");
			return;
		}
		while(true) {
			try {
				int b= Integer.parseInt(a);
				if(b==1 && money>= 100) {
					System.out.println(">>Kamu membeli Minuman jahe!");
					maxHp+=18; defaultHp+= 18;
					money-= 150;
					break;
				}else if(b==2 && money>= 150) {
					System.out.println(">>Kamu membeli Ramuan energy!");
					maxEnergy+=2; defaultEnergy+=2;
					money-= 100;
					break;
				}else if(b==3 && money>= 430) {
					System.out.println(">>Kamu membeli Jamu keluarga Apollon!");
					damage+=10; defaultDamage+=10;
					money-= 430;
					break;
				}else if(b==4 && money>= 180) {
					System.out.println(">>Kamu membeli Teh daun Rosegard!");
					defense+=3;defaultDefense+=3;
					money-= 180;
					break;
				}else if(b==5 && money>= 175) {
					System.out.println(">>Kamu membeli Madu lebah merah!");
					damage+=4; defaultDamage+=4;
					money-= 175;
					break;
				}else if(b==6 && money>= 440) {
					System.out.println(">>Kamu membeli Keringat elf!");
					maxEnergy+=6; defaultEnergy+=6;
					money-= 440;
					break;
				}else if(b==7 && money>= 1000) {
					System.out.println(">>Kamu membeli Darah Naga!");
					maxHp+=200; defaultHp+=200;
					money-= 1000;
					break;
				}
				
				
			}catch(Exception e) {
				System.out.println("Input salah");
				showPotions();
			}
		}
	}
		
	public void fightMonsters(Monster monster, int indeks, Player p1) {
		if(Main3.random.nextInt(2)==1) System.out.println(" kamu bertemu dengan "+monster.getName()+"! ");
		else System.out.println(" tiba-tiba kamu disergap oleh "+monster.getName()+"! ");
		
		System.out.println("\n|====> APA YANG AKAN KAMU LAKUKAN ? <===|");
		System.out.println("| 1. Bertarung                          |");
		System.out.print("|_2._Lari_______________________________|\n>> ");
		
		String a= Main3.xx.next();
		if(!a.equals("1")) {
			if(Main3.random.nextInt(4)<3) {
				System.out.println(">> Kamu berhasil kabur...");
				return;
			}else System.out.println(">> "+monster.getName()+" semakin dekat ke arah kamu! kamu tidak bisa lari dari pertarungan!!");
		}
		
		System.out.println(">>>>>>>>         BERTARUNG!         <<<<<<<<");
		while(true) {
			System.out.println("\n|========>  GILIRANMU! PILIH OPSI  <=======|");
			System.out.println("| 1. Serang lawan                          |  __________________________");
			System.out.println("| 2. Gunakan skill                         | |          Status          |");
			System.out.println("| 3. Charge                                | | HP      =  "+(int)hp+"/"+(int)maxHp+"\t|");
			System.out.println("| 4. Healing                               | | Energy  =  "+(int)energy+"/"+(int)maxEnergy+"\t|");
			System.out.println("| 5. Skip                                  | |__________________________|");
			System.out.println("|_6._Run___________________________________|");
			System.out.print(">> ");
			a= Main3.xx.next();
			if(a.equals("1")) {
				System.out.print(">> ");
				attack(monster);
			}
			else if(a.equals("2")) {
				System.out.print(">> ");
				useSkill(monster);
			}
			else if(a.equals("3")) {
				System.out.print(">> ");
				charge();
			}
			else if(a.equals("4")) {
				System.out.print(">> ");
				healing();
			}
			else if(a.equals("5")) {
				System.out.println(">> Kamu melewati turn ini..");
			}
			else if(a.equals("6")) {
				if(hp<hp/5 && Main3.random.nextInt(10)<8) System.out.println(">> Kamu ingin melarikan diri, namun dicegat oleh lawan..");
				else{
					System.out.println(">> Kamu melarikan diri..");
					break;
				}
			}else {
				System.out.println(">> Kamu melewati turn ini..");
			}
			
			regen();
			
			if(monster.dead()) {
				System.out.print(">> Mengalahkan "+monster.getName());
				win(monster, indeks);
				break;
			}
			
			System.out.println();
			monster.attack(p1);
			
			if(dead()) {
				System.out.print(">> Kamu dikalahkan "+monster.getName()+", ");
				loseToMonsters();
				break;
			}
		}

		}
			
	public void attack(Player b){
		if(b.getGuarding()) {
			System.out.println(name+" menyerang, ditangkis dengan skill [[Bertahan]]");
			b.setGuarding(false);
			return;
		}
		
		if(stunned) {
			System.out.println(name+" tidak bisa bergerak karena efek stun..");
			stunned= false;
			return;
		}
		
		if(energy<10) {
			System.out.println("Kekurangan energy, tidak bisa attack..");
			healing();
			return;
		}
		energy-= 10;
		
		int a= Main3.random.nextInt(101);
		
		if(b.getRole().equals("Archer")) {
			if(Main3.random.nextInt(101)<=22) {
				System.out.print("Skil pasif "+b.getName()+", [["+b.getPassive()+"]] aktif! \n>> ");
				a= 1;
			}
		}
		
		if(a<=5) {
			System.out.println(b.getName()+" berhasil menghindari serangan "+name+"!");
			charging= false;
			return;
		}
		
		int additionalAtt= 0;
		if(Main3.random.nextInt(100)<=15) additionalAtt= 20;
		double attacked= (double)(damage+Main3.random.nextInt(10)+additionalAtt-b.getDefense()); 
		
		if(role.equals("Warrior")) {
			if(Main3.random.nextInt(101)<=15) {
				System.out.print("Skil pasif "+name+", [[Amarah prajurit]] aktif! damage bertambah\n>> ");
				attacked+= damage;
			}
		}
		else if(role.equals("Mage")) {
			if(Main3.random.nextInt(101)<=10) {
				System.out.print("Skil pasif "+name+", [["+passive+"]] aktif! lawan ter-stun selama 1 turn\n>> ");
				b.setStunned(true);
			}
		}
		
		if(b.getRole().equals("Tanker")) {
			if(Main3.random.nextInt(101)<=25) {
				System.out.print("Skil pasif "+b.getName()+", [["+b.getPassive()+"]] aktif! \n>> ");
				double reduct= attacked*(0.25);
				attacked-= (int)reduct;
			}
		}
		
		if(charging) {
			attacked+= (damage+15+Main3.random.nextInt(15));
			charging= false;
		}
		b.setHp(b.getHp()-attacked);
		
		System.out.print(name);
		
		if(role.equals("Warrior")) System.out.print(" menyerang, ");
		else if(role.equals("Mage")) System.out.print(" menembakkan bola sihir, ");
		else if(role.equals("Archer")) System.out.print(" memanah, ");
		else if(role.equals("Tanker")) System.out.print(" menyerang, ");
		
		if(b.getHp()<=0) b.setHp(0);
		System.out.println("menghasilkan "+(int)attacked+" damage, sisa darah "+b.getName()+" = "+(int)b.getHp());
	}

	public void attack(Monster b){
		if(energy<10) {
			System.out.println("Kekurangan energy, tidak bisa attack..");
			healing();
			return;
		}
		energy-= 10;
		
		int a= Main3.random.nextInt(101);
		
		if(a<=b.getDodgeRate()) {
			System.out.println(b.getName()+" berhasil menghindari serangan "+name+"!");
			charging= false;
			return;
		}
		
		int additionalAtt= 0;
		if(Main3.random.nextInt(100)<=15) additionalAtt= 20;
		double attacked= (double)(damage+Main3.random.nextInt(10)+additionalAtt); 
		
		if(role.equals("Warrior")) {
			if(Main3.random.nextInt(101)<=15) {
				System.out.print("Skil pasif "+name+", [[Amarah prajurit]] aktif! damage bertambah\n>> ");
				attacked+= damage;
			}
		}
		else if(role.equals("Mage")) {
			if(Main3.random.nextInt(101)<=10) {
				System.out.print("Skil pasif "+name+", [["+passive+"]] aktif! lawan ter-stun selama 1 turn\n>> ");
				b.setStunned(true);
			}
		}
		
		if(charging) {
			attacked+= (damage+15+Main3.random.nextInt(15));
			charging= false;
		}
		b.setHp((int)b.getHp()-(int)attacked);
		
		System.out.print(name);
		
		if(role.equals("Warrior")) System.out.print(" menyerang, ");
		else if(role.equals("Mage")) System.out.print(" menembakkan bola sihir, ");
		else if(role.equals("Archer")) System.out.print(" memanah, ");
		else if(role.equals("Tanker")) System.out.print(" menyerang, ");
		
		if(b.getHp()<=0) b.setHp(0);
		System.out.println("menghasilkan "+(int)attacked+" damage, sisa darah "+b.getName()+" = "+(int)b.getHp());
	}
	
	public void useSkill(Player b) {
		int attacked= 1+Main3.random.nextInt(8);
		if(role.equals("Warrior")) {
			if(energy<30) {
				System.out.println("Kekurangan energy, tidak bisa memakai skill..");
				healing();
				return;
			}
			if(charging) {
				attacked+= (damage-10);
				charging= false;
			}
			attacked+= damage+100;
			energy-=30;
			b.setHp(b.getHp()-attacked);
			if(b.getHp()<=0) b.setHp(0);
			System.out.println("Menggunakan skill [["+active+"]], menghasilkan "+attacked+" damage, sisa darah "+b.getName()+" = "+(int)b.getHp());
		}
		else if(role.equals("Archer")) {
			if(energy<40) {
				System.out.println("Kekurangan energy, tidak bisa memakai skill..");
				healing();
				return;
			}
			energy-=40;
			System.out.println("Menggunakan skill [["+active+"]], "+name+" menyerang dua kali!");
			System.out.print(">> ");
			attack(b);
			System.out.print(">> ");
			attack(b);
			System.out.println();
		}
		else if(role.equals("Mage")) {
			if(energy<30) {
				System.out.println("Kekurangan energy, tidak bisa memakai skill..");
				healing();
				return;
			}
			
			if(Main3.random.nextInt(3)<=2 && energy>=70) {
				attacked+= 160;
				b.setStunned(true);
				energy-=70;
				b.setHp(b.getHp()-attacked);
				System.out.print("Menggunakan skill [["+active+"]], menghasilkan "+attacked+" damage dan efek stun");
			}else {
				attacked+= (damage+150);
				energy-=30;
				b.setHp(b.getHp()-attacked);
				System.out.print("Menggunakan skill [[Bola api]], menghasilkan "+attacked+" damage");
			}
			if(b.getHp()<=0) b.setHp(0);
			System.out.println(", sisa darah "+b.getName()+" = "+(int)b.getHp());
		}
		else {
			int heal= 190+Main3.random.nextInt(20);
			
			if(hp+heal>= maxHp) hp= maxHp;
			else hp+= heal;
			
			if(energy+10>= maxEnergy) energy= maxEnergy;
			else energy+=10;
			
			System.out.println("Menggunakan skill [["+active+"]], fokus untuk bertahan dan memulihkan diri..\n>> HP pulih "+heal+" poin");
			guarding= true;
		}
	}
	
	public void useSkill(Monster b) {
		int attacked= 1+Main3.random.nextInt(8);
		if(role.equals("Warrior")) {
			if(energy<30) {
				System.out.println("Kekurangan energy, tidak bisa memakai skill..");
				healing();
				return;
			}
			if(charging) {
				attacked+= (damage-10);
				charging= false;
			}
			attacked+= damage+100;
			energy-=30;
			b.setHp(b.getHp()-attacked);
			if(b.getHp()<=0) b.setHp(0);
			System.out.println("Menggunakan skill [["+active+"]], menghasilkan "+attacked+" damage, sisa darah "+b.getName()+" = "+(int)b.getHp());
		}
		else if(role.equals("Archer")) {
			if(energy<40) {
				System.out.println("Kekurangan energy, tidak bisa memakai skill..");
				healing();
				return;
			}
			energy-=40;
			System.out.println("Menggunakan skill [["+active+"]], "+name+" menyerang dua kali!");
			System.out.print(">> ");
			attack(b);
			System.out.print(">> ");
			attack(b);
			System.out.println();
		}
		else if(role.equals("Mage")) {
			if(energy<30) {
				System.out.println("Kekurangan energy, tidak bisa memakai skill..");
				healing();
				return;
			}
			
			if(Main3.random.nextInt(3)<=2 && energy>=70) {
				attacked+= 160;
				b.setStunned(true);
				energy-=70;
				b.setHp(b.getHp()-attacked);
				System.out.print("Menggunakan skill [["+active+"]], menghasilkan "+attacked+" damage dan efek stun");
			}else {
				attacked+= (damage+150);
				energy-=30;
				b.setHp(b.getHp()-attacked);
				System.out.print("Menggunakan skill [[Bola api]], menghasilkan "+attacked+" damage");
			}
			if(b.getHp()<=0) b.setHp(0);
			System.out.println(", sisa darah "+b.getName()+" = "+(int)b.getHp());
		}
		else {
			int heal= 190+Main3.random.nextInt(20);
			
			if(hp+heal>= maxHp) hp= maxHp;
			else hp+= heal;
			
			if(energy+10>= maxEnergy) energy= maxEnergy;
			else energy+=10;
			
			System.out.println("Menggunakan skill [["+active+"]], fokus untuk bertahan dan memulihkan diri..\n>> HP pulih "+heal+" poin");
			guarding= true;
		}
	}
	
	public void charge() {
		if(energy<8) {
			System.out.println("Kekurangan energy, tidak bisa charge..");
			healing();
		}else {
		energy-=8;
		charging= true;
		System.out.println("Menyimpan serangan untuk turn selanjutnya..");
		}
	}
	
	public String getDamage(Player b){
		return damage+"";
	}
	
	public void healing(){
		int a= Main3.random.nextInt(10);
		if(hp+150+a>= maxHp) hp= maxHp;
		else hp+=(a+150);
		
		if(energy+20>= maxEnergy) energy= maxEnergy;
		else energy+=20;
		
		System.out.println(name+" memulihkan diri.. sisa darah = "+(int)hp+", sisa energy = "+(int)energy);
	}
	
	public void regen() {
		if(hp+hpRgn>=maxHp)hp= maxHp;
		else hp+= hpRgn;
		
		if(energy+enRgn>=maxEnergy)energy= maxEnergy;
		else energy+= enRgn;
	}
	
	public void rest() {
		System.out.println(">> Memutuskan untuk beristirahat sejenak di bawah pohon..\nMemulihkan beberapa poin darah dan energy");
		int a= Main3.random.nextInt(10);
		if(hp+250+a>= maxHp) hp= maxHp;
		else hp+=(a+250);
		
		if(energy+20>= maxEnergy) energy= maxEnergy;
		else energy+=20;
	}
	
	public void talk() {
		if(energy<10) {
			System.out.println(">> Kamu terlalu kelelahan, tidak bisa berkeliling kota dulu..");
			return;
		}
		
		energy-= 10;
		
		int a= Main3.random.nextInt(20);
		if(a<=4) System.out.println(">> Kamu berkeliling kota, berjalan santai dan menghirup udara segar..");
		else if(a<=8) {
			System.out.println(">> Menyapa beberapa penduduk kota, membuat perasaanmu senang dan menambah poin energy");
			if(energy+15 >= maxEnergy) energy= maxEnergy;
			else energy+=15;
		}
		else if(a<=12 && money>8) {
			int goldRobbed= Main3.random.nextInt(8)+1;
			System.out.println(">> Kamu berjalan di pusat kota dan melewati gang kecil..");
			System.out.println(">> Setelah keluar kamu memeriksa kantong dan goldmu hilang "+goldRobbed+", goldmu telah dicuri");
			money-=goldRobbed;
		}
		else if(a<=16) {
			int goldAdded= Main3.random.nextInt(20)+1;
			System.out.println(">> Kamu berjalan di pusat kota.. dan tiba tiba menemukan "+goldAdded+" gold dijalan");
			money+=goldAdded;
		}
		else if(a<20) {
			Player people= new Player(4);
			
			int randomItem= Main3.random.nextInt(6);
			String barangName, info;
			int price;
			
			if(randomItem==5) {
				barangName= items.get(2).getName();
				price= items.get(2).getPrice()-10;
				info= items.get(2).getInfo();
			}
			else if(randomItem==4) {
				barangName= items.get(4).getName();
				price= items.get(4).getPrice()-45;
				info= items.get(4).getInfo();
			}
			else{
				barangName= anotherItems.get(randomItem).getName();
				price= anotherItems.get(randomItem).getPrice();
				info= anotherItems.get(randomItem).getInfo();
			}
			
			System.out.println(">> Kamu sedang berjalan, lalu "+people.getName()+" menghampirimu..");
			System.out.println(">> Dia menawarkan "+barangName+" padamu seharga "+price+" gold");
			System.out.println(">> Maukah kau membelinya?");
			System.out.print("(b)Buy item(i)Info item (N)No\n>> ");
			
			
			while(true) {
				String input= Main3.xx.next();
				System.out.println();
				
				if(input.equalsIgnoreCase("b")) {
					if(money<price) System.out.println(">> Kamu ingin membelinya namun kamu kekurangan uang, ia pun pergi..");
					else {
						System.out.println(">> Kamu membeli "+barangName+"! "+people.getName()+" berterima kasih padamu");
						money-=price;
						
						if(randomItem==5) {
							itemsBought.add(items.get(5));
						}else if(randomItem==4) {
							itemsBought.add(items.get(2));
						}else {
							itemsBought.add(anotherItems.get(randomItem));
						}
						
						money-= price;
					}
					break;
				}
				else if(input.equalsIgnoreCase("i")) {
					if(randomItem==3) System.out.println(people.getName()+" mengatakan bahwa, "+anotherItems.get(3).getInfo());
					else System.out.println(people.getName()+" mengatakan bahwa, barang ini adalah "+info);
				}
				else{
					System.out.println(">> Kamu menolak, si "+people.getName()+" pun meninggalkanmu..");
					break;
				}
				System.out.println(">> Maukah kau membelinya?");
				System.out.print("(b)Buy item(i)Info item (N)No\n>> ");
			}
		}
	}
	
	public boolean buy(Item a){
		if(money>= a.getPrice()) {
			return true;
		}
		return false;
	}
	
	public void sleep() {
		System.out.println(">> Kamu tertidur.. energy dan hp terisi kembali");
		energy= maxEnergy;
		hp= maxHp;
	}
	
	public void checkInventory() {
		System.out.println(">> Isi tas ");
		showItemsBought();
		System.out.print("(e)Equip/Unequip (s)Sell items (d)Destroy items (i)Info items (b)Back\n>> ");
		String a= Main3.xx.next();
		if(a.equalsIgnoreCase("e")) equipItems();
		else if(a.equalsIgnoreCase("s")) sellItems();
		else if(a.equalsIgnoreCase("d")) destroyItems();
		else if(a.equalsIgnoreCase("i")) infoItems();
		else if(a.equalsIgnoreCase("b")) return;
		else {
			System.out.println("Input salah");
			checkInventory();
		}
	}
	
	public void equipItems() {
		System.out.println("Pilih perlengkapan untuk dipakai");
		showItemsBought();
		
		if(usedItems!=-1) System.out.print("(u) Unequip ");
		
		System.out.print("(b)Back\n>> ");
		String a= Main3.xx.next();
		
		if(a.equalsIgnoreCase("b")) return;
		else if(itemsBought.size()==0) {
			System.out.println(">> Kamu tidak memiliki perlengkapan, tidak bisa memakai apapun..");
			return;
		}
		
		if(usedItems!=-1 && a.equalsIgnoreCase("u")) {
			System.out.println(">> Melepaskan "+itemsBought.get(usedItems).getName()+"..");
			usedItems= -1;
			maxHp= defaultHp; 
			if(hp>=maxHp) hp= maxHp;
			
			maxEnergy= defaultEnergy;
			if(energy>=maxEnergy) energy= maxEnergy;
			
			damage= defaultDamage;
			defense= defaultDefense;
			return;
		}
		try {
			int b= Integer.parseInt(a)-1;
		
			if(b<itemsBought.size()) {
				Item itemUsed= itemsBought.get(b);
				itemUsed.use();
				usedItems= b;
				maxHp= defaultHp+itemUsed.getHpPlus();
				maxEnergy= defaultEnergy+itemUsed.getEnergyPlus();
				if(energy>= maxEnergy) energy= maxEnergy;
				damage= defaultDamage+itemUsed.getDamagePlus();
				defense= defaultDefense+itemUsed.getDefensePlus();
			}else {
				System.out.println("Input salah");
				equipItems();
			}
		}catch(Exception e) {
			System.out.println("Input salah");
			equipItems();
		}
		
	}
	
	public void sellItems() {
		System.out.println("Pilih perlengkapan untuk dijual");
		showItemsBought();
		System.out.print("(b)Back\n>> ");
		String a= Main3.xx.next();
		
		try {
			int b= Integer.parseInt(a)-1;
			
			if(b==usedItems) {
				System.out.println(">> Tidak bisa dijual, sedang dipakai");
				return;
			}
			
			if(b<itemsBought.size()) {
				Item itemUsed= itemsBought.get(b);
				money+=itemUsed.getPrice();
				itemUsed.sell();
				System.out.println(", mendapat "+itemUsed.getPrice()+" gold, uang = "+money);
				itemsBought.remove(b);
			}else {
				System.out.print("Input salah");
				sellItems();
			}
		}catch(Exception e) {
			System.out.println("Input salah");
			sellItems();
		}
	}
	
	public void destroyItems() {
		System.out.println("Pilih perlengkapan untuk dihancurkan");
		showItemsBought();
		System.out.print("(b)Back\n>> ");
		String a= Main3.xx.next();
		
		
		if(a.equalsIgnoreCase("b")) return;
		try {
			int b= Integer.parseInt(a)-1;
			
			if(b==usedItems) {
				System.out.println(">> Tidak bisa dihancurkan, sedang dipakai");
				return;
			}
			
			if(b<itemsBought.size()) {
				Item itemUsed= itemsBought.get(b);
				itemUsed.destroy();
				itemsBought.remove(b);
			}else {
				System.out.println("Input salah");
				destroyItems();
			}
		}catch(Exception e) {
			System.out.println("Input salah");
			destroyItems();
		}
	}

	public void infoItems() {
		System.out.println("Pilih info perlengkapan");
		showItemsBought();
		System.out.print(">> ");
		String a= Main3.xx.next();
		
		if(a.equalsIgnoreCase("b")) return;
		try {
		
			int b= Integer.parseInt(a)-1;
			if(b<itemsBought.size()) {
				System.out.println(itemsBought.get(b).getInfo());
			}else {
				System.out.println("Input salah");
				infoItems();
			}
		}catch(Exception e) {
			System.out.println("Input salah");
			infoItems();
		}
		
	}
	
	public boolean dead() {
		if(hp<=0) return true;
		return false;
	}
	
	public void win(Player enemy) {
		int expBertambah= 20+Main3.random.nextInt(7);
		if (level<= enemy.getLevel()+2) expBertambah+= (enemy.getLevel()+3-level)*2;
		
		int gold= 8+Main3.random.nextInt(45);
		money+=gold;
		System.out.println("Exp bertambah "+expBertambah+" %, mendapat "+gold+" gold dari kantong lawan...\n");
		exp+= expBertambah;
		if(exp>=100) {
			levelUp();
			exp%= 100;
		}
	}
	
	public void win(Monster enemy, int indeks) {
		int expBertambah= 20+Main3.random.nextInt(7)+((1+indeks)*2);
		
		int gold= 20+Main3.random.nextInt(20)+((1+indeks)*4);
		money+=gold;
		System.out.println(", Exp bertambah "+expBertambah+" %, mendapatkan "+gold+" gold dari monster\n");
		exp+= expBertambah;
		if(exp>=100) {
			levelUp();
			exp%= 100;
		}
		enemy.setHp(enemy.getMaxHp());
	}
	
	public void lose() {
		int gold= 5+Main3.random.nextInt(5);
		hp=maxHp;
		
		if(money==0) {
			System.out.println("ia ingin mencuri goldmu, tetapi kamu tak mempunyai sepeserpun.. kamu terlalu miskin untuk dicuri\n");
			return;
		}else if(money<gold) gold= money;
		System.out.println("uangmu berkurang "+gold+" gold");
		money-=gold;
		System.out.println(">> Kamu pingsan dan tergeletak di jalanan..");
	}
	
	public void loseToMonsters() {
		int gold= 10+Main3.random.nextInt(30);
		hp=maxHp;
		
		if(money==0) {
			System.out.println("monster ingin mencuri goldmu, tetapi kamu tak mempunyai sepeserpun.. kamu terlalu miskin untuk dicuri\n");
			return;
		}else if(money<gold) gold= money;
		System.out.println("uangmu berkurang "+gold+" gold");
		money-=gold;
		System.out.println(">> Kamu pingsan dan tergeletak di hutan luar kota");
		System.out.println(">> Seseorang melihatmu dan membawamu pulang ke kota..");
	}
	
	public void train() {
		int a= Main3.random.nextInt(12);
		
		int enUsed= 15+Main3.random.nextInt(7);
		if(energy<enUsed) {
			System.out.println(">> Kamu terlalu lelah.. tidak bisa latihan saat ini");
			return;
		}
		energy-= enUsed;
		
		System.out.print(">> ");
		if(a==0 || a==8) {
			System.out.println("Berlatih... stat damage bertambah 1 point");
			damage+=1; defaultDamage+=1;
		}else if(a==1 || a==6) {
			System.out.println("Berlatih... stat HP bertambah 6 point");
			maxHp+=6; defaultHp+=6;
		}else if(a==2) {
			System.out.println("Berlatih... stat energy bertambah 1 point");
			maxEnergy++; defaultEnergy++;
		}else if(a==3) {
			System.out.println("Berlatih... stat defense bertambah 1 point");
			defense++; defaultDefense++;
		}else if(a==4) {
			System.out.println("Berlatih... stat HP bertambah 15 point!");
			defense++; defaultDefense++;
		}else {
			System.out.println("Kamu berlatih keras, tapi tidak menghasilkan apapun...");
		}
		
		System.out.println(">> Energy berkurang "+enUsed+" point");
	}
	
	public void setItems() {
		
		Item a= new Item();
		a.setName("Baju Pengelana");
		a.setPrice(100);
		a.setInfo("Baju untuk para pemula, tidak ada yang spesial...");
		a.setDamagePlus(12);
		a.setHpPlus(300);
		items.add(a);
		
		Item j= new Item();
		j.setName("Baju Berkarat");
		j.setPrice(100);
		j.setInfo("Kelihatannya berkarat.. namun masih bisa dipakai");
		j.setDamagePlus(15);
		j.setDefensePlus(1);
		j.setHpPlus(150);
		items.add(j);
		
		Item b= new Item();
		b.setName("Armor Besi");
		b.setPrice(200);
		b.setInfo("Pelindung berbahan besi, cocok untuk petarung namun sedikit berat");
		b.setEnergyPlus(-9);
		b.setHpPlus(850);
		b.setDefensePlus(5);
		items.add(b);
		
		Item c= new Item();
		
		c.setName("Jubah Sihir");
		c.setPrice(450);
		c.setInfo("Jubah yang cocok untuk mage, menambah kekuatan sihir..");
		c.setDamagePlus(10);
		c.setEnergyPlus(20);
		c.setHpPlus(250);
		items.add(c);
		
		Item d= new Item();
		d.setName("Seragam Petarung");
		d.setPrice(550);
		d.setInfo("Seragam tentara kerajaan, ditempa langsung oleh penempa besi kerajaan, Balfis..");
		d.setDamagePlus(20);
		d.setHpPlus(500);
		d.setDefensePlus(4);
		items.add(d);
		
		Item e= new Item();
		e.setName("Sayap Naga");
		e.setPrice(1000);
		e.setInfo("Sayap dari naga Gargamel.. kuat dan tak mudah hancur");
		e.setDamagePlus(25);
		e.setEnergyPlus(5);
		e.setDefensePlus(8);
		e.setHpPlus(1000);
		items.add(e);
		
		Item f= new Item();
		f.setName("Armor emas");
		f.setPrice(950);
		f.setInfo("Emas murni yang ditempa menjadi armor tak terkalahkan");
		f.setEnergyPlus(5);
		f.setDefensePlus(10);
		f.setHpPlus(1000);
		anotherItems.add(f);
		
		Item g= new Item();
		g.setName("Jubah api ");
		g.setPrice(650);
		g.setInfo("Jubah sihir yang diberi api abadi amaterasu.. menambah damage dengan jumlah yang besar");
		g.setDamagePlus(40);
		g.setEnergyPlus(5);
		g.setHpPlus(-250);
		anotherItems.add(f);
		
		Item h= new Item();
		h.setName("Armor Samurai");
		h.setPrice(600);
		h.setInfo("Seragam kebanggaan para samurai..");
		h.setDamagePlus(30);
		h.setDefensePlus(5);
		h.setHpPlus(350);
		anotherItems.add(f);
		
		Item i= new Item();
		i.setName("Jaket kulit");
		i.setPrice(150);
		i.setInfo("Jika memakainya kamu terlihat keren, namun tidak ada efek apa-apa");
		anotherItems.add(f);
	}
	
	public void setMonsters() {
		monster.add(new Monster("Goblin", 650, 78, 5));
		monster.add(new Monster("Slime", 410, 90, 12));
		monster.add(new Monster("Monster Bat", 350, 51, 30));
		monster.add(new Monster("Skeleton", 730, 100, 10));
		monster.add(new Monster("Orc", 1000, 105, 5));
		monster.add(new Monster("High Orc", 1150, 120, 10));
		monster.add(new Monster("Golem", 1750, 80, 4));
		monster.add(new Monster("Dragon Igneal", 5200, 200, 6));
	}
}