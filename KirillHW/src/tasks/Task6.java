package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    /*6. На вход программы подается размер интервала времени в секундах.
         Переведите это в часы, минуты и секунды и выведите согласно примеру теста.

         Тестовые данные
         Sample Input: 20367
         Sample Output:
         5 часов 39 минут 27 секунд

     */

    private int seconds;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите секунды: ");
        seconds = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. Ввод данных");
        System.out.println("2. Вывод результатов конвертации времени");
        System.out.println("3. Выход из задачи");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void timeConverter() {
        int minutes = 0;
        int hours = 0;
        int newSeconds = 0;
        newSeconds = seconds%60;
        minutes = (seconds / 60) - ((seconds/3600) * 60);
        hours = seconds / 3600;
        System.out.print(hours + "ч." + minutes + "мин." + newSeconds + "сек.");
    }

    public void task6Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { timeConverter(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Некорректный ввод :), попробуй снова");
                System.out.println("***********************************");
            }
        }
    }
}
