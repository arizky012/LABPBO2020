public class Monster {
	private String name;
	private int hp, maxHp, damage, dodgeRate;
	private boolean stunned= false;
	Monster(){}
	
	Monster(String a, int b, int c, int d){
		name= a;
		maxHp= b; hp= maxHp;
		damage= c;
		dodgeRate= d;
	}
	
	public void setHp(int a) {hp= a;}
	public void setStunned(boolean a) {stunned= a;}
	
	public String getName() {return name;}
	public int getHp() {return hp;}
	public int getMaxHp() {return maxHp;}
	public int getDamage() {return damage;}
	public int getDodgeRate() {return dodgeRate;}
	
	public void attack(Player player) {
		System.out.print(">> ");
		if(player.getGuarding()) {
			System.out.println(name+" menyerang, ditangkis dengan skill [[Bertahan]]");
			player.setGuarding(false);
			return;
		}
		
		if(stunned) {
			System.out.println(name+" tidak bisa bergerak karena efek stun..");
			stunned= false;
			return;
		}
		
		int attack= damage+Main3.random.nextInt(5);
		int dodge= Main3.random.nextInt(101);
		
		if(player.getRole().equals("Archer")) {
			if(Main3.random.nextInt(101)<=22) {
				System.out.print("Skil pasif "+player.getName()+", [["+player.getPassive()+"]] aktif! \n>> ");
				dodge= 1;
			}
		}
		
		if(dodge<=5) {
			System.out.println(player.getName()+" berhasil menghindari serangan "+name+"!");
			return;
		}
		
		player.setHp(player.getHp()-attack);
		
		System.out.print(name);
		
		if(name.equals("Goblin")) System.out.print(" menyerang dengan tongkat!");
		else if(name.equals("Slime")) System.out.print(" menembakkan lendir");
		else if(name.equals("Orc")) System.out.print(" meninju,");
		else if(name.equals("High Orc")) System.out.print(" meninju lalu mencakar!");
		else if(name.equals("Dragon Igneal")) System.out.print(" menghembuskan nafas Api!");
		else System.out.print(" menyerang,");
		
		System.out.println(" terkena "+(int)attack+" damage, sisa darah = "+(int)player.getHp());
	}
	
	public boolean dead() {
		if(hp<=0) return true;
		return false;
	}

}
