public class FROG {
	private String color;
	private int jump;
	private boolean run= true;
	
	FROG(){}
	
	FROG(String a, int b){
		color= a;
		jump= b;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean getRun(FIELD field) {
		return run;
	}

	public void getProses(FIELD field, int indeksFrog, int indeksField) {
		int ketinggian= Main.random.nextInt(11);
		if (jump + ketinggian > field.getTinggiBambu(indeksField)) System.out.println("Katak "+(indeksFrog+1)+" berwarna "+color+" berhasil melompati bambu setinggi "+field.getTinggiBambu(indeksField)+" dengan melompat setinggi "+ketinggian); 
		else{
			System.out.println("Katak "+(indeksFrog+1)+" berwarna "+color+" gagal melompati bambu");
			run= false;
		}
	}
	
	public boolean compare(FROG frog) {
		return true;
	}
	
	public int getMax(FROG frog[]) {
		return 0;
	}
	
}
