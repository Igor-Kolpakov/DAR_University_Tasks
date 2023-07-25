import java.util.Scanner;

public class SecondTask {
    /*2. Профессор Смит, у которого вы работаете ассистентом, поделился с вами кодом, который он использует для автоматического оценивания работ студентов.
    В прошлом у него возникли некоторые проблемы с кодом при вводе общего возможного количества баллов за задание. Иногда он случайно вводит 0 для общего количества возможных баллов, и программа сталкивается с фатальной ошибкой при попытке разделить на 0.
    Чтобы решить эту проблему, напишите метод divide(), который принимает два параметра: x и y и возвращает результат: x/y.
    Однако, если y равно нулю, вы должны выбросить исключение.
    Если исключение будет отловлено, не забудьте вывести полезное сообщение.
    */
    private int x;
    private int y;

    public void inputNums () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во баллов");
        x = in.nextInt();
        System.out.print("Введите критерий оценивания");
        y = in.nextInt();
    }

    public void divide () {
        double endNum;
        endNum = x/y;
        System.out.println(endNum);
    }

    public void optionsOfSecondTaskOutput () {
        System.out.println("1. Ввод чисел");
        System.out.println("2. Расчет оценки");
        System.out.println("3. Выход из программы");
    }

    public int optionNumInput () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер операции: ");
        int num = in.nextInt();
        return num;
    }
}
