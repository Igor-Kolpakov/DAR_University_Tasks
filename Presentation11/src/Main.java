public class Main {

    static boolean checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Доступ запрещен!");
        } else {
            System.out.println("Доступ разрешен");
            return true;
        }
    }

    public static void main(String[] args) {
        try {
            int[] myIntegers = {1, 3, 4, 6};
            int i = myIntegers[10];
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Возникла ошибка");
        } finally {
            System.out.println("Процесс завершен");
        }

        boolean isValid = checkAge(15);
        System.out.println(isValid);
    }
}
