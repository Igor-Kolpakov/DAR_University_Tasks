package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 implements SimilarInputInfo{
    //3) �������� ���������, ����� �������� ������� ��� ����������
    private int[] shuffleNumArr; // 3-��

    private int keyInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ����������: ");
        int key = in.nextInt();
        return key;
    }

    private void shuffleNumArrInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���������� ���� � �������: ");
        int arrLength = in.nextInt();
        shuffleNumArr = new int[arrLength];
        System.out.println("������� �����: ");
        for (int i = 0; i < arrLength; i++) {
            shuffleNumArr[i] = in.nextInt();
        }
    }

    private void shuffleNumArrNumsInFormula () {
        int sum = shuffleNumArr[keyInput()] + shuffleNumArr[keyInput()];
        System.out.println(sum);
    }

    public void task3Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { shuffleNumArrInput(); }
                    case (2) -> { shuffleNumArrNumsInFormula(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("�������������� ������ �����");
                System.out.println("***********************************");
            }
        }
    }

    @Override
    public void optionsInfoOutput() {

    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }
}
