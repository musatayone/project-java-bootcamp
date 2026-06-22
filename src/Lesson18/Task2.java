package Lesson18;

public class Task2 {
    public static void main(String[] args) {
        // В Класс Животное добавить свойство спать, есть, издавать звук
        //В класс Кошачьи мурлыкать, точить когти, приземляться на ноги при падении.
        //Сделать так, чтобы все Животные «отдыхали» (спали, ели)
        //Чтобы кошачьи приветствовали нас (мурлыкали, мяукали и точили когти)

        Cat cat = new Cat(5,4.2,"Рыжий", 20, 14.2, 2.2);
        Tiger tiger = new Tiger(10,50.4, "Полосато-рыжий", 20, 35.2, 10.2);
        Cow cow = new Cow(10,100.2,"Белый");

        cat.sleep();
        cat.eat();

        tiger.sleep();
        tiger.eat();

        cow.eat();
        cow.sleep();

        cat.greetings();
        tiger.greetings();

        cat.makeNoise();
        tiger.makeNoise();
        cow.makeNoise();
    }
}
