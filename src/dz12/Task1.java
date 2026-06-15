package dz12;

public class Task1 {
    public static void main(String[] args) {
        // Задача A. Создание классов
        //Создать эскиз «Студент», придумать и добавить свойства.
        //Создать 3 объекта класса «Студент».
        //Заполнить студентов (Задать их свойства)
        //Отобразить данные студентов
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Данные студентов

        Student studentOne = new Student();
        studentOne.name = "Daulet";
        studentOne.age = 22;
        studentOne.course = 4;
        System.out.println(studentOne.name + " " + studentOne.age + " " + studentOne.course);

        Student studentTwo = new Student();
        studentTwo.name = "Almas";
        studentTwo.age = 20;
        studentTwo.course = 3;
        System.out.println(studentTwo.name + " " + studentTwo.age + " " + studentTwo.course);

        Student studentThree = new Student();
        studentThree.name = "Isatay";
        studentThree.age = 18;
        studentThree.course = 1;
        System.out.println(studentThree.name + " " + studentThree.age + " " + studentThree.course);
    }
}
