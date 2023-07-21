import java.util.HashMap;
import java.util.Map;

public class FileWritePhoneBook {
    //ХэшМап для консольного ввода данных с последующим сохранением данных в файл
    private HashMap<String, String> userInputAndSaveInFilePhoneBook = new HashMap<>();

    //Вывод контактов из кешированной мапы с записью данных
    public void allContactsFromUserInputMapWithSaveOutput () {
        for (Map.Entry<String, String> entry : userInputAndSaveInFilePhoneBook.entrySet()) {
            System.out.println(entry);
        }
    }

    //поиск по имени контакта
    public void contactNameSearchInFileInputPhoneBook() {
        //System.out.print("Введите имя искомого контакта: ");
        String informationGet = userInputAndSaveInFilePhoneBook.get(InputDataInterface.contactNameAdd());
        System.out.println(informationGet);
    }

    //запись контакта в кэшированную мапу с сохранением в файлик
    public String newContactWriteInFutureFileMap() {
        return userInputAndSaveInFilePhoneBook.put(InputDataInterface.contactNameAdd(), InputDataInterface.contactNumberAdd());
        //System.out.println("Новый контакт добавлен");
    }

    //Поиск контакта по имени
    public void contactInformationUpdateInCashPhoneBook () {
        String forNameCheck = InputDataInterface.contactNameAdd();
        if (userInputAndSaveInFilePhoneBook.containsKey(forNameCheck) == true) {
            userInputAndSaveInFilePhoneBook.put(forNameCheck, InputDataInterface.contactNumberAdd());
        } else {
            System.out.println("Такого контакта не существует");
        }
    }
}
