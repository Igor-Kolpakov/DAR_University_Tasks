import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    /*13. Напишите программу для копирования всех записей из одной HashMap в другую.
      14. Напишите программу для проверки, содержит ли HashMap запись для указанного значения.
     */
    private HashMap<String, String> animalsAndAction = new HashMap<>();
    private HashMap<String, String> backUpMap = new HashMap<>();

    public void animalsAndActionOutput () {
        for (Map.Entry<String, String> entry : animalsAndAction.entrySet()) {
            System.out.println(entry);
        }
    }

    public void animalsAndActionCheck() {
        String actionCheck = InputDataInterface.animalAction();
        if (animalsAndAction.containsValue(actionCheck)) {
            System.out.println("Животное c таким действием существует");
        } else {
            System.out.println("Животного с таким действием нет");
        }
    }

    public String animalsAndActionsInput() {
        return animalsAndAction.put(InputDataInterface.animal(), InputDataInterface.animalAction());
    }

    public void backingUpAnimals () {
        backUpMap = (HashMap<String, String>) animalsAndAction.clone();
        for (Map.Entry<String, String> backupEntry : backUpMap.entrySet()) {
            System.out.println(backupEntry);
        }
    }
}
