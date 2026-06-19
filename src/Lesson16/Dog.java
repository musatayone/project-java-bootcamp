package Lesson16;

public class Dog {
    private String name;
    private double weight;
    private int age;

    static int count = 0;

    public Dog(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }
}
