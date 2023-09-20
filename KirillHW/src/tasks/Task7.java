package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {

    /*7. ��������� ��������� ������ � ������ ������.
         ������������ ������ ���� ������ � ���� ���� ����� ����� ����� ������ (����� �������).
         � ��������� ������ �� ������ ������ ������ � ��������� (����� ����� �����).
         ���� ����� ������� ���, ��� �������� � �����.
         ������, ��� ����� �� ����������� ���������� �� �������� ����������.
         ��������� ������ ������ ����������� � ������� �������.
         ��� ������ ����� ������ � ������ ��������� � ���� �������� (�.�. 00 ���., ���� ������ ���)

         �������� ������
         Sample Input 1:
         57 86
         15
         Sample Output 1:
         49 ���. 19 ���.
         Sample Input 2:
         67 50
         20
         Sample Output 2:
         54 ���. 00 ���.
     */

    private int rubles;
    private int kopeyki;
    private int discount;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���� ������: ");
        rubles = in.nextInt();
        kopeyki = in.nextInt();
        System.out.print("������� ���� ������:");
        discount = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. ���� ������");
        System.out.println("2. ����� �������� ����");
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

    private void priceConverter() {
        converter();
        int price = 0;
        price = rubles + (kopeyki/100);
        price = price * (discount/100);
        System.out.print(price);
    }

    public void task7Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { priceConverter(); }
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
