package Nomor2;

public class Anggota {
    private String nim,nama,prodi;
    public String jabatan;

    public Anggota () {

    }

    public Anggota(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setJabatan(int key){
        jabatan = null;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void showStatus(){
        System.out.println("===================================");
        System.out.println("NIM     : " + getNim());
        System.out.println("Nama    : " + getNama());
        System.out.println("Prodi   : " + getProdi());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("===================================");
    }
}