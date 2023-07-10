import java.util.Scanner;

public class Subtraction {
    int n;
    double[] numArray;
    double subtraction = 0;

    public Subtraction() {
        Scanner in = new Scanner(System.in);
        System.out.print("¬ведите количество чисел дл€ вычитани€: ");
        n = in.nextInt();
        numArray = new double[n];
        System.out.println("¬водите элементы дл€ вычитание чисел: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextDouble();
        }
        /* System.out.print ("Ёлементы вашей дальнейшей операции умножени€: ");
        for (int i = 0; i < n; i++) {
            System.out.print (" " + numArray[i]);
        } System.out.println(); */
    }


    public double subtractionCalculation() {
        subtraction = numArray[0];
        for (int i = 1; i < numArray.length; i++ ) {
            subtraction -= numArray[i];
        }
        return subtraction;
    }
}
