class Person {

    private String name;
    private int age;
    private boolean isMale;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(boolean isMale) {
        if (isMale) {
            this.isMale = true;
        } else {
            this.isMale = false;
        }

    }

    public String getGender() {
        return isMale ? "Male" : "Female";

    }

    public void desc() {
        System.out.println("Name   : " + getName());
        System.out.println("Age    : " + getAge());
        System.out.println("Gender : " + getGender());
        System.out.println();
    }

}