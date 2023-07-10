import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        label1:
        {
            System.out.println("Доступные операции: ");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.print("Введите номер необходимой вам операции: ");
            int operationNum = in.nextInt();
            switch (operationNum) {
                case (1):
                    Sum sum = new Sum();
                    System.out.println("Сумма = " + sum.sumOfNumbers());
                    break;
                case (2):
                    Subtraction subtraction = new Subtraction();
                    System.out.println("Вычитание = " + subtraction.subtractionCalculation());
                    break;
                case (3):
                    Multiplication multiplication = new Multiplication();
                    System.out.println("Произведение = " + multiplication.multiplicationCalculation());
                    break;
                case (4):
                    Segmentation segmentation = new Segmentation();
                    System.out.println("Деление = " + segmentation.segmentationCalculation());
            }
        }
    }
}
/*
G: {
                System.out.println("Работа закончена ");
            }
 */


/*
            System.out.println("Вы хотите продолжить работу?");
            String choice = in.nextLine();
            if (choice.toLowerCase() == "yes") {
                break T;
            } else if (choice.toLowerCase() == "no") {
                break;
            }
 */


/*System.out.println("Вы хотите продолжить работу?");
            String choice = in.nextLine();
            switch (choice.toLowerCase()) {
                case ("yes") :
                    break T;
                case ("no") :
                    break;
            } */


/*G:
            {
                System.out.println("Вы хотите продолжить работу?");
                String choice = in.nextLine();
                if (choice.toLowerCase() == "yes") {
                    break label1;
                }
            } */