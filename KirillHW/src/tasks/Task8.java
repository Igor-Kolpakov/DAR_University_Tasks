package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task8 {

    /*8. �������� ���������, ������� ��������� �������� �������: f(x) = ln(x + 7 * sqrt(x^4 + Pi))
         ��� ������ �������� ������� ����������� � �������� ������� ����� ���������� �����.
     */

    private double function;
    private double x;
    private final double Pi = 3.14;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������������ �������� x: ");
        x = in.nextDouble();
    }

    private void optionsInfoOutput() {
        System.out.println("1. ���� ������");
        System.out.println("2. ����� ���������� ������� - f(x) = ln(x + 7 * sqrt(x^4 + Pi))");
        System.out.println("3. ����� �� ������");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void functionCalculation() {
        function = Math.log10((x + 7) * (Math.sqrt(Math.pow(x, 4) + Pi)));
        System.out.printf("F(x) = %.4f", function);
    }

    public void task8Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { dataInput(); }
                    case (2) -> { functionCalculation(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("������������ ����, � Java ����� � ������� �������� �������� � ������� ����� ������� :)");
                System.out.println("***********************************");
            }
        }
    }
}
