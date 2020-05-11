package Nomor1;

public class Balok extends Bangunruang {
    private double panjangBalok;
    private double lebarBalok;
    private double tinggiBalok;

    public void setPanjangBalok(double panjangBalok){
        this.panjangBalok = panjangBalok;
    }

    public void setLebarBalok(double lebarBalok){
        this.lebarBalok = lebarBalok;
    }

    public void setTinggiBalok(double tinggiBalok){
        this.tinggiBalok = tinggiBalok;
    }

    @Override
    public double luasPermukaan() {
        double luas = (2*panjangBalok*lebarBalok)+(2*panjangBalok*tinggiBalok)+(2*lebarBalok*tinggiBalok);
        System.out.printf("\nLuas Permukaan Balok : %.2f cm", luas);
        return luas;
    }

    @Override
    public double volume() {
        double volume = panjangBalok*lebarBalok*tinggiBalok;
        System.out.printf("Voulme Balok\t: %.2f cm", volume);
        return volume;
    }
}