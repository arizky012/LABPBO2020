package app;

import java.util.ArrayList;

public class Race {
    public int participants;
    public boolean raceStarted = false;
    public ArrayList<String> runnersRank = new ArrayList<>();

    public void start() {
        if (participants >= 3) {
            System.out.println("The Race is Started . . .\n");
            raceStarted = true;
        } else {
            System.out.println("The race cannot be started, runners are not enough");
        }
    }

    public void result() {
        while (runnersRank.size() != participants) {
            continue;
        }

        System.out.println("\nThe Race has ended\n");

        String[] ranking = {"1st", "2nd", "3rd"};
        
        for (int i = 0; i < runnersRank.size(); i++) {
            if (i < 3) {
                System.out.printf("%s : %s\n", ranking[i], runnersRank.get(i));
            } else if(i == 3) {
                System.out.println("\n" + runnersRank.get(i) + " loses");
            }
            else {
                System.out.println(runnersRank.get(i) + " loses");
            }
        }
    }
}