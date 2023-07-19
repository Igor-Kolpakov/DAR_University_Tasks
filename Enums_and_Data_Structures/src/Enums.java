public class Enums {

    public enum Colors {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        PURPLE
    }

    public enum Weekdays {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public void isWeekday() {
        for (Weekdays weekdays : Weekdays.values()) {
            if (weekdays != Weekdays.SATURDAY && weekdays != Weekdays.SUNDAY) {
                System.out.println("Рабочий день: " + weekdays);
            } else {
                System.out.println("Выходной: " + weekdays);
                break;
            }
        }
    }

    public void isHoliday() {
        for (Weekdays weekdays : Weekdays.values()) {
            if (weekdays == Weekdays.SATURDAY && weekdays == Weekdays.SUNDAY) {
                System.out.println("Выходной: " + weekdays);
            } else {
                System.out.println("Рабочий день: " + weekdays);
                break;
            }
        }
    }
}
