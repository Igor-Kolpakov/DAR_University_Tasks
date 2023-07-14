import java.util.Scanner;

public class Temperature {
    /*9. Напишите класс Temperature, который имеет два поля: значение температуры (double) и символ шкалы, либо 'C' для Цельсия, либо 'F' для Фаренгейта.
        Убедитесь, что доступ к этим двум полям возможен только через методы-аксессоры (get/set) вне класса.

        Конструкторы:
        Класс должен иметь четыре конструктора:
        один для каждого поля экземпляра (предположим, ноль градусов, если значение не указано, и Цельсий, если шкала не указана)
        один с двумя параметрами для двух переменных экземпляра
        конструктор по умолчанию (устанавливается на ноль градусов Цельсия).

        Методы:
        Два метода для возврата температуры: один для возврата градусов по Цельсию, другой для возврата градусов по Фаренгейту.
        Для преобразования используйте следующие формулы:
        degreesC = 5(degreesF - 32) / 9
        degreesF = (9(degreesC/5) + 32

        Три метода для установки полей: один для установки значения, один для установки шкалы ('F' или 'C'), и один для установки обоих.
        Метод для возврата шкалы.
     */
    Scanner in = new Scanner(System.in);
    private double degrees;
    private String degreesType;


    public Temperature () {

    }
    public Temperature(double degrees) {
        this.degrees = degrees;
    }

    public Temperature (String degreesType) {
        this.degreesType = degreesType;
    }

    public Temperature (double degrees, String degreesType) {
        this.degreesType = degreesType;
        this.degrees = degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public void setDegreesType(String degreesType) {
        this.degreesType = degreesType;
    }

    public double getDegrees() {
        return degrees;
    }

    public String getDegreesType() {
        return degreesType;
    }

    public double degreesUserInput () {
        System.out.print("Введите градусы: ");
        degrees = in.nextDouble();
        return degrees;
    }

    public String degreesUserTypeInput () {
        System.out.print("Введите тип градусов: ");
        degreesType = in.next();
        return degreesType;
    }

    public void degreesConvertToFahrenheit () {
        double degreesF;
        degreesF = (((9 * degrees) / 5) + 32);
        System.out.println(degreesF);
    }

    public void degreesConvertToCelsius () {
        double degreesC;
        degreesC = ((degrees - 32) * 5) / 9;
        System.out.println(degreesC);
    }
}




/* идея, пользователь вводит температуру в градусах, затем выбирает тип градусов, а потом, а потом я хз
 */