import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        /*
        //1. Создайте публичное перечисление Colors с константами цветов. Выведите значения перечисления Colors на печать.
        for (Enums.Colors colors : Enums.Colors.values()) {
            System.out.println(colors);
        }

        /*2. Создайте публичное перечисление Weekday с константами для MONDAY, TUESDAY,... до SUNDAY.
        Перечисление должно иметь метод экземпляра boolean isWeekDay() и метод экземпляра boolean isHoliday().
        Метод isHoliday() должен возвращать значение, противоположное isWeekDay().
        Напишите программу, демонстрирующую использование этого перечисления, в которой есть метод, принимающий в качестве аргумента Weekday и печатающий сообщение в зависимости от того, является ли этот Weekday праздничным или нет.
        Подсказка: метод main может перебирать все значения в перечислении Weekday и передавать их в качестве аргумента методу.
        *--/
        Enums weekDays = new Enums();
        weekDays.isWeekday();
        weekDays.isHoliday();


        //4-ая задача
        Students studentAnna = new Students(5, "Анна");
        //studentAnna.setGrade(5);
        //System.out.println("Анна: " + studentAnna.getGrade());

        Students studentIgor = new Students(3, "Игорь");
        //studentAnna.setGrade(3);
        //System.out.println("Игорь: " + studentAnna.getGrade());

        Students studentRita = new Students(4, "Маргарита");
        //studentAnna.setGrade(4);
        //System.out.println("Маргарита: " + studentAnna.getGrade());

        ArrayList<String> students = new ArrayList<>();
        students.add(studentAnna.toString());
        students.add(studentIgor.toString());
        students.add(studentRita.toString());
        //System.out.println(students);
        for (String student : students) {
            System.out.println(student);
        }
        */


        boolean close = false;
        PhoneBook phoneBookOutput = new PhoneBook();
        while (!close) {
            phoneBookOutput.options();
            switch (phoneBookOutput.optionInput()) {
                case (1) : phoneBookOutput.allContactsFromCashMapOutput();

                case (2) :
                    phoneBookOutput.newContactWriteInEmptyCashMap();
                    phoneBookOutput.optionInput();

                case (3) :

                case (4) : phoneBookOutput.contactNameSearchInCashUserPhoneBook();

                case (5) :
                    close = true;
                    break;
            }
        }

    }
}
