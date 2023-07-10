import java.util.Scanner;

public class Triangle {
    /*2. Создайте класс с именем 'Triangle' с конструктором, параметрами которого будут длины сторон треугольника.
        Напишите программу для печати площади и периметра треугольника со сторонами 3, 4 и 5 единиц.
    */
    int a;
    int b;
    int c;
    int Perimeter;
    double Square;

    public Triangle() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону a: ");
        a = in.nextInt();
        System.out.print("Введите сторону b: ");
        b = in.nextInt();
        System.out.print("Введите сторону c: ");
        c = in.nextInt();
        //in.close();
    }


    int returnPerimeter(){
        Perimeter = a + b + c;
        return Perimeter;
    }

    double returnSquare(){
        Square = Math.sqrt(Perimeter * (Perimeter - a) * (Perimeter - b) * (Perimeter - c));
        return Square;
    }
}
