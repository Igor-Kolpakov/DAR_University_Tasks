import java.util.Scanner;

public interface InputDataInterface {
    //ввод номера операции
    static int optionInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите предпочтительный номер операции: ");
        int optionNumber = in.nextInt();
        return optionNumber;
    }

    static String contactNameAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите им€ контакта: ");
        String name = in.nextLine();
        return name;
    }

    static String contactNumberAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите номер телефона: ");
        String number = in.nextLine();
        return number;
    }

    static String colorAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите предпочтительный цвет: ");
        String color = in.nextLine();
        return color;
    }

    static String fruitAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите название фрукта: ");
        String fruit = in.nextLine();
        return fruit;
    }

    static String linkedListAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите предложение: ");
        String sentence = in.nextLine();
        return sentence;
    }

    static int indexNumberInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите число: ");
        int indexNumber = in.nextInt();
        return indexNumber;
    }

    static String gemsInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите название самоцвета: ");
        String gemsName = in.nextLine();
        return gemsName;
    }

    static String animal () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите название зверька: ");
        String animalName = in.nextLine();
        return animalName;
    }

    static String animalAction () {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите действие животного: ");
        String animalAction = in.nextLine();
        return animalAction;
    }
}
