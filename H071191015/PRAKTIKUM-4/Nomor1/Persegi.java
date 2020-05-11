package Nomor1;

public class Persegi extends Bangundatar{
    private double sisi;

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double luas(){
        double luas = sisi*sisi;
        System.out.println("Luas Persegi\t\t: " + luas + " cm");
        return luas;
    }

    @Override
    public double keliling(){
        double keliling = 4*sisi;
        System.out.println("Keliling Persegi\t: " + keliling + " cm");
        return keliling;
    }

}