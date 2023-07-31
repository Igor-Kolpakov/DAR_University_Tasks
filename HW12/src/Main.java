import LeetCodeTasks.*;
import OrdinaryTasks.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Task1And7 task1 = new Task1And7();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4And8 task4 = new Task4And8();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task1ShuffleString leetCodeTask1 = new Task1ShuffleString();
        Task2PalindromeNumber leetCodeTask2 = new Task2PalindromeNumber();
        Task3NumberOfStepsToReduceANumberToZero leetCodeTask3 = new Task3NumberOfStepsToReduceANumberToZero();
        Task4CheckIfTwoStringArraysAreEquivalent leetCodeTask4 = new Task4CheckIfTwoStringArraysAreEquivalent();
        Task5SumOfAllOddLengthSubArrays leetCodeTask5 = new Task5SumOfAllOddLengthSubArrays();

        boolean close = false;
        while (!close) {
            mainOptionsInfoOutput();
            try {
                switch (main.mainOptionsNumInput()) {
                    case (1) -> { task1.task1Calculation(); }
                    case (2) -> { task2.task2OddNumConsole(); }
                    case (3) -> { task3.task3Console(); }
                    case (4) -> { task4.task4And8MaxNumbersFromArray(); }
                    case (5) -> { task5.task5NegativeAndPositiveOutput(); }
                    case (6) -> { task6.task6LettersInStringShuffle(); }
                    case (7) -> { leetCodeTask1.leetCodeTask1Console(); }
                    case (8) -> { leetCodeTask2.task2PalindromeNumberConsole(); }
                    case (9) -> { leetCodeTask3.task3NumberOfStepsToReduceANumberToZeroConsole(); }
                    case (10) -> { leetCodeTask4.task4ConcatenationOfWordsConsole(); }
                    case (11) -> { leetCodeTask5.task5SumOutputConsole(); }
                    case (12) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("�������������� ������ �����");
                System.out.println("***********************************");
            }
        }
    }


    public static void mainOptionsInfoOutput() {
        System.out.println("1. ��������� ��� ������ �����, ���������, ���������, ������� � ������� ���� �����, � ����� ��� ����� ���� �������� �������");
        System.out.println("2. ��������� ��� ������ �������� ����� �� 1 �� 20 ");
        System.out.println("3. ���������, ����� �������� ������� ��� ���������� ");
        System.out.println("4. ���������, ������� ��������� �� ������������ ��� ����� � ������� ���������� �� ���, � ����� ������� ������ �� �������� ����� � �������");
        System.out.println("5. ��������� ��� �������� ����, �������� �� ����� ������������� ��� �������������");
        System.out.println("6. ��������� ��� ������ ���� �������� 'a' �� ������� 'b'");
        System.out.println("7. ������ � LeetCode �1 ���������� ������ �������� ������� � �������� �������");
        System.out.println("8. ������ � LeetCode �2 �������� ����� �� ������� ����������");
        System.out.println("9. ������ � LeetCode �3 ���-�� ����� ��� ����������� ����� � ����");
        System.out.println("10. LeetCode �4 �������� ���� ����� �� ���������� ������� ������������ �� ���������� ������");
        System.out.println("11. ������ � LeetCode �5 ����� ���� �������� � �������� ��� ��������");
        System.out.println("12. ����� �� �������");
    }

    public int mainOptionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

}
