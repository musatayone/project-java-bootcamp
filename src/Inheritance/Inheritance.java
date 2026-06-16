package Inheritance;


/**
 * Inheritance.
 *
 * @author shabdanbek.m
 * Date: 15.06.2026
 */
public class Inheritance {

    public static void main(String[] args ) {
        Animal an1 = new Dog("Rex", 12.2); // polymorphism
        Animal an2 = new Cat("myoy", 2.2);

//        Animal[] animals = {an1, an2, new Animal("Default animal", 12312.12)};

    }
}

abstract class Animal {

    private String name;
    private Double weight;

    public Animal(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}

class Dog extends Animal {

    String chutyo = "fdsfdsfsdkfs";

    public Dog(String name, Double weight) {
        super(name, weight);
    }
}

class Cat extends Animal {

    Integer lives = 9;

    public Cat(String name, Double weight) {
        super(name, weight);
    }
}
