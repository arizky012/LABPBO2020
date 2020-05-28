
public class Runner implements Runnable {
    
    private int number;
    private Thread thread;
    private Race race;

    public Runner(int number){
        this.number = number;
        thread = new Thread(this);
    }

	public Runner joinRace(Race race){
        if (this.race == null) {
            this.race = race;
            race.participant++;
        }
        return this;
    }

    public void start() {
        if (race.isStart) {
            thread.start();
        } else {
            System.out.printf("Hey Runner-%d, the race hasn't started yet!\n", number);
        }
    }

    private String getNumber(){
        return String.format("Runner-%d", number);
    }

    @Override
    public void run() {
        System.out.printf("%s running\n", getNumber());
        
        try {
            Thread.sleep(race.time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        race.ranking.add(getNumber());
    }

}