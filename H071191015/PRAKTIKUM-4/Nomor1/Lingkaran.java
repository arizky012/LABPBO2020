package Nomor1;

public class Lingkaran extends Bangundatar {
    private double jari;

    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    public double luas(){
        double luas = 2*Math.PI*jari;
        System.out.printf("Luas Lingkaran\t\t: %.2f cm", luas);
        return luas;
    }

    @Override
    public double keliling(){
        double keliling = Math.PI*Math.pow(jari, 2);
        System.out.printf("\nKeliling Lingkaran\t: %.2f cm", keliling);
        return keliling;
    }
}