import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        int rubles;
        int kopeyki;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите рубли и копейки: ");
        rubles = in.nextInt();
        kopeyki = in.nextInt();

        System.out.print(rubles + " " + kopeyki);
        /*
        int[] numArray;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во зарплат: ");
        int n = in.nextInt();
        numArray = new int[n];
        System.out.println("Вводите зарплаты сотрудников: ");
        for (int i = 0; i < n; i++) {
            numArray[i] = in.nextInt();
        }

        int minNum = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int k = 0; k < i; k++) {
                while (i<5) {
                    minNum = numArray[k];
                }
                /*
                if (numArray[k] < numArray[i]) {
                    minNum = numArray[k];
                }
                continue;
            }
        }
        System.out.print("Минимальное число: " + minNum);  */
    }
}
