import java.util.Random;

public class Main2 {
    public static void main(String[] args) { 
    	Random rd= new Random();
    	
        Integer number = 0;
        int [] runnersNumb= new int [10];
        Race race = new Race();
        Runner[] runners = new Runner[10];
        
        for(int i=0; i<10; i++) {
        	runnersNumb[i]= numberGenerator(rd);
        	for(int j=0; j<i; j++) {
        		if(runnersNumb[i]==runnersNumb[j]) {
        			j= i-1;
        			i--;
        		}
        	}
        }

        for (int i = 0; i < runners.length; i++) {
            runners[i] = new Runner(runnersNumb[i]);
            runners[i].joinRace(race);
        }

        race.start(); 

        for (Runner runner : runners) {
            runner.start();
        }
        race.result();
    }
    
    static int numberGenerator(Random rd) {
    	return 1+rd.nextInt(10);
    }
}