package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task5 implements SimilarInputInfo{
    //5) �������� ��������� ��� �������� ����, �������� �� ����� ������������� ��� �������������
    private int[] positiveOrNegativeCheckNumArr;

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. ������� ������ ��� ��������");
        System.out.println("2. �������� ������������� � ������������� ��������");
        System.out.println("3. ����� �� �������");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void positiveOrNegativeCheckNumArrInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���������� ���� � �������: ");
        int arrLength = in.nextInt();
        positiveOrNegativeCheckNumArr = new int[arrLength];
        System.out.println("������� �����: ");
        for (int i = 0; i < arrLength; i++) {
            positiveOrNegativeCheckNumArr[i] = in.nextInt();
        }
    }

    private void positiveOrNegativeCheck () {
        for (int nums : positiveOrNegativeCheckNumArr) {
            if (nums > 0) {
                System.out.println(nums + " - " + "�������������" );
            } else {
                System.out.println(nums + " - " + "�������������");
            }
        }
    }

    public void task5NegativeAndPositiveOutput () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { positiveOrNegativeCheckNumArrInput(); }
                    case (2) -> { positiveOrNegativeCheck(); }
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
