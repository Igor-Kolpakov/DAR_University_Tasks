package LeetCodeTasks;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1ShuffleString implements SimilarInputInfo{
    /*  https://leetcode.com/problems/shuffle-string/
        You are given a string s and an integer array indices of the same length.
        The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
        Return the shuffled string.
     */
    private String s = "codeleet";
    private int[] indices = {4,5,6,7,0,2,1,3};

    private HashMap<Integer, String> shuffleStringMap = new HashMap<>();

    private void shuffle() {
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            shuffleStringMap.put(indices[i], String.valueOf(s.charAt(i)));
        }
        for (String letters : shuffleStringMap.values()) {
            newS+=letters;
        }
        System.out.println(newS);
    }

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. Сортировка данной нам строки");
        System.out.println("3. Выход из задания");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    public void leetCodeTask1Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { shuffle(); }
                    case (2) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }
    }
}
