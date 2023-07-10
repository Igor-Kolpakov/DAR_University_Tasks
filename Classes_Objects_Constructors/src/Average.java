import java.util.Scanner;

public class Average {
    /*4. Создайте класс с именем 'Average', имеющий метод для вычисления и печати среднего значения.
    Напишите программу, чтобы вывести среднее значение трех чисел.

    P.S. (с)Игорь, Средних значений на самом деле дофига, можно потом как-нибудь дописать формулы для всех остальных
     */
    int n;
    int[] numArray;
    double numAverage;

    public Average() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел вашей последовательности чисел: ");
        n = in.nextInt();
        numArray = new int[n];
        System.out.println("Вводите элементы вашей последовательности чисел: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextInt();
        }
        System.out.print ("Элементы вашей последовательности: ");
        for (int i = 0; i < n; i++) {
            System.out.print (" " + numArray[i]);
        } System.out.println();
    }

        public double numAverageCalculation() {
            for (int num : numArray) {
                int sum = 0;
                sum += num;
                numAverage = (double) sum / numArray.length;
            }
            return numAverage;
        }
}
