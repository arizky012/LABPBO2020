package Nomor1;

public class PrismaSegitiga extends Bangunruang {
    private double tinggiPrisma;
    private double tinggiAlasPrisma;
    private double alasPrisma;
    private double sisi1,sisi2;

    public void setTinggiPrisma(double tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    public void setTinggiAlasPrisma(double tinggiAlasPrisma){
        this.tinggiAlasPrisma = tinggiAlasPrisma;
    }

    public void setAlasPrisma(double alasPrisma){
        this.alasPrisma = alasPrisma;
    }

    public void setSisi1(double sisi){
        sisi1 = sisi;
    }

    public void setSisi2(double sisi){
        sisi2 = sisi;
    }

    public double getKelilingAlas(){
        double kelilingAlas = sisi1+sisi2+alasPrisma;
        return kelilingAlas;
    }
    
    @Override
    public double luasPermukaan() {
        double luasPermukaan = (getKelilingAlas()*tinggiPrisma) + (alasPrisma*tinggiAlasPrisma);
        System.out.printf("\nLuas Permukaan Prisma Segitiga : %.2f", luasPermukaan);
        return luasPermukaan;
    }

    @Override
    public double volume() {
        double volumePrisma = (alasPrisma*tinggiAlasPrisma*tinggiPrisma)/2;
        System.out.printf("Volume Prisma Segitiga\t: %.2f", volumePrisma);
        return volumePrisma;
    }
}