package tasks;

import java.util.*;

public class Task5 {

    /*5. � ������ �������� 3 ����������, ������� �������� ���������� ����� � ������.
         ��������� ����������, �� ������� �������� ������ ������������������� �� ��� ���������� �� ������ ������������������.
         ������������ ������ ��� ����� ����� (��� �������� � ������). ��������� ������� �������� ������� � ������.

         ����������� ��������� ��������!

         �������� ������
         Sample Input: 6000 12000 10500
         Sample Output: 6000
     */

    private final int numOne = 6000;
    private final int numTwo = 12000;
    private final int numThree = 10500;
    private int numWithInputOne;
    private int numWithInputTwo;
    private int numWithInputThree;

    private int[] numArray;
    private Integer[] objectNumArr;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        numWithInputOne = in.nextInt();
        System.out.print("������� ������ �����: ");
        numWithInputTwo = in.nextInt();
        System.out.print("������� �������: ");
        numWithInputThree = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. ������� ������� �� ���������� �������");
        System.out.println("2. ���� ������� �����������");
        System.out.println("3. ���� ������� ��� n �����������");
        System.out.println("4. ���� ������� ��� n ����������� � ������ Integer");
        System.out.println("5. ����� ����������� �������� ��� ������� ������");
        System.out.println("6. ����� ����������� �������� ��� �������� ������");
        System.out.println("7. ����� ����������� �������� ��� �������� ������ ��� ������������� ������ Math");
        System.out.println("8. ����� ����������� �������� � ���������");
        System.out.println("9. ����� �� ������");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void numArrayFill() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���-�� �������: ");
        int n = in.nextInt();
        numArray = new int[n];
        System.out.println("������� �������� �����������: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextInt();
        }
    }

    private void objectNumArrayFill() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���-�� �������: ");
        int n = in.nextInt();
        objectNumArr = new Integer[n];
        System.out.println("������� �������� �����������: ");
        for (int i = 0; i < n; i++) {
            objectNumArr[i] = in.nextInt();
        }
    }

    private void numArrayOutput() {
        for (int num : numArray) {
            System.out.print(num + " ");
        }
    }

    private void minimalNumSearch() {
        int minNum;
        minNum=Math.min(Math.min(numOne, numTwo), numThree);
        System.out.print("����������� �����: " + minNum);
    }

    private void minimalNumSearchInInputNums() {
        int minNum;
        minNum=Math.min(Math.min(numWithInputOne, numWithInputTwo), numWithInputThree);
        System.out.print("����������� �����: " + minNum);
    }

    private void minimalNumSearchInNumArray () {
        int minNum = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int k = 0; k < i; k++) {
                minNum=Math.min(numArray[k], numArray[i]);
            }
        }
        System.out.print("����������� �����: " + minNum);
    }

    private void minimalNumSearchInNumArrayWithoutMathClass () {
        int minNum = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
                if (numArray[i] < minNum) {
                   minNum = numArray[i];
                }
        }
        System.out.print("����������� �����: " + minNum);
    }

    private void minimalNumSearchInList () {
        List<Integer> ints = Arrays.asList(objectNumArr);
        System.out.print("����������� �������: " + Collections.min(ints));
    }

    public void task5Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { minimalNumSearch(); }
                    case (2) -> { dataInput(); }
                    case (3) -> { numArrayFill(); }
                    case (4) -> { objectNumArrayFill(); }
                    case (5) -> { minimalNumSearchInInputNums(); }
                    case (6) -> { minimalNumSearchInNumArray(); }
                    case (7) -> { minimalNumSearchInNumArrayWithoutMathClass(); }
                    case (8) -> { minimalNumSearchInList(); }
                    case (9) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("������������ ���� :), �������� �����");
                System.out.println("***********************************");
            }
        }
    }

}
