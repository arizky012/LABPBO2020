/**
 * SubjectDetails
 */
public abstract class SubjectDetails {

    public abstract String getSubject(); 

    public abstract int getSks();

    public abstract String getLectureName();


}

class BahasaInggris extends SubjectDetails{

    public String getSubject(){
        return "Bahasa Inggris";
    }

    public int getSks(){
        return 2;
    }

    public String getLectureName(){
        return "Sukmawaty Marzuki";
    }


}

class Matdas2 extends SubjectDetails{

    public String getSubject(){
        return "Matematika Dasar II";
    }

    public int getSks(){
        return 3;
    }

    public String getLectureName(){
        return "Dr. Armin Lawi, S.Si., M.Si";
    }


}

class Wipteks extends SubjectDetails{

    public String getSubject(){
        return "Wawasan IPTEKS";
    }

    public int getSks(){
        return 2;
    }

    public String getLectureName(){
        return "Dr. Sri Suryani";
    }


}

class PBO extends SubjectDetails{

    public String getSubject(){
        return "Pemrograman Berorientasi Objek";
    }

    public int getSks(){
        return 3;
    }

    public String getLectureName(){
        return "Supri Amir, ST., M.Si";
    }

} 

class Kewarganegaraan extends SubjectDetails
{
    public String getSubject(){
        return "Kewarganegaraan";
    }

    public int getSks(){
        return 2;
    }

    public String getLectureName(){
        return "Irham S.Ip., M.Si";
    }


}

class AljabarLinear extends SubjectDetails{

    public String getSubject(){
        return "Aljabar Linear";
    }

    public int getSks(){
        return 3;
    }

    public String getLectureName(){
        return "Dr. Nurdin, S.Si., M.Si";
    }


}

class MetStatistika extends SubjectDetails{
    
    public String getSubject(){
        return "Metode Statistika";
    }

    public int getSks(){
        return 3;
    }

    public String getLectureName(){
        return "Dr. Nurtiti Sanusi, S.Si., M.Si";
    }

}

class Logkom extends SubjectDetails{

    public String getSubject(){
        return "Logika Komputer";
    }

    public int getSks(){
        return 3;
    }

    public String getLectureName(){
        return "Dr. Nirwan Ilyas, M.Si";
    }

}

class Technopreneurship extends SubjectDetails{
    
    public String getSubject(){
        return "Technopreneurship";
    }

    public int getSks(){
        return 2;
    }

    public String getLectureName(){
        return "Drs. H. Muhammad Hasbi, M.Sc";
    }

}