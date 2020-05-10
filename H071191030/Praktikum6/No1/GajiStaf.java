class GajiStaf extends GajiPegawai {
    
    private int attendance;
    
    public GajiStaf(int attendance) {
        this.attendance = attendance;
    }


    public int getSalary() {

        int extraSal = attendance * 50000;

        return 2500000 + extraSal;
    }
}
