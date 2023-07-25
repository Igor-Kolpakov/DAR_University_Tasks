import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThirdTask {
    /*3. Напишите программу, которая запрашивает, считывает строку ввода и анализирует целое число из каждой лексемы по мере ее извлечения.
    Программа суммирует целые числа и печатает сумму. Если вы передадите ей входные данные "10 20 30 40", она должна вывести "Сумма целых чисел в строке равна 100".
    Попробуйте и другие входы, например строку, содержащую как целые числа, так и другие значения, "2 rabbit 1 cat".
    Ошибки должны быть отловлены и корректно обработаны.

     */
    private String leksema;

    public String inputString() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
        leksema = in.nextLine();
        return leksema;
    }

    public String[] stringSplitAndWriteInArray () {
        String[] stringsArray = leksema.split(" ");
        return stringsArray;
    }

    public void stringSumOutput () {
        int sum = 0;
        for (String member : stringSplitAndWriteInArray()) {
            sum = Integer.parseInt(member.trim());
        }
        System.out.println(sum);
    }

    public void optionsOfThirdTaskOutput () {
        System.out.println("1. Ввод строки");
        System.out.println("2. Вывод суммы чисел которые есть в строке");
        System.out.println("3. Выход из программы");
    }

    public int optionNumInputOfThirdTask () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }
}