package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4And8 implements SimilarInputInfo{
    //4) Напишите программу, которая принимает от пользователя три числа и выводит наибольшее из них
    //8) Напишите программу для нахождения второго по величине числа из массива
    private int[] maxFromNumArr;

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. Введите данные для операций");
        System.out.println("2. Показать Максимальные элементы");
        System.out.println("3. Выход из задания");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void maxFromNumArrInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество цифр в массиве: ");
        int arrLength = in.nextInt();
        maxFromNumArr = new int[arrLength];
        System.out.println("Вводите числа: ");
        for (int i = 0; i < arrLength; i++) {
            maxFromNumArr[i] = in.nextInt();
        }
    }

    private void maxNumbersOutput () {
        int max = -1000;
        int max2 = -1000;
        for (int i = 0; i < maxFromNumArr.length; i++) {
            max = Math.max(maxFromNumArr[i], max);
        }
        for (int j = 0; j < maxFromNumArr.length; j++) {
            if (max > maxFromNumArr[j] && maxFromNumArr[j] > max2) {
                max2 = Math.max(maxFromNumArr[j], max2);
            }
        }
        System.out.println("Наибольший элемент = " + max);
        System.out.println("Второй наибольший элемент = " + max2);
    }

    public void task4And8MaxNumbersFromArray () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { maxFromNumArrInput(); }
                    case (2) -> { maxNumbersOutput(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }
    }
}
