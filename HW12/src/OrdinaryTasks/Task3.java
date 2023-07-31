package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 implements SimilarInputInfo{
    //3) Напишите программу, чтобы поменять местами две переменные
    private int[] shuffleNumArr; // 3-ая

    private int keyInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер переменной: ");
        int key = in.nextInt();
        return key;
    }

    private void shuffleNumArrInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество цифр в массиве: ");
        int arrLength = in.nextInt();
        shuffleNumArr = new int[arrLength];
        System.out.println("Вводите числа: ");
        for (int i = 0; i < arrLength; i++) {
            shuffleNumArr[i] = in.nextInt();
        }
    }

    private void shuffleNumArrNumsInFormula () {
        int sum = shuffleNumArr[keyInput()] + shuffleNumArr[keyInput()];
        System.out.println(sum);
    }

    public void task3Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { shuffleNumArrInput(); }
                    case (2) -> { shuffleNumArrNumsInFormula(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }
    }

    @Override
    public void optionsInfoOutput() {

    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }
}
