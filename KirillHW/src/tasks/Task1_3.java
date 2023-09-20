package tasks;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_3 {

    /*1. В программе заданы строка и несколько чисел. Выведите информацию на консоль так, как показано в примере.
         Sample Input:
         private String name = "Андрей";
         private int age = 23;
         private double discount = 15.5;

         Sample Output:
         С Днем рождения, Андрей!
         Сегодня Вам 23!
         По этому поводу Вам скидка 15.5% на весь ассортимент нашего сайта!

     */


    private String name = "Андрей";
    private int age = 23;
    private double discount = 15.5;

    private void ourEasyOutput() {
        System.out.println("С Днем рождения, " + name + "!");
        System.out.println("Сегодня Вам " + age + "!");
        System.out.println("По этому поводу Вам скидка " + discount + "%" + " на весь ассортимент нашего сайта!");
    }

    private String name1;
    private int age1;
    private double discount1;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        name1 = in.next();
        System.out.print("Введите ваш возраст: ");
        age1 = in.nextInt();
        System.out.print("Введите вашу скидку: ");
        discount1 = in.nextDouble();
    }

    private void ourMiddleOutput() {
        System.out.println("С Днем рождения, " + name1 + "!");
        System.out.println("Сегодня Вам " + age1 + "!");
        System.out.println("По этому поводу Вам скидка " + discount1 + "%" + " на весь ассортимент нашего сайта!");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void optionsInfoOutput() {
        System.out.println("1. Вывод простого решения");
        System.out.println("2. Ввод данных для решения посложнее");
        System.out.println("3. Вывод решения посложнее");
        System.out.println("4. Выход из задачи");
    }

    public void task1Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { ourEasyOutput(); }
                    case (2) -> { dataInput(); }
                    case (3) -> { ourMiddleOutput(); }
                    case (4) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Некорректный ввод :)");
                System.out.println("***********************************");
            }
        }
    }

}
