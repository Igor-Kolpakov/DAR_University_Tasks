package LeetCodeTasks;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Task2PalindromeNumber implements SimilarInputInfo{
    /*  https://leetcode.com/problems/palindrome-number/
        Given an integer x, return true if x is a palindrome, and false otherwise.
     */
    private int x;


    private int xInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���� �����");
        x = in.nextInt();
        return x;
    }

    private int reverseX () {
        int xForWhile = x;
        int reverseX = 0;
        while(xForWhile != 0) {
            int remainder = xForWhile % 10;
            reverseX = reverseX * 10 + remainder;
            xForWhile = xForWhile/10;
        }
        return reverseX;
    }

    private void checkForPalindrome () {
        if (x == reverseX()) {
            System.out.println("����� �������� �����������");
        } else {
            System.out.println("����� �� �������� �����������");
        }
    }

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. ������� �����");
        System.out.println("2. ������ �������� �� ���� ����� �����������");
        System.out.println("3. ����� �� ���������");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    public void task2PalindromeNumberConsole () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { xInput(); }
                    case (2) -> { checkForPalindrome();}
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("�������������� ������ �����");
                System.out.println("***********************************");
            }
        }
    }
}
