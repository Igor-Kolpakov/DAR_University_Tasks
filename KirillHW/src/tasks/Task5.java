package tasks;

import java.util.*;

public class Task5 {

    /*5. В отделе работают 3 сотрудника, которые получают заработную плату в рублях.
         Требуется определить, на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
         Пользователь вводит три целых числа (три зарплаты в рублях). Программа выводит разность зарплат в рублях.

         Используйте тернарную операцию!

         Тестовые данные
         Sample Input: 6000 12000 10500
         Sample Output: 6000
     */

    private final int numOne = 6000;
    private final int numTwo = 12000;
    private final int numThree = 10500;
    private int numWithInputOne;
    private int numWithInputTwo;
    private int numWithInputThree;

    private int[] numArray;
    private Integer[] objectNumArr;

    private void dataInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        numWithInputOne = in.nextInt();
        System.out.print("Введите второе число: ");
        numWithInputTwo = in.nextInt();
        System.out.print("Введите копейки: ");
        numWithInputThree = in.nextInt();
    }

    private void optionsInfoOutput() {
        System.out.println("1. Простое решение со статичными данными");
        System.out.println("2. Ввод зарплат сотрудников");
        System.out.println("3. Ввод зарплат для n сотрудников");
        System.out.println("4. Ввод зарплат для n сотрудников в массив Integer");
        System.out.println("5. Поиск минимальной зарплаты для второго пункта");
        System.out.println("6. Поиск минимальной зарплаты для третьего пункта");
        System.out.println("7. Поиск минимальной зарплаты для третьего пункта без использования класса Math");
        System.out.println("8. Поиск минимальной зарплаты в коллекции");
        System.out.println("9. Выход из задачи");
    }

    private int optionsNumInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }

    private void numArrayFill() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во зарплат: ");
        int n = in.nextInt();
        numArray = new int[n];
        System.out.println("Вводите зарплаты сотрудников: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextInt();
        }
    }

    private void objectNumArrayFill() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во зарплат: ");
        int n = in.nextInt();
        objectNumArr = new Integer[n];
        System.out.println("Вводите зарплаты сотрудников: ");
        for (int i = 0; i < n; i++) {
            objectNumArr[i] = in.nextInt();
        }
    }

    private void numArrayOutput() {
        for (int num : numArray) {
            System.out.print(num + " ");
        }
    }

    private void minimalNumSearch() {
        int minNum;
        minNum=Math.min(Math.min(numOne, numTwo), numThree);
        System.out.print("Минимальное число: " + minNum);
    }

    private void minimalNumSearchInInputNums() {
        int minNum;
        minNum=Math.min(Math.min(numWithInputOne, numWithInputTwo), numWithInputThree);
        System.out.print("Минимальное число: " + minNum);
    }

    private void minimalNumSearchInNumArray () {
        int minNum = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int k = 0; k < i; k++) {
                minNum=Math.min(numArray[k], numArray[i]);
            }
        }
        System.out.print("Минимальное число: " + minNum);
    }

    private void minimalNumSearchInNumArrayWithoutMathClass () {
        int minNum = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
                if (numArray[i] < minNum) {
                   minNum = numArray[i];
                }
        }
        System.out.print("Минимальное число: " + minNum);
    }

    private void minimalNumSearchInList () {
        List<Integer> ints = Arrays.asList(objectNumArr);
        System.out.print("Минимальный элемент: " + Collections.min(ints));
    }

    public void task5Console () {
        boolean close = false;
        while (!close) {
            optionsInfoOutput();
            try {
                switch (optionsNumInput()) {
                    case (1) -> { minimalNumSearch(); }
                    case (2) -> { dataInput(); }
                    case (3) -> { numArrayFill(); }
                    case (4) -> { objectNumArrayFill(); }
                    case (5) -> { minimalNumSearchInInputNums(); }
                    case (6) -> { minimalNumSearchInNumArray(); }
                    case (7) -> { minimalNumSearchInNumArrayWithoutMathClass(); }
                    case (8) -> { minimalNumSearchInList(); }
                    case (9) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Некорректный ввод :), попробуй снова");
                System.out.println("***********************************");
            }
        }
    }

}
