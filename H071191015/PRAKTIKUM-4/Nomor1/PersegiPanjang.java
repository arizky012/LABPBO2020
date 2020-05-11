package Nomor1;

public class PersegiPanjang extends Bangundatar {
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas(){
        double luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang\t\t: " + luas + " cm");
        return luas;
    }

    @Override
    public double keliling(){
        double keliling = 2*(panjang+lebar);
        System.out.println("Keliling Persegi Panjang\t: " + keliling + " cm");
        return keliling;
    }
}