
public class BangunRuang{

    double luasPermukaan(){
        System.out.println("Luas Permukaan Bangun Ruang");
        return 0;
    }

    double volume(){
        System.out.println("Volume Bangun Ruang");
        return 0;
    }

}

class Kubus extends BangunRuang{
    double rusuk;

    double luasPermukaan(){
        double luasPermukaan = 6 * Math.pow(rusuk, 2);
        System.out.printf("Luas permukaan kubus = %.2f\n" , luasPermukaan);
        return luasPermukaan;

    }

    double volume(){
        double volume = Math.pow(rusuk, 3);
        System.out.printf("Volume kubus = %.2f\n" , volume);
        return volume;

    }

}

class Balok extends BangunRuang{
    double panjang, lebar, tinggi;

    double luasPermukaan(){
        double luasPermukaan = 2*(panjang*lebar) + 2*(panjang*tinggi) + 2*(lebar*tinggi);
        System.out.printf("Luas permukaan balok = %.2f\n" , luasPermukaan);
        return luasPermukaan;
    }

    double volume(){
        double volume = panjang * lebar * tinggi;
        System.out.printf("Volume balok = %.2f\n" , volume);
        return volume;
    }
}
class PrismaSegitiga extends BangunRuang{
    double alas, tinggiSegitiga, tinggiPrisma;

    double luasPermukaan(){
        double luasPermukaan = tinggiSegitiga * (alas + (3 * tinggiPrisma));
        System.out.printf("Luas permukaan prisma segitiga = %.2f\n" , luasPermukaan);
        return luasPermukaan;
    }

    double volume(){
        double volume = alas *tinggiPrisma;
        System.out.printf("Volume prisma segitiga = %.2f\n" , volume);
        return volume;
    }

}

class Bola extends BangunRuang{
    double r;

    double luasPermukaan(){
        double luasPermukaan = 4 * Math.PI *Math.pow(r, 2);
        System.out.printf("Luas permukaan bola = %.2f\n" , luasPermukaan);
        return luasPermukaan;

    }

    double volume(){
        double volume = (4/3) * Math.PI * Math.pow(r, 3);
        System.out.printf("Volume bola = %.2f\n" , volume);
        return volume;
    }

}

class Tabung extends BangunRuang{
    double r, tinggiTabung;

    double luasPermukaan(){
        double luasPermukaan = (2 * Math.PI * r * tinggiTabung) + (2 * Math.PI* Math.pow(r, 2));
        System.out.printf("Luas permukaan tabung = %.2f\n" , luasPermukaan);
        return luasPermukaan;
    }

    double volume(){
        double volume = Math.PI * Math.pow(r, 2) * tinggiTabung;
        System.out.printf("Volume tabung = %.2f\n" , volume);
        return volume;
    }
}

