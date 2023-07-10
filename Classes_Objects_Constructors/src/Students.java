public class Students {
    /*1. Создайте класс с именем 'Student' со строковыми переменными name, surname, address и целочисленной переменной id.
    Класс Student имеет метод toString() для печати информации о студенте.
    Создайте объект класса Student, присвойте значения name - "Алиса", surname - "Смит", address - "Коктем-2", id - 24.
    Создайте еще два объекта класса Student.
    Присвойте регистрационный номер, фамилию, имя и адрес двух студентов с именами "Азамат" и "Кристина" соответственно.
    Выведите информацию о студентах с помощью метода toString().

     */
    String name;
    String surname;
    String address;
    int id;


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id +
                '}';
    }


}
