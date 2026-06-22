package Lesson18;

public abstract class AbstractAnimal {
    private String color;
    private int age;
    private double weight;

    abstract void makeNoise();

    public AbstractAnimal(int age, double weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void sleep() {
            System.out.println("Животное спит");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Ошибка");
        } else {
            this.age = age;
    }
    }

    public void setWeight(double weight) {
            if (weight <= 0) {
                System.out.println("Ошибка");
            } else {
                this.weight = weight;
            }
        }
    public double getWeight() {
        return weight;
    }
}
