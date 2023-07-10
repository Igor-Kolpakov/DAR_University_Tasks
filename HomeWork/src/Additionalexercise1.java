import java.util.Scanner;

public class Additionalexercise1 {
    public static void main(String[] args) {
        //1:Напишите программу для умножения 10 на 5 и вывода результата в консоль.
        int a = 10;
        int a1 = 5;
        int a2 = a * a1;
        System.out.println("10 * 5 = " + a2);
        // или
        int a3 = 10;
        a3 = a3 * 5;
        System.out.println("10 * 5 = " + a3);
        // или
        int a4;
        a4 = 10 * 5;
        System.out.println("10 * 5 = " + a4);
        // или
        int a5 = 10;
        a5 *= 5;
        System.out.println("10 * 5 = " + a5);
        // или
        System.out.println("10 * 5 = " + (10 * 5));


        //2:Напишите программу для деления 20 на 2.5 и вывода результата в консоль.
        int b = 20;
        double b1 = 2.5;
        double b2 = b / b1;
        System.out.println("20 / 2.5 = " + b2);
        // или
        byte b3 = 20;
        double b4 = b3 / 2.5;
        System.out.println("20 / 2.5 = " + b4);
        // или
        double b5;
        b5 = 20 / 2.5;
        System.out.println("20 / 2.5 = " + b5);
        // или
        double b6 = 20;
        b6 /= 2.5;
        System.out.println("20 / 2.5 = " + b6);
        // или
        System.out.println("20 / 2.5 = " + (20 / 2.5));


        /*3:Длина и ширина прямоугольника равны 15 и 9 соответственно.
        Напишите программу для вычисления площади и периметра прямоугольника. */

        int length = 15;
        int width = 9;
        int perimeter = (length + width) * 2;
        int square = length * width;
        System.out.println("Периметр прямоугольника: " + perimeter);
        System.out.println("Площадь прямоугольника: " + square);
        // или
        int perimeter1 = (15 + 9) * 2;
        int square1 = (15 * 9);
        System.out.println("Периметр прямоугольника: " + perimeter1);
        System.out.println("Площадь прямоугольника: " + square1);
        //или
        System.out.println("Периметр прямоугольника: " + ((15 + 9) * 2));
        System.out.println("Площадь прямоугольника: " + (15 * 9));


        /*4:Используйте правильный оператор,
         чтобы увеличить значение переменной x на 1 с помощью префиксной и постфиксной форм.
         Выведите на экран результат.
         */
        int x = 20;
        x++; // 20 + 1
        System.out.println("x + 1 = " + x); // 21

        ++x; // 21 + 1
        System.out.println("x + 1 = " + x); // 22


        //5:Используйте оператор присваивания сложения, чтобы добавить значение 5 к переменной x.

        x +=5;
        System.out.println("x1 + 5 = " + x);

        //6:Напишите программу для проверки равенства двух чисел 25 и 43.

        int y = 25;
        int u = 43;
        System.out.println(y + "==" + u + ": " + (y == u));

        /*7:Даны две переменные a и b, значения которых равны 10 и 5 соответственно.
         Напишите программу для сложения, вычитания, умножения, деления, деления по модулю двух переменных.
        */

        int a7 = 10;
        int b7 = 5;
        System.out.println("Сложение: " + (a7 + b7));
        System.out.println("Вычитание: " + (a7 - b7));
        System.out.println("Умножение: " + (a7 * b7));
        System.out.println("Деление: " + (a7 / b7));
        System.out.println("Деление по модулю: " + (a7 % b7));
        System.out.println("Деление по модулю: " + (double)(b7 % a7));

        /*9:Напишите программу, которая прибавляет 10 к числу 451, а затем делит его на 3.
        Теперь к модулю результата прибавляется 5, а затем полученное значение умножается на 5.
        Выведите на экран окончательный результат.
        */

        int j = 451;
        j %= (451+10)/3;
        j = (j+5)*5;
        System.out.println(j);

        /*10:Даны две переменные a и b, значения которых равны 65 и 80 соответственно.
        Напишите программу, чтобы проверить, верны ли оба условия 'a < 50' и 'a < b'.
         */

        int a8 = 65;
        int b8 = 80;
        boolean p1 = (a8 < 50) && (a8 < b8);
        System.out.println("a8<50: " + (a8 < 50) + ", a8<b8: " + (a8 < b8) + ", результат: " + p1);

        //8:Напишите программу для преобразования градусов Фаренгейта в градусы Цельсия.
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Farenheit: ");
        double farenheit = in.nextDouble();
        farenheit = (int)((farenheit - 32) / 1.8);
        System.out.printf("Your Celsius: " + farenheit);
        in.close();


    }
}
