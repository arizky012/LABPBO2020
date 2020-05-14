package app;

public class Runner implements Runnable {
    private Integer number;
    private Thread thread;
    private Race race;

    public Runner(Integer number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " is running");

        try {
            Thread.sleep(race.participants * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized(race.runnersRank) {
            race.runnersRank.add(thread.getName());
        }
    }

    public Runner joinRace(Race race) {
        if (this.race == null) {
            this.race = race;
            this.race.participants++;
            thread = new Thread(this);
            thread.setName("Runner-" +  number);
        }
        
        return this;
    }

    public void start() {
        if (thread != null && race.raceStarted) {
            thread.start();
        } else if (thread == null) {
            System.out.printf("%s have not entered any race\n", thread.getName());
        } else if (!race.raceStarted) {
            System.out.printf("Hey %s, the race hasn't started yet\n", thread.getName());
        }
    }
    
}