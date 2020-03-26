public class Item {
	private String name;
	private int price;
	private String info;
	private int damagePlus= 0;
	private int hpPlus= 0;
	private int energyPlus= 0;
	private int defensePlus= 0;
	
	void use() {
		System.out.println(">> Memakai "+name+"...");
	}
	
	void sell() {
		System.out.println(">> Menjual "+name+"...");
	}
	
	void destroy() {
		System.out.println(">> Membuang "+name+"...");
	}
	
	public void setName(String a) {name= a;}
	public void setPrice(int a) {price= a;}
	public void setInfo(String a) {info= a;}
	public void setDamagePlus(int a) {damagePlus= a;}
	public void setDefensePlus(int a) {defensePlus= a;}
	public void setHpPlus(int a) {hpPlus= a;}
	public void setEnergyPlus(int a) {energyPlus= a;}
	
	public String getName() {return name;}
	public int getPrice() {return price;}
	public String getInfo() {return info;}
	public int getHpPlus() {return hpPlus;}
	public int getDamagePlus() {return damagePlus;}
	public int getDefensePlus() {return defensePlus;}
	public int getEnergyPlus() {return energyPlus;}
}
