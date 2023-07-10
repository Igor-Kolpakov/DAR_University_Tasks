import java.util.Scanner;

public class Multiplication {
    int n;
    double[] numArray;
    int multiplication = 1;

    public Multiplication() {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите количество чисел дл€ умножени€: ");
        n = in.nextInt();
        numArray = new double[n];
        System.out.println("¬водите элементы дл€ умножени€ чисел: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextDouble();
        }
        /* System.out.print ("Ёлементы вашей дальнейшей операции умножени€: ");
        for (int i = 0; i < n; i++) {
            System.out.print (" " + numArray[i]);
        } System.out.println(); */
    }



    public double multiplicationCalculation() {
        for (double num : numArray) {
            multiplication *= num;
        }
        return multiplication;
    }
}
