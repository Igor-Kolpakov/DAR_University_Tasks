import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        label1:
        {
            System.out.println("��������� ��������: ");
            System.out.println("1. ��������");
            System.out.println("2. ���������");
            System.out.println("3. ���������");
            System.out.println("4. �������");
            System.out.print("������� ����� ����������� ��� ��������: ");
            int operationNum = in.nextInt();
            switch (operationNum) {
                case (1):
                    Sum sum = new Sum();
                    System.out.println("����� = " + sum.sumOfNumbers());
                    break;
                case (2):
                    Subtraction subtraction = new Subtraction();
                    System.out.println("��������� = " + subtraction.subtractionCalculation());
                    break;
                case (3):
                    Multiplication multiplication = new Multiplication();
                    System.out.println("������������ = " + multiplication.multiplicationCalculation());
                    break;
                case (4):
                    Segmentation segmentation = new Segmentation();
                    System.out.println("������� = " + segmentation.segmentationCalculation());
            }
        }
    }
}
/*
G: {
                System.out.println("������ ��������� ");
            }
 */


/*
            System.out.println("�� ������ ���������� ������?");
            String choice = in.nextLine();
            if (choice.toLowerCase() == "yes") {
                break T;
            } else if (choice.toLowerCase() == "no") {
                break;
            }
 */


/*System.out.println("�� ������ ���������� ������?");
            String choice = in.nextLine();
            switch (choice.toLowerCase()) {
                case ("yes") :
                    break T;
                case ("no") :
                    break;
            } */


/*G:
            {
                System.out.println("�� ������ ���������� ������?");
                String choice = in.nextLine();
                if (choice.toLowerCase() == "yes") {
                    break label1;
                }
            } */