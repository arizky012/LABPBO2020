class Biodata{
	String name, adress, prodi, fakultas;
	int age;
	boolean isMale;

	public String getName(String name){
		return name;
	}
	public String getAdress(String adress){
		return adress;
	}
	public String getProdi(String prodi){
		return prodi;
	}
	public String getFakultas(String fakultas){
		return fakultas;
	}
	public void getAge(int age){
		this.age = age;
	}
	public String getGender(){
		if (isMale){
			return ("Male");
		}
			return("female");
		}
	public void setGender(boolean isMale){
		this.isMale = isMale;
	}
}