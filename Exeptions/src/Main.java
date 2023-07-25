import java.util.InputMismatchException;

public class Main {
    public static void main (String[] args) {

        /*
        FirstTask task1 = new FirstTask();
        boolean close = false;
        while (!close) {
            task1.optionsOutput();
            try {
                switch (task1.optionNumInput()) {
                    case (1) -> { task1.inputNumber(); }
                    case (2) -> { task1.mathPowOfInputNumber(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            }
        }*/

        SecondTask task2 = new SecondTask();
        boolean close = false;
        while (!close) {
            task2.optionsOfSecondTaskOutput();
            try {
                switch (task2.optionNumInput()) {
                    case (1) -> { task2.inputNums(); }
                    case (2) -> { task2.divide(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            } catch (ArithmeticException zeroInYExeption) {
                System.out.println("***********************************");
                System.out.println("Нельзя ставить 0 в делитель, попробуйте снова :)");
                System.out.println("***********************************");
            }
        }

        /*
        ThirdTask task3 = new ThirdTask();
        boolean close = false;
        while (!close) {
            task3.optionsOfThirdTaskOutput();
            try {
                switch (task3.optionNumInputOfThirdTask()) {
                    case (1) -> { task3.inputString(); }
                    case (2) -> { task3.stringSumOutput(); }
                    case (3) -> { close = true; }
                }
            } catch (InputMismatchException optionNumberException) {
                System.out.println("***********************************");
                System.out.println("Синтаксическая ошибка ввода");
                System.out.println("***********************************");
            } catch (NumberFormatException stringException) {
                System.out.println("***********************************");
                System.out.println("Нельзя превратить строку в число :)");
                System.out.println("***********************************");
            }
        }*/
    }
}
