import java.util.Scanner;

public class Square {
    /*3. Создайте программу, которая вычисляет площадь, периметр и длину диагонали квадрата со стороной a.
         Которую ваша программа должна считать из пользовательского ввода с помощью класса Scanner.
     */
    double a;
    double perimeter;
    double square;
    double diagonal;

    public Square () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону квадрата: ");
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
