package Nomor1;

public class Tabung extends Bangunruang {
    private double jariTabung;
    private double tinggiTabung;
    
    public void setJariTabung(double jariTabung){
        this.jariTabung = jariTabung;
    }

    public void setTinggiTabung(double tinggiTabung){
        this.tinggiTabung = tinggiTabung;
    }

    @Override
    public double luasPermukaan(){
        double luas = (2*Math.PI*Math.pow(jariTabung,2)) + (2*Math.PI*jariTabung);
        System.out.printf("\nLuas Permukaan Tabung : %.2f cm", luas );
        return luas;
    }

    @Override
    public double volume() {
        double volume = Math.PI * Math.pow(jariTabung, 2) * tinggiTabung;
        System.out.printf("Volume Tabung\t: %.2f cm", volume);
        return volume;
    }
}