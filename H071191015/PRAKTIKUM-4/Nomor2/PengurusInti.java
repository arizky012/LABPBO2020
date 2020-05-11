package Nomor2;

public class PengurusInti extends Anggota {
    
    public PengurusInti(){

    }

    public PengurusInti(String nim, String nama, String prodi){
        super(nim, nama, prodi);
    }

    public void showPengurusInti() {
        System.out.println("++ 1. Ketua");
        System.out.println("++ 2. Sekretaris");
        System.err.println("++ 3. Bendahara");
    }

    @Override
    public void setJabatan(int a){
        if (a == 1) {
            this.jabatan = "Ketua";
        } else if (a == 2) {
            this.jabatan = "Sekretaris";
        } else if (a == 3) {
            this.jabatan = "Bendahara";
        }
    }


}



