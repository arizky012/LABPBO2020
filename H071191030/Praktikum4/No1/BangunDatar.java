

/**
 * BangunDatar
 */
public class BangunDatar {

    double luas(){
        System.out.println("Luas bangun datar");
        return 0;
    }
    double keliling(){
        System.out.println("Keliling bangun datar");
        return 0;
    }
    

}

class Persegi extends BangunDatar{

    double sisi;

    double luas(){
        double luas = Math.pow(sisi, 2);
        System.out.printf("Luas persegi = %.2f\n",luas);
        return luas;
    }

    double keliling(){
        double keliling = 4 * sisi;
        System.out.printf("Keliling persegi = %.2f\n" , keliling);
        return keliling;

    }


}

class PersegiPanjang extends BangunDatar{
    double panjang, lebar;
    double luas(){
        double luas = panjang * lebar;
        System.out.printf("Luas persegi panjang = %.2f\n" , luas);
        return luas;
    }

    double keliling(){
        double keliling = 2 * (panjang + lebar);
        System.out.printf("Keliling persegi panjang = %.2f\n" , keliling);
        return keliling;
    }

}

class Lingkaran extends BangunDatar{
    double r;

    double luas(){
        double luas = Math.PI * Math.pow(r, 2);
        System.out.printf("Luas lingkaran = %.2f\n" , luas);
        return luas;
    }

    double keliling(){
        double keliling = 2 * Math.PI * r;
        System.out.printf("Keliling lingkaran = %.2f\n" , keliling);
        return keliling;
    }


}

class Segitiga extends BangunDatar{
    double alas, tinggi, s1, s2, s3;

    double luas(){
        double luas = (alas * tinggi)/2;
        System.out.printf("Luas segitiga = %.2f\n" , luas);
        return luas;
    }

    double keliling(){
        double keliling = s1 + s2 + s3;
        System.out.printf("Keliling segitiga = %.2f\n" , keliling);
        return keliling;
    }

}

class Trapesium extends BangunDatar{
    double sa, sb, sm, t;

    double luas(){
        double luas = ((sa + sb) * t) /2;
        System.out.printf("Luas trapesium = %.2f\n" , luas);
        return luas;
    }

    double keliling(){
        double keliling = sa+sb+sm+t;
        System.out.printf("Keliling trapesium = %.2f\n" , keliling);
        return keliling;
    }


}

