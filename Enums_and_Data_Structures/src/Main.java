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

        /*
        boolean close = false;
        CashPhoneBook cashPhoneBookOutput = new CashPhoneBook();
        while (!close) {
            InformationOutputInterface.phoneBookOptions();
            try {
                switch (InputDataInterface.optionInput()) {
                    case (1) -> { cashPhoneBookOutput.allContactsFromCashMapOutput(); }
                    case (2) -> { cashPhoneBookOutput.newContactWriteInEmptyCashMap(); }
                    case (3) -> { cashPhoneBookOutput.contactInformationUpdateInCashPhoneBook(); }
                    case (4) -> { cashPhoneBookOutput.contactNameSearchInCashUserPhoneBook(); }
                    case (5) -> { close = true; }
                }
            } catch (Exception falseInput) {
                System.out.println("Ошибка ввода");
            }
        } */


        /*
        ArrayListTasks colors = new ArrayListTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.colorOptions();
            try {
                switch (InputDataInterface.optionInput()) {
                    case (1) -> { colors.colorsInputInArrayList(); }
                    case (2) -> { colors.colorsOutput(); }
                    case (3) -> { colors.colorsForCheckInput(); }
                    case (4) -> { colors.twoArrayListCheck(); }
                    case (5) -> { close = true; }
                }
            } catch (Exception falseInput) {
                System.out.println("Ошибка ввода");
            }
        } */

        /*
        LinkedListTasks element = new LinkedListTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.linkedLisOption();
            try {
                switch (InputDataInterface.optionInput()) {
                    case (1) -> { element.linkedListInput(); }
                    case (2) -> { element.linkedListOutput(); }
                    case (3) -> { element.showFirstAndLastElement(); }
                    case (4) -> { element.linkedListUpdateUserInfo(); }
                    case (5) -> { close = true; }
                }
            } catch (Exception falseInput) {
                System.out.println("Ошибка ввода");
            }
        } */

        /*
        HashSetTasks gems = new HashSetTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.hashSetOptions();
            try {
                switch (InputDataInterface.optionInput()) {
                    case (1) -> { gems.hashSetInputForAnna(); }
                    case (2) -> { gems.hashSetOutputForAnna(); }
                    case (3) -> { gems.hashSetInputForIrina(); }
                    case (4) -> { gems.hashSetOutputForIrina(); }
                    case (5) -> { gems.hashSetCheckForAnna(); }
                    case (6) -> { gems.twoHashSetsCheck(); gems.duplicatesOutput(); }
                    case (7) -> { close = true; }
                }
            } catch (Exception falseInput) {
                System.out.println("Ошибка ввода");
            }
        } */

        HashMapTasks animals = new HashMapTasks();
        boolean close = false;
        while (!close) {
            InformationOutputInterface.hashMapOption();
            try {
                switch (InputDataInterface.optionInput()) {
                    case (1) -> { animals.animalsAndActionsInput(); }
                    case (2) -> { animals.animalsAndActionOutput(); }
                    case (3) -> { animals.animalsAndActionCheck(); }
                    case (4) -> { animals.backingUpAnimals(); }
                    case (5) -> { close = true; }
                }
            } catch (Exception falseInput) {
                System.out.println("Ошибка ввода");
            }
        }
    }
}
