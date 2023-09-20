package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    /*4. ������������ ������ � ���������� �������� ����� � ������ � �������� (����� � ������� �������� � ������ ����������).
         ��������� ������ ���������������� ��������� ����� � ���������� �����.
         ��������, ���� ������������ ���� 22 � 978, �� ��������� ������ ������� 31 �. 78 �.

         �������� ������
         Sample Input:22 978

         Sample Output: 31 �. 78 �.
     */


    private int rubles;
    private int kopeyki;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �����: ");
        rubles = in.nextInt();
        System.out.print("������� �������: ");
        kopeyki = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. ���� ������");
        System.out.println("2. ��������� ����� ����������");
        System.out.println("3. ����� ������");
        System.out.println("4. ����� �� ������");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void converter() {
        if (kopeyki>0) {
            rubles += kopeyki/100;
            kopeyki%=100;
        }
        else {
            System.out.println("������ ���");
        }
    }

    private void output() {
        System.out.println("���� �����: " + rubles + " " + kopeyki);
    }

    public void task4Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { converter(); }
                    case (3) -> { output(); }
                    case (4) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("������������ ���� :), �������� �����");
                System.out.println("***********************************");
            }
        }
    }

}
