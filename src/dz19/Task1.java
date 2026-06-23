package dz19;

public class Task1 {
    public static void main(String[] args) {
        //Задача A. Создание класса
        //
        //Создать Обезьяну, которая умеет карабкаться.
        //Она может держать на спине другого карабкающегося зверя (можно и обезьяну).
        //Также она кушает съедобные фрукты.

        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        monkey1.setName("Наруто");
        monkey2.setName("Саске");

        monkey1.climb();
        monkey1.eatFruit("Яблоко");
        monkey1.carry(monkey2);
    }
}
