import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.LocalDate;

public class Main {
    public enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myLevel = Level.HIGH;
        System.out.println(myLevel);
        String strLevel = "";
        switch (myLevel) {
            case LOW -> strLevel = "Низкий уровень";
            case MEDIUM -> strLevel = "Средний уровень";
            case HIGH -> strLevel = "Высокий уровень";
        }
        System.out.println(strLevel);

        for (Level level : Level.values()) {
            System.out.println(level);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Введите пользователя:");
        String userName = in.nextLine();
        System.out.println("Имя пользователя: " + userName);

        System.out.println("");
        String name = in.nextLine();
        System.out.println();
        int age = in.nextInt();
        System.out.println();
        double salary = in.nextDouble();
        Employee employee = new Employee(name, age, salary);
        System.out.println(employee);


        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        System.out.println("До форматирования: " + currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("После форматирования: " + formattedDateTime);


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Avocado");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        fruits.set(0, "Lime");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        int sizeOfFruits = fruits.size();
        System.out.println(sizeOfFruits);
        for (int i = 0; i<sizeOfFruits; i++) {
            System.out.println(fruits.get(i));
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("До сортировки: " + fruits);
        Collections.sort(fruits);
        System.out.println("После сортировки: " + fruits);

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(25);
        integers.add(-13);
        integers.add(52);
        for (Integer num : integers) {
            System.out.println(num);
        }
        System.out.println("До сортировки: " + integers);
        Collections.sort(integers);
        System.out.println("После сортировки: " + integers);


        LinkedList<String> fruits1 = new LinkedList<>();
        fruits1.add("Apple");
        fruits1.add("Banana");
        fruits1.add("Orange");
        fruits1.add("Avocado");
        System.out.println(fruits1);


        HashMap<String, String> cities = new HashMap<>();
        cities.put("Казахстан", "Астана");
        cities.put("Франция", "Париж");
        cities.put("США", "Вашингтон");
        cities.put("Англия", "Лондон");
        System.out.println(cities);
        String capitalKz = cities.get("Казахстан");
        System.out.println("Столица Казахстана:" + capitalKz);
        cities.remove("Франция");
        System.out.println(cities);
        cities.clear();
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println("Вывести только ключи:");
        for (String country : cities.keySet()) {
            System.out.println(country + " ");
        }
        System.out.println("Вывести только значения:");
        for (String city : cities.values()) {
            System.out.println(city + " ");
        }
        System.out.println("Вывести ключи и значения:");
        for (Map.Entry<String, String> entry : cities.entrySet()) {
            System.out.printf("%s - %s %n", entry.getKey(), entry.getValue());
        }

        HashMap<String, Double> students = new HashMap<>();
        students.put("Айдана", 3.0);
        students.put("Мария", 4.0);
        students.put("Азамат", 3.67);
        for (String student : students.keySet()) {
            System.out.println(student + ": " + students.get(student));
        }

        HashSet<String> fruits2 = new HashSet<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Banana");
        fruits2.add("Banana");
        System.out.println(fruits2);
        fruits2.add("Orange");
        fruits2.add("Avocado");
        System.out.println(fruits2.contains("Apple"));
        System.out.println(fruits2.contains("Lime"));
        fruits2.remove("Banana");
        System.out.println(fruits2);
        fruits2.clear();
        System.out.println(fruits2);
        System.out.println(fruits2.size());
        for (String fruit : fruits2) {
            System.out.println(fruit);
        }

        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(0);
        integers1.add(5);
        integers1.add(0);
        integers1.add(10);
        System.out.println(integers1);
        for (int i = 0; i <= 5; i++) {
            if (integers1.contains(i)) {
                System.out.println(i + "Было найдено");
            } else {
                System.out.println(i + "Не было найдено");
            }
        }

        ArrayList<String> fruits3 = new ArrayList<>();
        fruits3.add("Apple");
        fruits3.add("Banana");
        fruits3.add("Orange");
        fruits3.add("Avocado");
        Iterator<String> it = fruits3.iterator();
        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(5);
        integers2.add(25);
        integers2.add(-13);
        integers2.add(52);
        while (it.hasNext()) {
            Integer num = Integer.valueOf(it.next());
            if (num < 10) {
                it.remove();
            }
        }
        System.out.println(integers2);

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character letterA = 'A';
        System.out.printf("%d, %.2f, %c %n", myInt, myDouble, letterA);
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(letterA.charValue());
        Integer myInt1 = 12345;
        String intStr = myInt1.toString();
        System.out.println(intStr.length());



    }
}
