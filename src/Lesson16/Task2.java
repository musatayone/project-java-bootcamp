package Lesson16;

public class Task2 {
    public static void main(String[] args) {
        // Создать класс Собака
        //Свойства: Имя, Вес, Возраст.
        //Класс Собака должен знать сколько собак было создано.

        Dog dog1 = new Dog("Naruto", 30.5, 10);
        Dog dog2 = new Dog("Sasuke", 34.3, 15);

        int count = Dog.getCount();
        System.out.println(count);

    }
}
