package app;

import java.util.*;

/**
 * Game
 */
public class Game {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = new Player("Musketeer X", "Assasin");
        Player player2 = new Player("Zekken", "Swordmaster");
        
        GameStart(player1, player2);        
    }
    
    public static void GameStart(Player player1, Player player2) {
        player1.showStatus();
        player2.showStatus();
        
        preparation(player1, player2);
        battle(player1, player2);
    }
    
    public static void preparation(Player player1, Player player2) {
        System.out.println("Welcome Boomer");
        System.out.println("This is the Preparation Mode");
        boolean check = true;
        int key;
        String str;
        while (check) {
            System.out.println("Player 1 turn");
            System.out.println("1. Shop");
            System.out.println("2. Show Items");
            System.out.println("3. Show Status");
            System.out.print("Command : ");
            key = sc.nextInt();
            System.out.println();

            switch (key) {
                case 1:
                    System.out.println("Welcome to the Shop");
                    System.out.println("1. Buy Items");
                    System.out.println("2. Sell Items");
                    System.out.print("Command : ");
                    key = sc.nextInt();
                    if (key == 1) {
                        player1.startBuy();
                        
                    } else if (key == 2) {
                        player1.sellItem();
                        
                    }
                    break;
                case 2:
                    player1.showItems();
                    break;
                case 3:
                player1.showStatus();
                    break;
            }
            sc.nextLine();
            System.out.println();
            System.out.print("Finish (Y/N) : ");
            str = sc.nextLine();
            System.out.println();
            if (str.equalsIgnoreCase("Y")) {
                check = false;
            } else  if (str.equalsIgnoreCase("N")){
                check = true;
            }

        }
        check = true;
        while (check) {
            System.out.println("Player 2 turn");
            System.out.println("1. Shop");
            System.out.println("2. Show Items");
            System.out.println("3. Show Status");
            System.out.print("Command : ");
            key = sc.nextInt();
            System.out.println();
        
            switch (key) {
                case 1:
                    System.out.println("Welcome to the Shop");
                    System.out.println("1. Buy Items");
                    System.out.println("2. Sell Items");
                    System.out.println("3. Show Items");
                    System.out.print("Command : ");
                    key = sc.nextInt();
                    if (key == 1) {
                        player2.startBuy();

                    } else if (key == 2) {
                        player2.sellItem();

                    } else if (key == 3) {
                        player2.showItems();
                    }
                    break;
                case 2:
                    player2.showItems();
                    break;
                case 3:
                    player2.showStatus();
                    break;
            }
            sc.nextLine();
            System.out.println();
            System.out.print("Finish (Y/N) : ");
            str = sc.nextLine();
            if (str.equalsIgnoreCase("Y")) {
                check = false;
            } else if (str.equalsIgnoreCase("N")) {
                check = true;
            }
        }
    }

    public static void battle(Player player1, Player player2) {
        System.out.println("Battle");
        int choose;
        boolean check = true;
        while (check) {
            System.out.println("Player 1 :");
            System.out.println("1. Attack");
            System.out.println("2. Use Items");
            System.out.print("Command : ");
            choose = sc.nextInt();

            player1.attack(player2);
            switch (choose) {
                case 1:
                    System.out.println(player1.getDamage(player2) + "\n");
                    player2.showStatus();
                    break;
                case 2:
                    player1.useItem();
                    player1.showStatus();
                    break;
            }

            if (player2.getHP() <= 0) {
                System.out.println("Player 1 Win");
                break;
            }

            System.out.println("Player 2");
            System.out.println("1. Attack");
            System.out.println("2. Use Items");
            System.out.print("Command : ");
            choose = sc.nextInt();

            player2.attack(player1);

            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(player2.getDamage(player1) + "\n");
                    choose = sc.nextInt();
                    if (choose == 1) {

                    }
                    player1.showStatus();
                    break;
                case 2:
                    player2.useItem();
                    player2.showStatus();
                    break;
            }

            if (player1.getHP() <= 0) {
                System.out.println("Player 2 Win");
                break;
            }
        }
    }
}