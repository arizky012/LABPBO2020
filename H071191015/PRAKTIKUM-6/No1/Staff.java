package No1;

public class Staff extends Pegawai {
    private int jumlahKehadiran;

    Staff(String name, int jumlahKehadiran) {
        super(name);
        this.jumlahKehadiran = jumlahKehadiran;
    }

    @Override
    public int getSalary() {
       int a = super.getSalary()+(jumlahKehadiran*50000);
       return a;
    }

}