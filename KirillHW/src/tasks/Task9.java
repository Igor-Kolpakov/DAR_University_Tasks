package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task9 {

    /*9. Ввести значение вещественного аргумента, a и вычислить значения двух функций:

         z = 2*sin^2(3*Pi - 2*a) * cos^2(5*Pi + 2*a)
         y = 1/4-1/4*sin(5/2*Pi - 8*a)

         Вывести на консоль сначала z, а потом y, разделив их пробелом. Значения представить с пятью знаками после десятичной точки.
     */

    private final double Pi = 3.14;
    private double a;
    private double y;
    private double z;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вещественный аргумент a: ");
        a = in.nextDouble();
    }

    private void optionsInfoOutput() {
        System.out.println("1. Ввод данных");
        System.out.println("2. Вывод результатов функций - z = 2*sin^2(3*Pi - 2*a) * cos^2(5*Pi + 2*a) и y = 1/4-1/4*sin(5/2*Pi - 8*a)");
        System.out.println("3. Выход из задачи");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void functionCalculation () {
        z = 2 * (Math.pow(Math.sin((3 * Pi) - (2 * a)), 2)) * (Math.pow(Math.cos((5 * Pi) + (2 * a)), 2));
        y = (1 / 4) - ((1 * Math.sin(((5 * Pi)/2) - (8 * a)))/4);
        System.out.printf("Функция z равна: %.4f" , z);
        System.out.print(" ");
        System.out.printf("Функция y равна: %.4f", y);
    }

    public void task9Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { functionCalculation(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Некорректный ввод, в Java числа с дробным остатком вводятся в консоли через запятую :)");
                System.out.println("***********************************");
            }
        }
    }
}
