package app;

public class KHS_Mahasiswa {
    private String namaMh, NIM, kelas, namaMK;
    private double nUTS, nUAS, nilaiAkhir;
    private MataKuliahDB matkulDB = new MataKuliahDB();
    
    KHS_Mahasiswa(String namaMh, String NIM, String kelas, String namaMK, double nUTS, double nUAS) {
        this.namaMh = namaMh;
        this.NIM = NIM;
        this.kelas = kelas;
        this.namaMK = namaMK;
        this.nUTS = nUTS;
        this.nUAS = nUAS;
        nilaiAkhir = (nUTS + nUAS)/2;
    }

    public String getNilaiMutu(double nilaiAkhir) {
        if (nilaiAkhir >= 85) {
            return "A";
        } else if (nilaiAkhir >= 80) {
            return "A-";
        } else if (nilaiAkhir >= 75) {
            return "B+";
        } else if (nilaiAkhir >= 70) {
            return "B";
        } else if (nilaiAkhir >= 65) {
            return "B-";
        } else if (nilaiAkhir >= 60) {
            return "C+";
        } else if (nilaiAkhir >= 55) {
            return "C";
        } else if (nilaiAkhir >= 50) {
            return "C-";
        } else if (nilaiAkhir >= 40) {
            return "D";
        } else if (nilaiAkhir < 40) {
            return "E";
        }
        return null;
    }

    public void show() {
        System.out.print("Sistem Akademik\n" +
                         "-----------------------------------------\n");
        System.out.println("NIM         : " + NIM);
        System.out.println("Nama        : " + namaMh);
        System.out.println("Mata Kuliah : " + namaMK);
        System.out.println("Kelas       : " + kelas);
        System.out.println("SKS         : " + matkulDB.getSKS(namaMK));
        System.out.println("Dosen       : " + matkulDB.getDosen(namaMK));
        System.out.println("Nilai UTS   : " + nUTS);
        System.out.println("Nilai UAS   : " + nUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Angka Mutu  : " + getNilaiMutu(nilaiAkhir));
        System.out.println("-----------------------------------------");
        
    }
}