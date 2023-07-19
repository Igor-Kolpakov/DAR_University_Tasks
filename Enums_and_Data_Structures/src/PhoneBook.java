import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PhoneBook {
    /*5. �������� ���������� ����������, �������������� ������� ���������� �����, ���������� ������ ����� ������� � ����������� ��������.
    ��������� ���������, ����� ��������� ������ ����� ������������ ��� ����� ���� ����������.
    � ������� ���� ������������ ����� ����������� �������� ����� �������, ����������� ��� ��������, �������� ���������� � ���������� �������� � ��������� ����� ��������� �� �����.
    ���������: ����������� Scanner, while(true), switch-case.
     */

    //������ �� ������������ ������� ��������� �������������
    public HashMap<String, String> staticPhoneBookCreation() {
        HashMap<String, String> staticPhoneBook = new HashMap<>();
        staticPhoneBook.put("�������� ��������� ���������", "+78092234596");
        staticPhoneBook.put("������� ������ ����������", "+79015455636");
        staticPhoneBook.put("���������� ����� �����������", "+75053698547");
        staticPhoneBook.put("������ ��������� ���������", "+78094879685");
        staticPhoneBook.put("������� ������� ������������", "+79012563215");
        staticPhoneBook.put("�������� ����� ��������", "+75054231563");
        return staticPhoneBook;
    }

    //������ ��� ������������� ���� ���������
    public HashMap<String, String> userInputPhoneBook = new HashMap<>();


    //������ ��� ����������� ����� ������ � ����������� ����������� ������ � ����
    public HashMap<String, String> userInputAndSaveInFilePhoneBook = new HashMap<>();

    //��������� �����
    public void options () {
        System.out.println("1:���������� ������������ ��������");
        System.out.println("2:�������� ����� �������");
        System.out.println("3:�������� ���������� � ������������ ��������");
        System.out.println("4:����� �� ����� ��������");
        System.out.println("5:����� �� ���������");

    }

    //���� ������ ��������
    public static int optionInput () {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���������������� ����� ��������: ");
        int optionNumber = in.nextInt();
        return optionNumber;
    }


    //����� ���� ��������� �� ����������� ����
    public void allContactsFromStaticMapOutput () {
       for (Map.Entry<String, String> entry : staticPhoneBookCreation().entrySet()) {
           System.out.println(entry);
       }
       optionInput();
    }

    //����� ��������� �� ������������ ����
    public void allContactsFromCashMapOutput () {
        for (Map.Entry<String, String> entry : userInputPhoneBook.entrySet()) {
            System.out.println(entry);
        }
        optionInput();
    }

    //����� ��������� �� ������������ ���� � ������� ������
    public void allContactsFromUserInputMapWithSaveOutput () {
        for (Map.Entry<String, String> entry : userInputAndSaveInFilePhoneBook.entrySet()) {
            System.out.println(entry);
        }
        optionInput();
    }

    //���� �����-����� ��������
    public static String contactNameAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ��� ��������: ");
        String name = in.nextLine();
        return name;
    }

    //���� �����-������ ��������
    public static String contactNumberAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� ��������: ");
        String number = in.nextLine();
        return number;
    }

    //����� �� ����� ��������
    public void contactNameSearchInStaticPhoneBook() {
        //System.out.print("������� ��� �������� ��������: ");
        String informationGet = staticPhoneBookCreation().get(contactNameAdd());
        System.out.println(informationGet);
        optionInput();
    }

    //����� �� ����� ��������
    public void contactNameSearchInCashUserPhoneBook() {
        //System.out.print("������� ��� �������� ��������: ");
        String informationGet = staticPhoneBookCreation().get(contactNameAdd());
        System.out.println(informationGet);
        optionInput();
    }

    //����� �� ����� ��������
    public void contactNameSearchInFileInputPhoneBook() {
        //System.out.print("������� ��� �������� ��������: ");
        String informationGet = staticPhoneBookCreation().get(contactNameAdd());
        System.out.println(informationGet);
        optionInput();
    }



    //������ �������� � ����������� ���������� �����
    public void newContactWriteInStaticMap () {
        staticPhoneBookCreation().put(contactNameAdd(), contactNumberAdd());
        System.out.println("����� ������� ��������");
        optionInput();
    }

    //������ �������� � ������ ��� ����
    public String newContactWriteInEmptyCashMap() {
        return userInputPhoneBook.put(contactNameAdd(), contactNumberAdd());
        //System.out.println("����� ������� ��������");
        //optionInput();
    }

    //������ �������� � ������������ ���� � ����������� � ������
    public void newContactWriteInFutureFileMap() {
        userInputAndSaveInFilePhoneBook.put(contactNameAdd(), contactNumberAdd());
        System.out.println("����� ������� ��������");
        optionInput();
    }
}
