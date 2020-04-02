class Orang{
	String name;
	int age;
	boolean isMale;

		public int getAge(){
			return this.age;
		}
		public void setAge (int age){
			this.age = age;
		}
		public String getName(){
			return name;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getgender(){
			if (isMale){
				return("Male");
			}
			return("Female");
		}
		public void setGender(boolean isMale){
			this.isMale = isMale;
		}
	} 