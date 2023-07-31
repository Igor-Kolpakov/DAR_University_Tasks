package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1And7 implements SimilarInputInfo{
    /*
    1) Напишите программу для вывода суммы, умножения, вычитания, деления и остатка двух чисел
    7) Напишите программу для суммирования значений массива
     */

    private int[] numArr;

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. Введите данные для операций");
        System.out.println("2. Операция сложения");
        System.out.println("3. Операция вычитания");
        System.out.println("4. Операция умножения");
        System.out.println("5. Операция деления");
        System.out.println("6. Операция остатка от чисел");
        System.out.println("7. Выход из программы");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void numArrInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество цифр в массиве: ");
        int arrLength = in.nextInt();
        numArr = new int[arrLength];
        System.out.println("Вводите числа: ");
        for (int i = 0; i < arrLength; i++) {
            numArr[i] = in.nextInt();
        }
    }

    private void sumOfNumsInArr () {
        int sumOfNums = 0;
        for (int nums : numArr) {
            sumOfNums +=nums;
        }
        System.out.println(sumOfNums);
    }

    private void subtractionOfArr () {
        int subtractionOfNums = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            subtractionOfNums -= numArr[i];
        }
        System.out.println(subtractionOfNums);
    }

    private void multiplicationOfNumsArr () {
        int multiplicationOfNums = 1;
        for (int nums : numArr) {
            multiplicationOfNums *= nums;
        }
        System.out.println(multiplicationOfNums);
    }

    private void segmentationOfNumsArr () {
        double segmentationNums = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            segmentationNums /= numArr[i];
        }
        System.out.println(segmentationNums);
    }

    private void remainderOfNumsArray () {
        int remainder = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            remainder %= numArr[i];
        }
        System.out.println(remainder);
    }

    public void task1Calculation () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { numArrInput(); }
                    case (2) -> { sumOfNumsInArr(); }
                    case (3) -> { subtractionOfArr(); }
                    case (4) -> { multiplicationOfNumsArr(); }
                    case (5) -> { segmentationOfNumsArr(); }
                    case (6) -> { remainderOfNumsArray(); }
                    case (7) -> { close = true; }
                 }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }
    }
}
