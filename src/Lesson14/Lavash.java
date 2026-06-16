package Lesson14;

public class Lavash extends Bread {

    String name;

    void wrap() {
        System.out.println("Лаваш завернут");
    }

    @Override
    void bake() {
        System.out.println("Я лаваш, меня испекли");
    }

}
