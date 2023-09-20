import tasks.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void optionsInfoOutput() {
        System.out.println("1. Задача №1 и Задача №3");
        System.out.println("2. Задача №2");
        System.out.println("3. Задача №4");
        System.out.println("4. Задача №5");
        System.out.println("5. Задача №6");
        System.out.println("6. Задача №7");
        System.out.println("7. Задача №8");
        System.out.println("8. Задача №9");
        System.out.println("9. Выход из программы");
    }

    public static void main(String[] args) {
        Main main = new Main();
        Task1_3 task1_3 = new Task1_3();
        Task2 task2 = new Task2();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Task6 task6 = new Task6();
        Task7 task7 = new Task7();
        Task8 task8 = new Task8();
        Task9 task9 = new Task9();

        boolean close = false;
        while (!close) {
            main.optionsInfoOutput();
                try {
                    switch (main.optionsNumInput()) {
                        case (1) -> { task1_3.task1Console(); }
                        case (2) -> { task2.task2Console(); }
                        case (3) -> { task4.task4Console(); }
                        case (4) -> { task5.task5Console(); }
                        case (5) -> { task6.task6Console(); }
                        case (6) -> { task7.task7Console(); }
                        case (7) -> { task8.task8Console(); }
                        case (8) -> { task9.task9Console(); }
                        case (9) -> { close = true; }
                    }
                } catch (InputMismatchException optionNumberException) {
                        System.out.println("***********************************");
                        System.out.println("Некорректный ввод :)");
                        System.out.println("***********************************");
                }
        }
    }
}