class Lampu {

    boolean blueIsOn = false;
    boolean redIsOn = false;

    void turnOn(){
        if (blueIsOn == false) {
            blueIsOn = true;
            redIsOn = false;
        } else {
            redIsOn = true;
            blueIsOn = false;
        }
    }

    void turnOff(){
        blueIsOn = false;
        redIsOn = false;
    }

    void getState() {
        if (blueIsOn) {
            System.out.println("Lampu Biru ON");
        } else {
            System.out.println("Lampu Bir OFF");
        }

        if (redIsOn) {
            System.out.println("Lampu Merah ON");
        } else {
            System.out.println("Lampu Merah OFF");
        }

    }
}