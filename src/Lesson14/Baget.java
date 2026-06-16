package Lesson14;

public class Baget extends Bread {
    int length;
    int ribs;
    String name;

    void ribbing() {
        System.out.println("Багет прорубцован");
    }

    @Override
    void pack() {
        System.out.println("Только в экологичный пакет");
    }
}
