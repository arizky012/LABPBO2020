public class MainPerson {

    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        p.setName("Koko");
        p.setAge(17);
        p.setGender(true);

        p2.setName("Cici");
        p2.setAge(15);
        p2.setGender(false);

        p.desc();
        p2.desc();
    }
}