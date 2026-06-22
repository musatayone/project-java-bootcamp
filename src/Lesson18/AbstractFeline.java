package Lesson18;

public abstract class AbstractFeline extends AbstractAnimal {

    private int clawCount;
    private double tailLength;
    private double whiskerLength;

    public AbstractFeline(int age, double weight, String color,
                          int clawCount, double tailLength, double whiskerLength) {
        super(age, weight, color);
        this.clawCount = clawCount;
        this.tailLength = tailLength;
        this.whiskerLength = whiskerLength;
    }

    public int getClawCount() {
        return clawCount;
    }

    public void setClawCount(int clawCount) {
        if (clawCount < 0) {
            System.out.println("Ошибка");
        } else {
            this.clawCount = clawCount;
        }
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        if (tailLength < 0) {
            System.out.println("Ошибка");
        } else {
            this.tailLength = tailLength;
        }
    }

    public double getWhiskerLength() {
        return whiskerLength;
    }

    public void setWhiskerLength(double whiskerLength) {
        if (whiskerLength < 0) {
            System.out.println("Ошибка");
        } else {
            this.whiskerLength = whiskerLength;
        }
    }

    public void sharpenClaws() {
        System.out.println("Кошка точит когти");
    }

    public void landOnFeet() {
        System.out.println("Приземлилась на лапы");
    }

    public void purr() {
        System.out.println("Мурррр...");
    }
}