import java.util.Scanner;

public class SecondTask {
    /*2. ��������� ����, � �������� �� ��������� �����������, ��������� � ���� �����, ������� �� ���������� ��� ��������������� ���������� ����� ���������.
    � ������� � ���� �������� ��������� �������� � ����� ��� ����� ������ ���������� ���������� ������ �� �������. ������ �� �������� ������ 0 ��� ������ ���������� ��������� ������, � ��������� ������������ � ��������� ������� ��� ������� ��������� �� 0.
    ����� ������ ��� ��������, �������� ����� divide(), ������� ��������� ��� ���������: x � y � ���������� ���������: x/y.
    ������, ���� y ����� ����, �� ������ ��������� ����������.
    ���� ���������� ����� ���������, �� �������� ������� �������� ���������.
    */
    private int x;
    private int y;

    public void inputNums () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���-�� ������");
        x = in.nextInt();
        System.out.print("������� �������� ����������");
        y = in.nextInt();
    }

    public void divide () {
        double endNum;
        endNum = x/y;
        System.out.println(endNum);
    }

    public void optionsOfSecondTaskOutput () {
        System.out.println("1. ���� �����");
        System.out.println("2. ������ ������");
        System.out.println("3. ����� �� ���������");
    }

    public int optionNumInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }
}
