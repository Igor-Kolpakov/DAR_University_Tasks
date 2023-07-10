import java.util.Scanner;

public class StarTriangle {
    /*2. Напишите класс StarTriangle, который можно использовать для генерации следующего треугольника.
        [*]
        [*][*]
        [*][*][*]
        [*][*][*][*]

        Ваш класс должен иметь конструктор с параметром width, который указывает на количество [*] в последней строке треугольника.
        Кроме того, должен быть метод toString(), который вычисляет строку, представляющую треугольник, и возвращает строку, состоящую из [*] и символов новой строки.

        Использование класса:
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

        Выходные данные:
        [*]
        [*][*]
        [*][*][*]
     */

    /*
    System.out.print("Введите предел звездочек: ");
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
