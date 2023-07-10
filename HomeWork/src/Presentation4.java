public class Presentation4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 2;

        int c = a + b;
        int d = 4 + b;
        System.out.println(a + "+" + b + "=" + c);
        System.out.println(4 + "+" + b + "=" + d);

        c = a - b;
        d = 4 - a;
        System.out.println(a + "-" + b + "=" + c);
        System.out.println(4 + "-" + b + "=" + d);

        int v = a * b;
        int n = b * 5;
        System.out.println(a + "*" + b + "=" + v);
        System.out.println(4 + "*" + b + "=" + n);

        v = a / b;
        double e = 22.5 / 4.5;
        System.out.println(a + "/" + b + "=" + v);
        System.out.println("22.5/4.5= " + e);


        a++; // 20 + 1
        System.out.println("a++ = " + a); // 21
        System.out.println("a++ = " + a++); // Вывод 21, потом +1
        a--; // 21 - 1
        System.out.println("a-- = " + a); //21
        System.out.println("a-- = " + a--); // Вывод 21, потом -1


        ++a; // 20 + 1
        System.out.println("++a = " + a); // 21
        System.out.println("++a = " + ++a); // Сначала +1, вывод 20
        --a; // 22 - 1
        System.out.println("--a = " + a); //21
        System.out.println("--a = " + --a); // Сначала -1, вывод 20

        int a1 = 5;
        System.out.println("a1+=10: " + (a1 += 10));
        System.out.println("a1-=3: " + (a1 -= 3));
        System.out.println("a1*=2: " + (a1 *= 2));
        System.out.println("a1/=6: " + (a1 /= 6));
        System.out.println("a1<<=4: " + (a1 <<= 4));
        System.out.println("a1>>=2: " + (a1 >>= 2));

        int a2 = 10;
        int b2 = 4;
        System.out.println(a2 + "==" + b2 + ": " +(a2 == b2));
        System.out.println(a2 + "==10 " + (a2 == 10));
        System.out.println(a2 + "!=" + b2 + ": " + (a2 != b2));
        System.out.println(a2 + "!=10: " + (a2 != 10));
        System.out.println(a2 + "<" + b2 + ": " + (a2 < b2));
        System.out.println(a2 + ">" + b2 + ": " + (a2 > b2));
        System.out.println( "10>=10: " + (10 >= 10));
        System.out.println("10>=4: " + (10 >= 4));
        System.out.println("10>=20: " + (10 >= 20));
        System.out.println("10<=10: " + (10 <= 10));
        System.out.println("10<=4: " + (10 <= 4));
        System.out.println("10<=20: " + (10 <= 20));


        boolean p1 = (5 > 6) || (4 < 6);
        boolean p2 = (5 > 6) || (4 > 6);
        boolean p3 = (5 > 6) && (4 < 6);
        boolean p4 = (50 > 6) && (4 / 2 < 3);
        boolean p5 = (5 < 6) ^ (4 > 6);
        boolean p6 = (5 > 6) ^ (4 / 2 < 3);

        System.out.println("5>6: " + (5 > 6) + ", 4<6: " + (4 < 6) + ", результат: " + p1);
        System.out.println("5>6: " + (5 > 6) + ", 4>6: " + (4 > 6) + ", результат: " + p2);
        System.out.println("5>6: " + (5 > 6) + ", 4<6: " + (4 < 6) + ", результат: " + p3);
        System.out.println("50>6: " + (50 > 6) + ", 4/2<3: " + (4 / 2 < 3) + ", результат: " + p4);
        System.out.println("5<6: " + (5 < 6) + ", 4>6: " + (4 > 6) + ", результат: " + p5);
        System.out.println("50>6: " + (50 > 6) + ", 4/2<3: " + (4 / 2 < 3) + ", результат: " + p6);


    }
}
