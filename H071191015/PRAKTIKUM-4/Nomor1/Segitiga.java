package Nomor1;

public class Segitiga extends Bangundatar {
    private double alas;
    private double tinggi;
    private double sisi2;
    private double sisi3;

    public void setAlas(double alas){
        this.alas = alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public void setSisi2(double sisi){
        sisi2 = sisi;
    }

    public void setSisi3(double sisi){
        sisi3 = sisi;
    }

    @Override
    public double luas(){
        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga\t\t: " + luas + " cm");
        return luas;
    }

    @Override
    public double keliling(){ 
        double keliling = alas + sisi2 + sisi3;
        System.out.println("Keliling Segitiga\t: " + keliling + " cm");
        return keliling;
    }
}