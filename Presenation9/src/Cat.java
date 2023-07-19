public class Cat extends Animal implements Runnable, Swimmable {
    private String name = " отик";

    @Override
    public void animalSound1() {
        System.out.println(" отик говорит: ћ€у-м€у");
    }

    @Override
    public void animalSound() {
        System.out.println(" отик говорит: ћ€у-м€у");
    }


    public void sleep() {
        System.out.println("Zzzzzz");
    }

    public void run(int speed) {
        System.out.println("Ѕежит со скоростью: " + speed);
    }

    public void swim() {
        System.out.println(" отик умеет плавать!");
    }
}
