public class Employee {
    String name;
    int age;
    double salary;

    public Employee (String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s, �������: %d, \n" + "��������: %.2f", name, age, salary);
    }
}
