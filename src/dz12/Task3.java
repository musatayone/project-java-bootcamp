package dz12;

public class Task3 {
    public static void main(String[] args) {
        //Задача A.Создание классов
        //
        //Создать новый класс – Курсы со следующими свойствами:
        //Наименование
        //Дата создания
        //ID
        //ФИО преподавателя
        //Создать класс - Студента со следующими свойствами:
        //Дата рождения
        //Фамилия
        //Имя
        //Пол
        //Возраст
        //
        //Создайте конструкторы для обоих классов (всех свойств), а также добавьте конструктор по умолчанию.
        //
        //Использовать Конструкторы для создания объектов.
        //Использовать геттеры и сеттеры для получения и присваивания значений
        //Проверить Возраст на негативное значение

        Course course =
                new Course(
                        "Java",
                        "15.09.2025",
                        101,
                        "Иванов Иван Иванович"
                );

        Student student =
                new Student(
                        "13.08.1999",
                        "Ахметов",
                        "Диас",
                        "Мужской",
                        21
                );

        System.out.println("Курс:");
        System.out.println(course.getName());
        System.out.println(course.getCreationDate());
        System.out.println(course.getId());
        System.out.println(course.getTeacherFullName());

        System.out.println();

        System.out.println("Студент:");
        System.out.println(student.getName() + " " + student.getLastName());
        System.out.println(student.getBirthDate());
        System.out.println(student.getGender());
        System.out.println(student.getAge());
    }
}
