public class LogikaKomputer extends MataKuliah{
    LogikaKomputer(){
        name = "Logika Komputer";
        sks = 3;
    }
    @Override
    public void dosenKelas(char i) {
        super.dosenKelas(i);
        switch (i) {
            case 'A':
                dosen = "Nirwan Ilyas";
                break;
            case 'B':
                dosen = "Andi Muhammad Anwar";
                break;
            default:
                break;
        }
    }
}