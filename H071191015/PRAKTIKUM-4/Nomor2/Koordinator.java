package Nomor2;

public class Koordinator extends Anggota {
    
    public Koordinator(){

    }

    public Koordinator(String nim, String nama, String prodi){
        super(nim, nama, prodi);
    }

    public void showKoordinatorStaff() {
        System.out.println("++ 4. Koordinator Bidang Hardware");
        System.out.println("++ 5. Koordinator Bidang Software");
        System.out.println("++ 6. Staff Administrasi");
    }

    @Override
    public void setJabatan(int a){
        if (a == 4) {
            this.jabatan = "Koordinator Bidang Hardware";
        } else if (a == 5) {
            this.jabatan = "Koordinator Bidang Software";
        } else if (a == 6) {
            this.jabatan = "Staff Administrasi";
        }
    }

}