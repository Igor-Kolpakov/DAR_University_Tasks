public class Presentation5_1 {
    public static void main (String[] args) {
        if (30 > 10) {
            System.out.println("30 больше, чем 10");
        }

        int x = 20;
        int y = 40;
        if (x < y)
            System.out.println(x + "меньше " + y);

        int time = 20;
        if (time < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }

        int time1 = 20;
        if (time1 < 18) {
            System.out.println("Добрый утро!");
        } else if (time1 < 20) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
            case 2:
                System.out.println("Вторник");
            case 3:
                System.out.println("Среда");
            case 4:
                System.out.println("Четверг");
            case 5:
                System.out.println("Пятница");
            case 6:
                System.out.println("Суббота");
            case 7:
                System.out.println("Воскресенье");
                break;
        }

        String color = "Blue";
        switch (color) {
            case "Blue":
                System.out.println("Голубой");
                break;
            case "Black":
                System.out.println("Черный");
                break;
        }

        int day1 = 1;
        switch (day1) {
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскреснье");
                break;
            default:
                System.out.println("C нетерпением жду выходных");
        }

        String myNumber = "два";
        switch (myNumber) {
            case "один":
                System.out.println(1);
                break;
            case "два":
                System.out.println(2);
                break;
            case "три":
                System.out.println(3);
                break;
            default:
                System.out.println("Не найдено");
        }
    }
}
