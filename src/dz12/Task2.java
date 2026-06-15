package dz12;

public class Task2 {
    public static void main(String[] args) {
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
        //Использовать геттеры и сеттеры для получения и присваивания значений
        //Проверить Возраст на негативное значение

        Course course = new Course();
        course.setName("Java Начало");
        course.setCreationDate("2026-06-11");
        course.setId(101);
        course.setTeacherFullName("Даулет Тоганбаев");

        Student student = new Student();
        student.setAge(20);
        student.setName("Диас");
        student.setLastName("Мусатай");
        student.setGender("Мужчина");
        student.setBirthDate("1999-08-13");

        System.out.println("Курс:");
        System.out.println(course.getName() + ", " + course.getCreationDate() + ", ID: " + course.getId() + ", Профессор: " + course.getTeacherFullName());

        System.out.println("\nСтудент:");
        System.out.println(student.getName() + " " + student.getLastName() + ", " + student.getGender() + ", Возраст: " + student.getAge() + ", Дата рождения: " + student.getBirthDate());
    }
}
