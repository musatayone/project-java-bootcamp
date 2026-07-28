package Lesson33;

public class Juice implements Liquid {
    private String name;
    public Juice(String name) {
        this.name = name;
    }

    @Override
    public void pour() {
        System.out.println(name + " перелили");
    }

    @Override
    public String toString() {
        return name;
    }
}
