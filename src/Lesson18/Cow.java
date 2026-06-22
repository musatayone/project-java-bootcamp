package Lesson18;

public class Cow extends AbstractAnimal {
    public Cow(int age, double weight, String color) {
        super(age, weight, color);
    }

    @Override
    public void makeNoise() {
        System.out.println("МУУУУУ");
    }
}
