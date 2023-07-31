package LeetCodeTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4CheckIfTwoStringArraysAreEquivalent implements SimilarInputInfo{
    /*  https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
        Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
        A string is represented by an array if the array elements concatenated in order forms the string.
    */
    private int arrayLength;

    private String[] word1;
    private String[] word2;

    private void word1Input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество слогов в слове 1: ");
        arrayLength = in.nextInt();
        word1 = new String[arrayLength];
        System.out.println("Вводите слоги: ");
        for (int i = 0; i < arrayLength; i++) {
            word1[i] = in.next();
        }
    }

    private void word1Output () {
        for (String sentence : word1) {
            System.out.println(sentence);
        }
    }

    private void word2Input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество слогов в слове 2: ");
        arrayLength = in.nextInt();
        word2 = new String[arrayLength];
        System.out.println("Вводите слоги: ");
        for (int i = 0; i < arrayLength; i++) {
            word2[i] = in.next();
        }
    }

    private void word2Output () {
        for (String sentence : word2) {
            System.out.println(sentence);
        }
    }

    private void wordsConcatenationAndEqualing () {
        String endWord1 = "";
        String endWord2 = "";
        for (String word : word1) {
            endWord1+=word;
        }
        for (String word : word2) {
            endWord2+=word;
        }
        if (endWord1.equals(endWord2)) {
            System.out.println("Слова одинаковы");
        } else {
            System.out.println("Слова разные");
        }
    }

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. Введите слогов в первом слове");
        System.out.println("2. Вывод слогов первого слова");
        System.out.println("3. Введите слогов в втором слове");
        System.out.println("4. Вывод слогов второго слова");
        System.out.println("5. Сравнение слов и вывод результата");
        System.out.println("6. Выход из программы");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    public void task4ConcatenationOfWordsConsole () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { word1Input(); }
                    case (2) -> { word1Output(); }
                    case (3) -> { word2Input(); }
                    case (4) -> { word2Output(); }
                    case (5) -> { wordsConcatenationAndEqualing(); }
                    case (6) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }
    }
}
