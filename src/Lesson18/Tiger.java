package Lesson18;

public class Tiger extends AbstractFeline {
    public Tiger(int age, double weight, String color, int clawCount, double tailLength, double whiskerLength) {
        super(age, weight, color, clawCount, tailLength, whiskerLength);
    }

    @Override
    public void makeNoise() {
        System.out.println("ГРРРРРРРРАААХ");
    }

    public void greetings() {
        purr();
        makeNoise();
        sharpenClaws();
    }
}
