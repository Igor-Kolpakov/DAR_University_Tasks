import java.util.HashMap;
import java.util.Map;

public class CashPhoneBook {
    //ХэшМап для кешированного вида программы
    private HashMap<String, String> userInputPhoneBook = new HashMap<>();

    //Вывод контактов из кэшированной Мапы
    public void allContactsFromCashMapOutput () {
        for (Map.Entry<String, String> entry : userInputPhoneBook.entrySet()) {
            System.out.println(entry);
        }
    }

    //Поиск контакта в кэш Мапе
    public void contactNameSearchInCashUserPhoneBook() {
        //System.out.print("Введите имя искомого контакта: ");
        String informationGet = userInputPhoneBook.get(InputDataInterface.contactNameAdd());
        System.out.println(informationGet);
    }

    //запись контакта в пустую кэш Мапу
    public String newContactWriteInEmptyCashMap() {
        return userInputPhoneBook.put(InputDataInterface.contactNameAdd(), InputDataInterface.contactNumberAdd());
        //System.out.println("Новый контакт добавлен");
    }

    //Обновление телефона для существующего контакта
    public void contactInformationUpdateInCashPhoneBook () {
        String forNameCheck = InputDataInterface.contactNameAdd();
        //boolean nameCheck = userInputPhoneBook.containsKey(contactNameAdd()); //nameCheck == true
        if (userInputPhoneBook.containsKey(forNameCheck) == true) {
            userInputPhoneBook.put(forNameCheck, InputDataInterface.contactNumberAdd());
        } else {
            System.out.println("Такого контакта не существует");
        }
    }
}
