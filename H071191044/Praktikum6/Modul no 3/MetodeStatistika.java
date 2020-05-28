public class MetodeStatistika extends MataKuliah{
    MetodeStatistika(){
        name = "Metode Statistika";
        sks = 3;
    }
    @Override
    public void dosenKelas(char i) {
        super.dosenKelas(i);
        switch (i) {
            case 'A':
                dosen = "Bu Titi";
                break;
            case 'B':
                dosen = "Nasrah Sirajang";
                break;
            default:
                break;
        }
    }
}