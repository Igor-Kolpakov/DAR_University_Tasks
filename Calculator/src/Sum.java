import java.util.Scanner;

public class Sum {
    int n;
    double[] numArray;
    int sum = 0;

    public Sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���������� ����� ��� ����� �����: ");
        n = in.nextInt();
        numArray = new double[n];
        System.out.println("������� �������� ��� ����� �����: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextDouble();
        }
        /* System.out.print ("�������� ����� �����: ");
        for (int i = 0; i < n; i++) {
            System.out.print (" " + numArray[i]);
        } System.out.println(); */
    }



    public double sumOfNumbers() {
        for (double num : numArray) {
            sum += num;
        }
        return sum;
    }
}
