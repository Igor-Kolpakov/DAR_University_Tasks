import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Students student1 = new Students("Anna", 12);
        student1.getName();
        student1.getId();
        student1.setLearningYear(4);
        student1.learningYearIncrease();


        StarTriangle small = new StarTriangle(3);
        for (int i2 = 0; i2 <= small.getWidth(); i2++) {
            for (int j = 0; j < i2; j++) {
                System.out.print(small.toString());
            } System.out.println();
        }

        //Пользовательский ввод лимита звездочек
        StarTriangle userTriangle = new StarTriangle();
        userTriangle.starLimitInput();
        for (int i2 = 0; i2 <= userTriangle.getWidth(); i2++) {
            for (int j = 0; j < i2; j++) {
                System.out.print(small.toString());
            } System.out.println();
        }


        Square square = new Square();
        square.sideInput();
        System.out.println("Периметр = " + square.perimeterCalculation());
        System.out.println("Площадь = " + square.squareCalculation());
        System.out.println("Длинна диагонали =" + square.diagonalCalculation());


        Temperature temperature = new Temperature();
        temperature.degreesUserInput();
        temperature.degreesUserTypeInput();
        switch (temperature.getDegreesType().toLowerCase()) {
            case ("c") :
                temperature.degreesConvertToFahrenheit();
                break;
            case ("f") :
                temperature.degreesConvertToCelsius();
                break;
        }

    }
}
