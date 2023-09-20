package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

    /*6. �� ���� ��������� �������� ������ ��������� ������� � ��������.
         ���������� ��� � ����, ������ � ������� � �������� �������� ������� �����.

         �������� ������
         Sample Input: 20367
         Sample Output:
         5 ����� 39 ����� 27 ������

     */

    private int seconds;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������: ");
        seconds = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. ���� ������");
        System.out.println("2. ����� ����������� ����������� �������");
        System.out.println("3. ����� �� ������");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void timeConverter() {
        int minutes = 0;
        int hours = 0;
        int newSeconds = 0;
        newSeconds = seconds%60;
        minutes = (seconds / 60) - ((seconds/3600) * 60);
        hours = seconds / 3600;
        System.out.print(hours + "�." + minutes + "���." + newSeconds + "���.");
    }

    public void task6Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { timeConverter(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("������������ ���� :), �������� �����");
                System.out.println("***********************************");
            }
        }
    }
}
