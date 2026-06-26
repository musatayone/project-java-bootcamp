package Lesson24;

public class Mysyk extends Animal {
    public Mysyk(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Mysyk " + getAge();
    }
}
