import java.util.Scanner;

public class Movie {
    /*5. Создайте класс 'Movie'. Экземпляр класса Movie представляет фильм. Этот класс имеет следующие три переменные класса:
        title, которая, является строкой, представляющей, название фильма
        studio, которая, является строкой, представляющей студию, снявшую фильм
        rating, которая представляет собой строку, обозначающую рейтинг фильма (например, PG13, R и т.д.).
     1) Напишите конструктор для класса Movie, который принимает в качестве аргументов строку, представляющую название фильма, строку, представляющую студию, и строку, представляющую рейтинг, и устанавливает соответствующие переменные класса в эти значения.
     2) Напишите второй конструктор для класса Movie, который принимает в качестве аргументов строку, представляющую название фильма, и строку, представляющую студию, и устанавливает соответствующие переменные класса в эти значения, а переменную класса rating устанавливает в значение "PG".
     3) Создайте экземпляры класса Movie с названием "Фокус", студией "RatPac-Dune Entertainment" и рейтингом "R" и с названием "Главный герой" и студией "20th Century Studios"
     */

    String title;
    String studio;
    String rating;

    /*
    //1)
    public Movie() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название фильма: ");
        title = in.nextLine();
        System.out.println("Введите название студии: ");
        studio = in.nextLine();
        System.out.println("Введите возрастной рейтинг фильма: ");
        rating = in.nextLine();
    }
     */
    //1)
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    //2)
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    //3)

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
