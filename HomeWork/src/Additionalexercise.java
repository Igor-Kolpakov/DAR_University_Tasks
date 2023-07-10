public class Additionalexercise {
    public static void main(String[] args) {
        String flowersName = "Roses ";
        byte flowersNumber = 101;
        System.out.println(flowersName + flowersNumber);

        byte a = 15;
        byte b = 10;
        System.out.println("15 + 10 = " + (a+b));
        int c;
        c = a + b;
        System.out.println(c);

        int x = 25, y = 50, z = 75;
        System.out.println(x + y + z);
        int q, w, e, r;
        q = w = e = r = 100;
        System.out.println(q + w + e + r);

        double myDoubleNum;
        final double PI = 3.14;
        final double g = 9.8;
        final String cityName = "Almaty";
        myDoubleNum = 215.15;
        System.out.println(myDoubleNum);

        byte myByte = 12;
        short myShort = -1;
        int myNum = 37;
        double myDoubleNum2 = 3.98;
        long myLong = 1200000L;
        float myFloatNum = 8.65f;
        char myLetter = 'I';
        boolean myBool = true;
        String myText = "Privet";
        myDoubleNum = 376.98;

        System.out.println(myDoubleNum);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myNum);
        System.out.println(myDoubleNum2);
        System.out.println(myLong);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        byte m = 47;
        int n = m;
        int j = 4;
        byte h = (byte)j;
        System.out.println("Расширяющее приведение byte в int " + n);
        System.out.println("Сужающее приведение int в byte " + h);
    }
}
