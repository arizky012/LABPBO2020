package app;

public class Dosen extends Pegawai {
 
    Dosen(String nama) {
        super(nama);
    }
    
    @Override
    public void gajiPegawai(Integer gTambahan) {
        gaji += gTambahan * 120000;
    }
}