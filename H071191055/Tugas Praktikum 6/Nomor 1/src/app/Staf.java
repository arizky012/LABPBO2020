package app;

public class Staf extends Pegawai{
  
    Staf(String nama) {
        super(nama);
    }
    
    @Override
    public void gajiPegawai(Integer gTambahan) {
        gaji += gTambahan * 50000;
    }
}