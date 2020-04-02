public class Coba{
	public static void main(String[] args) {
		
		Biodata biodata1 = new Biodata();
		biodata1.setName("Taufiq");
		biodata1.setAdress("Jl. Elektro Blok D/91");
		biodata1.setProdi("Ilmu Komputer");
		biodata1.setFakultas("FMIPA");
		biodata1.setAge(20);
		biodata1.setGender(true);

		System.out.println(biodata1.getName());
		System.out.println(biodata1.getAdress());
		System.out.println(biodata1.getProdi());
		System.out.println(biodata1.getFakultas());
		System.out.println(biodata1.getAge());
		System.out.println(biodata1.getGender());
	}


}