package Lesson14;

public class Lepeshka extends Bread {

    boolean hasOrnament;

    void makeOrnament() {
        hasOrnament = true;
        System.out.println("Нанесены узоры");
    }

    void varnish() {
        System.out.println("Лакировали");
    }

    @Override
    void bake() {
        if (weight <= 0) {
            System.out.println("Лепешка без веса — подделка!");
            return;
        } else {
            System.out.println("Лепешка испечена!");
        }

    }
}
