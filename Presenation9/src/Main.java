public class Main {
    public static void main (String[] args) {
        //Scaner in = new Scaner(System.in);
        Person myPerson = new Person("Мария");
        System.out.println(myPerson.getName());
        myPerson.setName("Алиса");
        System.out.println(myPerson);


    }
}
