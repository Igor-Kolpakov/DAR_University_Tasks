import java.util.Scanner;

public class StarTriangle {
    /*2. �������� ����� StarTriangle, ������� ����� ������������ ��� ��������� ���������� ������������.
        [*]
        [*][*]
        [*][*][*]
        [*][*][*][*]

        ��� ����� ������ ����� ����������� � ���������� width, ������� ��������� �� ���������� [*] � ��������� ������ ������������.
        ����� ����, ������ ���� ����� toString(), ������� ��������� ������, �������������� �����������, � ���������� ������, ��������� �� [*] � �������� ����� ������.

        ������������� ������:
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

        �������� ������:
        [*]
        [*][*]
        [*][*][*]
     */

    /*
    System.out.print("������� ������ ���������: ");
        int i1 = in.nextInt();
        for (int i2 = 0; i2 <= i1; i2++) {
            for (int j = 0; j <= i2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
     */
    int width;

    public StarTriangle(int width) {
        width = width;
    }

    @Override
    public String toString() {
        width++;
        return "[" +
                "*" +
                "]";
    }
}
