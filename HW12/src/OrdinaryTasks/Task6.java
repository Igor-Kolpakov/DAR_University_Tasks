package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 implements SimilarInputInfo{
    //6) �������� ��������� ��� ������ ���� �������� 'a' �� ������� 'b'
    private String lettersReplace;

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. ������� ������ ��� ��������");
        System.out.println("2. �������� ��� ����� � �� ����� �");
        System.out.println("3. ����� �� �������");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        int num = in.nextInt();
        return num;
    }

    private void letterShuffleStringInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���� ������: ");
        lettersReplace = in.nextLine();
    }

    private void lettersAReplaceToB () {
        lettersReplace = lettersReplace.toLowerCase().replace('a', 'b');
        System.out.println(lettersReplace);
    }

    public void task6LettersInStringShuffle () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { letterShuffleStringInput(); }
                    case (2) -> { lettersAReplaceToB(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("�������������� ������ �����");
                System.out.println("***********************************");
            }
        }
    }
}
