public class Presentation5_2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int i1 = 0;
        do {
            System.out.println(i1);
            i1++;
        }
        while (i1 < 5);


        for (int i2 = 0; i2 < 5; i2++) {
            System.out.println(i2);
        }

        for (int i3 = 0; i3 < 10; i3 += 2) {
            System.out.println(i3);
        }

        String[] fruits = {"Apple", "Banana", "Avocado"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int i4 = 0; i4 < 6; i4++) {
            if (i4 == 3) {
                break;
            }
            System.out.println(i4);
        }

        for (int a = 0; a < 6; a++) {
            if (a == 3) {
                continue;
            }
            System.out.println(a);
        }

        int a1 = 0;
        while (a1 < 6) {
            if (a1 ==3) {
                break;
            }
            System.out.println(a1);
            a1++;
        }

        int a2 = 0;
        while (a2 < 6) {
            if (a2 == 3) {
                a2++;
                continue;
            }
            System.out.println(a2);
            a2++;
        }

    }
}
