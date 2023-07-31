package OrdinaryTasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 implements SimilarInputInfo{
    //6) Напишите программу для замены всех символов 'a' на символы 'b'
    private String lettersReplace;

    @Override
    public void optionsInfoOutput() {
        System.out.println("1. Введите строку для операций");
        System.out.println("2. Заменить все буквы А на буквы В");
        System.out.println("3. Выход из задания");
    }

    @Override
    public int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void letterShuffleStringInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
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
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }
    }
}
