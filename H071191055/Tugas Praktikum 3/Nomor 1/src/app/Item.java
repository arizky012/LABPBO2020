package app;

import java.util.*;
/**
 * Item
 */
public class Item {

    static Scanner sc = new Scanner(System.in);
    private String name;
    private int price;
    private String info;

    public Item (String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }
    
    public double use(String name) {
        if (name.equalsIgnoreCase("Healing")) {
            return 50;
        }else if (name.equalsIgnoreCase("Blade of Despair")) {
            return 150 / 100;
        }else if (name.equalsIgnoreCase("Snickers")) {
            return 100;
        }
        return 0;
    }

    public int sell() {
        return 5;
    }

    public void destroy() {
        System.out.println("It's Better to Sell Your Item");
    }

    public String getInfo() {
        return info;
    }
    
	public String getName() {
		return name;
    }
    
    public int getPrice() {
        return price;
    }
}