package Lesson20;

public class Turtle implements Swimmable {

    @Override
    public void swim() {
        System.out.println("Черепаха плавает");
    }

    @Override
    public void makeNoise() {
        System.out.println("Черепаха издает звуки: ш-ш-ш");
    }

    public void layEggs(int count) {
        System.out.println("Черепаха отложила " + count + "яиц");
    }

}
