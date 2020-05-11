package Nomor1;

public class Bola extends Bangunruang {
    private double jariBola;

    public void setJariBola(double jariBola){
        this.jariBola = jariBola;
    }

    @Override
    public double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI * Math.pow(jariBola, 2);
        System.out.printf("\nLuas Permukaan Bola\t: %.2f cm", luasPermukaan);
        return luasPermukaan;
    } 

    @Override
    public double volume(){
        double volume = 4/3 * Math.PI * Math.pow(jariBola, 3);
        System.out.printf("Volume Bola\t\t: %.2f cm", volume);
        return volume;
    }
}