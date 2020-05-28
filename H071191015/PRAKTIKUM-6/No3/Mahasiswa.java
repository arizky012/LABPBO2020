package No3;

public class Mahasiswa extends SistemAkademik {
    private String nim,nama;

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void isiData(){
        System.out.println("Nim         : " + nim);
        System.out.println("Nama        : " + nama);
    }
}