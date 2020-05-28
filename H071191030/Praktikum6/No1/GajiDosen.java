class GajiDosen extends GajiPegawai {

    private int sks;
    
    public GajiDosen(int sks) {
        this.sks = sks;
    }


    public int getSalary() {

        int extraSal = sks * 120000;

        return 2500000 + extraSal;

    }

}