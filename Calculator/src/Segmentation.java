import java.util.Scanner;

public class Segmentation {
    int n;
    double[] numArray;
    double segmentation = 0;

    public Segmentation() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���������� ����� ��� �������: ");
        n = in.nextInt();
        numArray = new double[n];
        System.out.println("������� �������� ��� �������: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextDouble();
        }
        /* System.out.print ("�������� ����� ���������� �������� �������: ");
        for (int i = 0; i < n; i++) {
            System.out.print (" " + numArray[i]);
        } System.out.println(); */
    }



    public double segmentationCalculation() {
        segmentation = numArray[0];
        for (int i = 1; i < numArray.length; i++ ) {
            segmentation /= numArray[i];
        }
        return segmentation;
    }
}
