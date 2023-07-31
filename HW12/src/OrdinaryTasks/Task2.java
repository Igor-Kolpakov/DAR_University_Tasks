package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 implements SimilarInputInfo{
    //2) �������� ��������� ��� ������ �������� ����� �� 1 �� 20

    private int[] oddNumArr = new int[20];

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. ������� �������� ����� � ������� �� 1 �� 20");
        System.out.println("2. ����� �� ���������");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void oddNumOutput() {
        for (int i = 0; i < oddNumArr.length; i++) {
            oddNumArr[i] = i + 1;
            if (oddNumArr[i] % 2 != 0) {
                System.out.println(oddNumArr[i] + " - " + "�������� ");
            }
        }
    }

    public void task2OddNumConsole () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { oddNumOutput(); }
                    case (2) -> { close = true; }
                 }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("�������������� ������ �����");
                System.out.println("***********************************");
            }
        }
    }

}
