package dz26;

import java.util.Objects;

public class Dog {
    private String name;
    private Integer weight;

    public Dog(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void tellAbout () {
        System.out.println("Я далматинец. Меня зовут " + name +
                ", мой вес " + weight + " кг.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(weight, dog.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
