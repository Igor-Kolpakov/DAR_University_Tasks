package LeetCodeTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3NumberOfStepsToReduceANumberToZero implements SimilarInputInfo{
    /*  https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
        Given an integer num, return the number of steps to reduce it to zero.
        In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
     */
    private int num;

    private int numInput () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше число");
        num = in.nextInt();
        return num;
    }

    private void positiveOperationNumCount () {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            counter++;
        }
        System.out.println(counter);
    }

    private void negativeOperationNumCount () {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num + 1;
            }
            counter++;
        }
        System.out.println(counter);
    }

    private void operationCheckForNumType () {
        if (num > 0) {
            positiveOperationNumCount();
        } else {
            negativeOperationNumCount();
        }
    }

    public void task3NumberOfStepsToReduceANumberToZeroConsole () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { numInput(); }
                    case (2) -> { operationCheckForNumType(); }
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
        System.out.println("1. Введите число");
        System.out.println("2. Узнать кол-во операций");
        System.out.println("3. Выход из программы");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }
}
