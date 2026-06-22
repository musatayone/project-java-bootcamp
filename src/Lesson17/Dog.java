package Lesson17;

public class Dog {
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public final void bark() {
        System.out.println("гав-гав");
    }
}

;
