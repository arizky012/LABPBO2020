package Nomor1;

public class Trapesium extends Bangundatar {
    private double sisiBawah;
    private double sisiAtas;
    private double tinggiTrapesium;
    private double sisiMiring = Math.sqrt(Math.pow((sisiBawah-sisiAtas), 2) + Math.pow(tinggiTrapesium, 2));

    public void setSisiBawah(double sisiBawah){
        this.sisiBawah = sisiBawah;
    }

    public void setSisiAtas(double sisiAtas) {
        this.sisiAtas = sisiAtas;
    }
    
    public void setTinggiTrapesium(double tinggiTrapesium){
        this.tinggiTrapesium = tinggiTrapesium;
    }

    @Override
    public double luas(){
        double luas = ((sisiAtas + sisiBawah) * tinggiTrapesium) / 2;
        System.out.println("Luas Trapesium\t\t: " + luas + " cm");
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = sisiAtas + sisiBawah + sisiMiring + tinggiTrapesium;
        System.out.println("Keliling Trapesium\t: " + keliling + " cm");
        return keliling;
    }
}