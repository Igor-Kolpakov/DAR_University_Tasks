import java.util.Scanner;

public class FirstTask {
    /*1. �������� ���������, ������� ����� ����������� � ������������ ������������ ����� � �������� ��� ���������� ������.
    ������ ������ ���� ��������� � ������� ����� try-catch.
     */
    private double inputNum = 0;

    public double inputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���� ������������ �����: ");
        inputNum = in.nextDouble();
        return inputNum;
    }

    public void mathPowOfInputNumber () {
        double inputNumberCalculation;
        inputNumberCalculation = Math.sqrt(inputNum);
        System.out.println(inputNumberCalculation);
    }

    public void optionsOutput () {
        System.out.println("1. ���� �����");
        System.out.println("2. ������ ����������� ����� �����");
        System.out.println("3. ����� �� ���������");
    }

    public int optionNumInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }
}
