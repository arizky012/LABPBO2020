class Person{
	String name;
	int age;
	boolean isMale;

		public String getAge(){
			this.age = age;
		}
		public void setAge (int age){
			this.age = age;
		}
		public String getName(){
			return name;
		}
		public void setName(String){
			this.name = name;
		}
		public String getgender(){
			if (isMale){
				return ("Male");
			}else {
				return("Female");
			}
		}
		public void setGender(String){
			this.isMale = isMale;
		}
	} 