//Tgs Praktikum kls C No.1

import java.util.Random;


public class MainFrog {
 

    public static void main(String[] args) {

        Random random = new Random();
        int bambooHeight[] = new int[10];
        String colors[] = {"Daisy", "Graphite", "Daphodil", "Peach", "Emerald", "Poopy Red",
                            "Aegean", "Periwinkle", "Yale", "Ivory"};

        for (int i = 0; i < 10; i++) {
            bambooHeight[i] = 1 + random.nextInt(10);
            
        }

        Field field = new Field(bambooHeight);
        Frog frogs[] = new Frog[10];

        for (int i = 0; i < 10; i++) {
            frogs[i] = new Frog(colors[i], random.nextInt(15) + 1);
            
        }
        System.out.println("The frog's highest jump is " + Frog.getMax(frogs));

        for (int i = 0; i < 10; i++) {
            frogs[i].getProcess(field);
        }






    }

}
