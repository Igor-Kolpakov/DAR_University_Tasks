public class Main {

    static boolean checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("������ ��������!");
        } else {
            System.out.println("������ ��������");
            return true;
        }
    }

    public static void main(String[] args) {
        try {
            int[] myIntegers = {1, 3, 4, 6};
            int i = myIntegers[10];
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("�������� ������");
        } finally {
            System.out.println("������� ��������");
        }

        boolean isValid = checkAge(15);
        System.out.println(isValid);
    }
}
