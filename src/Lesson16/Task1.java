package Lesson16;

public class Task1 {
    public static void main(String[] args) {
        //Создать класс Счётчик, в котором имеется скрытое статическое свойство numOfCalls.
        //Создать статический метод increment, который увеличивает numOfCalls на 1.
        //Создать метод factorial, который выгружает факториал числа numOfCalls при каждом вызове.
        //В методе main создать 2 экземпляра объекта, counter1 & counter2. Вызвать указанные выше методы.

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        Counter.increment();
        Counter.increment();

        counter1.factorial();
        counter2.factorial();

        Counter.increment();
        Counter.increment();

        counter1.factorial();
        counter2.factorial();
    }
}
