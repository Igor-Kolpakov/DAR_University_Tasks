package tasks;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_3 {

    /*1. � ��������� ������ ������ � ��������� �����. �������� ���������� �� ������� ���, ��� �������� � �������.
         Sample Input:
         private String name = "������";
         private int age = 23;
         private double discount = 15.5;

         Sample Output:
         � ���� ��������, ������!
         ������� ��� 23!
         �� ����� ������ ��� ������ 15.5% �� ���� ����������� ������ �����!

     */


    private String name = "������";
    private int age = 23;
    private double discount = 15.5;

    private void ourEasyOutput() {
        System.out.println("� ���� ��������, " + name + "!");
        System.out.println("������� ��� " + age + "!");
        System.out.println("�� ����� ������ ��� ������ " + discount + "%" + " �� ���� ����������� ������ �����!");
    }

    private String name1;
    private int age1;
    private double discount1;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���� ���: ");
        name1 = in.next();
        System.out.print("������� ��� �������: ");
        age1 = in.nextInt();
        System.out.print("������� ���� ������: ");
        discount1 = in.nextDouble();
    }

    private void ourMiddleOutput() {
        System.out.println("� ���� ��������, " + name1 + "!");
        System.out.println("������� ��� " + age1 + "!");
        System.out.println("�� ����� ������ ��� ������ " + discount1 + "%" + " �� ���� ����������� ������ �����!");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void optionsInfoOutput() {
        System.out.println("1. ����� �������� �������");
        System.out.println("2. ���� ������ ��� ������� ���������");
        System.out.println("3. ����� ������� ���������");
        System.out.println("4. ����� �� ������");
    }

    public void task1Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { ourEasyOutput(); }
                    case (2) -> { dataInput(); }
                    case (3) -> { ourMiddleOutput(); }
                    case (4) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("������������ ���� :)");
                System.out.println("***********************************");
            }
        }
    }

}
