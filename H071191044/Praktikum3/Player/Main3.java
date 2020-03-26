import java.util.Scanner;
import java.util.Random;

class Main3{
	
	static Scanner xx= new Scanner(System.in);
	static Random random= new Random();
	public static void main(String [] args){
		System.out.println("<>-<>-<   SELAMAT DATANG DI RPG FANTASY   >-<>-<>");
		System.out.print("Masukkan nama Player 1 >> ");
		Player p1= new Player(xx.nextLine());
		
		System.out.print(">> Memperoleh Skill pasif [["+p1.getPassive()+"]], dan skill aktif [["+p1.getActive()+"]]");
		if(p1.getRole().equals("Mage")) System.out.print(", [[Bola Api]]");
		System.out.println();
		
		p1.setItems();
		p1.setMonsters();
		mainMenu(p1);
	}
	
	static String mainMenu(Player p1) {
		System.out.println("\n|=============>  PILIH OPSI  <=============|");
		System.out.println("| 1. Periksa status player                 |");
		System.out.println("| 2. Info Role                             |");
		System.out.println("| 3. Periksa tas                           |");
		System.out.println("| 4. Beli perlengkapan                     |  __________________________");
		System.out.println("| 5. Beli ramuan                           | |          Status          |");
		System.out.println("| 6. Tidur                                 | | HP      =  "+(int)p1.getHp()+"/"+(int)p1.getMaxHp()+"\t|");
		System.out.println("| 7. Berkeliling kota                      | | Energy  =  "+(int)p1.getEnergy()+"/"+(int)p1.getMaxEnergy()+"\t|");
		System.out.println("| 8. Berlatih                              | | Exp     =  "+p1.getXp()+" %\t\t|");
		System.out.println("| 9. Bertarung dengan player lain          | |__________________________|");
		System.out.println("|_10._Berpetualang_keluar_kota_____________|"); 
		System.out.print(">> ");
		
		String opsi= xx.next();
		if(opsi.equals("1")) p1.showStatus();
		else if(opsi.equals("2")) p1.roleInfo();
		else if(opsi.equals("3")) p1.checkInventory();
		else if(opsi.equals("4")) p1.showItems();
		else if(opsi.equals("5")) p1.showPotions();
		else if(opsi.equals("6")) p1.sleep();
		else if(opsi.equals("7")) p1.talk();
		else if(opsi.equals("8")) p1.train();
		else if(opsi.equals("9")) {
			Player enemy= new Player(9);
			System.out.println(">> Bersiap untuk bertarung! "+p1.getName()+" vs "+enemy.getName());
			fight(p1, enemy);
		}else if(opsi.equals("10")) {
			System.out.println(">> Keluar kota..");
			adventure(p1);
		}
		else System.out.println("Input salah..");
		return mainMenu(p1);
	}
	
	static void fight(Player player1, Player enemy) {
		while(true) {
			System.out.println("\n|========>  GILIRANMU! PILIH OPSI  <=======|");
			System.out.println("| 1. Serang lawan                          |  __________________________");
			System.out.println("| 2. Gunakan skill                         | |          Status          |");
			System.out.println("| 3. Charge                                | | HP      =  "+(int)player1.getHp()+"/"+(int)player1.getMaxHp()+"\t|");
			System.out.println("| 4. Healing                               | | Energy  =  "+(int)player1.getEnergy()+"/"+(int)player1.getMaxEnergy()+"\t|");
			System.out.println("| 5. Skip                                  | |__________________________|");
			System.out.println("|_6._Run___________________________________|");
			System.out.print(">> ");
			String a= xx.next();
			if(a.equals("1")) {
				System.out.print(">> ");
				player1.attack(enemy);
			}
			else if(a.equals("2")) {
				System.out.print(">> ");
				player1.useSkill(enemy);
			}
			else if(a.equals("3")) {
				System.out.print(">> ");
				player1.charge();
			}
			else if(a.equals("4")) {
				System.out.print(">> ");
				player1.healing();
			}
			else if(a.equals("5")) {
				System.out.println(">> Kamu melewati turn ini..");
			}
			else if(a.equals("6")) {
				if(player1.getHp()<player1.getMaxHp()/5 && random.nextInt(10)<8) System.out.println(">> Kamu ingin melarikan diri, namun dicegat oleh lawan..");
				else{
					System.out.println(">> Kamu melarikan diri..");
					break;
				}
			}else {
				System.out.println(">> Kamu melewati turn ini..");
			}
			
			player1.regen();
			
			if(enemy.dead()) {
				System.out.print(">> Kamu mengalahkan "+enemy.getName()+"! ");
				player1.win(enemy);
				break;
			}
			
			System.out.println();
			System.out.print(">> ");
			enemy.attack(player1);
			
			enemy.regen();
			
			if(player1.dead()) {
				System.out.print(">> Kamu dikalahkan, ");
				player1.lose();
				break;
			}
		}
	}
	
	static void adventure(Player player1) {
		while(true) {
			System.out.println("\n|=====>  (DI LUAR KOTA)  PILIH OPSI  <=====|");
			System.out.println("| 1. Berjalan ke depan                     |  __________________________");
			System.out.println("| 2. Beristirahat sebentar                 | |          Status          |");
			System.out.println("| 3. Ganti Perlengkapan                    | | HP      =  "+(int)player1.getHp()+"/"+(int)player1.getMaxHp()+"\t|");
			System.out.println("| 4. Cek Status                            | | Energy  =  "+(int)player1.getEnergy()+"/"+(int)player1.getMaxEnergy()+"\t|");
			System.out.println("|_5._Kembali ke kota_______________________| |__________________________|");
			System.out.print(">> ");
			String input= xx.next();
			
			if(input.equals("5")) {
				if(player1.getEnergy()<player1.getMaxEnergy()) System.out.println(">> Karena kelelahan, kamu balik ke kota..");
				else System.out.println(">> Kembali ke kota..");
				return;
			}else if(input.equals("4")) {
				player1.showStatus();
			}else if(input.equals("3")) {
				player1.equipItems();
			}else if(input.equals("2")) {
				player1.rest();
			}else {
			int a= random.nextInt(80+(3*player1.getLevel()));
			
			System.out.print(">> Berjalan..");
			if(a<=10) {
				System.out.println(" tetapi tidak menemukan apa-apa");
			}else if(a<=25) {
				int gold= 1+Main3.random.nextInt(20);
				System.out.println(" kamu mendapat "+gold+" gold!");
			}else if(a<=40) {
				System.out.println(" kamu menemukan orang yang meminta pertolongan... meminta "+(Main3.random.nextInt(8)+1)+" gold\n>>Maukah kamu memberinya? (y/n)");
				String tolong= Main3.xx.next();
				
				if(tolong.equalsIgnoreCase("y")) {
					System.out.println(">> Kamu memberinya gold..");
					if(Main3.random.nextInt(3)==0) {
						int diberikan= Main3.random.nextInt(3);
						String didapat;
						if(diberikan==2) {
							int uangDikasi= 20+Main3.random.nextInt(50);
							player1.setMoney(player1.getMoney()+uangDikasi);
							didapat= uangDikasi+" gold";
						}else {
							player1.setItemsGift(diberikan);
							didapat= player1.getItemsGift().getName();
						}
						System.out.println(">> Tidak terduga! dia memberimu "+didapat);
						}
				}else {
					System.out.println(">> Kamu tidak memberinya uang");
				}
				
			}else if(a<=50) {
				player1.fightMonsters(player1.getMonster(0), 0,player1);
			}else if(a<=60) {
				player1.fightMonsters(player1.getMonster(1), 1, player1);
			}else if(a<=70) {
				player1.fightMonsters(player1.getMonster(2), 2, player1);
			}else if(a<=80) {
				player1.fightMonsters(player1.getMonster(3), 3, player1);
			}else if(a<=90) {
				player1.fightMonsters(player1.getMonster(4), 4, player1);
			}else if(a<=100) {
				player1.fightMonsters(player1.getMonster(5), 5, player1);
			}else if(a<=103) {
				player1.fightMonsters(player1.getMonster(7), 7, player1);
			}else{
				player1.fightMonsters(player1.getMonster(6), 6, player1);
			}
			
			if(player1.dead()) return;
			}
		}
	}
	
}
