public class Presentation7 {

    static void printHelloWorld() {
        System.out.println("Привет, мир!");
    }

    static void printHello() {
        System.out.println("Привет, мир!");
    }

    static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    static void printHello(String name, int age) {
        System.out.println("Привет, " + name + "! Возраст:" + age);
    }


    static void printHelloPersonAndAge (String name, int age) {
        System.out.println("Привет, " + name + "! Возраст: " + age);
    }

    static String getHelloWorld() {
        return "Привет, мир!";
    }

    static int getSumOfTwoNums(int x, int y) {
        return x + y;
    }

    static double getSumOfTwoNums(double x, double y) {
        return x + y;
    }

    static float getSumOfTwoNums(float x, float y) {
        return x + y;
    }

    static void checkAge(int age) {
        if (age < 21) {
            System.out.println("Доступ запрещен!");
        } else {
            System.out.println("Доступ разрешен!");
        }
    }

    static int getSum(int x) {
        if (x > 0) {
            return x + getSum(x -1);
        } else {
            return 0;
        }
    }

    static int getSum1(int start, int end) {
        if (end > start) {
            return end + getSum1(start, end - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        printHelloWorld();
        printHello("Анна");
        printHello("Еркебулан");
        printHello("Айсулу");
        printHello();
        printHello("Денис");
        printHello("Айгуль", 24);
        printHelloPersonAndAge("Руслан", 25);
        printHelloPersonAndAge("Мария", 25);
        printHelloPersonAndAge("Азамат", 25);
        // вызов метода в println()
        System.out.println(getHelloWorld());
        //сохранение результата в strHelloWorld
        String strHelloWorld = getHelloWorld();
        //вывод результата
        System.out.println(strHelloWorld);

        int x = 2, y = 5;
        int sum = getSumOfTwoNums(x, y);
        System.out.println(x + "+" + y + "=" + sum);

        int age = 25;
        checkAge(age);

        System.out.println(getSumOfTwoNums(1, 2));
        System.out.println(getSumOfTwoNums(2.5, 8.2));
        System.out.println(getSumOfTwoNums(10f, 19.2f));


        int sum1 = getSum(10);
        System.out.println(sum1);

        int sum2 = getSum1(5, 10);
        System.out.println(sum2);
    }
}
