package app;

public class Pegawai {
 
    Integer gaji = 2500000;
    String nama;

    Pegawai(String nama) {
        this.nama = nama;
    }
    
    public void showGaji() {
        System.out.printf("%s mendapatkan gaji Rp.%d\n", nama, gaji);
    }

    public void gajiPegawai(Integer gTambahan) {
        
    }    
}