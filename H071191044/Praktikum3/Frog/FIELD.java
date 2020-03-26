public class FIELD {
	int [] tinggiBambu= new int [10];
	
	FIELD() {}
	FIELD(int arr[]) {
		
	}
	
	public void setTinggiBambu(int indeks, int data) {
		tinggiBambu[indeks]= data;
	}
	
	public int getTinggiBambu(int indeks) {
		return tinggiBambu[indeks];
	}
	
	public int getMinTall() {
		return 0;																								
	}
	
}
