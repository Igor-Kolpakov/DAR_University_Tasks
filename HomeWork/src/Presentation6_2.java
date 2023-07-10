public class Presentation6_2 {
    public static void main(String[] args) {
        //двумерный массив
        int[][] twoDArray = new int[10][20];

        //трехмерный массив
        int[][][] threeDArray = new int[10][20][30];

        int[][] array = new int[10][20];
        array[0][0] = 1;
        System.out.println("array[0][0]: " + array[0][0]);


        int[][] array1 = new int[2][2];
        array1[0][0] = 1;
        array1[0][1] = 15;
        array1[1][0] = -2;
        array1[1][1] = 53;
        System.out.println("array1[0][0]: " + array1[0][0]);
        System.out.println("array1[0][0]: " + array1[0][1]);
        System.out.println("array1[0][0]: " + array1[1][0]);
        System.out.println("array1[0][0]: " + array1[1][1]);


        int[][] array2 = new int[2][2];
        array2[0][0] = 1;
        array2[0][1] = 15;
        array2[1][0] = -2;
        array2[1][1] = 53;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("array[" + i + "][" + j + "]: " + array2[i][j]);
            }
        }

        int[][] array3 = new int[2][2];
        array3[0][0] = 1;
        array3[0][1] = 15;
        array3[1][0] = -2;
        array3[1][1] = 53;
        for (int i1 = 0; i1 < array3.length; i1++) {
            for (int j1 = 0; j1 < array3[i1].length; j1++) {
                System.out.printf("array[%d][%d]: %d\n", i1, j1, array3[i1][j1]);
            }
        }

        int[][] array4 = {{1, 15}, {-2, 53}};
        for (int i2 = 0; i2 < array4.length; i2++) {
            for (int j2 = 0; j2 < array4[i2].length; j2++) {
                System.out.println("array[" + i2 + "][" + j2 + "]: " + array2[i2][j2]);
            }
        }

        int[][] array5 = {{4, 15, 10}, {3, 53, -2}};
        for (int i3 = 0; i3 < array5.length; i3++) {
            for (int j3 = 0; j3 < array5[i3].length; j3++) {
                System.out.print(array5[i3][j3] + " ");
            }
            System.out.println();
        }

        int[][] array6 = {{4, 15, 10}, {3, 5, -2}, {5, -4, 2}};
        for (int i4 = 0; i4 < array6.length; i4++) {
            for (int j4 = 0; j4 < array6[i4].length; j4++) {
                if (i4 == j4) {
                    System.out.println(array6[i4][j4] + " ");
                } else {
                    System.out.println(0 + " ");
                }
            }
            System.out.println();
        }

    }
}
