import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        /*
        //1. �������� ��������� ������������ Colors � ����������� ������. �������� �������� ������������ Colors �� ������.
        for (Enums.Colors colors : Enums.Colors.values()) {
            System.out.println(colors);
        }

        /*2. �������� ��������� ������������ Weekday � ����������� ��� MONDAY, TUESDAY,... �� SUNDAY.
        ������������ ������ ����� ����� ���������� boolean isWeekDay() � ����� ���������� boolean isHoliday().
        ����� isHoliday() ������ ���������� ��������, ��������������� isWeekDay().
        �������� ���������, ��������������� ������������� ����� ������������, � ������� ���� �����, ����������� � �������� ��������� Weekday � ���������� ��������� � ����������� �� ����, �������� �� ���� Weekday ����������� ��� ���.
        ���������: ����� main ����� ���������� ��� �������� � ������������ Weekday � ���������� �� � �������� ��������� ������.
        *--/
        Enums weekDays = new Enums();
        weekDays.isWeekday();
        weekDays.isHoliday();


        //4-�� ������
        Students studentAnna = new Students(5, "����");
        //studentAnna.setGrade(5);
        //System.out.println("����: " + studentAnna.getGrade());

        Students studentIgor = new Students(3, "�����");
        //studentAnna.setGrade(3);
        //System.out.println("�����: " + studentAnna.getGrade());

        Students studentRita = new Students(4, "���������");
        //studentAnna.setGrade(4);
        //System.out.println("���������: " + studentAnna.getGrade());

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
