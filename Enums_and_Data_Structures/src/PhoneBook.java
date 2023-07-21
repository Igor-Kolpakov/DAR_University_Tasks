import java.util.HashMap;
import java.util.Map;


public class PhoneBook implements InputDataInterface {
    /*5. Напишите консольное приложение, представляющее простую телефонную книгу, содержащую связки между именами и телефонными номерами.
    Подумайте тщательно, какую структуру данных можно использовать для этого типа приложения.
    В главном меню пользователь имеет возможность добавить новый контакт, просмотреть все контакты, обновить информацию о конкретном контакте и выполнить поиск контактов по имени.
    Подсказка: используйте Scanner, while(true), switch-case.
     */

    //ХэшМап со статическими данными вводимыми программистом
    private HashMap<String, String> staticPhoneBookCreation() {
        HashMap<String, String> staticPhoneBook = new HashMap<>();
        staticPhoneBook.put("Филатова Маргарита Андреевна", "+78092234596");
        staticPhoneBook.put("Акронов Максим Васильевич", "+79015455636");
        staticPhoneBook.put("Калимуллин Алмас Жанибекович", "+75053698547");
        staticPhoneBook.put("Пучков Александр Антонович", "+78094879685");
        staticPhoneBook.put("Искаков Алексей Владимирович", "+79012563215");
        staticPhoneBook.put("Аксенова Ирина Игоревна", "+75054231563");
        return staticPhoneBook;
    }

    //Вывод всех контактов из статической мапы
    public void allContactsFromStaticMapOutput () {
       for (Map.Entry<String, String> entry : staticPhoneBookCreation().entrySet()) {
           System.out.println(entry);
       }
    }

    //поиск по имени контакта
    public void contactNameSearchInStaticPhoneBook() {
        //System.out.print("Введите имя искомого контакта: ");
        String informationGet = staticPhoneBookCreation().get(InputDataInterface.contactNameAdd());
        System.out.println(informationGet);
    }

    //Запись контакта в статическую телефонную книгу
    public String newContactWriteInStaticMap () {
        return staticPhoneBookCreation().put(InputDataInterface.contactNameAdd(), InputDataInterface.contactNumberAdd());
    }

    //Обновление телефона для существующего контакта
    public void contactInformationUpdateInStaticPhoneBook () {
        String forNameCheck = InputDataInterface.contactNameAdd();
        //boolean nameCheck = userInputPhoneBook.containsKey(contactNameAdd()); //nameCheck == true
        if (staticPhoneBookCreation().containsKey(forNameCheck) == true) {
             staticPhoneBookCreation().put(forNameCheck, InputDataInterface.contactNumberAdd());
        } else {
            System.out.println("Такого контакта не существует");
        }
    }
}
