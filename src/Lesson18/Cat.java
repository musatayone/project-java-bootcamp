package Lesson18;

public class Cat extends AbstractFeline {

    public Cat(int age, double weight, String color, int clawCount, double tailLength, double whiskerLength) {
        super(age, weight, color, clawCount, tailLength, whiskerLength);
    }

    @Override
    public void makeNoise() {
        System.out.println("мяу");
    }

    public void greetings() {
        purr();
        makeNoise();
        sharpenClaws();
    }
}
