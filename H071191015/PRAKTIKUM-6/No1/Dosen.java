package No1;

public class Dosen extends Pegawai{
    private int sks;

    Dosen(String name, int sks) {
        super(name);
        this.sks = sks;
    }

    @Override
    public int getSalary() {
        int a = super.getSalary()+(sks*120000);
        return a;
    }

}