public class Dog extends Animal {
    private String name = "Собачка";

    @Override
    public void animalSound1() {
        System.out.println("Собачка говорит: Гав-гав");
    }

    @Override
    public void animalSound() {
        System.out.println("Собачка говорит: Гав-гав");
    }
}
