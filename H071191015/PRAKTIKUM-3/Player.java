import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {

    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int money;
    private List<Item> items;

    public Player(String name, String role){
        this.name = name;
        this.role = role;
        level = 1;
        damage = (int)(10);
        hp = (int)(100);
        energy = (int)(100);
        money = (int)(1000);
        items = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public double getHp(){
        return hp;
    }

    public double getEnergy() {
        return energy;
    }

    public double getMoney() {
        return money;
    }

    public void showStatus() {
        System.out.println("Nama    : " + name);
        System.out.println("Role    : " + role);
        System.out.println("Level   : " + level);
        System.out.println("Damage  : " + damage);
        System.out.println("HP      : " + hp);
        System.out.println("Energy  : " + energy);
        System.out.println("Money   : " + money);
        System.out.println();
    }

    public void showItem() {
        if (items.isEmpty()) {
            System.out.println("You have no items");
        } else {
            for (int i = 0; i < items.size(); i++) {
                items.get(i).descItem();
            }
        }
    }

    public void attack(Player player) {
        player.hp -= damage;
        energy -= 10;
    }

    public boolean death(Player enemy){
        if (enemy.hp == 0 || enemy.energy == 0) {
            System.out.println(enemy.name + " DEAD");
            System.out.println("!!! GAME OVER !!!");
            return true;
        } 
        return false;
    }

    public void getDamage() {
        System.out.println("Get " + damage + " damage!!!");
    }

    public void healing(Player player){
        if (energy==100 || hp==100) {
            System.out.println("No need for healing");
        } else if (money > 100){
            hp += 20;
            money -= 100;
            System.out.println("Successful healing");
        } else {
            System.out.println("Your money isn't enough");
        }
    }

    public void buy() {
        System.out.println("1. Sword, 200, hp increases by 30");
        System.out.println("2. Mask, 150, hp increases by 10");
        System.out.println("3. Potion, 100, energy increases by 20");
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("Berhasil Dibeli");
                items.add(new Item("Sword", 200, "hp increases by 30"));
                money -= 200;
                break;
            case 2:
                System.out.println("Berhasil Dibeli");
                items.add(new Item("Mask", 150, "hp increases by 10"));
                money -= 150;
                break;
            case 3:
                System.out.println("Berhasil Dibeli");
                items.add(new Item("Poison", 100, "hp increases by 20"));
                money -= 100;
                break;
        }
    }

    public void useItems() {
        Scanner sc = new Scanner(System.in);
        if (items.isEmpty()) {
            System.out.println("You have no items to use");
        } else {
            showItem();
            System.out.println("Which item you want to use?(input number of item)");
            int in = sc.nextInt();
            if (items.get(in).getName()=="Sword") {
                hp+=30;
            } else if (items.get(in).getName()=="Mask") {
                hp+=10;
            } else if (items.get(in).getName()=="Poison") {
                energy+=20;
            }
            System.out.println(items.get(in).getName() + " is used");
            items.remove(in);
        }
    }

    public void sellItems(){
        Scanner sc = new Scanner(System.in);

        if (items.isEmpty()) {
            System.out.println("You have no items to sell");
        } else {
            showItem();
            System.out.println("Which item you want to sell?(input number of item)");
            int in = sc.nextInt();
            System.out.println("Get $"+items.get(in).getPrice());
            money += items.get(in).getPrice();
            items.remove(in);
        }
    }

    
}