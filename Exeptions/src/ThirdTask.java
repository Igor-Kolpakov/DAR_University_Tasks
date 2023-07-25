import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThirdTask {
    /*3. �������� ���������, ������� �����������, ��������� ������ ����� � ����������� ����� ����� �� ������ ������� �� ���� �� ����������.
    ��������� ��������� ����� ����� � �������� �����. ���� �� ���������� �� ������� ������ "10 20 30 40", ��� ������ ������� "����� ����� ����� � ������ ����� 100".
    ���������� � ������ �����, �������� ������, ���������� ��� ����� �����, ��� � ������ ��������, "2 rabbit 1 cat".
    ������ ������ ���� ��������� � ��������� ����������.

     */
    private String leksema;

    public String inputString() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���� ������: ");
        leksema = in.nextLine();
        return leksema;
    }

    public String[] stringSplitAndWriteInArray () {
        String[] stringsArray = leksema.split(" ");
        return stringsArray;
    }

    public void stringSumOutput () {
        int sum = 0;
        for (String member : stringSplitAndWriteInArray()) {
            sum = Integer.parseInt(member.trim());
        }
        System.out.println(sum);
    }

    public void optionsOfThirdTaskOutput () {
        System.out.println("1. ���� ������");
        System.out.println("2. ����� ����� ����� ������� ���� � ������");
        System.out.println("3. ����� �� ���������");
    }

    public int optionNumInputOfThirdTask () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }
}