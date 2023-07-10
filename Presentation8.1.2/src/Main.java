public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myAnimal1 = new Animal();

        System.out.println(myAnimal.name);
        System.out.println(myAnimal1.name);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 10;
        rectangle.y = 12;
        System.out.println(rectangle.x);
        System.out.println(rectangle.y);


        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 =new Rectangle();
        rectangle2.x = 12;
        System.out.println(rectangle1.x);
        System.out.println(rectangle2.y);

        Animal myAnimal2 = new Animal();
        myAnimal2.run();
        myAnimal2.run(20);


        Animal myAnimal3 = new Animal();
        System.out.printf("%s, цвет: %s, вес: %f кг", myAnimal3.name, myAnimal3.color, myAnimal3.weight);

        Animal myDog = new Animal("dog");
        Animal myCat = new Animal("cat", "White");
        Animal myFox = new Animal("Fox", "Redhead", 2.5);
        System.out.println(myDog.name);
        System.out.printf("%s, цвет: %s %n", myCat.name, myCat.color);
        System.out.printf("%s, цвет: %s, вес: %f кг", myFox.name, myFox.color, myFox.weight);
    }
}
