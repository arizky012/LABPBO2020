package Nomor1;

public class Kubus extends Bangunruang {
    private double sisi;
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    
    @Override
    public double luasPermukaan() {
        double luas = 6*sisi*sisi; 
        System.out.printf("\nLuas Permukaan Kubus : %.2f cm", luas);
        return luas;
    }

    @Override
    public double volume() {
        double volume = sisi*sisi*sisi;
        System.out.printf("Volume Kubus\t: %.2f cm", volume);
        return volume;
    }
}