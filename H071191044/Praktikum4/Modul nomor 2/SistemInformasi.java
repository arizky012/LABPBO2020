import java.util.ArrayList;

public class SistemInformasi {
	protected ArrayList <String> informasi= new ArrayList<>();
	protected String user;
	
	void informasiDiberikan() {
		if(informasi.size()==0) {
			System.out.println("\n<== Informasi yang diberikan kepada "+user+" belum ada ==>");
		}else {
			System.out.println("\n<== Informasi yang diberikan kepada "+user+" ==>");
			
			for(int i=0; i<informasi.size(); i++) {
				System.out.println(" "+(i+1)+". "+informasi.get(i));
			}
		}
	}
}
