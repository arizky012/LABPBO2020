import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Player1", "X");
        Player player2 = new Player("Player2", "Y");

        Scanner sc = new Scanner(System.in);
        
        boolean turn = true;
        
        while (true) {
            if (turn) {
                System.out.println("==========================");
                System.out.println(player1.getName() + " Turn!");
                System.out.println("1. Attack");
                System.out.println("2. Buy Item");
                System.out.println("3. Healing");
                System.out.println("4. Status");
                System.out.println("5. Items");
                System.out.println("6. Use Items");
                System.out.println("7. Sell Items");
                System.out.println("Energi:"+ player1.getEnergy() + " || HP:" + player1.getHp() + " || Money:" +player1.getMoney());
                System.out.printf("Input your option : ");
                int s = sc.nextInt();
                System.out.println("==========================");

                if (s == 1) {
                    turn = false;
                    player1.attack(player2);
                    player1.getDamage();
                    if (player1.death(player2)) {
                        return;
                    }
                } else if (s == 2) {
                    player1.buy();
                } else if (s == 3) {
                    turn = false;
                    player1.healing(player1);
                } else if (s == 4) {
                    player1.showStatus();
                } else if (s == 5) {
                    player1.showItem();
                } else if (s == 6) {
                    player1.useItems();
                } else if (s == 7) {
                    player1.sellItems();
                }
            } 
            
            else {
                System.out.println("==========================");
                System.out.println(player2.getName() + " Turn!");
                System.out.println("1. Attack");
                System.out.println("2. Buy Item");
                System.out.println("3. Healing");
                System.out.println("4. Status");
                System.out.println("5. Items");
                System.out.println("6. Use Items");
                System.out.println("7. Sell Items");
                System.out.println("Energi:"+ player2.getEnergy() + " || HP:" + player2.getHp() + " || Money:" +player2.getMoney());
                System.out.print("Input your option : ");
                int s = sc.nextInt();
                System.out.println("==========================");

                if (s == 1) {
                    turn = true;
                    player2.attack(player1);
                    player2.getDamage();
                    if (player2.death(player1)) {
                        return;
                    }
                } else if (s == 2) {
                    player2.buy();
                } else if (s == 3) {
                    turn = true;
                    player2.healing(player2);
                } else if (s == 4) {
                    player2.showStatus();
                } else if (s == 5) {
                    player2.showItem();
                } else if (s == 6) {
                    player2.useItems();
                } else if (s == 7) {
                    player2.sellItems();
                }
            }
        }


        

    }
}