
public class KoordDanStaff extends UKMDetails {

    String usg;

    public KoordDanStaff(String usg, String position,String name, String nim, String major, int batch){
        super(position, name, nim, major, batch);
        this.usg = usg;
    }


}