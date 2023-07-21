import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class HashSetTasks {
    /*11. Напишите программу для сравнения двух HashSet и сохранения элементов, одинаковых в обоих HashSet.
      12. Напишите программу для проверки того, является ли HashSet пустым или нет.
     */
   private HashSet<String> annaGems = new HashSet<>();
   private HashSet<String> irinaGems = new HashSet<>();
   private ArrayList<String> forDuplicates = new ArrayList<>();


    public String hashSetInputForAnna () {
        return String.valueOf(annaGems.add(InputDataInterface.gemsInput()));
    }

    public void hashSetOutputForAnna () {
        for (String out : annaGems) {
            System.out.println(out);
        }
    }

    public void hashSetCheckForAnna () {
        if (annaGems.isEmpty()) {
            System.out.println("Коллекция пустая");
        } else {
            System.out.println("В коллекции что-то есть");
        }
    }

    public String hashSetInputForIrina () {
        return String.valueOf(irinaGems.add(InputDataInterface.gemsInput()));
    }

    public void hashSetOutputForIrina () {
        for (String out : irinaGems) {
            System.out.println(out);
        }
    }

    public void duplicatesOutput () {
        for (String dup : forDuplicates) {
            System.out.println(dup);
        }
    }

    public void twoHashSetsCheck () {
        for (String anna : annaGems) {
            for (String irina : irinaGems) {
                if (Objects.equals(anna.toLowerCase(), irina.toLowerCase())) {
                    forDuplicates.add(anna);
                }
            }
        }
    }

}
