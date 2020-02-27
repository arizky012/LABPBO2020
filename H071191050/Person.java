public class Person{

        String name;
        int age;
        boolean isMale;

        public void setAge(int age) {
        this.age = age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setGender(boolean isMale){
            this.isMale = isMale;
        }

        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }

        public String getGender() {
            if (isMale == true){
                return "Male";
            }else {
                return "Female";
            }
        }

       
}

