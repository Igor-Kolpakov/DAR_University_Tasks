public class Students {
    /*1. Реализуйте класс Student. Студент имеет имя, id и год обучения.
    Предоставьте конструктор с двумя параметрами и создайте методы для доступа к имени, id и увеличения года обучения.
    */

    private String name;
    private int id;
    private int learningYear;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLearningYear(int learningYear) {
        this.learningYear = learningYear;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void learningYearIncrease () {
        while (learningYear <= 11) {
            learningYear++;
            System.out.println(learningYear);
        }
    }
}
