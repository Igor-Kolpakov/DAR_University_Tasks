public class Animal {
    String name;
    String color;
    double weight;

    public Animal () {
        name = "Кот";
        color = "Серый";
        weight = 2.5;
    }

    public Animal (String name){
        this.name = name;
    }

    public Animal (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal (String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    public void run() {
        System.out.println("животное бежит");
    }

    public void run(int speed) {
        System.out.println("Животное бежит со скоростью: " + speed);
    }

}
