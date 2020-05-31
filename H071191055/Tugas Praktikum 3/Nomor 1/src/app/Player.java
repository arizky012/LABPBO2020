package app;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


/**
 * Player
 */
public class Player {

    static Scanner sc = new Scanner(System.in);

    private String name;
    private String role;
    private int level;
    private double damage;
    private double hp;
    private double energy;
    private int count[];
    private int money;
    private Item[] items;
    private int number[];

    public Player(String name, String role) {
        this.name = name;
        this.role = role;
        level = 1;
        hp = 100;
        energy = 30;
        money = 100;
        damage = ThreadLocalRandom.current().nextInt(5, 21);
        callItem();
    }
    
    public String getName() {
        return name;
    }
    public void setHP(double hp) {
        this.hp = hp;
    }

    public void startBuy() {
        buy(items);
    }
    
    public void callItem() {
        items = new Item[3];
        items[0] = new Item("Healing", 50, 
                            "Healing    : This item will heal your HP by 50");
        items[1] = new Item("Elixir", 15, 
                            "Elixir     : This item will increase your damage by 150 %");
        items[2] = new Item("Snickers", 50, 
                            "Snickers   : This item will recover your energy by 100");

        count = new int[items.length];
        for (int i = 0; i < count.length; i++) {
            count[i] = 1;
        }

        number = new int[items.length];
        for (int i = 0; i < count.length; i++) {
            number[i] = i + 1;   
        }
    }

    public void showStatus() {
        System.out.println(name + "\'s" + " status : ");
        System.out.printf("Role   : %s \n", role);
        System.out.printf("Level  : %d \n" , level);
        System.out.printf("HP     : %.2f \n" , hp);
        System.out.printf("Attack : %.2f \n", damage);
        System.out.printf("Energy : %.2f\n" , energy);
        System.out.printf("Money  : %d\n\n" , money);
    }

    public void showItems() {
        for (int i = 0; i < count.length; i++) {
            System.out.println(items[i].getName() + " x" + count[i]);
        }
    }

    public double getHP() {
        return hp;
    }

    public boolean attack(Player player) {
        if (player.getHP() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public double getAttack() {
        return damage;
    }

    public double getEnergy() {
        return energy;
    }

    public String getDamage(Player player) {
        energy -= 10;
        if (energy <= 0) {
            energy = 0;
            return "You can't attack anymore, please use energy items";
        } else {
            player.hp = player.hp - damage;
            if (player.hp <= 0) {
                player.hp = 0;
            }
            return String.format("%s has taken %.0f damage from %s", player.name, damage, name);
        }
    }

    public void useItem() {
        int useitem = sc.nextInt();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getName() + " x" + count[i]);
        }

        if (useitem == 1) {
            if (count[0] >= 1) {
                hp = hp + items[0].use(items[0].getName());
                if (hp >= 100) {
                    hp = 100;
                }
                count[0]--;
            }else {
                System.out.println("Item's runnig out");
            }
        }else if (useitem == 2) {
            if (count[1] >= 1) {
                damage = damage * items[1].use(items[1].getName());
                count[1]--;
            } else {
                System.out.println("Item's running out");
            }
        } else if (useitem == 3) {
            if (count[2] >= 1) {
                energy = energy + items[2].use(items[2].getName());
                if (energy >= 100) {
                    energy = 100;
                }
                count[2]--;
            } else {
                System.out.println("Item's running out");
            }
        }
    }

    public void sellItem() {
        System.out.println("Item Owned : ");
        showItems();
        System.out.print("Choose Item to Sell : ");
        int command = sc.nextInt();
        money += items[command - 1].getPrice() - items[command-1].sell();
        if (count[command - 1] >= 1) {
            count[command - 1]--;
            System.out.printf("%s is selled", items[command - 1].getName());
        }else {
            count[command - 1] = 0;
        }
    }

    public void buy(Item[] items) {
        System.out.println("Welcome to Item Shop");   
        System.out.println("--------------------");   
        for (int i = 0; i < items.length; i++) {
            System.out.println(number[i] + ". " + items[i].getName());
        }
        System.out.println("00. Items Detail");
        System.out.println("Command : ");
        int select = sc.nextInt();
        if (select == 1) {
            if (items[0].getPrice() <= money) {
                money = money - items[0].getPrice();
                count[0]++;
                System.out.println(items[0].getName() + " has been added to your inventory.");
            } else {
                System.out.println("Not enough money.");
            }
        } else if (select == 2) {
            if (items[1].getPrice() <= money) {
                money = money - items[1].getPrice();
                count[1]++;
                System.out.println(items[1].getName() + " has been added to your inventory.");
            } else {
                System.out.println("Not enough money.");
            }
        } else if (select == 3) {
            if (items[2].getPrice() <= money) {
                money = money - items[2].getPrice();
                count[2]++;
                System.out.println(items[2].getName() + " has been added to your inventory.");
            } else {
                System.out.println("Not enough money.");
            }
        } else if (select == 00) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(number[i] + "." + items[i].getInfo());
            }
        }
    }
}