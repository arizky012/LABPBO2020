package No1;

public class Pegawai {

    private int salary = 2500000;
    private String name;

    Pegawai(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getSalary(){
        return salary;
    }

    public void showSalary(){
        System.out.printf("%s mendapatkan gaji Rp. %d\n", getName(), getSalary());
    }
}



