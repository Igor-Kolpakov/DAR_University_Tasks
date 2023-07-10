public class Main {

    public static void main(String[] args) {

        //Первая задача.
        Students studentAlice = new Students();
        studentAlice.name = "Алиса";
        studentAlice.surname = "Смит";
        studentAlice.address = "Коктем - 2";
        studentAlice.id = 24;
        System.out.println(studentAlice);

        Students studentAzamat = new Students();
        studentAzamat.name = "Азамат";
        studentAzamat.surname = "Керимов";
        studentAzamat.address = "Орбита - 1";
        studentAzamat.id = 17;
        System.out.println(studentAzamat);

        Students studentKristina = new Students();
        studentKristina.name = "Кристина";
        studentKristina.surname = "Спицына";
        studentKristina.address = "Нурмакова 83";
        studentKristina.id = 12;
        System.out.println(studentKristina);
        System.out.println();

        //Вторая задача.
        Triangle triangle = new Triangle();
        System.out.println("Периметр: " + triangle.returnPerimeter());
        System.out.println("Площадь: " + triangle.returnSquare());

        //Третья задача.
        Rectangle rectangle = new Rectangle();
        System.out.println("Площадь первого прямоугольника = " + rectangle.returnFirstSquare());
        System.out.println("Площадь второго прямоугольника = " + rectangle.returnSecondSquare());

        //Четвертая задача.
        Average average = new Average();
        System.out.println("Среднее арифметическое = " + average.numAverageCalculation());

        //пятая задача
        Movie movie = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie1 = new Movie("Главный герой", "20th Century Studios");
    }
}
