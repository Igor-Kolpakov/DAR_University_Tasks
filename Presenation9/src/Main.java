import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Person myPerson = new Person("Мария");
        System.out.println(myPerson.getName());
        myPerson.setName(" Алиса ");
        System.out.println(myPerson);

        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        Person myPerson1 = new Person(name, age);
        System.out.println(myPerson1);


        //Animal animal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        //animal.animalSound();
        myCat.animalSound();
        myCat.sleep();
        myCat.run(20);
        myCat.swim();
        myDog.animalSound();


        Outer myOuter = new Outer();
        Outer.Inner mInner = myOuter.new Inner();
        System.out.println(mInner.b + myOuter.a);

    }
}
