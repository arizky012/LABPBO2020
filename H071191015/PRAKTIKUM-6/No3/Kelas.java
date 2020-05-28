package No3;

public class Kelas extends SistemAkademik {
    String matkul,dosen;
    int sks;

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getDosen() {
        return dosen;
    }

    public int getSks() {
        return sks;
    }
    
    @Override
    public void isiData(){
        if (getMatkul().equals("Pemrograman Berorientasi Objek")) {
            sks = 3;
            dosen = "Supri Amir, ST. MS.i";
        } else if (getMatkul().equals("Matematika Dasar")) {
            sks = 3;
            dosen = "Diaraya M.Ak";
        } else if (getMatkul().equals("Logika Komputer")) {
            sks = 3;
            dosen = "Diaraya M.Ak";
        } else {
            System.out.println("Inputan Salah");
        }
        System.out.println("Mata Kuliah : " + getMatkul());
        System.out.println("SKS         : " + sks);
        System.out.println("Dosen       : " + dosen);
    }
}