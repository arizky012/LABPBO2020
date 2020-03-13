//Tgs Praktikum kls C No.1

import java.util.Arrays;

class Field {
    private int[] bambooHeight = new int[10];

    public Field(int[] arr) {
  
        bambooHeight = arr;

    }

    public void setBambooHeight(int m, int n) {
        bambooHeight[m] = n;

    }

    public int getBambooHeight(int indeks) {
        return bambooHeight[indeks];
    }

    public int[] getBambooHeight(){
        return bambooHeight;
    }
    
    public int getMinTall() {
        Arrays.sort(bambooHeight);
        int min = bambooHeight[0];

        return min;
    }

}