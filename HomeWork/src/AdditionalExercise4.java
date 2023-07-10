import java.lang.reflect.Array;
import java.util.*;

public class AdditionalExercise4 {
    public static void main(String[] args) {
        /*1. Дан массив чисел. Напишите программу для вычисления среднего значения элементов одномерного массива.
        Дано:
        [1, 3, 4, 1, 5, 5]

        Вывод:
        Среднее значение = 3.16666667
         */
        double average = 0;
        int sum = 0;
        int[] myInt = {1, 3, 4, 1, 5, 5};
        for (int num : myInt) {
            sum += num;
            average = (double) sum / myInt.length;
        }
        System.out.println("Среднее значение = " + average);

        /*2. Дан массив целых значений. Напишите программу для поиска дубликатов значений.

        Дано:
        [1, 3, 4, 1, 5, 5]

        Вывод:
        Дубликаты = 1, 5
         */
        int[] myInt2 = {1, 3, 4, 1, 5, 5};
        for (int i = 0; i < myInt2.length; i++) {
            for (int j = i + 1; j < myInt2.length; j++) {
                if (myInt2[i] == myInt2[j]) {
                    System.out.println("Дубликаты = " + myInt2[j]);
                }
            }
        }
        System.out.println();

        /*3. Дан массив целых значений. Напишите программу для проверки, содержит ли массив определенное значение.
        1)
        Дано:
        [1, 3, -6, 23, 14, 2]
        int x = 23

        Вывод:
        True

        2)
        Дано:
        [1, 3, -6, 23, 14, 2]
        int x = 0

        Вывод:
        False
        */
        int x1 = 0;
        int x = 23;
        int[] myInt3 = {1, 3, -6, 23, 14, 2};
        for (int num1 : myInt3) {
            if (num1 == x) {
                System.out.println("Число " + x + " есть в массиве myInt3");
            } /* if (num1 == x1) {
                System.out.println("Числа " + x1 + "нет в массиве myInt3");
            } */
        }
        System.out.println();

        /*4. Дан массив целых значений. Напишите программу для нахождения индекса элемента массива.
        1)
        Дано:
        [1, 3, -6, 23, 14, 2]
        int x = 23

        Вывод:
        Индекс = 3

        2)
        Дано:
        [1, 3, -6, 23, 14, 2]
        int x = 5

        Вывод:
        Не найдено

         */
        int index = 0;
        int x3 = 23;
        int x4 = 5;
        for (int i1 = 0; i1 < myInt3.length; i1++) {
            if (myInt3[i1] == x3) {
                index = i1;
            }
            /* if (myInt3[i1] == x4 ) {
                index = i1;
            }*/
        }
        System.out.println("Индекс элемента: " + index);
        System.out.println();

        /*5. Даны массив целых значений и целые числа n, m.
        Напишите программу для нахождения подмассива между индексами n и m.
        1)
        Дано:
        [34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7]
        int n = 3
        int m = 8

        Вывод:
        [30, 25, 40, 32, 31, 35]

        2)
        Дано:
        [1, 3, -6, 23, 14, 2]
        int n = 1
        int m = 3

        Вывод:
        [3, -6, 23]
         */
        int n = 3;
        int m = 8;
        int[] myInt4 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        for (int i2 = 0; i2 < myInt4.length; i2++) {
            if (i2 >= n && i2 <= m) {
                System.out.println("Вывод: " + myInt4[i2]);
            }
        }
        System.out.println();

        /*6. Дан массив целых значений.
        Напишите программу для нахождения наибольшего и наименьшего элементов массива.

        Дано:
        [1, 3, -6, 23, 14, 2]

        Вывод:
        Минимальный элемент = -6
        Максимальный элемент = 23
         */
        Integer[] myInt5 = {1, 3, -6, 23, 14, 2}; //можно было гораздо проще сделать через Math.min(), но я прочитал про коллекции раньше чем до меня это дошло
        List<Integer> ints = Arrays.asList(myInt5);
        System.out.println("Минимальный элемент = " + Collections.min(ints));
        System.out.println("Максимальный элемент = " + Collections.max(ints));
        System.out.println();

        /*7. Дан массив целых значений.
        Напишите программу для нахождения наименьшего и второго наименьшего элементов заданного массива.

        Дано:
        [1, 3, -6, 23, 14, 2]

        Вывод:
        Наименьший элемент = -6
        Второй наименьший элемент = 1
         */
        int min = 1000;  //можно еще реализовать ввод числа min через Scanner, чтобы пользователь сам устанавливал минимум который надо найти.
        int min2 = 1000;
        int[] myInt6 = {1, 3, -6, 23, 14, 2};
        for (int i5 = 0; i5 < myInt6.length; i5++) {
            min = Math.min(myInt6[i5], min);
        }
        for (int j5 = 0; j5 < myInt6.length; j5++) {
            if (min < myInt6[j5] && myInt6[j5] < min2) {
                min2 = Math.min(myInt6[j5], min2);
            }
        }
        System.out.println("Наименьший элемент = " + min);
        System.out.println("Второй наименьший элемент = " + min2);
        System.out.println();

        /*8. Дан массив целых значений.
        Напишите программу для формирования наибольшего числа из заданного массива целых неотрицательных чисел.

        Дано:
        [1, 2, 3, 0, 4, 6]

        Вывод:
        643210

         */
        int[] myInt7 = {1, 2, 3, 0, 4, 6};  //Была еще идея записать массив в строку, затем с помощью charAt перевернуть строку.
        System.out.print("Ваше число: ");
        for (int i3 = myInt7.length - 1; i3 >= 0; i3--) {
            System.out.print(myInt7[i3]);
        } System.out.println();

        /*9. Дан двумерный массив целых значений.
        Напишите программу для печати массива после изменения строк и столбцов заданного двумерного массива.

        1)

        Дано:
        10 20 30
        40 50 60

        Вывод: После изменения строк и столбцов указанного массива
        10 40
        20 50
        30 60

        2)
        Дано:
        4 2 1
        2 7 2

        Вывод: После изменения строк и столбцов указанного массива
        4 2
        2 7
        1 2

         */
        int[][] myDoubleInt = {{10, 20, 30}, {40, 50, 60}};  //Не понимаю почему он выводит только 0-ой и 1-ый символ в массиве.
        int[][] myNewDoubleInt = new int[myDoubleInt.length][myDoubleInt.length];
         for (int i4 = 0; i4 < myDoubleInt.length; i4++) {
            for (int j4 = 0; j4 < myDoubleInt.length; j4++) {
                myNewDoubleInt[j4][i4] = myDoubleInt[i4][j4];
            }
        }
        System.out.println("Ваш перезаписанный массив: ");
        Arrays.stream(myNewDoubleInt).map(Arrays::toString).forEach(System.out::println);
        System.out.println();


        /*10. Напишите программу, которая возвращает сумму всех значений в двумерном массиве.
        Дано:
        10 20 30
        40 50 60

        Вывод:
        Сумма = 210
        */
        int[][] myDoubleInt3 = {{10, 20, 30}, {40, 50, 60}};
        int sum1 = 0;
        for(int[] row : myDoubleInt3)
        {
            for(int element : row)
                sum1 += element;
        } System.out.println("Сумма: " + sum1);

        /*11. Напишите программу, которая возвращает true, если двумерный массив является квадратным.
        (!) Двумерный массив считается квадратным, если количество строк равно длине каждой строки.
        Можно предположить, что каждая строка двумерного массива имеет одинаковое количество индексов.
        1)
        Дано:
        10 20 30
        40 50 60

        Вывод: false

        2)
        Дано:
        10 20
        40 50

        Вывод: true

         */
        int[][] myDoubleInt4 = {{10, 20, 30}, {40, 50, 60}};
        for (int[] arr : myDoubleInt4) {
            if (myDoubleInt3.length == arr.length) {
                 System.out.println("Ваш массив квадратный");
             } else {
                System.out.println("Ваш массив не квадратный");
            }
        } System.out.println();

        /*12. Дано целое число n.
        Напишите программу, которая возвращает двумерный массив, представляющий таблицу умножения.
        Число n определяет размер таблицы умножения.

        Дано: n = 5;

        Вывод:
        [1,  2,  3,  4,  5]
        [2,  4,  6,  8, 10]
        [3,  6,  9, 12, 15]
        [4,  8, 12, 16, 20]
        [5, 10, 15, 20, 25]

         */
        int n1 = 5; //не догоняю почему он проходит по каждому числу, но заполняет таблицу только максимальным числом
        int[][] multiplicationTable = new int[n1][n1];
        for(int multiplier = 1; multiplier <= n1; multiplier++) {
            for (int k = 0; k < n1; k++) {
            for (int[] row : multiplicationTable) {
                for (int element : row) {
                    element = (int) Math.pow(multiplier, 2);
                    row[k] = element;

                }
            }
            }
        }
        Arrays.stream(multiplicationTable).map(Arrays::toString).forEach(System.out::println);
        System.out.println();



        /*13. Напишите программу, которая возвращает максимальное и минимальное значение, найденные в двумерном массиве.
        Дано:
        10 20 30
        40 50 60

        Вывод:
        Максимальный элемент = 60
        Минимальный элемент = 10
         */

        int[][] myDoubleInt5 = {{10, 20, 30}, {40, 50, 60}};
        int min1 = 1000;
        int max1 = 0;
        for (int i6 = 0; i6 < myDoubleInt5.length; i6++) {
            for (int j6 = 0; j6 <= myDoubleInt5.length; j6++){
                min1 = Math.min(myDoubleInt5[i6][j6], min1);
                max1 = Math.max(myDoubleInt5[i6][j6], max1);
            }
        }
        System.out.println("Ваш минимальный элемент: " + min1);
        System.out.println("Ваш максимальный элемент: " + max1);
    }
}
