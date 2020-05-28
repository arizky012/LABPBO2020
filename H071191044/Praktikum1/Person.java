
public class Person {
	String name;
	int age;
	boolean isMale;
	
	void setAge(int umur) {age= umur;}
	void setName(String nama) {name= nama;}
	void setGender(boolean isMale) {this.isMale= isMale; }
	
	int getAge() {return age;}
	String getName() {return name;}
	String getGender() {return isMale==true? "Male" : "Female";}
	
//	public static void main(String [] args){
//		Person a= new Person();
//		a.setName("Yusuf");
//		a.setAge(19);
//		a.setGender(true);
//		System.out.println(a.getAge());
//		System.out.println(a.getName());
//		System.out.println(a.getGender());
	
//	}
}
