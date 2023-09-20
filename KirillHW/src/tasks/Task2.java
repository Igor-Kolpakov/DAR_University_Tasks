package tasks;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    /*2. �������� ���������, ������� ������� ����� ���� ����� �����.

         �������� ������
         Sample Input: 8 11
         Sample Output: 19
     */


    private final int numOne = 8;
    private final int numTwo = 11;

    private void easySumCalculationNumberOne() {
        System.out.println("����� �����: " + (numOne + numTwo));
    }

    private void easySumCalculationNumberTwo() {
        int sum;
        sum = numOne + numTwo;
        System.out.println("����� �����: " + sum);
    }

    private int numOne1;
    private int numTwo1;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ����� ����: ");
        numOne1 = in.nextInt();
        System.out.print("������� ����� ����� ���: ");
        numTwo1 = in.nextInt();
    }

    private void inputSumCalculationNumberOne() {
        int sum;
        sum = numOne1 + numTwo1;
        System.out.println("���� �����: " + sum);
    }

    private void optionsInfoOutput() {
        System.out.println("1. ����� �������� ������� �1");
        System.out.println("2. ����� �������� ������� �2");
        System.out.println("3. ���� ������ ��� ������� ���������");
        System.out.println("4. ����� ������� ���������");
        System.out.println("5. ����� �� ������");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    public void task2Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { easySumCalculationNumberOne(); }
                    case (2) -> { easySumCalculationNumberTwo(); }
                    case (3) -> { dataInput(); }
                    case (4) -> { inputSumCalculationNumberOne(); }
                    case (5) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("������������ ���� :)");
                System.out.println("***********************************");
            }
        }
    }

}
