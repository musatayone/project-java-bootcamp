package Lesson20;

public class Duck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }

    @Override
    public void makeNoise() {
        System.out.println("Утка издает звуки: кря-кря");
    }
}
