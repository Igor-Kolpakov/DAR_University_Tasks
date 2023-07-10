import java.util.Scanner;

public class AdditionalExercise3 {
    public static void main(String[] args) {
        /*1: Напишите программу, чтобы проверить значения длины и ширины прямоугольника.
        И определить, является ли он квадратным или нет.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину: ");
        int length = in.nextInt();
        System.out.print("Введите ширину: ");
        int width = in.nextInt();
        System.out.print("Введите гипотенузу: ");
        int hypotenuse = in.nextInt();
        if ((hypotenuse * hypotenuse) == ((length * length) + (width * width))) {
            System.out.println("Ответ: Прямоугольный ");
        } else if ((hypotenuse * hypotenuse) < ((length * length) + (width * width))) {
            System.out.println("Ответ: Остроугольный ");
        } else if ((hypotenuse * hypotenuse) > ((length * length) + (width * width))) {
            System.out.println("Ответ: Тупоугольный ");
        }
        /*2:Магазин предоставит скидку в 10%, если стоимость купленного товара будет больше 5000.
        Если стоимость товара ниже 5000, то стоимость остается без изменений.
        Вычислите и выведите итоговую стоимость покупки для пользователя.
         */
        System.out.print("Введите цену: ");
        double price = in.nextDouble();
        if (price > 5000) {
            double newprice = price * 0.9;
            System.out.println("Новая цена: " + newprice);
        } else {
            System.out.println("Цена осталась прежней");
        }
        /*3:В университете существуют следующие правила для системы оценок:
        Ниже 25 - F
        От 25 до 45 - E
        От 45 до 50 - D
        От 50 до 60 - C
        От 60 до 80 - B
        Выше 80 - A
        Создайте переменную grade и напечатайте в консоль соответствующую оценку в зависимости от значения переменной.
        */
        System.out.print("Введите балл: ");
        int grade = in.nextInt();
        if (grade < 25) {
            System.out.println("Ваша оценка: F ");
        } else if (grade >= 25 && grade <= 45) {
            System.out.println("Ваша оценка: E ");
        } else if (grade >= 45 && grade <= 50) {
            System.out.println("Ваша оценка: D ");
        } else if (grade >= 50 && grade <= 60) {
            System.out.println("Ваша оценка: C ");
        } else if (grade >= 60 && grade <= 80) {
            System.out.println("Ваша оценка: B ");
        } else if (grade > 80) {
            System.out.println("Ваша оценка: A ");
        }

        /*4:Дано целое положительное число. Напишите программу, которая выводит это число в обратном порядке.
        Например, если дано число 12345, то вывод будет следующим: 54321.
        */
        System.out.print("Введите число: ");
        int a = in.nextInt();
        int b;
        while (a>0) {
            b = a%10;
            a /=10;
            System.out.print(b);
        } System.out.println(" Поздравляю");
        /*5. Дано целое положительное число.
        Напишите программу, которая выводит сообщение о том, является ли это число простым.
         */

        System.out.print("Введите число: ");
        int chislo = in.nextInt();
        for(int i=2; i<=Math.sqrt(chislo); i++){
        if(chislo%i==0) {
            System.out.println("Число составное");
        }
        System.out.println("Число простое");
        }

        /*
        6. Напишите программу для печати следующего сообщения:

        i)
        **********
        **********
        **********
        **********
         */

        System.out.print("Введите число: ");
        int x = in.nextInt();
        for (int y= 0; y<=x; y++ ) {
            System.out.print("*");
        } System.out.println();
        for (int z= 0; z<=x; z++ ) {
            System.out.print("*");
        } System.out.println();
        for (int c= 0; c<=x; c++ ) {
            System.out.print("*");
        } System.out.println();
        for (int v= 0; v<=x; v++ ) {
            System.out.print("*");
        }
            System.out.println();


        /*
        6:Напишите программу для печати следующего сообщения:

        ii)
        *
        **
        ***
        ****
        *****
         */

        System.out.print("Введите предел звездочек: ");
        int i1 = in.nextInt();
        for (int i2 = 0; i2 <= i1; i2++) {
            for (int j = 0; j <= i2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*
        6:Напишите программу для печати следующего сообщения:
        iii)
                1
              212
            32123
          4321234
        543212345
         */
        System.out.print("Введите предел выводимых чисел: ");
        int predel = in.nextInt();
        for (int i2 = 1; i2 <= predel; i2++) {
            for (int j = 1; j <= i2; j++) {
                System.out.print(" " + j + "" + j);
            }
            System.out.println(); // Не знаю как отзеркалить пирамидку и сплюсовать новое значение.
        } System.out.println();

        /*
        7:Даны два целых числа a и b.
        Напишите программу для вычисления суммы натуральных чисел в диапазоне от a до b.
         */
        System.out.print("Введите первое число: ");
        int a1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int b1 = in.nextInt();
        int pow = 2;
        int sum;
        if (b1>0) {
            sum =(int)((Math.pow(b1, pow))/2) - (b1/2);
            System.out.print(sum);
        } else System.out.println("Ошибка");
        System.out.println();

        /*
        8:В компании прошла аттестация по компетенциям и навыкам сотрудников.
        Даны зарплата и класс сотрудника.
        Напишите программу, чтобы определить сумму премии в зависимости от класса сотрудника.
        Необходимо создать переменную со значением зарплаты сотрудника;
        вывести в консоль результирующую зарплату с премией.

        Бонусы в зависимости от класса:

        Класс A: 50%
        Класс B: 25%
        Класс C: 0%
         */
        System.out.print("Введите вашу зарплату: ");
        int salary = in.nextInt();
        double resultSalary;
        if (salary>0 && salary<=250000) {
            resultSalary = salary;
            System.out.print("Ваш класс C: " + resultSalary);
        } else if (salary>250000 && salary<=500000) {
            resultSalary = (salary * 1.25);
            System.out.print("Ваш класс B: " + resultSalary);
        } else if (salary>500000 && salary<=1000000) {
            resultSalary = (salary * 1.5);
            System.out.print("Ваш класс A: " + resultSalary);
        } System.out.println();

        /*
        Дано целое положительное число n. Напишите программу для печати ряда Фибоначчи из n членов:

        0 1 1 2 3 5 8 13 21 .....
         */
        int f1 = 0;
        int f2 = 1;
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        for (int k = 0; k < (n - 2); k++ ) {
            int fSum;
            fSum = f1 + f2;
            f1 = f2;
            f2 = fSum;
            System.out.print(" " + f2 + " ");
        } System.out.println();
        in.close();

    }

}
