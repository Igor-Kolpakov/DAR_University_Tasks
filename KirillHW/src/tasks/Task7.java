package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    /*7. Вычислите стоимость товара с учетом скидки.
         Пользователь вводит цену товара в виде двух целых чисел через пробел (рубли копейки).
         В следующей строке он вводит размер скидки в процентах (также целое число).
         Цену нужно вывести так, как показано в тесте.
         Учтите, что здесь не применяется округление по правилам математики.
         Стоимость товара всегда учитывается в большую сторону.
         При выводе число рублей и копеек выводится в двух позициях (т.е. 00 коп., если копеек нет)

         Тестовые данные
         Sample Input 1:
         57 86
         15
         Sample Output 1:
         49 руб. 19 коп.
         Sample Input 2:
         67 50
         20
         Sample Output 2:
         54 руб. 00 коп.
     */

    private int rubles;
    private int kopeyki;
    private int discount;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цену товара: ");
        rubles = in.nextInt();
        kopeyki = in.nextInt();
        System.out.print("Введите вашу скидку:");
        discount = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. Ввод данных");
        System.out.println("2. Вывод конченой цены");
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

    private void priceConverter() {
        converter();
        int price = 0;
        price = rubles + (kopeyki/100);
        price = price * (discount/100);
        System.out.print(price);
    }

    public void task7Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { priceConverter(); }
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
