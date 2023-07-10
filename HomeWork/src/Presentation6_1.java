public class Presentation6_1 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Avocado"};
        int[] myInteger = {10, 20, 30, 40};

        String[] fruits1 = {"Apple", "Banana", "Orange", "Avocado"};
        System.out.println(fruits1[0]);

        String[] fruits2 = {"Apple", "Banana", "Orange", "Avocado"};
        System.out.println("1-ый элемент" + fruits2[0]);
        fruits2[0] = "Lime";
        System.out.println("Измененный 1-ый элемент: " + fruits2[0]);


        String[] fruits3 = {"Apple", "Banana", "Orange", "Avocado"};
        System.out.println("Длинна массива: " + fruits3.length);


        String[] fruits4 = {"Apple", "Banana", "Orange", "Avocado"};
        for (int i = 0; i < fruits4.length; i++) {
            System.out.println(fruits4[i]);
        }

        String[] fruits5 = {"Apple", "Banana", "Orange", "Avocado"};
        for (String fruit : fruits5) {
            System.out.println(fruit);
        }
    }
}
