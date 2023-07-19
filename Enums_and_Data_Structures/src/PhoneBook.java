import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PhoneBook {
    /*5. Напишите консольное приложение, представляющее простую телефонную книгу, содержащую связки между именами и телефонными номерами.
    Подумайте тщательно, какую структуру данных можно использовать для этого типа приложения.
    В главном меню пользователь имеет возможность добавить новый контакт, просмотреть все контакты, обновить информацию о конкретном контакте и выполнить поиск контактов по имени.
    Подсказка: используйте Scanner, while(true), switch-case.
     */

    //ХэшМап со статическими данными вводимыми программистом
    public HashMap<String, String> staticPhoneBookCreation() {
        HashMap<String, String> staticPhoneBook = new HashMap<>();
        staticPhoneBook.put("Филатова Маргарита Андреевна", "+78092234596");
        staticPhoneBook.put("Акронов Максим Васильевич", "+79015455636");
        staticPhoneBook.put("Калимуллин Алмас Жанибекович", "+75053698547");
        staticPhoneBook.put("Пучков Александр Антонович", "+78094879685");
        staticPhoneBook.put("Искаков Алексей Владимирович", "+79012563215");
        staticPhoneBook.put("Аксенова Ирина Игоревна", "+75054231563");
        return staticPhoneBook;
    }

    //ХэшМап для кешированного вида программы
    public HashMap<String, String> userInputPhoneBook = new HashMap<>();


    //ХэшМап для консольного ввода данных с последующим сохранением данных в файл
    public HashMap<String, String> userInputAndSaveInFilePhoneBook = new HashMap<>();

    //Доступные опции
    public void options () {
        System.out.println("1:Посмотреть существующие контакты");
        System.out.println("2:Добавить новый контакт");
        System.out.println("3:Обновить информацию о существующем контакте");
        System.out.println("4:Поиск по имени контакта");
        System.out.println("5:Выход из программы");

    }

    //Ввод номера операции
    public static int optionInput () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предпочтительный номер операции: ");
        int optionNumber = in.nextInt();
        return optionNumber;
    }


    //Вывод всех контактов из статической мапы
    public void allContactsFromStaticMapOutput () {
       for (Map.Entry<String, String> entry : staticPhoneBookCreation().entrySet()) {
           System.out.println(entry);
       }
       optionInput();
    }

    //Вывод контактов из кэшированной Мапы
    public void allContactsFromCashMapOutput () {
        for (Map.Entry<String, String> entry : userInputPhoneBook.entrySet()) {
            System.out.println(entry);
        }
        optionInput();
    }

    //Вывод контактов из кешированной мапы с записью данных
    public void allContactsFromUserInputMapWithSaveOutput () {
        for (Map.Entry<String, String> entry : userInputAndSaveInFilePhoneBook.entrySet()) {
            System.out.println(entry);
        }
        optionInput();
    }

    //Ввод ключа-имени контакта
    public static String contactNameAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя контакта: ");
        String name = in.nextLine();
        return name;
    }

    //Ввод ключа-номера контакта
    public static String contactNumberAdd () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер телефона: ");
        String number = in.nextLine();
        return number;
    }

    //поиск по имени контакта
    public void contactNameSearchInStaticPhoneBook() {
        //System.out.print("Введите имя искомого контакта: ");
        String informationGet = staticPhoneBookCreation().get(contactNameAdd());
        System.out.println(informationGet);
        optionInput();
    }

    //поиск по имени контакта
    public void contactNameSearchInCashUserPhoneBook() {
        //System.out.print("Введите имя искомого контакта: ");
        String informationGet = staticPhoneBookCreation().get(contactNameAdd());
        System.out.println(informationGet);
        optionInput();
    }

    //поиск по имени контакта
    public void contactNameSearchInFileInputPhoneBook() {
        //System.out.print("Введите имя искомого контакта: ");
        String informationGet = staticPhoneBookCreation().get(contactNameAdd());
        System.out.println(informationGet);
        optionInput();
    }



    //Запись контакта в статическую телефонную книгу
    public void newContactWriteInStaticMap () {
        staticPhoneBookCreation().put(contactNameAdd(), contactNumberAdd());
        System.out.println("Новый контакт добавлен");
        optionInput();
    }

    //запись контакта в пустую кэш Мапу
    public String newContactWriteInEmptyCashMap() {
        return userInputPhoneBook.put(contactNameAdd(), contactNumberAdd());
        //System.out.println("Новый контакт добавлен");
        //optionInput();
    }

    //запись контакта в кэшированную мапу с сохранением в файлик
    public void newContactWriteInFutureFileMap() {
        userInputAndSaveInFilePhoneBook.put(contactNameAdd(), contactNumberAdd());
        System.out.println("Новый контакт добавлен");
        optionInput();
    }
}
