import java.util.Scanner;

public class Square {
    /*3. �������� ���������, ������� ��������� �������, �������� � ����� ��������� �������� �� �������� a.
         ������� ���� ��������� ������ ������� �� ����������������� ����� � ������� ������ Scanner.
     */
    double a;
    double perimeter;
    double square;
    double diagonal;

    public Square () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ������� ��������: ");
        a = in.nextDouble();
    }

    public double perimeterCalculation() {
        perimeter = a * 4;
        return perimeter;
    }

    public double squareCalculation() {
        square = a * a;
        return square;
    }

    public double diagonalCalculation() {
        diagonal = Math.sqrt(2) * a;
        return diagonal;
    }
}
