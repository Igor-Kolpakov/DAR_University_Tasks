import java.util.Scanner;

public class Rectangle {
    /*3. Создайте класс 'Rectangle' с полями длины и ширины, переданные в качестве параметров конструктору, и методом 'returnArea', который возвращает площадь.
    Напишите программу для печати площади двух прямоугольников со сторонами (5, 9) и (10, 14) соответственно.

     */
    int a;
    int b;
    int d;
    int e;
    double firstSquare;
    double secondSquare;

    public Rectangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину первого прямоугольника: ");
        a = in.nextInt();
        System.out.print("Введите ширину первого прямоугольника: ");
        b = in.nextInt();
        System.out.print("Введите длину второго прямоугольника: ");
        d = in.nextInt();
        System.out.print("Введите ширину второго прямоугольника: ");
        e = in.nextInt();
        //in.close();
    }

    double returnFirstSquare(){
        firstSquare = a * b;
        return firstSquare;
    }

    double returnSecondSquare(){
        secondSquare = d * e;
        return secondSquare;
    }
}
