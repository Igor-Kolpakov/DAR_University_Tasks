public class Students {
    /*4. Напишите класс Student с полем grade типа int.
    Затем создайте несколько экземпляров вашего класса и добавьте их в коллекцию.
    Затем выполните итерацию по вашему набору (используя foreach или iterator) и покажите, что будет получено в результате.

     */
    private int grade;
    private String name;

    public Students() {

    }

    public Students(int grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: " +
                "Имя='" + name + '\'' + " " +
                "grade=" + grade;
    }
}
