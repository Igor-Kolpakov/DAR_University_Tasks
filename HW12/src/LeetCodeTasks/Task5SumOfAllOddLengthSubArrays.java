package LeetCodeTasks;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5SumOfAllOddLengthSubArrays implements SimilarInputInfo{
    /*  https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
        Given an array of positive integer's arr, return the sum of all possible odd-length subArrays of arr.
        A subarray is a contiguous subsequence of the array.
    */
    //private int[] arr;
    //private int n;       потом как-нибудь придумаю пользовательский ввод =)
    //private int r;
    private int endSum;

    private int sumOfOneElements;
    private int sumOfFiveElements;
    private int sumOfThreeElements;

    /*
    public void arrInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество цифр в массиве: ");
        int arrLength = in.nextInt();
        arr = new int[arrLength];
        System.out.println("Вводите числа: ");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = in.nextInt();
        }
    } */

    private ArrayList<int[]> generate(int n, int r) {
        ArrayList<int[]> combinations = new ArrayList<>();
        int[] combination = new int[r];
        for (int i = 0; i < r; i++) {
            combination[i] = i;
        }
        while (combination[r - 1] < n) {
            combinations.add(combination.clone());
            int t = r - 1;
            while (t != 0 && combination[t] == n - r + t) {
                t--;
            }
            combination[t]++;
            for (int i = t + 1; i < r; i++) {
                combination[i] = combination[i - 1] + 1;
            }
        }
        return combinations;
    }

    private void givenSetAndSelectionSize_whenCalculatedUsingIterativeAlgorithm_thenExpectedCount() {
        Task5SumOfAllOddLengthSubArrays generator = new Task5SumOfAllOddLengthSubArrays();
        ArrayList<int[]> selectionWithOneElement = generator.generate(5, 1);
        for (int [] subArrays : selectionWithOneElement) {
            for (int elem : subArrays) {
                sumOfOneElements+=elem;
            }
        }
        //System.out.println(sumOfOneElements);

        ArrayList<int[]> selectionWithThreeElement = generator.generate(5, 3);
        for (int [] subArrays : selectionWithThreeElement) {
            for (int elem : subArrays) {
                sumOfThreeElements+=elem;
            }
        }
        //System.out.println(sumOfThreeElements);

        ArrayList<int[]> selectionWithFiveElement = generator.generate(5, 5);
        for (int [] subArrays : selectionWithFiveElement) {
            for (int elem : subArrays) {
                sumOfFiveElements+=elem;
            }
        }
        //System.out.println(sumOfFiveElements);
        endSum = sumOfOneElements + sumOfThreeElements + sumOfFiveElements;
        System.out.println("Сумма элементов всех нечетных под массивов" + endSum);
    }

    @Override
    public void optionsInfoOutput() {
            System.out.println("1. Показать сумму всех элементов нечетных под массивов");
            System.out.println("2. Выход из программы");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    public void task5SumOutputConsole () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                case (1) -> { givenSetAndSelectionSize_whenCalculatedUsingIterativeAlgorithm_thenExpectedCount(); }
                case (6) -> { close = true; }
                }
            }  catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }
    }
}
