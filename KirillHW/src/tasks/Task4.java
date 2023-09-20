package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    /*4. Пользователь вводит с клавиатуры денежную сумму в рублях и копейках (рубли и копейки вводятся в разные переменные).
         Программа должна откорректировать введенную сумму в правильную форму.
         Например, если пользователь ввел 22 и 978, то программа должна вывести 31 р. 78 к.

         Тестовые данные
         Sample Input:22 978

         Sample Output: 31 р. 78 к.
     */


    private int rubles;
    private int kopeyki;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите рубли: ");
        rubles = in.nextInt();
        System.out.print("Введите копейки: ");
        kopeyki = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. Ввод данных");
        System.out.println("2. Конвертер наших сбережений");
        System.out.println("3. Вывод данных");
        System.out.println("4. Выход из задачи");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void converter() {
        if (kopeyki>0) {
            rubles += kopeyki/100;
            kopeyki%=100;
        }
        else {
            System.out.println("Копеек нет");
        }
    }

    private void output() {
        System.out.println("Наша сумма: " + rubles + " " + kopeyki);
    }

    public void task4Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { converter(); }
                    case (3) -> { output(); }
                    case (4) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Некорректный ввод :), попробуй снова");
                System.out.println("***********************************");
            }
        }
    }

}
