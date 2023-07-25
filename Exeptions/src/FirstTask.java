import java.util.Scanner;

public class FirstTask {
    /*1. Напишите программу, которая будет запрашивать у пользователя вещественное число и выводить его квадратный корень.
    Ошибки должны быть отловлены с помощью блока try-catch.
     */
    private double inputNum = 0;

    public double inputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше вещественное число: ");
        inputNum = in.nextDouble();
        return inputNum;
    }

    public void mathPowOfInputNumber () {
        double inputNumberCalculation;
        inputNumberCalculation = Math.sqrt(inputNum);
        System.out.println(inputNumberCalculation);
    }

    public void optionsOutput () {
        System.out.println("1. Ввод числа");
        System.out.println("2. Расчет квадратного корня числа");
        System.out.println("3. Выход из программы");
    }

    public int optionNumInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }
}
